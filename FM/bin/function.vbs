Option Explicit

sub AppErr(errMsg)
	Wscript.echo("Error ocurred.")
	Wscript.echo(errMsg)
end sub

function GetExcelBook(absFileName, visible, _
	byref rtnStillOpened, _
	byref rtnAppCreate)
	
	Dim fsObj
	Dim excelExt
	Dim ext
	Dim excel
	Dim wshShell
	Dim wb
	If not (len(absFileName) < 1) Then
		
		Set fsObj = CreateObject("Scripting.FileSystemObject")
		If (fsObj.FileExists(absFileName)) Then
		
			Set excelExt =  CreateObject("Scripting.Dictionary")
			excelExt.Add "xls", "xls"
			excelExt.Add "csv", "csv"
			excelExt.Add "xlsm", "xlsm"
			excelExt.Add "xlsx", "xlsx"
			
			ext = LCase(fsObj.GetExtensionName(absFileName))
			Set wshShell = WScript.CreateObject("WScript.Shell")
			rtnStillOpened = false
			rtnAppCreate = false
			
			If (excelExt.Exists(ext)) Then
				
				on error resume next
				Set excel = GetObject(, "Excel.Application")
				If (Err.Number <> 0) Then
					Set excel = CreateObject("Excel.Application")
					rtnAppCreate = true
					excel.Visible = visible
				End If
				on error goto 0
				
				for each wb in excel.WorkBooks
					Dim wbnm
					wbnm = wb.path & "\" & wb.name
					wbnm = Replace(wbnm, "/", "\") 
					if wbnm = Replace(absFileName,"/","\") then 
						rtnStillOpened = True
						Exit for
					end if
				next
				
				if rtnStillOpened = false then
					On Error Resume Next
					set wb = excel.WorkBooks.Open( absFileName,  , false)
					if Err.Number <> 0 then
						appErr("File open error" & vbnewline & Err.Number & " : " & Err.Description)
						if rtnAppCreate then
							excel.quit
						end if
					end if
				end if
			Else
				WScript.echo ext & " file is not supported."
				Set wb = nothing
			End If
		else	
			appErr(absFileName & "is not exist.")
		End If
	else
		appErr("File name is not specified.")
	End If
	
	Set fsObj = nothing
	Set excelExt = nothing
	Set ext = nothing
	Set excel = nothing
	Set wshShell = nothing
	
	Set GetExcelBook = wb
end function



Function GetAbsolutePath(rPath, curPath)

    Const DELIM  = "\"
    Const cd  = "."
    Const ccd = ".."
    
    Dim sp
    Dim sp2
    Dim idx
    Dim objWshShell

	rPath = Replace(rPath, "/", DELIM) 
	curPath = Replace(curPath, "/", DELIM) 
    If curPath = "" then
       Set objWshShell = CreateObject("WScript.Shell")
       curPath = objWshShell.CurrentDirectory
       Set objWshShell = Nothing
    End If

    If Right(curPath, 1) = DELIM Then
        curPath = Left(curPath, Len(curPath) - 1)
    End If
    
    sp = Split(rPath, DELIM)
    
    If UBound(sp) <= 0 Then
        GetAbsolutePath = ""
        Exit Function
    End If

    If sp(0) = "." Then
        sp(0) = curPath
    ElseIf sp(0) = ".." Then
        sp(0) = curPath
        sp2 = Split(sp(0), DELIM)
        sp2(UBound(sp2)) = cd
        sp(0) = appendFolderName(sp2, cd)
    
    End If
    
    rPath = appendFolderName(sp, cd)
    sp = Split(rPath, DELIM)
    
    For idx = LBound(sp) To UBound(sp)
        
        If sp(idx) <> cd Then
        
            If sp(idx) = ccd Then
                sp(idx) = cd
                
                Dim i
                For i = idx To 2 Step -1
                    If sp(i - 1) <> cd Then
                        sp(i - 1) = cd
                        Exit For
                    End If
                Next 
                
            End If
        
        End If
        
    Next
    
    GetAbsolutePath = appendFolderName(sp, cd)
    

    
End Function

Function appendFolderName(sp, cd)
    
    Dim idx
    
    For idx = LBound(sp) To UBound(sp)
    
        If sp(idx) <> cd Then
            If idx = 0 Then
                appendFolderName = sp(idx) & "\"
            Else
                appendFolderName = appendFolderName & sp(idx) & "\"
            End If
        End If
    Next
    
    appendFolderName = Left(appendFolderName, Len(appendFolderName) - 1)
    
End Function