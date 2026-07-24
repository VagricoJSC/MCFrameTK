package mcframe.serverPFBZ.PFBZL9080;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileFmt;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileDef.*;
import static mcframe.commonCore.notice.Core_Msg.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import mcframe.commonCore.report.MCReportFile;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashSet;

abstract public class PFBZL_FixLenFileWriter_MC {
	
	/**
	 * 固定長ファイル
	 */
	protected PFBZL_FixLenFileFmt _fixLenFileFmt;
	
	/**
	 * 固定長ファイルフォーマット情報
	 */
	protected PFBZL_FixLenFileInfo _fileInfo;
	
	/**
	 * 出力ファイルのパス
	 */
	protected String _filePath;
	
	/**
	 * 出力ファイルのディレクトリ
	 */
	protected String _fileDir;
	
	/**
	 * 出力ファイルの名前
	 */
	protected String _fileName;
	
	/**
	 * 文字セット
	 */
	protected String _charset = MCReportFile.ENCODE_UTF8;
	
	/**
	 * ファイルにBOMを付けるか否か
	 */
	protected boolean _writeBOM;
	
	protected FileOutputStream _fos;
	protected BufferedOutputStream _bos;
	protected boolean _append = true;
	
	/**
	 * ディレクトリが存在しない場合、作成するか否か
	 */
	protected boolean _mkdir = true;
	
	/**
	 * ファイル書き込み時のエラー情報を格納します
	 */
	protected MCMessageList _msgL = new MCMessageList();
	
	/**
	 * 出力データ
	 */
	protected MCList<MCRow> _rptL;
	
	/**
	 * skipレコード
	 */
	protected MCRow _skipRow;
	
	/**
	 * trailerレコード
	 */
	protected MCRow _trailerRow;
	
	/**
	 * endレコード
	 */
	protected MCRow _endRow;
	
	protected MCRow _preHdrRow;
	protected MCRow _curHdrRow;
	protected int _headerCnt;
	protected int _dataByHeaderCnt;
	protected int[] _dataCnt;
	
	///////////////////////////////////////////////////////////////////////////
	// 外部から固定長フォーマットやファイルパスなどを設定するメソッド
	////////////////////
	
	/**
	 * 固定長ファイルのフォーマット情報を取得する。<br>
	 */
	public PFBZL_FixLenFileInfo getFileInfo() {
		return _fileInfo;
	}
	
	/**
	 * 固定長ファイルのフォーマット情報を設定する。<br>
	 * skipレコードはこのタイミングで生成される。
	 */
	public void setFixLenFileFmt(PFBZL_FixLenFileFmt fmt) {
		_fixLenFileFmt = fmt;
		_fileInfo = fmt.getFileInfo();
		_rptL = MCList.create(MCRow.class);
		_skipRow = null;
		createSkipRow();
		initForNewFile();
	}
	
	/**
	 * skipレコードに値を設定する。
	 */
	public void setSkipVal(String col, Comparable<?> val) {
		_skipRow.setValueNE(col, val);
	}
	
	/**
	 * ファイルに出力レコードの一覧を追加する。
	 */
	public void addList(MCList<MCRow> list) {
		_rptL.addAll(list);
	}
	
	/**
	 * 出力項目の文字セットを設定する。
	 */
	public void setCharset(String charset) {
		if (isNull(charset)) {
			_charset = MCReportFile.ENCODE_UTF8;
		}
		else {
			try {
				"".getBytes(charset);
			}
			catch (UnsupportedEncodingException e) {
				throw new MCAppException(PFBZL0096, charset);
			}
			_charset = charset;
		}
	}
	
	/**
	 * 文字セットがUTF-8/UTF-16LE/UTF-16BEの場合、ファイルの先頭にBOMを出力するか否か。
	 */
	public void setWriteBOM(boolean writeBOM) {
		_writeBOM = writeBOM;
	}
	
	public void append(boolean append) {
		_append = append;
	}
	
	/**
	 * ファイルパスに指定した親ディレクトリが存在しない場合、ディレクトリを作成するか否か。初期値は「true：作成する」
	 */
	public void mkdir(boolean mkdir) {
		_mkdir = mkdir;
	}
	
	/**
	 * 出力ファイルのパスを設定する。
	 */
	public void setFilePath(String filePath) {
		_filePath = filePath;
		File f = new File(_filePath);
		_fileDir = f.getParent();
		_fileName = f.getName();
	}
	
	/**
	 * 出力ファイルのパスを取得する
	 */
	public String getFilePath() {
		return _filePath;
	}
	
	/**
	 * filePathを出力ファイルとしてデータを書き込む。writeCloseメソッドを必ず最後に呼出すこと
	 * @see #writeClose()
	 */
	public void write(String filePath) {
		setFilePath(filePath);
		write();
	}
	
	/**
	 * 出力ファイルにデータを書き込む。writeCloseメソッドを必ず最後に呼出すこと
	 */
	public void write() {
		String filePath = getFilePath();
		if (!isOpen()) {
			writeOpen(filePath);
			writeOpenAfter();
			writeBOM();
			writeSkip();
		}
		writeMain();
		writeAfter();
	}
	
	/**
	 * filePathを出力ファイルとしてデータを書き込む。writeCloseも呼出す
	 */
	public void writeAndClose(String filePath) {
		setFilePath(filePath);
		writeAndClose();
	}
	
	/**
	 * 出力ファイルにデータを書き込む。writeCloseも呼出す
	 */
	public void writeAndClose() {
		try {
			write();
		}
		finally {
			writeClose();
		}
	}
	
	/**
	 * ファイル出力時にエラーがあったか否か
	 */
	public boolean hasErr() {
		return _msgL == null ? false : !_msgL.isEmpty();
	}
	
