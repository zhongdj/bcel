/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package net.imadz.org.apache.bcel.util;

import java.util.LinkedList;

import net.imadz.org.apache.bcel.classfile.JavaClass;

/** 
 * Utility class implementing a (typesafe) queue of JavaClass
 * objects.
 *
 * @version $Id: ClassQueue.java 1152072 2011-07-29 01:54:05Z dbrosius $
 * @author <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A> 
 */
public class ClassQueue implements java.io.Serializable {

    private static final long serialVersionUID = 685144104322420292L;
    protected LinkedList<JavaClass> vec = new LinkedList<JavaClass>();


    public void enqueue( JavaClass clazz ) {
        vec.addLast(clazz);
    }


    public JavaClass dequeue() {
        return vec.removeFirst();
    }


    public boolean empty() {
        return vec.isEmpty();
    }


    @Override
    public String toString() {
        return vec.toString();
    }
}
