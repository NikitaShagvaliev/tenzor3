package tenzor.kotlin

interface FileSystemNode {

    var name: String

    var parent: Folder?

    override fun toString(): String
}