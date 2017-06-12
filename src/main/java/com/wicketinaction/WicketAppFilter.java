package com.wicketinaction;

import org.apache.wicket.protocol.ws.javax.JavaxWebSocketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/*",
           initParams = {
                   @WebInitParam(name = "applicationClassName",
                                 value = "com.wicketinaction.WicketApplication")
           })
public class WicketAppFilter extends JavaxWebSocketFilter {
}