	/**
	 * 新規ファイルに出力するための、内部変数の初期化。
	 */
	protected void initForNewFile() {
		_msgL.clear();
		
		_headerCnt = 0;
		_dataByHeaderCnt = 0;
		_dataCnt = new int[0];
		if (_fileInfo.hasData()) {
			_dataCnt = new int[_fileInfo.getDataColumn().size()];
			for (int i = 0; i < _dataCnt.length; i++) {
				_dataCnt[i] = 0;
			}
		}
		
		_preHdrRow = null;
		_curHdrRow = null;
		_trailerRow = null;
		_endRow = null;
		createEndRow();
	}
	
	///////////////////////////////////////////////////////////////////////////
	// ファイル出力の内部処理
	////////////////////
	protected boolean isOpen() {
		return _bos != null && _fos != null;
	}
	
	protected void writeOpen(String fileName) {
		if ((_bos == null) && (_fos == null)) {
			
			// ディレクトリ自動作成
			if (_mkdir) {
				File file = new File(fileName);
				File dir = file.getParentFile();
				if (dir != null && !dir.exists()) {
					if (!dir.mkdirs()) {
						throw new MCException(FCBIC0006, fileName);
					}
				}
			}
			// ファイルオープン
			try {
				_fos = new FileOutputStream(fileName, _append);
				_bos = new BufferedOutputStream(_fos);
				return;
			}
			catch (FileNotFoundException fnfe) {
				throw new MCException(fnfe, FCBIC0035, fileName);
			}
		}
	}
	
	protected void writeOpenAfter() {
		initForNewFile();
	}
	
	/**
	 * endレコードを出力し、出力ファイルのストリームを閉じる。ストリームが開いてない場合、何もしない。
	 */
	public void writeClose() {
		try {
			if (isOpen() && !hasErr()) {
				writeTrailer();
				writeEnd();
			}
		}
		finally {
			boolean isOpen = isOpen();
			writeCloseStream();
			writeCloseAfter(isOpen);
		}
	}
	
	protected void writeCloseStream() {
		try {
			if (_bos != null) {
				_bos.close();
			}
			if (_fos != null) {
				_fos.close();
			}
		}
		catch (IOException ex) {
			// closeはERRORでも許す
			MCMessage msg = new MCMessage(PFBZL0100);
			MCLog.write(msg);
		}
		_bos = null;
		_fos = null;
	}
	
	protected void writeCloseAfter(boolean isOpenBeforeClose) {
		if (isOpenBeforeClose && hasErr()) {
			File f = new File(_fileDir, _fileName);
			if (f.exists() && f.isFile()) {
				f.delete();
			}
		}
	}
	
	protected void writeBOM(){
		if (_writeBOM == false) {
			return;
		}
		byte[] bom = null;
		if (isSame(_charset, MCReportFile.ENCODE_UTF8)) {
			bom = MCReportFile.BOM_UTF8;
		}
		else if (isSame(_charset, MCReportFile.ENCODE_UTF16BE)) {
			bom = MCReportFile.BOM_UTF16BE;
		}
		else if (isSame(_charset, MCReportFile.ENCODE_UTF16LE)) {
			bom = MCReportFile.BOM_UTF16LE;
		}
		write(bom);
	}
	
	protected void createSkipRow() {
		if (_fileInfo.hasSkip() == false) {
			_skipRow = null;
			return ;
		}
		_skipRow = MCRow.create();
		addColumns(_skipRow, _fileInfo.getSkipColumn());
	}
	
	/**
	 * skipレコードをファイルに出力する。
	 */
	protected void writeSkip() {
		if (_fileInfo.hasSkip() == false || _skipRow == null) {
			return ;
		}
		editRow(SKIP_KEY, _skipRow, _fileInfo.getSkipColumn());
		writeLine(_skipRow, _fileInfo.getSkipColumn());
	}
	
	protected void writeMain() {
		if (isNull(_rptL)) {
			return ;
		}
		
		// ヘッダ明細形式
		if (_fileInfo.hasData()) {
			writeHeaderData();
		}
		// 一覧形式
		else if (_fileInfo.hasHeader()) {
			writeList();
		}
	}
	
	protected void writeAfter() {
		_rptL.clear();
		if (hasErr()) {
			MCAppException ex = new MCAppException(PFBZL0097, _fileDir, _fileName);
			ex.addCauseMessageList(_msgL);
			throw ex;
		}
	}
	
	protected void writeList() {
		for (MCRow row : _rptL) {
			_curHdrRow = row;
			writeHeader(row);
			createTrailerRow();
			writeTrailer();
			_preHdrRow = _curHdrRow;
		}
	}
	
	/**
	 * headerレコードをファイルに出力する。
	 */
	protected void writeHeader(MCRow row) {
		_headerCnt++;
		_dataByHeaderCnt = 0;
		
		setCtrlVal(row, HEADER_KEY);
		Map<String, Map<String, Object>> cols = _fileInfo.getHeaderColumn();
		addColumns(row, cols);
		editRow(HEADER_KEY, row, cols);
		writeLine(row, cols);
		calcEndRow(row, -1);
	}
	
	protected void writeHeaderData() {
		for (MCRow curR : _rptL) {
			if (isSameHeader(_preHdrRow, curR)) {
				writeData(curR);
			}
			else {
				writeTrailer();
				
				_curHdrRow = curR;
				writeHeader(curR);
				createTrailerRow();
				
				// ヘッダ明細同一レコード形式
				if (_fileInfo.hasHeaderKey() == false) {
					writeData(curR.clone());
				}
				
				_preHdrRow = _curHdrRow;
			}
		}
	}
	
