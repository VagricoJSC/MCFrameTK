Option Explicit

Const ForReading = 1

Dim newExlFlg, isOpened 'dummy
Dim bkpath, bk
dim rtn

rtn = 0
bkpath = Wscript.Arguments(0)


WScript.Echo "/**/ Read function.vbs /**/"

Function ReadFile(ByVal fileName)
    Dim so, s, p
    Set so = WScript.CreateObject("Scripting.FileSystemObject")
    p = so.GetFile(WScript.ScriptFullName).ParentFolder
    wscript.echo p &"\"&fileName
    set s = so.OpenTextFile(p &"\"&FileName, ForReading, False)
    ReadFile = s.ReadAll()
    s.close
    set so = nothing
    set s = nothing
End Function
Execute ReadFile("function.vbs")


WScript.Echo "/**/ Open file /**/"

set bk = GetExcelBook(bkpath, true, isOpened, newExlFlg)
if bk is nothing then
	WScript.Quit(1)
end if

WScript.Echo "/**/ Execute macro : ScreenParamInit /**/"

On Error Resume Next
wscript.echo bk.name & "!ScreenParamInit", WScript
bk.application.run bk.name & "!ScreenParamInit", WScript
	
if Err.Number <> 0 then
	AppErr(Err.Number & " : " & Err.Description)
	rtn = 1
end if

WScript.Echo "/***/ Execution finished /***/"
WScript.Quit(rtn)




