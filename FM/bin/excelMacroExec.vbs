Option Explicit

Const ForReading = 1

Dim args, fileName , macroName, newExlFlg, isOpened
Set args = WScript.Arguments
If (4 > args.Count) Then
	appErr("Invalid number of arguments(" & args.Count & ")")
End If

dim i
Dim bk
dim rtn

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

for i=1 to 2
	if i = 1 then
		fileName = GetAbsolutePath(args(3), args(0))
'		WScript.Echo "exec DbTool : [" & fileName & "]"
		set bk = GetExcelBook(fileName, false, isOpened, newExlFlg)
	else
		macroName = "db2dbc_Batch"
		if (args.Count = 5) then macroName = "db2dbc_BatchMain"
		WScript.Echo "execDB2DBC:[" & macroName & "]in[" & fileName & "]"

		On Error Resume Next

		if (args.Count = 5) then
		bk.application.run bk.name & "!" & macroName, GetAbsolutePath(args(4), ""), GetAbsolutePath(args(1), ""), "true", "", GetAbsolutePath(args(2), ""), rtn, WScript
		else
		bk.application.run bk.name & "!" & macroName, GetAbsolutePath(args(1), ""), GetAbsolutePath(args(2), ""), rtn, WScript
		end if
		if Err.Number <> 0 then
			appErr(Err.Number & " : " & Err.Description)
			Err.Clear
		end if
	end if
next

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
 
if (rtn = 0) then
	WScript.Echo "output csv for DBC in [" & GetAbsolutePath(args(2), "") & "]"
else
	WScript.Echo "Please check the description of the DB Definition document and its setting file."
	if (args.Count = 5) then
		WScript.Echo "Designation of the DB Definition document might be wrong."
	else
		WScript.Echo "Designation of the DB Definition document setting file might be wrong."
	end if
end if
WScript.Quit(rtn)