	/**
	 * dataレコードをファイルに出力する。
	 */
	protected void writeData(MCRow row) {
		int idx = getDataIndex(row);
		if (idx < 0 || _dataCnt.length <= idx) {
			return ;
		}
		_dataCnt[idx]++;
		_dataByHeaderCnt++;
		setCtrlVal(row, DATA_KEY, idx);
		Map<String, Map<String, Object>> cols = _fileInfo.getDataColumn().get(idx);
		addColumns(row, cols);
		editRow(DATA_KEY, row, cols);
		writeLine(row, _fileInfo.getDataColumn().get(idx));
		calcTrailerRow(row, idx);
		calcEndRow(row, idx);
	}
	
	protected void createTrailerRow() {
		if (_fileInfo.hasTrailer() == false) {
			_trailerRow = null;
			return ;
		}
		_trailerRow = MCRow.create();
		addColumns(_trailerRow, _fileInfo.getTrailerColumn());
		calcRowInit(null, -1, TRAILER_KEY, _trailerRow, _fileInfo.getTrailerCalc());
		for (int i = 0; i < _dataCnt.length; i++) {
			calcRowInit(null, i, TRAILER_KEY, _trailerRow, _fileInfo.getTrailerCalc());
		}
	}
	
	protected void calcTrailerRow(MCRow row, int idx) {
		if (_fileInfo.hasTrailer() == false) {
			return ;
		}
		calcRow(row, idx, TRAILER_KEY, _trailerRow, _fileInfo.getTrailerCalc());
	}
	
	/**
	 * trailerレコードをファイルに出力する。
	 */
	protected void writeTrailer() {
		if (_fileInfo.hasTrailer() == false || _trailerRow == null) {
			return ;
		}
		setCtrlVal(_trailerRow, TRAILER_KEY);
		editRow(TRAILER_KEY, _trailerRow, _fileInfo.getTrailerColumn());
		writeLine(_trailerRow, _fileInfo.getTrailerColumn());
		_trailerRow = null;
	}
	
	/**
	 * endレコードをファイルに出力する。
	 */
	protected void writeEnd() {
		if (_fileInfo.hasEnd() == false) {
			return ;
		}
		setCtrlVal(_endRow, END_KEY);
		editRow(END_KEY, _endRow, _fileInfo.getEndColumn());
		writeLine(_endRow, _fileInfo.getEndColumn());
		_endRow = null;
	}
	
	protected void createEndRow() {
		if (_fileInfo.hasEnd() == false) {
			_endRow = null;
			return ;
		}
		_endRow = MCRow.create();
		addColumns(_endRow, _fileInfo.getEndColumn());
		calcRowInit(null, -1, END_KEY, _endRow, _fileInfo.getEndCalc());
		for (int i = 0; i < _dataCnt.length; i++) {
			calcRowInit(null, i, END_KEY, _endRow, _fileInfo.getEndCalc());
		}
	}
	
	protected void calcEndRow(MCRow row, int idx) {
		if (_fileInfo.hasEnd() == false) {
			return ;
		}
		calcRow(row, idx, END_KEY, _endRow, _fileInfo.getEndCalc());
	}
	
	protected void calcRowInit(MCRow row, int idx, String rType, MCRow setRow, Map<String, Map<String, Object>> cols) {
		calcRow(row, idx, rType, setRow, cols, true);
	}
	
	protected void calcRow(MCRow row, int idx, String rType, MCRow setRow, Map<String, Map<String, Object>> cols) {
		calcRow(row, idx, rType, setRow, cols, false);
	}
	
	protected void calcRow(MCRow row, int idx, String rType, MCRow setRow, Map<String, Map<String, Object>> cols, boolean initFlg) {
		if (cols == null || setRow == null) {
			return ;
		}
		for (String name : cols.keySet()) {
			Map<String, Object> col = cols.get(name);
			String method = PFBZL_FixLenFileInfo.getString(col, "method");
			String arg = PFBZL_FixLenFileInfo.getString(col, "arg");
			if (isSame(method, CALC_COUNT)) {
				if (idx >= 0) {
					if (isSame(arg, DATA_KEY + "[]")) {
						MCNumber val =  initFlg ? MCNumber.ZERO : MCNumber.sum(setRow.getNumberNE(name), MCNumber.ONE) ;
						setRow.setNumberNE(name,val);
					}
					else if (isSame(arg, DATA_KEY + "[" + idx + "]")) {
						MCNumber val = initFlg ? MCNumber.ZERO : MCNumber.sum(setRow.getNumberNE(name), MCNumber.ONE) ;
						setRow.setNumberNE(name,val);
					}
				}
				else {
					if (isSame(arg, HEADER_KEY)) {
						MCNumber val = initFlg ? MCNumber.ZERO : MCNumber.sum(setRow.getNumberNE(name), MCNumber.ONE) ;
						setRow.setNumberNE(name,val);
					}
				}
			}
			else if (isSame(method, CALC_SUM)) {
				String[] keys = arg.split("\\.");
				if (keys.length <= 1) {
					continue;
				}
				if (idx >= 0) {
					if (isSame(keys[0], DATA_KEY + "[" + idx + "]")) {
						MCNumber val =  initFlg ? MCNumber.ZERO : MCNumber.sum(setRow.getNumberNE(name), row.getNumberNE(keys[1])) ;
						setRow.setNumberNE(name,val);
					}
				}
				else {
					if (isSame(keys[0], HEADER_KEY)) {
						MCNumber val =  initFlg ? MCNumber.ZERO : MCNumber.sum(setRow.getNumberNE(name), row.getNumberNE(keys[1])) ;
						setRow.setNumberNE(name,val);
					}
				}
			}
		}
	}
	
