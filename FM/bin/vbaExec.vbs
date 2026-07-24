Option Explicit

Const ForReading = 1

Dim args, newExlFlg, isOpened
Dim bk
dim rtn

Set args = WScript.Arguments
dim dbb,macro,sbook,sini,issilent,log,outPath
dbb=args(0)
macro=args(1)
sbook=args(2)
sini=args(3)
issilent=args(4)
log=args(5)
if macro = "db2dbc_BatchMain"  then
	outPath = args(6)
end if


rtn = 0

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
set bk = GetExcelBook(dbb, false, isOpened, newExlFlg)
if bk is nothing then
	WScript.Quit(1)
end if

WScript.Echo "/**/ Execute macro : " & macro & " /**/"

On Error Resume Next
Dim objWshShell 
Set objWshShell = WScript.CreateObject("WScript.Shell")
If Err.Number = 0 Then
    WScript.Echo "FM_TEST_MODE/" & objWshShell.ExpandEnvironmentStrings("%FM_TEST_MODE%")
Else
End If
Set objWshShell = Nothing


On Error Resume Next
if macro <> "db2dbc_BatchMain" then
	wscript.echo bk.name & "!" & macro & "," & sini & "," & sbook & "," & cbool(issilent) & "," &  cstr(log)
	bk.application.run bk.name & "!" & macro, cstr(sini), cstr(sbook), cbool(issilent), cstr(log), rtn, WScript
else
	wscript.echo bk.name & "!" & macro & "," & sini & "," & sbook & "," & cbool(issilent) & "," &  cstr(log) & "," &  cstr(outPath)
	bk.application.run bk.name & "!" & macro, cstr(sini), cstr(sbook), cbool(issilent), cstr(log), cstr(outPath), rtn, WScript
end if
	
if Err.Number <> 0 then
	appErr(Err.Number & " : " & Err.Description)
	rtn = 1
end if

dim app 
if not bk is nothing then
	set app = bk.application
	if not isOpened then
		bk.close false
		set bk = nothing
	end if
	if newExlFlg then
		app.Quit
	end if
end if
set app = nothing

WScript.Echo "/***/ Execution finished (" & rtn & ") /***/"
WScript.Quit(rtn)

