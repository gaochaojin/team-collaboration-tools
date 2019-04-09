package com.gaochaojin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Author: gaochaojin
 * @Email: gaochaojin@163.com
 * @Description:
 * @Date Created in 10:35 2019/4/9
 */
@Mojo(name = "log")
public class MyPlugin extends AbstractMojo {

    @Parameter(property = "log.name", defaultValue = "gaochaojin")
    private Object name;//参数

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello" + name + ",deploy to your local repository");
    }
}