	/**
	 * skip/header/data/trailer/endレコード（引数row）の情報をファイルに出力する。
	 */
	protected void writeLine(MCRow row, Map<String, Map<String, Object>> cols) {
		if (row == null || cols == null) {
			return ;
		}
		for (String name : cols.keySet()) {
			Map<String, Object> col = cols.get(name);
			if (PFBZL_FixLenFileInfo.isDummyColumn(col)) {
				continue;
			}
			Map<String, Object>  tmpCol = PFBZL_FixLenFileInfo.columnDeepCopy(col);
			if (PFBZL_FixLenFileInfo.isSynonymColumn(tmpCol)) {
				setSynonymValue(row, cols, name, tmpCol);
			}
			setMapping(row, cols, name, col);
			writeColumn(row, name, tmpCol);
		}
	}
	
	/**
	 * 項目colの属性情報にmappingによる参照の値を設定する
	 */
	@SuppressWarnings("unchecked")  // mapのキャスト
	protected void setMapping(MCRow row, Map<String, Map<String, Object>> cols, String name, Map<String, Object> col) {
		if (PFBZL_FixLenFileInfo.hasMappingColumn(col) == false) {
			return;
		}
		
		boolean isErr = false;
		ArrayList<String> errBindL = new ArrayList<>();
		
		// ex) "mapping" : {"number" : {"decimalLength" : "header.attr1"} }}
		Map<String, Object> mapping = PFBZL_FixLenFileInfo.getAttribute(col, MAPPING_KEY);
		for (String attrName : mapping.keySet()) {
			//ex) mapAttrMap = {"decimalLength" : "header.attr1"}
			Map<String, Object> mapAttrMap = (Map<String, Object>) mapping.get(attrName);
			
			// 設定先の属性情報Map
			Map<String, Object> targetAttrMap = PFBZL_FixLenFileInfo.getAttribute(col, attrName);
			for (String attrElName : mapAttrMap.keySet()) {
				String refColName = (String)mapAttrMap.get(attrElName);	//ex) "header.attr1"
				MCRow refRow = getReferToRow(row, cols, name, col, refColName);
				if (refRow == null) {
					continue;
				}
				String[] keys = refColName.split("\\.");
				String key = keys.length == 1 ? keys[0] : keys[1];
				Comparable<?> refVal = refRow.getValueNE(key);
				String bindKeyVal = _fixLenFileFmt.joinBind(_fixLenFileFmt.joinKeyName(attrName, attrElName), refColName, refVal);
				if (_fixLenFileFmt.acceptableMappingValue(refVal, attrName, attrElName) == false) {
					isErr = true;
					_msgL.add(new MCMessage(PFBZL0099, name, bindKeyVal));
					continue;
				}
				errBindL.add(bindKeyVal);
				targetAttrMap.put(attrElName, refVal);
			}
		}
		
		if (isErr == false) {
			int preCnt = _fixLenFileFmt.getErrMsgList().size();
			
			String dataType = PFBZL_FixLenFileInfo.getString(col, "dataType");
			if (TYPE_NUMBER.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(col, "number");
				_fixLenFileFmt.chkNumberAttr(col, attrMap, COLUMN_KEY);
			}
			else if (TYPE_DATE.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(col, "date");
				_fixLenFileFmt.chkDateTsAttr(col, attrMap, COL_D_KEY, COLUMN_KEY);
			}
			else if (TYPE_TIMESTAMP.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(col, "timestamp");
				_fixLenFileFmt.chkDateTsAttr(col, attrMap, COL_TS_KEY, COLUMN_KEY);
			}
			else if (TYPE_BOOL.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(col, "boolean");
				_fixLenFileFmt.chkBooleanAttr(col, attrMap, COLUMN_KEY);
			}
			
			int curCnt = _fixLenFileFmt.getErrMsgList().size();
			if (preCnt != curCnt) {
				_msgL.add(new MCMessage(PFBZL0099, name, _fixLenFileFmt.joinBind(errBindL)));
			}
		}
	}
	
	/**
	 * シノニムの項目に参照先の値を設定する。colsに、参照先のdataTypeを設定する。
	 */
	protected void setSynonymValue(MCRow row, Map<String, Map<String, Object>> cols, String name, Map<String, Object> col) {
		String synonym = PFBZL_FixLenFileInfo.getString(col, SYNONYM_KEY);
		if (isNull(synonym)) {
			return ;
		}
		String[] keys = synonym.split("\\.");
		if (keys.length < 1) {
			return ;
		}
		
		MCRow refRow = getReferToRow(row, cols, name, col, synonym);
		Map<String, Object> refCol = getReferToCol(row, cols, name, col, synonym); 
		
		if (refRow != null && refCol != null) {
			String key = keys.length == 1 ? keys[0] : keys[1];
			row.setValueNE(name, refRow.getValueNE(key));
			col.put(DATATYPE_KEY, refCol.get(DATATYPE_KEY));
		}
	}
	
	protected void writeColumn(MCRow row, String name, Map<String, Object> col) {
		if (_fileInfo.isReturnColumn(col)) {
			writeColReturn(row, name, col);
			return ;
		}
		int length = PFBZL_FixLenFileInfo.getInt(col, LENGTH_KEY);
		if (length <= 0) {
			return ;
		}
		
		String dataType = PFBZL_FixLenFileInfo.getString(col, DATATYPE_KEY);
		
		if (TYPE_STRING.equals(dataType)) {
			writeColString(row, name, col, length);
		}
		else if (TYPE_NUMBER.equals(dataType)) {
			writeColNumber(row, name, col, length);
		}
		else if (TYPE_DATE.equals(dataType)) {
			writeColDate(row, name, col, length);
		}
		else if (TYPE_TIMESTAMP.equals(dataType)) {
			writeColTimestamp(row, name, col, length);
		}
		else if (TYPE_BOOL.equals(dataType)) {
			writeColBool(row, name, col, length);
		}
	}
	
