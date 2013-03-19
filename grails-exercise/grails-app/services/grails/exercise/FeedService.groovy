package grails.exercise

import org.codehaus.groovy.grails.web.context.ServletContextHolder
import grails.web.JSONBuilder
import groovy.json.JsonSlurper
import org.codehaus.groovy.grails.commons.ConfigurationHolder

class FeedService {

    def grailsApplication

    def getBooksFeed() {
        ConfigurationHolder ch;
        def ctx = ServletContextHolder.servletContext
        def input = ctx.getResourceAsStream(grailsApplication.config.bookStore.feedFile)
        return new JsonSlurper().parseText(input.text)
    }
}
