package org.example;

class FileLogger implements Logger {
  @Override
    public void log(String message) {
        System.out.println("[FILE LOG] " + message);
    }
}