	/**
	 * 改行項目をファイルに出力する
	 */
	protected void writeColReturn(MCRow row, String name, Map<String, Object> col) {
		String str = (String)_fileInfo.getReturnDefault().get("code");
		write(toBytes(str));
	}
	
	/**
	 * 文字型の項目をファイルに出力する
	 */
	protected void writeColString(MCRow row, String name, Map<String, Object> col, int length) {
		MCDataType dataType = row.getDataType(name);
		if (dataType != null && dataType != MCDataType.STRING) {
			_msgL.add(new MCMessage(PFBZL0117, name));
			return ;
		}
		String val = row.getStringNE(name);
		String str = null;
		if (isNull(val)) {
			str = getNullStr(row, name, col, length);
		}
		else {
			str = paddingStr(row, name, val, col, length);
		}
		write(toBytes(str));
	}
	
	/**
	 * 論理型の項目をファイルに出力する
	 */
	@SuppressWarnings("unchecked")
	protected void writeColBool(MCRow row, String name, Map<String, Object> col, int length) {
		MCDataType dataType = row.getDataType(name);
		if (dataType != null && dataType != MCDataType.BOOLEAN) {
			_msgL.add(new MCMessage(PFBZL0117, name));
			return ;
		}
		
		boolean val = row.getBooleanNE(name);
		String str = null;
		Map<String, Object> attr = (Map<String, Object>)col.get(COL_F_KEY);
		if (attr != null) {
			if (val) {
				str = PFBZL_FixLenFileInfo.getString(attr, "trueStr");
			}
			else {
				str = PFBZL_FixLenFileInfo.getString(attr, "falseStr");
			}
		}
		str = paddingStr(row, name, str, col, length);
		write(toBytes(str));
	}
	
	/**
	 * 日付型の項目をファイルに出力する
	 */
	@SuppressWarnings("unchecked")
	protected void writeColDate(MCRow row, String name, Map<String, Object> col, int length) {
		MCDataType dataType = row.getDataType(name);
		if (dataType != null && dataType != MCDataType.DATE) {
			_msgL.add(new MCMessage(PFBZL0117, name));
			return ;
		}
		MCDate val = row.getDateNE(name);
		String str = null;
		if (isNull(val)) {
			str = getNullStr(row, name, col, length);
		}
		else {
			Map<String, Object> attr = (Map<String, Object>)col.get(COL_D_KEY);
			int shiftYear = PFBZL_FixLenFileInfo.getInt(attr, "shiftYear");
			String format = (String)attr.get("format");
			str = getDateStr(format, val.getYear() - shiftYear, val.getMonth(), val.getDay(), val.getHour(), val.getMinute(), val.getSecond());
			str = paddingStr(row, name, str, col, length);
		}
		write(toBytes(str));
	}
	
	/**
	 * タイムスタンプ型の項目をファイルに出力する
	 */
	@SuppressWarnings("unchecked")
	protected void writeColTimestamp(MCRow row, String name, Map<String, Object> col, int length) {
		MCDataType dataType = row.getDataType(name);
		if (dataType != null && dataType != MCDataType.TIMESTAMP) {
			_msgL.add(new MCMessage(PFBZL0117, name));
			return ;
		}
		
		MCTimestamp val = row.getTimestampNE(name);
		String str = null;
		if (isNull(val)) {
			str = getNullStr(row, name, col, length);
		}
		else {
			Map<String, Object> attr = (Map<String, Object>)col.get(COL_TS_KEY);
			int shiftYear = PFBZL_FixLenFileInfo.getInt(attr, "shiftYear");
			String format = (String)attr.get("format");
			str = getTimestampStr(format, val.getYear() - shiftYear, val.getMonth(), val.getDay(), val.getHour(), val.getMinute(), val.getSecond(), val.getMilliSecond());
			str = paddingStr(row, name, str, col, length);
		}
		write(toBytes(str));
	}
	
	protected String getDateStr(String format, int year, int month, int day, int hour, int minute, int second) {
		String str = format;
		if (str.contains("yyyy")) {
			str = str.replace("yyyy", lpad(year, 4, "0"));
		}
		else if (format.contains("yy")) {
			str = str.replace("yy", lpad(year % 100, 2, "0"));
		}
		str = str.replace("MM", lpad(month, 2, "0"));
		str = str.replace("dd", lpad(day, 2, "0"));
		str = str.replace("hh", lpad(hour, 2, "0"));
		str = str.replace("mm", lpad(minute, 2, "0"));
		str = str.replace("ss", lpad(second, 2, "0"));
		return str;
	}
	
	protected String getTimestampStr(String format, int year, int month, int day, int hour, int minute, int second, int milliSecond) {
		String str = getDateStr(format, year, month, day, hour, minute, second);
		if (str.contains("SSS")) {
			str = str.replace("SSS", lpad(milliSecond, 3, "0"));
		}
		else if (str.contains("SS")) {
			str = str.replace("SS", lpad(milliSecond / 10, 2, "0"));
		}
		else if (str.contains("S")) {
			str = str.replace("S", lpad(milliSecond / 100, 1, "0"));
		}
		return str;
	}
	
