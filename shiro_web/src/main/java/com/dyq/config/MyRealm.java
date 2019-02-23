package com.dyq.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * @author 丁艳青
 * @site www.dyq.com
 * @company xxx
 * @create 2019-02-08 21:38
 */
public class MyRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRole("super");
        authorizationInfo.addStringPermission("user:delete");
        authorizationInfo.addStringPermission("user:update");

        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String)authenticationToken.getPrincipal();
        if(username.equals("zhangsan")){
            AuthenticationInfo authenticationInfo =
                    new SimpleAuthenticationInfo("zhangsan","68609b8b64988c0f4def093eaa025e05",
                                                                    ByteSource.Util.bytes("abcd"),this.getName());
            return authenticationInfo;
        }
        return null;
    }
}