	/**
	 * 数値型の項目をファイルに出力する
	 */
	@SuppressWarnings("unchecked")
	protected void writeColNumber(MCRow row, String name, Map<String, Object> col, int length) {
		MCDataType dataType = row.getDataType(name);
		if (dataType != null && dataType != MCDataType.NUMBER) {
			_msgL.add(new MCMessage(PFBZL0117, name));
			return ;
		}

		MCNumber val = row.getNumberNE(name);
		String str = null;
		if (isNull(val)) {
			str = getNullStr(row, name, col, length);
		}
		else {
			Map<String, Object> attr = (Map<String, Object>)col.get("number");
			
			String signStr = null;
			String intStr = null;
			String decStr = null;
			if (val.isZero()) {
				signStr = (String)attr.get("signZero");
				if (signStr == null) {
					signStr = (String)attr.get("signPlus");
				}
				intStr = "0";
				decStr = "";
			}
			else {
				MCNumber tmpVal = null;
				if (val.isPositive()) {
					signStr = PFBZL_FixLenFileInfo.getString(attr, "signPlus");
					tmpVal = val;
				}
				else {
					signStr = PFBZL_FixLenFileInfo.getString(attr, "signMinus");
					tmpVal = val.abs();
				}
				String[] tmp = tmpVal.toSimpleString().split("\\.");
				intStr = tmp[0];
				decStr = tmp.length > 1 ? tmp[1] : "";
			}
			
			boolean decimalDisplayFlg = PFBZL_FixLenFileInfo.getBoolean(attr, "decimalDisplayFlg");
			boolean decimalFloatFlg = PFBZL_FixLenFileInfo.getBoolean(attr, "decimalFloatFlg");
			int decimalLength = PFBZL_FixLenFileInfo.getInt(attr, "decimalLength");
			String align = PFBZL_FixLenFileInfo.getString(col, "align");
			
			// 小数点を表示する場合
			if (decimalDisplayFlg) {
				String decimalStr = (String)attr.get("decimalStr");
				String separatorInteger = (String)attr.get("separatorInteger");
				String separatorDecimal = (String)attr.get("separatorDecimal");
				if (!isNull(separatorInteger)) {
					intStr = getNumSepStr(intStr, separatorInteger, numberSeparatorCount(), true);
				}
				if (!isNull(separatorDecimal)) {
					decStr = getNumSepStr(decStr, separatorDecimal, numberSeparatorCount(), false);
				}
				
				// 整数値には小数点を付与しない
				if (decimalFloatFlg) {
					if (!isNull(decStr)) {
						str = intStr + decimalStr + decStr;
					}
					else {
						str = intStr;
					}
				}
				// 整数値でも小数点を付与する
				else {
					if (decimalLength > 0 && ALIGN_RIGHT.equals(align)) {
						if (isNull(separatorDecimal)) {
							if (decStr.length() < decimalLength - decimalStr.length()) {
								decStr = rpad(decStr, decimalLength - decimalStr.length(), "0");
							}
						}
						else {
							StringBuilder sb = new StringBuilder();
							sb.append(decStr);
							int sepCnt = numberSeparatorCount();
							while(true) {
								if (sb.length() >= decimalLength - decimalStr.length()) {
									break;
								}
								if (sb.length() % (sepCnt + separatorDecimal.length()) == 3) {
									sb.append(separatorDecimal);
								}
								else {
									sb.append("0");
								}
							}
							decStr = sb.toString();
						}
					}
					
					str = intStr + decimalStr + decStr;
				}
			}
			// 小数点を表示しない場合
			else {
				if (decStr.length() > decimalLength) {
					_msgL.add(new MCMessage(PFBZL0098, name, length, val, PFBZL_FixLenFileInfo.getString(col, "paddingStr")));
					return ;
				}
				if (decStr.length() < decimalLength) {
					decStr = rpad(decStr, decimalLength, "0");
				}
				if (isSame(intStr, "0") && length == decimalLength + signStr.length()) {
					str = decStr;
				}
				else {
					str = intStr + decStr;
				}
			}
			
			String paddingStr = PFBZL_FixLenFileInfo.getString(col, "paddingStr");
			String signPosition = (String)attr.get("signPosition");
			
			// 文字埋め処理
			if (isSame(align, ALIGN_LEFT) || isSame(signPosition, POSITION_FIT)) {
				str = signStr + str;
				str = paddingStr(row, name, str, paddingStr, align, length);
			}
			else {
				str = paddingStr(row, name, str, paddingStr, align, length, signStr);
			}
		}
		write(toBytes(str));
	}
	
	protected String getNumSepStr(String str, String sep, int sepCnt, boolean intFlg) {
		if (isNull(str) || isNull(sep)) {
			return str;
		}
		String tmpVal = "";
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length ; i++) {
			if (i != 0 && i % sepCnt == 0) {
				if (intFlg) {
					tmpVal = sep + tmpVal;
				}
				else {
					tmpVal = tmpVal + sep;
				}
			}
			if (intFlg) {
				tmpVal = chars[chars.length - 1 - i] + tmpVal;
			}
			else {
				tmpVal = tmpVal + chars[i];
			}
		}
		return tmpVal;
	}
	
	protected int numberSeparatorCount() {
		return 3;
	}
	
	///////////////////////////////////////////////////////////////////////////
	// ファイル出力の共通処理
	////////////////////
	protected String getNullStr(MCRow row, String name, Map<String, Object> col, int length) {
		String nullStr = PFBZL_FixLenFileInfo.getString(col, "nullStr");
		String align = PFBZL_FixLenFileInfo.getString(col, "align");
		return paddingStr(row, name, "", nullStr, align, length);
	}
	
	protected String paddingStr(MCRow row, String name, String val, Map<String, Object> col, int length) {
		String paddingStr = PFBZL_FixLenFileInfo.getString(col, "paddingStr");
		String align = PFBZL_FixLenFileInfo.getString(col, "align");
		return paddingStr(row, name, val, paddingStr, align, length);
	}
	
	protected String paddingStr(MCRow row, String name, String val, String paddingStr, String align, int length) {
		return paddingStr(row, name, val, paddingStr, align, length, "");
	}
	
	protected String paddingStr(MCRow row, String name, String val, String paddingStr, String align, int length, String head) {
		String orgVal = val;
		if (val == null) {
			val = "";
		}
		if (head == null) {
			head = "";
		}
		
		String headVal = null;
		headVal = head + val;
		
		byte[] bytes = toBytes(headVal);
		if (bytes.length == length) {
			return headVal;
		}
		
		if (isNull(paddingStr)) {
			_msgL.add(new MCMessage(PFBZL0098, name, length, orgVal, paddingStr));
			return null;
		}
		
		while (bytes.length < length) {
			if (isSame(align, ALIGN_LEFT)) {
				val = val + paddingStr;
			}
			else {
				val = paddingStr + val;
			}
			headVal = head + val;
			bytes = toBytes(headVal);
		}
		
		if (bytes.length == length) {
			return headVal;
		}
		else {
			_msgL.add(new MCMessage(PFBZL0098, name, length, orgVal, paddingStr));
			return null;
		}
	}
	
	protected byte[] toBytes(String str) {
		if (isNull(str)) {
			return new byte[0];
		}
		try {
			return str.getBytes(_charset);
		}
		catch (UnsupportedEncodingException e) {
			throw new MCAppException(PFBZL0096, _charset);
		}
	}
	
	protected void write(byte[] bytes) {
		if (bytes == null || bytes.length == 0 || hasErr()) {
			return ;
		}
		try {
			_bos.write(bytes);
		}
		catch (IOException ex) {
			MCLog.write(ex);
			throw new MCAppException(PFBZL0101,  _fileDir, _fileName);
		}
	}
	
	protected boolean isSameHeader(MCRow preR, MCRow curR) {
		if (preR == null) {
			return false;
		}
		String[] keys = getHeaderKey();
		if (keys == null || keys.length == 0) {
			return false;
		}
		
		for (String key : keys) {
			if (!isSame(preR.getValueNE(key), curR.getValueNE(key))) {
				return false;
			}
		}
		
		return true;
	}
	
	protected String[] getHeaderKey() {
		String[] tmpkeys = null;
		
		if (_fileInfo.hasHeaderKey()) {
			tmpkeys = _fileInfo.getHeaderKey();
		}
		else {
			tmpkeys = _fileInfo.getHeaderColumn().keySet().toArray(new String[0]);
		}
		if (tmpkeys == null) {
			return new String[0];
		}
		
		HashSet<String> keys = new HashSet<>();
		List<String> cCols = _fileInfo.getControlColNames();
		Map<String, Map<String, Object>> hCols = _fileInfo.getHeaderColumn();
		for (String key : tmpkeys) {
			if (cCols.contains(key) || !hCols.containsKey(key)) {
				continue;
			}
			Map<String, Object> hCol = hCols.get(key);
			if (_fileInfo.isReturnColumn(hCol)) {
				continue;
			}
			if (PFBZL_FixLenFileInfo.isSynonymColumn(hCol)) {
				continue;
			}
			if (PFBZL_FixLenFileInfo.getBoolean(hCol, "dupNameAllowFlg")) {
				continue;
			}
			if (!isNull(PFBZL_FixLenFileInfo.getString(hCol, "fixedValueType"))) {
				continue;
			}
			if (PFBZL_FixLenFileInfo.getOptionAttrArray(hCol, COL_EDIT_KEY) != null) {
				continue;
			}
			keys.add(key);
		}
		
		return keys.toArray(new String[0]);
	}

	
	/**
	 * 制御項目に個別フォーマットに定義された値を設定する。
	 */
	protected void setCtrlVal(MCRow row, String key) {
		setCtrlVal(row, key, -1);
	}
	
	/**
	 * 制御項目に個別フォーマットに定義された値を設定する。
	 */
	protected void setCtrlVal(MCRow row, String key, int idx) {
		if (_fileInfo.hasControl() == false) {
			return ;
		}
		Map<String, Object> ctrlMap = _fileInfo.getControl();
		String name = (String)ctrlMap.get(NAME_KEY);
		Comparable<?> val = null;
		
		if (isSame(key, DATA_KEY)) {
			val = ((Comparable<?>[])_fileInfo.getControl().get(key))[idx];
		}
		else {
			val = (Comparable<?>)_fileInfo.getControl().get(key);
		}
		row.setValueNE(name, val);
	}
	
	/**
	 * rowが属するdataレコードのindexを取得する。dataレコードに属さない場合、負の値を返す。
	 */
	protected int getDataIndex(MCRow row) {
		if (_fileInfo.hasData() == false) {
			return -1;
		}
		
		List<String> cCols = _fileInfo.getControlColNames();
		
		for (int i = 0; i < _fileInfo.getDataColumn().size(); i++) {
			Map<String, Map<String, Object>> columnL = _fileInfo.getDataColumn().get(i);
			for (String name : columnL.keySet()) {
				Map<String, Object> column = columnL.get(name);
				if (cCols.contains(name)) {
					continue;
				}
				if (_fileInfo.isReturnColumn(name)) {
					continue;
				}
				if (PFBZL_FixLenFileInfo.isSynonymColumn(column)) {
					continue;
				}
				if (PFBZL_FixLenFileInfo.getBoolean(column, "dupNameAllowFlg")) {
					continue;
				}
				if (!isNull(PFBZL_FixLenFileInfo.getString(column, "fixedValueType"))) {
					continue;
				}
				if (PFBZL_FixLenFileInfo.getOptionAttrArray(column, COL_EDIT_KEY) != null) {
					continue;
				}
				if (row.contains(name) && !row.isEmpty(name)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	protected boolean hasNullStr(Map<String, Object> col) {
		String val = PFBZL_FixLenFileInfo.getString(col, "nullStr");
		return isNull(val) == false;
	}
	
	protected boolean hasPaddingStr(Map<String, Object> col) {
		String val = PFBZL_FixLenFileInfo.getString(col, "paddingStr");
		return isNull(val) == false;
	}
	
	protected void addColumns(MCRow row, Map<String, Map<String, Object>> cols) {
		for (String name : cols.keySet()) {
			if (row.contains(name)) {
				continue;
			}
			Map<String, Object> col = cols.get(name);
			String dataType = PFBZL_FixLenFileInfo.getString(col, DATATYPE_KEY);
			if (PFBZL_FixLenFileInfo.isSynonymColumn(col)) {
				String synonym = PFBZL_FixLenFileInfo.getString(col, SYNONYM_KEY);
				Map<String, Object> refCol = getReferToCol(row, cols, name, col, synonym);
				if (refCol != null) {
					dataType = PFBZL_FixLenFileInfo.getString(refCol, DATATYPE_KEY);
				}
			}
			if (TYPE_STRING.equals(dataType)) {
				row.addStringColumn(name);
			}
			else if (TYPE_NUMBER.equals(dataType)) {
				row.addNumberColumn(name);
			}
			else if (TYPE_BOOL.equals(dataType)) {
				row.addBooleanColumn(name);
			}
			else if (TYPE_DATE.equals(dataType)) {
				row.addDateColumn(name);
			}
			else if (TYPE_TIMESTAMP.equals(dataType)) {
				row.addTimestampColumn(name);
			}
		}
	}
	
	/**
	 * rowに対して、データ編集「option.edit」、固定値補完「fixedValue」を行う
	 */
	protected void editRow(String rType, MCRow row, Map<String, Map<String, Object>> cols) {
		setEditValues(rType, row, cols);
		setFixedValues(rType, row, cols);
	}
	
	protected void setEditValues(String rType, MCRow row, Map<String, Map<String, Object>> cols) {
		for (String name : cols.keySet()) {
			Map<String, Object> col = cols.get(name);
			Comparable<?> val = row.getValueNE(name);
			val = PFBZL_FixLenFileInfo.getOpEditValue("table", val, col);
			row.setValueNE(name, val);
		}
	}
	
	protected void setFixedValues(String rType, MCRow row, Map<String, Map<String, Object>> cols) {
		for (String name : cols.keySet()) {
			Map<String, Object> col = cols.get(name);
			String fixedValueTyp = PFBZL_FixLenFileInfo.getString(col, "fixedValueType");
			if (isSame(fixedValueTyp, FIX_TYPE_VALUE)) {
				row.setValueNE(name, (Comparable<?>)col.get("fixedValue"));
			}
			else if (isSame(fixedValueTyp, FIX_TYPE_H_ROWS)) {
				if (isSame(rType, HEADER_KEY) || isSame(rType, DATA_KEY) 
						|| isSame(rType, TRAILER_KEY) || isSame(rType, END_KEY)) {
					row.setValueNE(name, MCNumber.valueOf(_headerCnt));
				}
			}
			else if (isSame(fixedValueTyp, FIX_TYPE_D_ROWS)) {
				if (isSame(rType, DATA_KEY) || isSame(rType, TRAILER_KEY)) {
					row.setValueNE(name, MCNumber.valueOf(_dataByHeaderCnt));
				}
			}
		}
	}
	
	protected MCRow getReferToRow(MCRow row, Map<String, Map<String, Object>> cols, String name, Map<String, Object> col, String refName) {
		if (isNull(refName)) {
			return null ;
		}
		String[] keys = refName.split("\\.");
		if (keys.length < 1) {
			return null ;
		}
		
		MCRow refRow = null;
		if (isSame(keys[0], SKIP_KEY)) {
			refRow = _skipRow;
		}
		else if (isSame(keys[0], HEADER_KEY)) {
			refRow = _curHdrRow;
		}
		else if (isSame(keys[0], TRAILER_KEY)) {
			refRow = _trailerRow;
		}
		else if (isSame(keys[0], END_KEY)) {
			refRow = _endRow;
		}
		else {
			refRow = row;
		}
		
		return refRow;
	}
	
	protected Map<String, Object> getReferToCol(MCRow row, Map<String, Map<String, Object>> cols, String name, Map<String, Object> col, String refName) {
		if (isNull(refName)) {
			return null ;
		}
		String[] keys = refName.split("\\.");
		if (keys.length < 1) {
			return null ;
		}
		Map<String, Map<String, Object>> refCols = null; 
		
		if (isSame(keys[0], SKIP_KEY)) {
			refCols = _fileInfo.getSkipColumn();
		}
		else if (isSame(keys[0], HEADER_KEY)) {
			refCols = _fileInfo.getHeaderColumn();
		}
		else if (isSame(keys[0], TRAILER_KEY)) {
			refCols = _fileInfo.getTrailerColumn();
		}
		else if (isSame(keys[0], END_KEY)) {
			refCols = _fileInfo.getEndColumn();
		}
		else {
			refCols = cols;
		}
		
		if (refCols == null) {
			return null;
		}
		
		String key = keys.length == 1 ? keys[0] : keys[1];
		return refCols.get(key);
	}
	
	protected String joinKeyName(String... values) {
		return _fixLenFileFmt.joinKeyName(values);
	}
	
}
