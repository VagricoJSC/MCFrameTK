package mcframe.serverPFBZ.PFBZL9090;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.report.MCReportFile;
import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.serverCore.resource.MCConst;

import mcframe.commonMA.constant.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import mcframe.serverPF.dbc.PFT_SDRV_IF_R;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileFmt;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo.*;
import static mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileDef.*;
import static mcframe.commonPF.notice.PF_Msg.*;

public abstract class PFBZL_FixLenFileReader_MC extends MCReportFile {
	
	/**
	 * BOMの有無の設定（文字コードがUnicodeの場合のみ有効）
	 */
	protected boolean _isBOM = false;

	protected BufferedInputStream _bis = null;
	
	protected String _fileDir = null;
	
	protected String _fileName = null;
	
	/**
	 * 固定長ファイル
	 */
	protected PFBZL_FixLenFileFmt _fixLenFileFmt = null;
	
	/**
	 * 固定長ファイルフォーマット情報
	 */
	protected PFBZL_FixLenFileInfo _fileInfo = null;
	
	/**
	 * ファイル読み込み時のエラー情報を格納します
	 */
	protected MCMessageList _msgL = new MCMessageList();
	
	/**
	 * insertする件数の単位
	 */
	protected int _buffRows = MCConst.app.getInteger("PF.PFBZL9090.read_buffer_rows", 1000);
	
	String _type = null;
	
	/**
	 * 読み込んだ行のメタ配列
	 * <p>
	 * キーはレコードキー<br>
	 * dataレコードの場合はindexを付与した値(ex data.0)
	 */
	protected Map<String, MCReportMeta[]> _metaArryMap = new HashMap<>();
	
	/**
	 * 読込み中のレコードキー名<p>
	 * readLinesで返却した行の情報を保持します。readLineNextが呼ばれると更新されます。
	 */
	protected String _recordName = null;
	
	/**
	 * 読込み中のcontrol.data[]のindex<p>
	 */
	protected int _dataCtrlIndex = -1;
	
	/**
	 * _dataCtrlIndexをRowに格納する項目名
	 */
	protected static final String _dataCtrlIndexName = "_$ctrlIdx$_";

	/**
	 * headerとdataのリスト
	 * <p>
	 * Mapのkey：headerの通し番号（１～）<br>
	 * Mapのvalue(list):List[0]=headerのrow、List[1～]:list[0]のheaderに紐づくdataのrow<br>
	 * 
	 */
	protected Map<Integer, List<MCRow>> _reportSetRowMap = new LinkedHashMap<Integer, List<MCRow>>();
	
	/**
	 * ファイル全体のheaderレコード数<p>
	 */
	protected int _headerCnt = 0;
	
	/**
	 * dataレコード数<p>
	 * header読込み毎にリセット
	 */
	protected int _dataCnt = 0;
	
	/**
	 * 制御項目値ごとのdataレコード数<p>
	 * 配列のindexはcontrol.dataのindex<br>
	 * header読込み毎にリセット
	 */
	protected int[] _dataIdxCnt = null;
	
	/**
	 * 全dataレコード数<p>
	 */
	protected int _dataCntAll = 0;
	
	/**
	 * 制御項目値ごとの全dataレコード数<p>
	 */
	protected int[] _dataIdxCntAll = null;

	/**
	 * 読込み中行のcolumnレコード<p>
	 * readLinesで返却した行の情報を保持します。readLineNextが呼ばれると更新されます。
	 */
	protected List<Map<String, Object>> _columnL = null;

	/**
	 * 処理中行のcolumn<p>
	 * readLines()でreadSetValueを呼び出す際のvalueのカラム情報です。
	 */
	protected Map<String, Object> _column = null;
	
	/**
	 * 処理中のファイルから切り出した値（ログ、メッセージ用）
	 */
	protected String _value = null;
	
	/**
	 * ファイル内のレコードブロックの処理番号<p>
	 * 1ブロック読み込むと+1する
	 */
	protected int _blockIndex = 0;
	
	/**
	 * BOMをスキップしたかどうか
	 */
	protected boolean _isBomSkip = false;

	/**
	 * 次Tokens（文字列配列）<p>
	 * hasMoreTokens()実行時に生成され、nextTokens()実行時に初期化(null化)される。
	 */
	protected String[] _nTokens;
	
	/**
	 * ファイル行ごとのcharset
	 */
	protected String _line_charset;
	
	/**
	 * skip.column項目を格納するMCRowです
	 */
	protected MCRow _skipR = null;

	/**
	 * trailer.column項目を格納するMCRowリストです
	 */
	protected Map<Integer, MCRow> _trailerMap = null;

	/**
	 * end.column項目を格納するMCRowリストです
	 */
	protected MCRow _endR = null;
	
	/**
	 * 改行コード
	 */
	protected byte[] _returnCode = null;
	
	protected final Pattern _calcArgDataIdxPattern = Pattern.compile("^data\\[([0-9]*)\\].*$");
	
	
	public PFBZL_FixLenFileReader_MC() {
		this(MCRow.class);
	}

	public PFBZL_FixLenFileReader_MC(Class<? extends MCRow> rowc) {
		setReportSet(PFBZL_FixLenFileReportSet.create(rowc));
		useRecordType(false);
		useHeading(false);
	}
	
	
	public void setFixLenFileFmt(PFBZL_FixLenFileFmt fmt) {
		_fixLenFileFmt = fmt;
		_fileInfo = fmt.getFileInfo();
		
		_returnCode = ((String)_fileInfo.getReturnDefault().get("code")).getBytes();
		
		if (_fileInfo.hasControl()) {
			// dataの制御項目別件数を保持する配列の初期化
			Map<String, Object> ctrl = _fileInfo.getControl();
			if (ctrl.containsKey(DATA_KEY)) {
				Object[] dataCtl = (Object[]) ctrl.get(DATA_KEY);
				_dataIdxCnt = new int[dataCtl.length];
				_dataIdxCntAll = new int[dataCtl.length];
			}
		}
		
	}
	
	/**
	 * 処理中のファイル行のカラム名リストを取得します。
	 * @return カラム名リスト
	 */
	protected String[] getColumns() {
		String[] names = new String[_columnL.size()];
		for (int i=0; i<_columnL.size(); i++) {
			names[i] = (String)_columnL.get(i).get(NAME_KEY);
		}
		return names;
	}

	/**
	 * ファイルから1行分のカラムを読み込みます。
	 * <p>
	 * BOMは無視します。<br>
	 * SKIPレコードは1行目のヘッダー行のみに含まれます。2行目以降は各行のカラム定義に従います。<br>
	 * 
	 */
	@Override
	public String[] readLines() {
		return nextLineTokens();
	}
	
	/**
	 * 固定長ファイルを行単位で取得します。<P>
	 *
	 * @return 1行分の文字列の配列
	 */
	protected String[] nextLineTokens() {
		String[] ret;

		if (_nTokens != null) {
			ret = _nTokens;
			_nTokens = null;
			return ret;
		}

		if (!hasMoreTokens()) {
			return null;
		}
		return nextLineTokens();
	}

	@Override
	public boolean readLineNext() {
		return hasMoreTokens();
	}
	
	/**
	 * 固定長ファイルから１行分の文字列配列を返せるかどうか
	 * （nextLineTokens()が実行可能かどうか）を判断する。<p>
	 * trueを返す場合はnTokensに1行分のデータを格納します。
	 *
	 * @return 文字列配列を返せる場合は、true
	 */
	protected boolean hasMoreTokens() {
		if (_nTokens != null) {
			return true;
		}

		// BOM付きはBOMデータだけ読み飛ばす
		readSkipBom();

		// 制御項目に文字コードを設定できる機能用（現時点では未使用）
		// 読み込むブロックごとに文字コードをデフォルトに戻す
		_line_charset = _charset;

		int tempInt = -1;
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		String preRecordName = _recordName;
		
		// どのブロックを読み込むか
		List<Map<String, Object>> columnL = getLineColumn(null);
		if (columnL.isEmpty()) {
			throw createAppEx(PFBZL0104);
		}
		
		// ブロックごとの読み込むバイト数を取得
		int length = getReadByte();
		byte[] buffer = new byte[length];
		tempInt = read(buffer);
		
		// EOF到達時の処理
		if (tempInt == -1) {
			if (_fileInfo.isHeaderOnly()) {
				return false;
			}
			else if (_fileInfo.hasEnd()) {
				if (END_KEY.equals(preRecordName)) {
					return false;
				}
			}
			else {
				if (_fileInfo.hasTrailer()) {
					if (TRAILER_KEY.equals(preRecordName)) {
						return false;
					}
				}
				else {
					if (CONTROL_KEY.equals(_recordName)) {
						return false;
					}
				}
			}
		}

		if (tempInt == -1 || tempInt != length) {
			throw createAppEx(PFBZL0105, _blockIndex + 1, _recordName);
		}
		write(bout, buffer);
		
		// controlブロックの場合は、読み込んだ制御項目から続けて読むブロックを判定
		if (CONTROL_KEY.equals(_recordName)) {
			// 次に読むブロック定義を取得
			columnL = getLineColumn(buffer);
			if (columnL.isEmpty()) {
				throw createAppEx(PFBZL0104);
			}
			length = getReadByte();
			buffer = new byte[length];
			tempInt = read(buffer);
			if (tempInt == -1 || tempInt != length) {
				throw createAppEx(PFBZL0105, _blockIndex + 1, _recordName);
			}
			write(bout, buffer);
		}
		if (HEADER_KEY.equals(_recordName)) {
			_headerCnt++;
		}

		if (bout.size() == 0 && !SKIP_KEY.equals(_recordName)) { 
			return false;
		}
		
		// 1ブロック分のバイト配列
		byte[] lineData = bout.toByteArray();
		List<String> tokens = tokens(lineData, columnL);

		_nTokens = tokens.toArray(new String[tokens.size()]);
		_columnL = columnL; // _nTokensにセットした行データのカラム定義を保持
		_blockIndex++;
		return true;
	}

	/**
	 * １ブロック分のバイト配列を１行分の文字列配列へ変換する
	 */
	protected List<String> tokens(byte[] lineData, List<Map<String, Object>> columnL) {
		List<String> tokens = new ArrayList<>();
		int index = 0;
		try {
			// 1行分のバイト配列からカラム定義に従って、カラムを切り出していく。
			for (int i=0; i < columnL.size(); i++) {
				Map<String, Object> col = columnL.get(i);
				// ファイルを参照しないカラムは個別に補完
				// シノニムorダミー
				if (isDummyColumn(col) || isSynonymColumn(col)) {
					// tokensの位置の確保だけしておく
					tokens.add(null);
					continue;
				}
				
				int to = index + getLength(col);
				byte[] colStrB = Arrays.copyOfRange(lineData, index, to);
				String colStr = new String(colStrB, _line_charset);
				tokens.add(colStr);
				index = to;
			}
		}
		catch (UnsupportedEncodingException e) {
			// 設定できる文字コードはチェック済みのためこのエラーはありえない
		}
		return tokens;
	}

	/**
	 * BOM付きの場合、BOM分のバイト数を一度だけ読み飛ばす。
	 */
	protected void readSkipBom() {
		if (!_isBomSkip && isBOM()) {
			byte[] bom = getBOM();
			byte[] b = new byte[bom.length];
			int l = read(b);
			if (l == -1 || l != bom.length) {
				throw createAppEx(PFBZL0103);
			}
			_isBomSkip = true;
		}
		else {
			_isBomSkip = true;
		}
	}

	protected void write(ByteArrayOutputStream bout, byte[] bytes) {
		try {
			bout.write(bytes);
		}
		catch (IOException e) {
			throw createAppEx(PFBZL0106);
		}
	}

	/**
	 * 最大byte.lengthバイトのデータを、この入力ストリームからbufに読み込みます。
	 */
	protected int read(byte[] buf) {
		int len = 0;
		try {
			len = _bis.read(buf);
		}
		catch (IOException ex) {
			MCLog.write(ex);
			throw createAppEx(PFBZL0102);
		}
		return len;
	}

	protected MCAppException createAppEx(String msgId, Comparable<?>...binds) {
		MCAppException ex = new MCAppException(msgId, _fileDir, _fileName);
		if (binds != null) {
			for (int i = 0; i < binds.length; i++) {
				ex.setBind(3+i, binds[i]);
			}
		}
		return ex;
	}

	/**
	 * 読み込むバイト数を取得します。
	 * @return バイト数
	 */
	protected int getReadByte() {
		int b = 0;
		switch(_recordName) {
			case SKIP_KEY:
				b = _fileInfo.getSkipLength();
				break;
			case HEADER_KEY:
				b = _fileInfo.getHeaderLength();
				break;
			case CONTROL_KEY:
				b = _fileInfo.getControlLength();
				break;
			case TRAILER_KEY:
				b = _fileInfo.getTrailerLength();
				break;
			case END_KEY:
				b = _fileInfo.getEndLength();
				break;
			case DATA_KEY:
				b = _fileInfo.getDataLength()[_dataCtrlIndex];
				break;
			default:
				break;
		}
		return b;
	}
	
	/**
	 * 読み込むカラム定義を取得します。
	 * <p>
	 * ctrlBufが指定されている場合は、ctrlBufを解析してどのブロックを読み込むか判定します。
	 * @param ctrlBuf 制御項目のバイト配列
	 * @return カラム定義
	 */
	protected List<Map<String, Object>> getLineColumn(byte[] ctrlBuf) {
		List<Map<String, Object>> columnL = new ArrayList<Map<String, Object>>();

		// skipレコードをまだ読み込んでいない
		if (_fileInfo.getSkipLength() > 0 && _skipR == null) {
			for (Entry<String, Map<String, Object>> e : _fileInfo.getSkipColumn().entrySet()) {
				columnL.add(columnDeepCopy(e.getValue()));
			}
			_recordName = SKIP_KEY;
		}
		// headerレコードのみ（制御項目なし）
		else if (_fileInfo.isHeaderOnly()) {
			for (Entry<String, Map<String, Object>> e : _fileInfo.getHeaderColumn().entrySet()) {
				columnL.add(columnDeepCopy(e.getValue()));
			}
			_recordName = HEADER_KEY;
		}
		// 制御レコードを読み込んでいない
		else if (ctrlBuf == null) {
			for (Entry<String, Map<String, Object>> e : _fileInfo.getControlColumn().entrySet()) {
				columnL.add(columnDeepCopy(e.getValue()));
			}
			_recordName = CONTROL_KEY;
		}
		// 制御レコード読み込み済みの場合は、制御項目を判定し、次に読み込むべきブロックを判断する。
		else if (ctrlBuf != null) {
			// 制御項目を判定し、どのレコードか判断する
			String key = getRecodeKey(ctrlBuf, 0);
			_recordName = key;
			
			Map<String, Map<String, Object>> columnMap = null;
			if (HEADER_KEY.equals(key)) {
				columnMap = _fileInfo.getHeaderColumn();
				_dataCnt = 0;
				if (_fileInfo.hasData()) {
					_dataIdxCnt = new int[_dataIdxCnt.length];
				}
			}
			else if (TRAILER_KEY.equals(key)) {
				columnMap = _fileInfo.getTrailerColumn();
			}
			else if (END_KEY.equals(key)) {
				columnMap = _fileInfo.getEndColumn();
			}
			else {
				// dataの場合は制御項目の値を判定し、data[].columnを特定する。
				String[] dkey = key.split("\\.");
				if (DATA_KEY.equals(dkey[0])) {
					int dIdx = Integer.valueOf(dkey[1]);	// control.data[]のindex
					columnMap = _fileInfo.getDataColumn().get(dIdx);
					_recordName = DATA_KEY;
					_dataCtrlIndex = dIdx;
					
					// 各データレコードの件数をカウントアップ.trailerとかendで使う。
					_dataCnt++;
					_dataCntAll++;
					_dataIdxCnt[_dataCtrlIndex]++;
					_dataIdxCntAll[_dataCtrlIndex]++;
				}
			}
			if (columnMap != null) {
				for (Entry<String, Map<String, Object>> e : columnMap.entrySet()) {
					columnL.add(columnDeepCopy(e.getValue()));
				}
			}
		}
		
		return columnL;
	}
	
	/**
	 * controlレコードの制御項目を判定し、どのレコードの処理か判断する。
	 * <p>
	 * 当該レコードのキーを返却する。
	 * @param lineData 行データ
	 * @param index 開始インデックス
	 * @return レコードキー
	 */
	protected String getRecodeKey(byte[] ctrlBuf, int index) {
		String key = null;
		
		Map<String, Object> ctrlMap = _fileInfo.getControl();
		// control.nameの値
		String ctrlColName = (String)ctrlMap.get(NAME_KEY);
		String ctrlVal = null;
		Map<String, Object> ctrlColMap = null;
		for (Entry<String, Map<String, Object>> e : _fileInfo.getControlColumn().entrySet()) {
			String name = e.getKey();
			Map<String, Object> col = e.getValue();
			if (isDummyColumn(col)) {
				continue;
			}
			int len = getLength(col);
			// control.column[]からnameと一致するcolumnを探す
			if (name.equals(ctrlColName) && len > 0) {
				ctrlColMap = col;
				// 行データから制御項目を切り出し
				byte[] ctrlB = Arrays.copyOfRange(ctrlBuf, index, index + len);
				// 指定文字コードで変換
				try {
					ctrlVal = new String(ctrlB, _line_charset);
				}
				catch (UnsupportedEncodingException ex) {
					// 設定できる文字コードはチェック済みのためこのエラーはありえない
				}
				break;
			}
			index += getLength(col);
		}

		// 切り出した制御項目がcontrolレコードの定義値と一致するか判定
		if (isSameCtrlKey(ctrlVal, ctrlMap.get(HEADER_KEY), ctrlColMap)) {
			key = HEADER_KEY;
		}
		else if (_fileInfo.hasTrailer() && isSameCtrlKey(ctrlVal, ctrlMap.get(TRAILER_KEY), ctrlColMap)) {
			key = TRAILER_KEY;
		}
		else if (_fileInfo.hasEnd() && isSameCtrlKey(ctrlVal, ctrlMap.get(END_KEY), ctrlColMap)) {
			key = END_KEY;
		}
		else if (_fileInfo.hasData()) {
			Object[] data = (Object[])ctrlMap.get(DATA_KEY);
			int idx = 0;
			for (Object val : data) {
				if (isSameCtrlKey(ctrlVal, val, ctrlColMap)) {
					key = DATA_KEY + "." + idx;
					break;
				}
				idx++;
			}
		}
		if (key == null) {
			throw createAppEx(PFBZL0109, _blockIndex + 1, ctrlColName, ctrlVal);
		}
		return key;
	}
	
	/**
	 * column.nullStrと一致する場合はnullを返します。
	 * 一致しない場合はvalを返します。
	 * 
	 * @param val 対象の値
	 * @param colMap 値のカラム定義
	 * @return nullStrと一致する場合null
	 */
	protected String convertNullStr(String val, Map<String, Object> colMap) {
		// null文字変換はboolean以外
		if (isBoolType(colMap)) {
			return val;
		}
		if (!colMap.containsKey("nullStr") || isNull(val)) {
			return val;
		}
		
		String nullStr = (String)colMap.get("nullStr");
		if (isNull(nullStr)) {
			return val;
		}
		int nullStrlen = nullStr.length();
		int vallen = val.length();
		if (vallen % nullStrlen != 0) {
			return val;
		}
		
		for (int i = 0; i <= vallen - nullStrlen;) {
			String v = val.substring(i, i + nullStrlen);
			if (!v.equals(nullStr)) {
				return val;
			}
			i += nullStrlen;
		}
		
		return null;
	}
	
	/**
	 * 制御項目が制御項目定義と一致するか判定する。
	 * <p>
	 * 制御項目の型はstringかnumberのみ対応
	 * 
	 * @param val1 固定長ファイルから取得した制御項目値
	 * @param val2 フォーマットファイルの制御項目値
	 * @param ctrlColMap フォーマットファイルの制御項目定義
	 * @return 一致する場合true
	 */
	protected boolean isSameCtrlKey(String val1, Object val2, Map<String, Object> ctrlColMap) {
		// 制御項目のデータ型
		String dataType = (String)ctrlColMap.get(DATATYPE_KEY);
		
		switch (dataType) {
			case TYPE_STRING:
				val1 = removePadding(val1, getPaddingStr(ctrlColMap), getAlign(ctrlColMap));
				return isSame(val1, (Comparable<?>)val2);
			default:
			// 制御項目には指定できないデータ型
			// NUMBER, DATE, TIMESTAMP, BOOLEAN
				break;
		}
		return false;
	}
	
	/**
	 * 埋め文字を除去する。
	 * <p>
	 * @param val 対象文字列
	 * @param paddingStr フォーマットファイルの埋め文字列
	 * @param align フォーマットファイルの整列方法
	 * @return
	 */
	protected String removePadding(String val, String paddingStr, String align) {
		if (isNull(val) || isNull(paddingStr) || isNull(align)) {
			return val;
		}
		
		char paddingC = paddingStr.charAt(0);
		// 左寄せは右から埋め文字を除去
		if (ALIGN_LEFT.equals(align)) {
			int idx = 0;
			for (idx = val.length()-1; idx >= 0; idx--) {
				char s = val.charAt(idx);
				if (paddingC != s) {
					break;
				}
			}
			idx = idx == val.length()-1 ? val.length() : idx +1;
			val = val.substring(0, idx);
		}
		// 右寄せは左から埋め文字を除去
		else if (ALIGN_RIGHT.equals(align)) {
			int idx = 0;
			for (idx = 0; idx < val.length(); idx++) {
				char s = val.charAt(idx);
				if (paddingC != s) {
					break;
				}
			}
			val = val.substring(idx);
		}
		return val;
	}
	
	/**
	 * 文字列をトリムする。
	 * <p>
	 * @param val 対象文字列
	 * @param trimType フォーマットファイルのトリム方法
	 * @return トリムした文字列
	 */
	protected boolean isTrimCol(Map<String, Object> colMap) {
		return isStringType(colMap) && TRIM_TYPE_BOTH.equals(getString(colMap, "trim"));
	}
	
	/**
	 * カラム定義から"paddingStr"を取得します。
	 * <p>
	 * @param colMap カラム定義
	 * @return "paddingStr"の値。見つからない場合はnull。
	 */
	protected String getPaddingStr(Map<String, Object> colMap) {
		return getPaddingStr(colMap, null);
	}
	
	protected String getPaddingStr(Map<String, Object> colMap, String def) {
		String padding = getString(colMap, "paddingStr");
		return padding != null ? padding : def;
	}

	/**
	 * カラム定義から"align"を取得します。
	 * <p>
	 * @param colMap カラム定義
	 * @return "align"の値。見つからない場合はnull。
	 */
	protected String getAlign(Map<String, Object> colMap) {
		return getString(colMap, "align");
	}

	@Override
	protected void readLine(String fileName) {
		File f = new File(fileName);
		_fileDir = f.getParent();
		_fileName = f.getName();
		
		_line_charset = _charset;
		
		ArrayList<Integer> tgtHeaderCntL = new ArrayList<>();
		try {
			String preRecordName = null;
			//1行分のデータ読み込み
			while (readLineNext()) {
				String[] values = readLines();
				values = fireReadLines(_blockIndex, values);

				if (HEADER_KEY.equals(_recordName)) {
					// 値をrowに詰める
					MCRow r = setLineValue(fileName, _blockIndex, values, null);
					List<MCRow> headL = new ArrayList<MCRow>();
					headL.add(r);
					_reportSetRowMap.put(_headerCnt, headL);
					if (preRecordName != null && !isSame(preRecordName, SKIP_KEY)) {
						if (_fileInfo.hasTrailer() && !isSame(preRecordName, TRAILER_KEY)) {
							throw createAppEx(PFBZL0116, _blockIndex);
						}
					}
				}
				else if (DATA_KEY.equals(_recordName)) {
					if (!_reportSetRowMap.containsKey(_headerCnt)) {
						throw createAppEx(PFBZL0110, _blockIndex);
					}
					if (!isSame(preRecordName, HEADER_KEY) && !isSame(preRecordName, DATA_KEY)) {
						throw createAppEx(PFBZL0110, _blockIndex);
					}
					MCRow r = setLineValue(fileName, _blockIndex, values, null);
					// このdata行が制御項目coltrol.data[]のどの値(index)のカラム定義か判断するための値
					r.addNumberColumn(_dataCtrlIndexName, MCNumber.valueOf(_dataCtrlIndex));
					// headerに紐づけてRowを追加
					_reportSetRowMap.get(_headerCnt).add(r);
				}
				else if (TRAILER_KEY.equals(_recordName)) {
					if (!_reportSetRowMap.containsKey(_headerCnt)) {
						throw createAppEx(PFBZL0110, _blockIndex);
					}
					if (!isSame(preRecordName, HEADER_KEY) && !isSame(preRecordName, DATA_KEY)) {
						throw createAppEx(PFBZL0110, _blockIndex);
					}
					setTrailerValue(fileName, _blockIndex, values);
				}
				else if (END_KEY.equals(_recordName)) {
					if (isSame(preRecordName, END_KEY)) {
						throw createAppEx(PFBZL0110, _blockIndex);
					}
					if (_headerCnt >= 1) {
						if (_fileInfo.hasTrailer() && !isSame(preRecordName, TRAILER_KEY)) {
							throw createAppEx(PFBZL0116, _blockIndex);
						}
					}
					setEndValue(fileName, _blockIndex, values);
				}
				else if (SKIP_KEY.equals(_recordName)) {
					setSkipValue(fileName, _blockIndex, values);
				}
				
				// header単位でreportSetにRowを追加する
				if (HEADER_KEY.equals(_recordName)) {
					// 一つ前のheaderに紐づくrowを確定する
					if (_headerCnt > 1) {
						tgtHeaderCntL.add(_headerCnt - 1);
					}
				}
				preRecordName = _recordName;

				flushRows(fileName, tgtHeaderCntL, _blockIndex);
			}
		}
		catch (Exception ex) {
			throw fireErrReadLine(ex, fileName, _blockIndex);
		}
		
		tgtHeaderCntL.add(_headerCnt);
		fixRows(fileName, tgtHeaderCntL, _blockIndex);
		_insertRptL();
	}
	
	/**
	 * reportSetに追加するRowの確定
	 * <p>
	 * 発番、シノニムの参照を行ってから格納する
	 * 
	 * @param fileName ファイル名
	 * @param headerCntL 処理対象のヘッダー番号
	 * @param blockIndex ブロック番号
	 */
	protected void fixRows(String fileName, ArrayList<Integer> headerCntL, int blockIndex) {
		if (headerCntL == null || headerCntL.isEmpty()) {
			return ;
		}
		setNumVal(fileName, headerCntL);
		trimStr(fileName, headerCntL);
		setSynonymVal(fileName, headerCntL);
		for (Integer i : headerCntL) {
			fixRow(fileName, i);
		}
		headerCntL.clear();
	}
	
	protected void setNumVal(String fileName, ArrayList<Integer> headerCntL) {
		// 発番パタンマスタによる発番処理
		setNumValForNumPtn(fileName, headerCntL);
		// シーケンスによる発番処理
		setNumValForSeq(fileName, headerCntL);
	}
	
	@SuppressWarnings("unchecked")
	protected void setNumValForNumPtn(String fileName, ArrayList<Integer> headerCntL) {
		Map<String, Object> numPtnMap = new HashMap<>();
		Map<Integer, ElmArgsR> numArgsStrMap = new HashMap<>();
		Map<Integer, ElmArgsR> numArgsNumMap = new HashMap<>();
		setNumPtnInfo(numPtnMap, numArgsStrMap, numArgsNumMap, headerCntL, COL_NPTN_KEY, "numPtnCd");
		Map<String, Object> numPtnKeyMap = (Map<String, Object>)numPtnMap.get("num_ptn_key");
		if (numPtnKeyMap == null) {
			return ;
		}
		
		MCList<ElmArgsR> numValNumL = MCList.create(ElmArgsR.class);
		for (Integer i : numArgsNumMap.keySet()) {
			numValNumL.add(numArgsNumMap.get(i));
		}
		MCList<ElmArgsR> numValStrL = MCList.create(ElmArgsR.class);
		for (Integer i : numArgsStrMap.keySet()) {
			numValStrL.add(numArgsStrMap.get(i));
		}
		setNum(MAC_NUM_BIZ_TYP.ESBNUM, numValNumL);
		setNum(MAC_NUM_BIZ_TYP.ESBSTR, numValStrL);
		
		for (String key : numPtnKeyMap.keySet()) {
			Map<String, Object> numPtnInfo = (Map<String, Object>)numPtnKeyMap.get(key);
			ArrayList<HashMap<String, Object>> list = (ArrayList<HashMap<String, Object>>)numPtnInfo.get("list");
			if (list == null) {
				continue;
			}
			
			for (HashMap<String, Object> rs : list) {
				MCRow row = (MCRow)rs.get("row");
				String name = (String)rs.get("name");
				Map<String, Object> col = (Map<String, Object>)rs.get("col");
				Integer peg_no = (Integer)rs.get("peg_no");
				
				if (isStringType(col)) {
					ElmArgsR elm = numArgsStrMap.get(peg_no);
					if (elm != null) {
						row.setStringNE(name, elm.new_no());
					}
				}
				else if (isNumberType(col)){
					ElmArgsR elm = numArgsNumMap.get(peg_no);
					if (elm != null) {
						MCNumber val = null;
						try {
							val = MCNumber.valueOf(elm.new_no());
						}
						catch (MCException ex) {
						}
						row.setNumberNE(name, val);
					}
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void setNumValForSeq(String fileName, ArrayList<Integer> headerCntL) {
		Map<String, Object> numPtnMap = new HashMap<>();
		Map<Integer, ElmArgsR> numArgsMap = new HashMap<>();
		setNumPtnInfo(numPtnMap, numArgsMap, numArgsMap, headerCntL, COL_SEQ_KEY, "name");
		Map<String, Object> numPtnKeyMap = (Map<String, Object>)numPtnMap.get("num_ptn_key");
		if (numPtnKeyMap == null) {
			return ;
		}
		
		MCList<ElmArgsR> numValL = MCList.create(ElmArgsR.class);
		for (Integer i : numArgsMap.keySet()) {
			numValL.add(numArgsMap.get(i));
		}
		for (MCList<ElmArgsR> grpL : numValL.groupList(ElmArgsR.$num_ptn_cd)) {
			ElmArgsR grpR = grpL.get(0);
			doSeqCache(grpR.num_ptn_cd(), grpL.size());
			grpL.sort(ElmArgsR.$peg_no);
			for (ElmArgsR r : grpL) {
				r.num(getSequence(grpR.num_ptn_cd()));
			}
		}
		
		for (String seqNm : numPtnKeyMap.keySet()) {
			Map<String, Object> numPtnInfo = (Map<String, Object>)numPtnKeyMap.get(seqNm);
			ArrayList<HashMap<String, Object>> list = (ArrayList<HashMap<String, Object>>)numPtnInfo.get("list");
			if (list == null) {
				continue;
			}
			
			for (HashMap<String, Object> rs : list) {
				MCRow row = (MCRow)rs.get("row");
				String name = (String)rs.get("name");
				Map<String, Object> col = (Map<String, Object>)rs.get("col");
				Integer peg_no = (Integer)rs.get("peg_no");
				
				if (isStringType(col)) {
					String val = null;
					ElmArgsR elm = numArgsMap.get(peg_no);
					if (elm == null) {
						continue;
					}
					Map<String, Object> numTyp = getOptionAttr(col, COL_SEQ_KEY);
					int length = getInt(numTyp, "length");
					if (length == 0) {
						length = getInt(col, "length");
					}
					val = getSeqStr(elm.num(), length, getString(numTyp, "head"), getString(numTyp, "paddingStr"));
					row.setStringNE(name, val);
				}
				else if (isNumberType(col)){
					ElmArgsR elm = numArgsMap.get(peg_no);
					if (elm == null) {
						continue;
					}
					row.setNumberNE(name, elm.num());
				}
			}
		}
	}
	
	protected String getSeqStr(MCNumber num, int length, String head, String paddingStr) {
		String val = null;
		
		head = nvl(head, "");
		if (isNull(paddingStr) || paddingStr.length() != 1) {
			paddingStr = "0";
		}
		
		if (length > head.length()) {
			val = head + lpad(isNull(num) ? "" : num.toSimpleString(), length - head.length(), paddingStr);
		}
		return val;
	}
	
	protected void setNumPtnInfo(Map<String, Object> numPtnMap, Map<Integer, ElmArgsR> numArgsStrMap, Map<Integer, ElmArgsR> numArgsNumMap, 
			ArrayList<Integer> headerCntL, String nptnKey, String nptnCdKey) {
		
		// headerのカラム定義Mapのリスト
		List<Map<String, Object>> headerNumPtnL = getNumPtnColL(_fileInfo.getHeaderColumn(), nptnKey, nptnCdKey);
		
		// dataのカラム定義Mapのリスト
		HashMap<Integer, List<Map<String, Object>>> dataNumPtnMap = new HashMap<>();
		if (_fileInfo.hasData()) {
			List<Map<String, Map<String, Object>>> dColumnsL = _fileInfo.getDataColumn();
			for (int i = 0; i < dColumnsL.size(); i++) {
				List<Map<String, Object>> dataNumPtnL = getNumPtnColL(dColumnsL.get(i), nptnKey, nptnCdKey);
				if (dataNumPtnL != null && !dataNumPtnL.isEmpty()) {
					dataNumPtnMap.put(i, dataNumPtnL);
				}
			}
		}
		
		if (headerNumPtnL.isEmpty() && dataNumPtnMap.isEmpty()) {
			return ;
		}
		
		for (Integer headerCnt : headerCntL) {
			List<MCRow> preHeaderL = _reportSetRowMap.get(headerCnt - 1);
			List<MCRow> curHeaderL = _reportSetRowMap.get(headerCnt);
			
			MCRow preHdrR = null;
			
			if (curHeaderL == null || curHeaderL.isEmpty()) {
				continue ;
			}
			if (preHeaderL != null && !preHeaderL.isEmpty()) {
				preHdrR = preHeaderL.get(0);
			}
			
			MCRow curHdrR = curHeaderL.get(0);
			setNumPtnInfo(numPtnMap, numArgsStrMap, numArgsNumMap, headerNumPtnL, curHdrR, preHdrR, HEADER_KEY, curHdrR, nptnKey, nptnCdKey);
			
			if (curHeaderL.size() > 1) {
				for (Integer i : dataNumPtnMap.keySet()) {
					List<Map<String, Object>> dataNumPtnL = dataNumPtnMap.get(i);
					if (dataNumPtnL == null) {
						continue;
					}
					for (int k = 1; k < curHeaderL.size(); k++) {
						setNumPtnInfo(numPtnMap, numArgsStrMap, numArgsNumMap, dataNumPtnL, curHdrR, preHdrR, DATA_KEY, curHeaderL.get(k), nptnKey, nptnCdKey);
					}
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	protected void setNumPtnInfo(Map<String, Object> numPtnMap, Map<Integer, ElmArgsR> numArgsStrMap, Map<Integer, ElmArgsR> numArgsNumMap, 
			List<Map<String, Object>> colL, MCRow curHdrR, MCRow preHdrR, String type, MCRow curR, String nptnKey, String nptnCdKey) {
		Integer peg_num = (Integer)numPtnMap.get("peg_no");
		int peg_no = peg_num == null ? 0 : peg_num.intValue();
		Map<String, Map<String, Object>> numPtnKeyMap = (Map<String, Map<String, Object>>)numPtnMap.get("num_ptn_key");
		if (numPtnKeyMap == null) {
			numPtnKeyMap = new HashMap<String, Map<String, Object>>();
			numPtnMap.put("num_ptn_key", numPtnKeyMap);
		}
		
		for (Map<String, Object> col : colL) {
			String dataType = getString(col, DATATYPE_KEY);
			String name = getString(col, NAME_KEY);
			Map<String, Object> numTyp = getOptionAttr(col, nptnKey);
			String numPtnCd = getString(numTyp, nptnCdKey);
			String numPtnKey = COL_NPTN_KEY.equals(nptnCdKey) ? dataType + "." + numPtnCd : numPtnCd;
			
			Map<String, Object> numPtnInfo = numPtnKeyMap.get(numPtnKey);
			if (numPtnInfo == null) {
				numPtnInfo = new HashMap<>();
				numPtnKeyMap.put(numPtnKey, numPtnInfo);
				
				numPtnInfo.put(nptnCdKey, numPtnCd);
				numPtnInfo.put("list", new ArrayList<HashMap<String, Object>>());
			}
			
			ArrayList<HashMap<String, Object>> list = (ArrayList<HashMap<String, Object>>)numPtnInfo.get("list");
			HashMap<String, Object> result = new HashMap<>();
			result.put("header", curHdrR);
			result.put("row", curR);
			result.put("type", type);
			result.put("name", name);
			result.put("col", col);
			list.add(result);
			
			result.put("peg_no", peg_no);
			if (isStringType(col)) {
				numArgsStrMap.put(peg_no, createNumElm(peg_no, numPtnCd));
			}
			else {
				numArgsNumMap.put(peg_no, createNumElm(peg_no, numPtnCd));
			}
			peg_no++;
		}
		numPtnMap.put("peg_no", peg_no);
	}
	
	protected ElmArgsR createNumElm(int peg_no, String numPtnCd) {
		ElmArgsR arg = ElmArgsR.create();
		arg.peg_no(peg_no);
		arg.num_ptn_cd(numPtnCd);
		arg.dt(getToday());
		return arg;
	}
	
	protected List<Map<String, Object>> getNumPtnColL(Map<String, Map<String, Object>> cols, String numTypKey, String numCdKey) {
		List<Map<String, Object>> numPtnL = new ArrayList<Map<String, Object>>();
		if (cols == null) {
			return numPtnL;
		}
		for (String name :cols.keySet()) {
			Map<String, Object> col = cols.get(name);
			
			if (!isStringType(col) && !isNumberType(col)) {
				continue;
			}
			Map<String, Object> numTyp = getOptionAttr(col, numTypKey);
			if (numTyp == null) {
				continue;
			}
			
			String numCd = getString(numTyp, numCdKey);
			if (isNull(numCd)) {
				continue;
			}
			
			numPtnL.add(columnDeepCopy(col));
		}
		return numPtnL;
	}
	
	protected void trimStr(String fileName, ArrayList<Integer> headerCntL) {
		for (Integer headerCnt : headerCntL) {
			List<MCRow> headL = _reportSetRowMap.get(headerCnt);
			
			if (headL == null || headL.isEmpty()) {
				return ;
			}
			
			MCRow headerR = headL.get(0);
			
			Map<String, Map<String, Object>> hColumnL = _fileInfo.getHeaderColumn();
			for (String name : hColumnL.keySet()) {
				Map<String, Object> col = hColumnL.get(name);
				if (isTrimCol(col)) {
					headerR.setStringNE(name, MCStringUtil.trim(headerR.getStringNE(name)));
				}
			}
			
			for (int i = 1; i < headL.size(); i++) {
				MCRow dataR = headL.get(i);
				Map<String, Map<String, Object>> dColumnL = _fileInfo.getDataColumn().get(dataR.getNumber(_dataCtrlIndexName).intValue());
				for (String name : dColumnL.keySet()) {
					Map<String, Object> col = dColumnL.get(name);
					if (isTrimCol(col)) {
						dataR.setStringNE(name, MCStringUtil.trim(dataR.getStringNE(name)));
					}
				}
			}
		}
	}
	
	protected void setSynonymVal(String fileName, ArrayList<Integer> headerCntL) {
		for (Integer headerCnt : headerCntL) {
			List<MCRow> headL = _reportSetRowMap.get(headerCnt);
			
			if (headL == null || headL.isEmpty()) {
				return ;
			}
			
			MCRow headerR = headL.get(0);
			Map<String, Map<String, Object>> hColumnL = _fileInfo.getHeaderColumn();
			MCRow trailerR = null;
			if (_trailerMap != null) {
				trailerR = _trailerMap.get(headerCnt);
			}
			setSynonymVal(HEADER_KEY, headerR, hColumnL, headerR, trailerR);
			
			for (int i = 1; i < headL.size(); i++) {
				MCRow dataR = headL.get(i);
				Map<String, Map<String, Object>> dColumnL = _fileInfo.getDataColumn().get(dataR.getNumber(_dataCtrlIndexName).intValue());
				setSynonymVal(DATA_KEY, dataR, dColumnL, headerR, trailerR);
			}
		}
	}
	
	protected void setSynonymVal(String rowType, MCRow row, Map<String, Map<String, Object>> cols, MCRow header, MCRow trailer) {
		for (String name : cols.keySet()) {
			Map<String, Object> col = cols.get(name);
			if (isSynonymColumn(col)) {
				String synonym = getString(col, SYNONYM_KEY);
				MCRow refRow = getRefRow(rowType, row, synonym, header, trailer);
				if (refRow == null) {
					continue;
				}
				String[] keys = synonym.split(Pattern.quote("."));
				if (keys.length > 1) {
					String refname = keys[1];
					row.setValueNE(name, refRow.getValueNE(refname));
				}
			}
		}
	}
	
	protected MCRow getRefRow(String rowType, MCRow row, String synonym, MCRow header, MCRow trailer) {
		String[] keys = synonym.split(Pattern.quote("."));
		MCRow refRow = null;
		if (keys[0].equals(rowType)) {
			refRow = row;
		}
		else if (keys[0].equals(HEADER_KEY)){
			refRow = header;
		}
		else if (keys[0].equals(TRAILER_KEY)){
			refRow = trailer;
		}
		else if (keys[0].equals(END_KEY)){
			refRow = _endR;
		}
		else if (keys[0].equals(SKIP_KEY)){
			refRow = _skipR;
		}
		return refRow;
	}
	
	/**
	 * reportSetに追加するRowの確定
	 * 
	 * @param fileName ファイル名
	 * @param headerCntL 処理対象のヘッダー番号
	 */
	protected void fixRow(String fileName, Integer headerCnt) {
		List<MCRow> headL = _reportSetRowMap.get(headerCnt);
		
		if (headL == null || headL.isEmpty()) {
			return ;
		}
		
		if (headL.size() == 1) {
			// 1つ前レコードはheaderのみ
			MCRow repotR = headL.get(0);
			_reportSet.addRow(repotR);
		}
		else {
			// headerとdataを１つのrowにする処理
			// headLのindex
			// 0:headerのRow
			// 1以降:headerに紐づくdataのRow
			
			MCRow headerR = headL.get(0);
			for (int i = 1; i < headL.size(); i++) {
				// headerのRowをcloneして、そのRowにdataのRowをマージする(row.setValues)
				MCRow row = headerR.clone();
				MCRow dataR = headL.get(i);
				
				// dataのカラム定義Map
				Map<String, Map<String, Object>> dColumnL = _fileInfo.getDataColumn().get(dataR.getNumber(_dataCtrlIndexName).intValue());

				row.addNumberColumn(_dataCtrlIndexName);
				// カラム定義のnameを抽出
				String[] names = new String[dColumnL.size()+1];
				int j = 0;
				for (Entry<String, Map<String, Object>> entry : dColumnL.entrySet()) {
					names[j] = (String)entry.getKey();
					j++;
				}
				names[j] = _dataCtrlIndexName;	// 制御項目のindex
				// headerのrowにdataのrowをマージ
				row.setValuesNE(names, dataR, names);
				
				_reportSet.addRow(row);
			}
		}
	}
	
	/**
	 * Rowに1レコード分の値を設定します。
	 * @param fileName ファイル名
	 * @param rowIndex rowIndex
	 * @param values 値
	 * @param headerR ヘッダーRow(dataレコードセットする場合このrowを使用)
	 * @return 値を設定したMCRow
	 */
	protected MCRow setLineValue(String fileName, int rowIndex, String[] values, MCRow headerR) {
		//ブロックの確定
		String rType = getRecordType(rowIndex, values);
		rType = fireReadRecordTypeFix(rType, rowIndex, values);

		//Rowの確定
		MCRow r;
		if (headerR == null) {
			r = createReadRow(rowIndex, values, rType);
			r = fireReadRowFix(r, rowIndex, values, rType);
		}
		else {
			r = headerR;
		}

		// メタの確定
		// メタ定義にないカラムはdummyMetaｔがセットされる
		MCReportMeta[] rmetas = getFireReadReportMetaArray(rowIndex, values, r, rType);

		if (values != null) {
			//データの格納
			for (int i = 0; i < values.length; i++) {
				// readSetValueに渡すカラムのカラム定義
				// readLinesでダミー値やシノニムは補完されてvaluesにセットされているため
				// valuesの要素数と_columnLの要素数は一致するはず。
				_column = _columnL.get(i);
				
				MCReportMeta rmeta = null;
				if (rmetas != null) {
					if (rmetas.length > i) {
						rmeta = rmetas[i];
					}
				}
				
				readSetValue(fileName, r, rowIndex, i, rmeta, values[i]);
			}
		}
		
		return r;
	}
	
	/**
	 * 固定長フォーマットの属性に従って値を変換、Rowに詰める。
	 * <p>
	 * メタ定義がない(nullまたはdummyメタ)カラムは一時カラムとして追加します。<br>
	 * 改行項目は何もしません。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 */
	@Override
	public void setValue(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta) {
		Map<String, Object> colMap = _column;
		_value = value;
		value = convertNullStr(value, colMap);
		
		if (!checkMetaType(rowIndex, colIndex, r, value, rmeta)) {
			return;
		}
		
		// メタがコンテナから取得できたメタならMCRow.set～で固定カラムとして追加,それ以外はMCRow.add～で一時カラムとして追加
		boolean isConst = (rmeta == null || rmeta == _getDmyMeta()) ? false : true;
		String name = (String)colMap.get(NAME_KEY);
		
		// シノニム項目は発番後に補完するためここでは処理しない
		if (isSynonymColumn(colMap)) {
			return;
		}
		
		// 改行項目はスキップ
		if (_fileInfo.isReturnColumn(colMap)) {
			if (!r.contains(name)) {
				r.addStringColumn(name);
			}
			return;
		}

		int msgCnt = _msgL.size();
		Comparable<?> v = null;
		
		if (isDummyColumn(colMap)) {
			v = getDummyValue(rowIndex, colIndex, r, value, rmeta, colMap);
		}
		else if (isStringType(colMap)) {
			v = convertString(rowIndex, colIndex, r, value, rmeta, colMap);
		}
		else if (isNumberType(colMap)) {
			v = convertNumber(rowIndex, colIndex, r, value, rmeta, colMap);
		}
		else if (isDateType(colMap)) {
			v = convertDate(rowIndex, colIndex, r, value, rmeta, colMap);
		}
		else if (isTimestampType(colMap)) {
			v = convertTimestamp(rowIndex, colIndex, r, value, rmeta, colMap);
		}
		else if (isBoolType(colMap)) {
			v = convertBoolean(rowIndex, colIndex, r, value, rmeta, colMap);
		}
		// 変換時にエラーがあった場合
		if (msgCnt != _msgL.size()) {
			return;
		}
		// 固定値チェック
		if (!chkFixedValue(v, colMap)) {
			return;
		}
		// データ編集
		v = getOpEditValue("file", v, colMap);
		
		// Rowにカラムを設定
		if (isConst) {
			r.setValue(name, v);
		}
		else {
			r.addValueColumn(name, getMCDataType(colMap), v);
		}
	}
	
	/**
	 * メタ情報とフォーマットの属性情報の整合性チェック
	 * <p>
	 * NGの場合はエラー情報を設定します。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 * @return true:OK
	 */
	protected boolean checkMetaType(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta) {
		if (rmeta == null || rmeta == _getDmyMeta()) {
			return true;
		}

		String type = (String)_column.get(DATATYPE_KEY);
		boolean isOK = true;
		switch(type) {
			case TYPE_STRING:
				if (rmeta.type() != MCDataType.STRING) {
					isOK = false;
				}
				break;
			case TYPE_NUMBER:
				if (rmeta.type() != MCDataType.NUMBER) {
					isOK = false;
				}
				break;
			case TYPE_DATE:
				if (rmeta.type() != MCDataType.DATE) {
					isOK = false;
				}
				break;
			case TYPE_TIMESTAMP:
				if (rmeta.type() != MCDataType.TIMESTAMP) {
					isOK = false;
				}
				break;
			case TYPE_BOOL:
				if (rmeta.type() != MCDataType.BOOLEAN) {
					isOK = false;
				}
				break;
			default:
				// dataTypeが未定義の場合はデータ型のチェックはしない
				isOK = true;
				break;
		}
		
		if (!isOK) {
			String colPath = rmeta == null ? null : rmeta.getColumnPath();
			_msgL.add(new MCMessage(_getIfR(), null, PFBZL0114, _fileDir, _fileName, rowIndex, colPath, value));
		}

		return isOK;
	}
	
	protected MCDataType getMCDataType(Map<String, Object> colMap) {
		String dataType = (String)colMap.get(DATATYPE_KEY);
		switch (dataType) {
			case TYPE_STRING:
				return MCDataType.STRING;
			case TYPE_NUMBER:
				return MCDataType.NUMBER;
			case TYPE_DATE:
				return MCDataType.DATE;
			case TYPE_TIMESTAMP:
				return MCDataType.TIMESTAMP;
			case TYPE_BOOL:
				return MCDataType.BOOLEAN;
			default:
				break;
		}
		return null;
	}
	
	/**
	 * フォーマットに従って文字型に変換します。
	 * <p>
	 * エラーの場合はエラー情報を設定し、nullを返します。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 * @return 文字型の値
	 */
	protected String convertString(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		setMapping(rowIndex, colIndex, r, value, rmeta, colMap);
		value = removePadding(value, getPaddingStr(colMap), getAlign(colMap));
		return value;
	}

	/**
	 * フォーマットに従って数値型に変換します。
	 * <p>
	 * エラーの場合はエラー情報を設定し、nullを返します。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 * @return 数値型の値
	 */
	protected MCNumber convertNumber(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		Map<String, Object> attrMap = getAttribute(colMap, COL_N_KEY);
		if (isNull(value) || isEmpty(attrMap)) {
			return null;
		}
		
		setMapping(rowIndex, colIndex, r, value, rmeta, colMap);
		String colPath = getString(colMap, NAME_KEY);
		String tmpValue = value;
		
		// 小数部と整数部を分離する
		boolean decimalDisplayFlg = getBoolean(attrMap, "decimalDisplayFlg");
		String int_ = null;	// 整数部
		String dec_ = null; // 小数部
		if (decimalDisplayFlg) {
			String[] tmp = tmpValue.split(Pattern.quote(getString(attrMap, "decimalStr")));
			int_ = tmp[0];
			if (tmp.length > 2) {
				_msgL.add(new MCMessage(_getIfR(), null, PFBZL0114, _fileDir, _fileName, rowIndex, colPath, _getFormat(rmeta), _value));
				return null;
			}
			if (tmp.length > 1) {
				dec_ = tmp[1];
			}
			// 整数・小数の区切り文字を除去
			if (getString(attrMap, "separatorInteger") != null) {
				int_ = int_.replaceAll(Pattern.quote(getString(attrMap, "separatorInteger")), "");
			}
			if (dec_ != null && getString(attrMap, "separatorDecimal") != null) {
				dec_ = dec_.replaceAll(Pattern.quote(getString(attrMap, "separatorDecimal")), "");
			}
			if (int_.length() == 0) {
				int_ = null;
			}
		}
		else {
			int decimalLength = getInt(attrMap, "decimalLength");
			if (tmpValue.length() < decimalLength) {
				_msgL.add(new MCMessage(_getIfR(), null, PFBZL0114, _fileDir, _fileName, rowIndex, colPath, _getFormat(rmeta), _value));
				return null;
			}
			else if (tmpValue.length() == decimalLength) {
				dec_ = tmpValue;
			}
			else {
				int_ = tmpValue.substring(0, tmpValue.length() - decimalLength);
				dec_ = tmpValue.substring(tmpValue.length() - decimalLength);
				if (isNull(dec_)) {
					dec_ = null;
				}
			}
		}
		
		// 符号判定
		String signPosition = getString(attrMap, "signPosition");
		String signVal = null;
		if (int_ != null) {
			if (POSITION_FIT.equals(signPosition)) {
				// 左の埋め文字を除去
				int_ = removePadding(int_, getPaddingStr(colMap, ""), ALIGN_RIGHT);
				if (int_.length() > 0) {
					signVal = int_.substring(0, 1);
				}
				else {
					int_ = null;
				}
			}
			else {
				signVal = int_.substring(0, 1);
			}
		}
		
		int intIdx = 0;
		String sign = null;
		String signPlus = getString(attrMap, "signPlus");
		String signMinus = getString(attrMap, "signMinus");
		String signZero = getString(attrMap, "signZero");
		if (signZero == null) {
			signZero = signPlus;
		}
		
		// 符号が未定義
		if (isNull(signPlus) && isNull(signMinus)) {
			sign = PLUS;
		}
		// マイナス符号に一致
		else if (!isNull(signMinus) && isSame(signMinus, signVal)) {
			sign = MINUS;
			intIdx = 1;
		}
		else {
			sign = PLUS;
			if (!isNull(signPlus) && isSame(signPlus, signVal)) {
				intIdx = 1;
			}
			else if (!isNull(signZero) && isSame(signZero, signVal)) {
				sign = "";
				intIdx = 1;
			}
		}
		
		if (int_ != null) {
			if (intIdx > 0) {
				int_ = int_.substring(intIdx, int_.length());
			}
			if (POSITION_HEAD.equals(signPosition)) {
				// 符号の右の埋め文字を除去
				int_ = removePadding(int_, getPaddingStr(colMap, ""), ALIGN_RIGHT);
			}
		}
		
		// ゼロ文字の判定
		if (sign.length() == 0) {
			boolean isZero = true;
			
			if (!isNull(int_)) {
				Matcher m = ALL_ZERO_PTN.matcher(int_);
				isZero = m.matches();
			}
			if (isZero && !isNull(dec_)) {
				Matcher m = ALL_ZERO_PTN.matcher(dec_);
				isZero = m.matches();
			}
			
			if (!isZero) {
				_msgL.add(new MCMessage(_getIfR(), null, PFBZL0114, _fileDir, _fileName, rowIndex, colPath, _getFormat(rmeta), _value));
				return null;
			}
			
			return MCNumber.ZERO;
		}
		
		// 小数右の埋め文字を除去
		if (dec_ != null) {
			dec_ = removePadding(dec_, getPaddingStr(colMap, ""), ALIGN_LEFT);
			if (dec_.length() == 0) {
				dec_ = "0";
			}
		}
		String numFormat = "#";
		if (isNull(int_)) {
			int_ = "0";
		}
		tmpValue = int_;
		if (!isNull(dec_)) {
			numFormat += ".#";
			tmpValue += "." + dec_;
			if (dec_.length() < getInt(attrMap, "decimalLength")) {
				dec_ = lpad(dec_, getInt(attrMap, "decimalLength"), "0");
			}
		}
		if (MINUS.equals(sign)) {
			tmpValue = MINUS + tmpValue;
		}
		
		MCNumber val = null;
		try {
			val = MCNumber.valueOf(tmpValue, numFormat);
		}
		catch(MCException ex) {
			_msgL.add(new MCMessage(_getIfR(), null, PFBZL0114, _fileDir, _fileName, rowIndex, colPath, _getFormat(rmeta), _value));
		}
		
		return val;
	}
	
	/**
	 * フォーマットに従って日付型に変換します。
	 * <p>
	 * エラーの場合はエラー情報を設定し、nullを返します。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 * @return 日付型の値
	 */
	protected MCDate convertDate(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		if (isNull(value)) {
			return null;
		}
		setMapping(rowIndex, colIndex, r, value, rmeta, colMap);
		
		int[] intValues = getDateTsValue(value, colMap, COL_D_KEY);
		if (intValues != null) {
			try {
				return MCDate.valueOf(intValues);
			}
			catch (MCException e) {
				intValues = null;
			}
		}
		if (intValues == null) {
			String colPath =  getString(colMap, NAME_KEY);
			Map<String, Object> attrMap = getAttribute(colMap, COL_D_KEY);
			String format = null;
			if (attrMap != null) {
				format = (String)attrMap.get("format");
			}
			_msgL.add(new MCMessage(_getIfR(), null, PFBZL0113, _fileDir, _fileName, rowIndex, colPath, _value, format));
		}
		return null;
	}
	
	/**
	 * フォーマットに従ってタイムスタンプ型に変換します。
	 * <p>
	 * エラーの場合はエラー情報を設定し、nullを返します。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 * @return タイムスタンプ型の値
	 */
	protected MCTimestamp convertTimestamp(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		if (isNull(value)) {
			return null;
		}
		setMapping(rowIndex, colIndex, r, value, rmeta, colMap);
		
		int[] intValues = getDateTsValue(value, colMap, COL_TS_KEY);
		if (intValues != null) {
			try {
				return MCTimestamp.valueOf(intValues);
			}
			catch (MCException e) {
				intValues = null;
			}
		}
		if (intValues == null) {
			String colPath =  getString(colMap, NAME_KEY);
			Map<String, Object> attrMap = getAttribute(colMap, COL_TS_KEY);
			String format = null;
			if (attrMap != null) {
				format = (String)attrMap.get("format");
			}
			_msgL.add(new MCMessage(_getIfR(), null, PFBZL0113, _fileDir, _fileName, rowIndex, colPath, _value, format));
		}
		return null;
	}

	/**
	 * フォーマットに従って論理型に変換します。
	 * <p>
	 * エラーの場合はエラー情報を設定し、falseを返します。
	 * 
	 * @param rowIndex 行のインデックス。0から始まります。
	 * @param colIndex 列のインデックス。0から始まります。
	 * @param r        格納先のRow
	 * @param value    格納対象の値
	 * @param rmeta    格納先の列に対するメタ
	 * @return 論理型の値
	 */
	protected boolean convertBoolean(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		setMapping(rowIndex, colIndex, r, value, rmeta, colMap);
		// column.boolean.trueStrと一致するか
		value = removePadding(value, getPaddingStr(colMap), getAlign(colMap));
		return isSame((String)getAttribute(colMap, COL_F_KEY).get("trueStr"), value);
	}
	
	/**
	 * formatからvalueを切り出して返します。
	 * <p>
	 * 戻り値のindexは0:年、1:月、2:日...の各値です。
	 * @param value 解析対象の値
	 * @param colMap カラム定義
	 * @param key data または timestamp
	 * @return 日付要素の配列
	 */
	protected int[] getDateTsValue(String value, Map<String, Object> colMap, String key) {
		Map<String, Object> attrMap = getAttribute(colMap, key);
		String format = (String)attrMap.get("format");
		String align = getAlign(colMap);
		try {
			if (ALIGN_LEFT.equals(align)) {
				value = value.substring(0, format.length());
			}
			else {
				value = value.substring(value.length() - format.length());
			}
		}
		catch (IndexOutOfBoundsException e) {
			// 書式どおりにデータ変換できなかった場合
			return null;
		}
		
		int idx = 0;
		// 年の確定 yyyyかyyどちらかのフォーマットから値を取得
		int year = -1;
		if ((idx = format.indexOf("yyyy")) != -1) {
			year = Integer.valueOf(value.substring(idx, idx + "yyyy".length()));
		}
		else if ((idx = format.indexOf("yy")) != -1) {
			year = Integer.valueOf(value.substring(idx, idx + "yy".length()));
		}
		else {
			year = getInt(attrMap, "omitYear");
		}
		if (getInt(attrMap, "shiftYear") > 0) {
			year += getInt(attrMap, "shiftYear");
		}
		
		int month = getFormatIntValue("MM", "omitMonth", format, value, attrMap);
		int day = getFormatIntValue("dd", "omitDay", format, value, attrMap);
		// 月末日補正
		if (day == 99) {
			day = LocalDate.of(year, month, 1).lengthOfMonth();
		}
		int hour = getFormatIntValue("hh", "omitHour", format, value, attrMap);
		int min = getFormatIntValue("mm", "omitMinutes", format, value, attrMap);
		int sec = getFormatIntValue("ss", "omitSecond", format, value, attrMap);
		// うるう秒補正
		if (sec > 59) {
			sec = 59;
		}
		// ミリ秒の確定 "S"の数だけ数値を抜き出す
		int msec = -1;
		if (key.equals(COL_TS_KEY) && format.contains("S")) {
			if ((idx = format.indexOf("SSS")) != -1) {
				msec = Integer.valueOf(value.substring(idx, idx + 3));
			}
			else if ((idx = format.indexOf("SS")) != -1) {
				msec = Integer.valueOf(value.substring(idx, idx + 2));
				msec *= 10;
			}
			else if ((idx = format.indexOf("S")) != -1) {
				msec = Integer.valueOf(value.substring(idx, idx + 1));
				msec *= 100;
			}
		}
		else if (key.equals(COL_TS_KEY)) {
			msec = getInt(attrMap, "omitMilliSecond");
		}

		// 戻り値の配列の数
		int l = key.equals(COL_TS_KEY) ? 7 : 6;
		int[] values = new int[l];
		values[0] = year;
		values[1] = month;
		values[2] = day;
		values[3] = hour;
		values[4] = min;
		values[5] = sec;
		if (key.equals(COL_TS_KEY)) {
			values[6] = msec;
		}
		
		return values;
	}
	
	/**
	 * format内のkeyが示す位置と一致するvalue値をintで返します。
	 * <p>
	 * ex)<br>
	 * format:yyyy/MM/dd<br>
	 * value:2021/09/01<br>
	 * key:MM<br>
	 * 戻り値：9<br>
	 * <p>
	 * format内にkeyが存在しない場合は属性値omitKeyを返します。
	 * 
	 * @param key 取得するキー(yyyy,MM,ddなど)
	 * @param omitKey デフォルトキー
	 * @param format フォーマット文字列
	 * @param value 値
	 * @param attrMap 属性Map
	 * @return keyから取得したvalue値
	 */
	protected int getFormatIntValue(String key, String omitKey, String format, String value, Map<String, Object> attrMap) {
		int idx = 0;
		if ((idx = format.indexOf(key)) != -1) {
			return Integer.valueOf(value.substring(idx, idx + key.length()));
		}
		return getInt(attrMap, omitKey);
	}
	
	protected Comparable<?> getDummyValue(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		setMapping(rowIndex, colIndex, r, value, rmeta, colMap);
		
		String type = getString(colMap, "fixedValueType");
		// "fixedValue"：fixedValueの値
		if ("fixedValue".equals(type)) {
			return (Comparable<?>) colMap.get("fixedValue");
		}
		// "headerRows"：ファイルの先頭からその位置までのヘッダレコードの数。ファイルごとにリセットされる。
		else if ("headerRows".equals(type)){
			return MCNumber.valueOf(_headerCnt);
		}
		// "dataRows"：ヘッダレコードからその位置までの明細レコードの数。
		else if ("dataRows".equals(type)){
			return MCNumber.valueOf(_dataCnt);
		}
		else {
			if (isBoolType(colMap)) {
				return Boolean.FALSE;
			}
			else {
				return null;
			}
		}
	}
	
	/**
	 * マッピングを行う
	 * @param colMap カラム定義
	 */
	@SuppressWarnings("unchecked")  // mapのキャスト
	protected void setMapping(int rowIndex, int colIndex, MCRow r, String value, MCReportMeta rmeta, Map<String, Object> colMap) {
		if (!hasMappingColumn(colMap)) {
			return;
		}
		
		String name = getString(colMap, "name");
		boolean isErr = false;
		ArrayList<String> errBindL = new ArrayList<>();
		
		// "mapping" : {"number" : {"decimalLength" : "header.attr1"} }}
		Map<String, Object> mapping = getAttribute(colMap, MAPPING_KEY);	//ex) {"number" : {"decimalLength" : "header.attr1"}}
		for (Entry<String, Object> mapEn : mapping.entrySet()) {
			String mapAttrName = mapEn.getKey();							//ex) "number"
			Map<String, Object> mapAttrMap = (Map<String, Object>) mapEn.getValue();
																			//ex) {"decimalLength" : "header.attr1"}
			// 設定先の属性情報Map
			Map<String, Object> targetAttrMap = getAttribute(colMap, mapAttrName);
			for (Entry<String, Object> attrEn : mapAttrMap.entrySet()) {
				String attrElName = attrEn.getKey();						//ex) "decimalLength"
				String refColName = (String)attrEn.getValue();				//ex) "header.attr1"
				String[] keys = refColName.split(Pattern.quote("."));
				Comparable<?> attrVal = getReferenceValue(r, keys);
				String bindKeyVal = _fixLenFileFmt.joinBind(joinKeyName(mapAttrName, attrElName), refColName, attrVal);
				if (_fixLenFileFmt.acceptableMappingValue(attrVal, mapAttrName, attrElName) == false) {
					isErr = true;
					_msgL.add(new MCMessage(PFBZL0099, name, bindKeyVal));
					continue;
				}
				errBindL.add(bindKeyVal);
				targetAttrMap.put(attrElName, attrVal);
			}
		}
		
		if (isErr == false) {
			int preCnt = _fixLenFileFmt.getErrMsgList().size();
			
			String dataType = PFBZL_FixLenFileInfo.getString(colMap, "dataType");
			if (TYPE_NUMBER.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(colMap, "number");
				_fixLenFileFmt.chkNumberAttr(colMap, attrMap, COLUMN_KEY);
			}
			else if (TYPE_DATE.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(colMap, "date");
				_fixLenFileFmt.chkDateTsAttr(colMap, attrMap, COL_D_KEY, COLUMN_KEY);
			}
			else if (TYPE_TIMESTAMP.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(colMap, "timestamp");
				_fixLenFileFmt.chkDateTsAttr(colMap, attrMap, COL_TS_KEY, COLUMN_KEY);
			}
			else if (TYPE_BOOL.equals(dataType)) {
				Map<String, Object> attrMap = PFBZL_FixLenFileInfo.getAttribute(colMap, "boolean");
				_fixLenFileFmt.chkBooleanAttr(colMap, attrMap, COLUMN_KEY);
			}
			
			int curCnt = _fixLenFileFmt.getErrMsgList().size();
			if (preCnt != curCnt) {
				_msgL.add(new MCMessage(PFBZL0099, name, _fixLenFileFmt.joinBind(errBindL)));
			}
		}
	}

	/**
	 * 参照先の値を取得します。
	 * <p>
	 * 取得できない場合はnullを返します。
	 * @param r 処理中のMCRow
	 * @param keys 参照先のレコード名/カラム名
	 * @return 値
	 */
	protected Comparable<?> getReferenceValue(MCRow r, String[] keys) {
		MCRow refRow = null;
		// 今処理中のレコード
		if (keys[0].equals(_recordName)) {
			refRow = r;
		}
		else if (keys[0].equals(HEADER_KEY)){
			refRow = _reportSetRowMap.get(_headerCnt).get(0);
		}
		else if (keys[0].equals(TRAILER_KEY)){
			refRow = _trailerMap.get(_headerCnt);
		}
		else if (keys[0].equals(END_KEY)){
			refRow = _endR;
		}
		else if (keys[0].equals(SKIP_KEY)){
			refRow = _skipR;
		}
		if (refRow == null) {
			return null;
		}
		
		return refRow.getValueNE(keys[1]);
	}
		
	/**
	 * reportSetに溜まったデータをinsertします。
	 * <p>
	 * ただしinsertする件数の条件を満たしていない場合は何もしません。
	 * @param rowIndex rowindex
	 */
	protected void flushRows(String fileName, ArrayList<Integer> headerCntL, int rowIndex) {
		if (rowIndex >= _buffRows
		 && rowIndex % _buffRows == 0) {
			fixRows(fileName, headerCntL, rowIndex);
			_insertRptL();
		}
	}

	/**
	 * skipレコードを保存します。
	 * @param fileName ファイル名
	 * @param values 値
	 */
	protected void setSkipValue(String fileName, int rowIndex, String[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		if (_skipR == null) {
			_skipR = MCRow.create();
		}
		
		//データの格納
		for (int i = 0; i < values.length; i++) {
			_column = _columnL.get(i);
			setValue(0, i, _skipR, values[i], null);
		}
	}
	
	/**
	 * trailerレコードを保存します。
	 * @param fileName ファイル名
	 * @param values 値
	 */
	protected void setTrailerValue(String fileName, int rowIndex, String[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		if (_trailerMap == null) {
			_trailerMap = new HashMap<Integer, MCRow>();
		}
		MCRow r = MCRow.create();
		//データの格納
		for (int i = 0; i < values.length; i++) {
			_column = _columnL.get(i);
			setValue(0, i, r, values[i], null);
		}
		// 現在処理中のヘッダー番号に紐づける
		_trailerMap.put(_headerCnt, r);
		
		// calcチェック
		Map<String, Map<String, Object>> calc = _fileInfo.getTrailerCalc();
		if (calc != null) {
			chkCalc(fileName, rowIndex, calc, r, TRAILER_KEY);
		}
	}

	/**
	 * endレコードを保存します。
	 * @param fileName ファイル名
	 * @param values 値
	 */
	protected void setEndValue(String fileName, int rowIndex, String[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		if (_endR == null) {
			_endR = MCRow.create();
		}
		for (int i = 0; i < values.length; i++) {
			_column = _columnL.get(i);
			setValue(0, i, _endR, values[i], null);
		}

		// calcチェック
		Map<String, Map<String, Object>> calc = _fileInfo.getEndCalc();
		if (calc != null) {
			chkCalc(fileName, rowIndex, calc, _endR, END_KEY);
		}
	}
	
	/**
	 * trailer/endのcalcチェックを実行します。
	 * @param calcL calcカラム定義
	 * @param targetRow チェック対象の値を格納したRow(trailer/endの値を格納したRow)
	 * @param recordName trailer または end
	 */
	protected void chkCalc(String fileName, int rowIndex, Map<String, Map<String, Object>> calcL, MCRow targetRow, String recordName) {

		File f = new File(fileName);
		
		for (Entry<String, Map<String, Object>> e : calcL.entrySet()) {
			Map<String, Object> calcMap = e.getValue();
			// 入力時チェック対象かどうか
			if (!getBoolean(calcMap, "checkFlg")) {
				continue;
			}
			
			String name = getString(calcMap, NAME_KEY);
			String method = getString(calcMap, "method");
			String arg = getString(calcMap, "arg");
			if (isNull(method) || isNull(arg)) {
				continue;
			}
			
			// チェック対象がdataレコードの値の場合
			String data_n = null;
			if (arg.startsWith(DATA_KEY)) {
				// argからdata[n]のnを抜き出し
				Matcher matcher = _calcArgDataIdxPattern.matcher(arg);
				if (matcher.matches()) {
					data_n = matcher.group(1);
				}
				if (data_n == null) {
					continue;
				}
			}

			// チェック対象の値（trailer/endにセットされた値）
			MCNumber targetVal = targetRow.getNumberNE(name);

			// method:count
			if (CALC_COUNT.equals(method)) {
				// headerレコードの件数をチェック
				if (HEADER_KEY.equals(arg)) {
					if (!isSame(targetVal, MCNumber.valueOf(_headerCnt))) {
						_msgL.add(new MCMessage(PFBZL0108, f.getParent(), f.getName(), rowIndex, joinKeyName(recordName, name), targetVal, _headerCnt, method, arg));
						continue;
					}
				}
				else if (arg.startsWith(DATA_KEY)) {
					// data[]:データレコード全件数をチェック
					if (data_n.length() == 0) {
						int cnt = recordName.equals(TRAILER_KEY) ? _dataCnt : _dataCntAll;
						if (!isSame(targetVal, MCNumber.valueOf(cnt))) {
							_msgL.add(new MCMessage(PFBZL0108, f.getParent(), f.getName(),  rowIndex, joinKeyName(recordName, name), targetVal, cnt, method, arg));
							continue;
						}
					}
					// "data[n]":制御項目ごとのレコード数をチェック
					else {
						int idx = Integer.valueOf(data_n);
						if (_dataIdxCnt.length <= idx) {  // _dataIdxCnt/Allも配列数は同じ
							continue;
						}
						int cnt = recordName.equals(TRAILER_KEY) ? _dataIdxCnt[idx] : _dataIdxCntAll[idx];
						if (!isSame(targetVal, MCNumber.valueOf(cnt))) {
							_msgL.add(new MCMessage(PFBZL0108, f.getParent(), f.getName(),  rowIndex, joinKeyName(recordName, name), targetVal, cnt, method, arg));
						}
					}
				}
			}
			// method:sum
			else if (CALC_SUM.equals(method)) {
				String[] args = arg.split(Pattern.quote("."));
				
				MCList<MCRow> tmpL = MCList.create(MCRow.class);
				boolean isChkTgt = false;
				
				// trailerの場合は現在処理中のデータが対象
				if (recordName.equals(TRAILER_KEY)) {
					if (args[0].startsWith(DATA_KEY)) {
						List<MCRow> rowL = _reportSetRowMap.get(_headerCnt);
						// 処理中のdataレコードから処理対象のRowを検索
						int n = Integer.valueOf(data_n);
						for (int i = 1; i < rowL.size(); i++) {
							int ctrlIdx = rowL.get(i).getNumber(_dataCtrlIndexName).intValue();
							if (ctrlIdx == n) {
								// dataの制御項目と"data[n]"のnが一致したRowをセット
								tmpL.add(rowL.get(i));
							}
						}
						isChkTgt = true;
					}
					
				}
				// endの場合全データが対象
				else {
					for (Entry<Integer, List<MCRow>> set : _reportSetRowMap.entrySet()) {
						List<MCRow> rowL = set.getValue();
						// headerが対象
						if (args[0].startsWith(HEADER_KEY)) {
							tmpL.add(rowL.get(0));
							isChkTgt = true;
						}
						// data[n]が対象
						else if (args[0].startsWith(DATA_KEY)){
							int n = Integer.valueOf(data_n);
							for (int i = 1; i < rowL.size(); i++) {
								int ctrlIdx = rowL.get(i).getNumber(_dataCtrlIndexName).intValue();
								if (ctrlIdx == n) {
									// dataの制御項目と"data[n]"のnが一致したRowをセット
									tmpL.add(rowL.get(i));
								}
							}
							isChkTgt = true;
						}
					}
				}
				
				if (isChkTgt) {
					MCNumber sum = nvl(tmpL.sum(args[1]), MCNumber.ZERO);
					if (!isSame(targetVal, sum)) {
						_msgL.add(new MCMessage(PFBZL0108, f.getParent(), f.getName(),  rowIndex, joinKeyName(recordName, name), targetVal, sum, method, arg));
					}
				}
			}
		}
	}
	
	
	/**
	 * 読み込んだ値がcolumn.fixedValueと一致するか。
	 * 
	 * @param value 読み込んだ値
	 * @param colMap カラム定義
	 * @return 一致する場合true
	 */
	protected boolean chkFixedValue(Comparable<?> value, Map<String, Object> colMap) {
		if (!getBoolean(colMap, "fixedValueCheckFlg")) {
			return true;
		}
		Comparable<?> fixedValue = (Comparable<?>) colMap.get("fixedValue");
		if (isSame(value, fixedValue)) {
			return true;
		}
		else {
			_msgL.add(new MCMessage(PFBZL0107, _fileDir, _fileName, _blockIndex, getString(colMap, "name"), value, fixedValue));
			return false;
		}
	}
	
	/**
	 * skip項目を取得します。
	 * <p>
	 * 受信ファイルにskipレコードが無い場合はnullが返ります。
	 * @return skip.columnの項目
	 */
	public MCRow getSkip() {
		return _skipR;
	}
	
	/**
	 * trailer項目を取得します。
	 * <p>
	 * 受信ファイルにtrailerレコードが無い場合はnullが返ります。<br>
	 * keyはファイル内のヘッダー行番号（1～）です。
	 * 
	 * @return tailer.columnの項目
	 */
	public Map<Integer, MCRow> getTrailer() {
		return _trailerMap;
	}
	
	/**
	 * end項目を取得します。
	 * <p>
	 * 受信ファイルにendレコードが無い場合はnullが返ります。
	 * @return end.columnの項目
	 */
	public MCRow getEnd() {
		return _endR;
	}
	
	//////////////////////////////////
	// 【ここから】 以下のクラスからコピー/固定長ファイル用に修正したメソッド
	// mcframe.commonCore.report.MCCSVFile
	// mcframe.commonCore.report.MCCSVReportFile
	//////////////////////////////////
	@Override
	public void setReportSet(MCReportSet rset) {
		_reportSet = rset;
		if (_reportSet instanceof PFBZL_FixLenFileReportSet) {
			_type = ((PFBZL_FixLenFileReportSet) _reportSet).getReportSetType();
		}
		else {
			_type = PFBZL_FixLenFileReportSet.REPORTSET_TYPE_OHER;
		}
	}

	/**
	 * 文字コードに対するボムを返します。
	 * @return ボム
	 */
	protected byte[] getBOM() {
		if (getCharset().equals(ENCODE_UTF8)) {
			return BOM_UTF8;
		}
		if (getCharset().equals(ENCODE_UTF16LE)) {
			return BOM_UTF16LE;
		}
		if (getCharset().equals(ENCODE_UTF16BE)) {
			return BOM_UTF16BE;
		}
		return null;
	}

	/**
	 * BOMが含まれる場合trueを返します。
	 * @return BOMの有無
	 */
	protected boolean isBOM() {
		if (_isBOM) {
			if (getCharset().equals(ENCODE_UTF8) || getCharset().equals(ENCODE_UTF16BE)
					|| getCharset().equals(ENCODE_UTF16LE)) {
				return true;
			}
			return false;
		}
		return _isBOM;
	}

	/**
	 * ボムを出力するかどうかを設定します。
	 * @param writeBOM ボムを出力する場合true
	 */
	public void setBOM(boolean bom) {
		this._isBOM = bom;
	}

	@Override
	public String getRecordType(int rowIndex, String[] values) {
		if (_reportSet instanceof PFBZL_FixLenFileReportSet) {
			return PFBZL_FixLenFileReportSet.DEF_BLOCK;
		}
		return super.getRecordType(rowIndex, values);
	}
	
	@Override
	public MCRow createReadRow(int rowIndex, String[] values, String rType) {
		if (_reportSet instanceof PFBZL_FixLenFileReportSet) {
			return _reportSet.createRow(PFBZL_FixLenFileReportSet.DEF_BLOCK);
		}
		return super.createReadRow(rowIndex, values, rType);
	}
	
	@Override
	public MCReportMeta[] getReadReportMetaArray(int rowIndex, String[] values, MCRow r,
			String rType) {
		MCReportMeta[] rms = _getReportMetaArray(r);
		if (rms != null) {
			return rms;
		}
		return super.getReadReportMetaArray(rowIndex, values, r, rType);
	}

	/**
	 * フォーマットファイルから現在処理中の行のカラムリストを取得し、
	 * ReportSetからメタ情報を取得します。
	 * @param r 対象のRow
	 * @return メタの配列
	 */
	protected MCReportMeta[] _getReportMetaArray(MCRow r) {
		ArrayList<MCReportMeta> rMetaList = new ArrayList<MCReportMeta>();
		String[] columns = getColumns();
		for(int i=0; i < columns.length; i++) {
			MCReportMeta meta = _getReportSet().getReportMeta(r, columns[i]);
			if(meta != null) {
				rMetaList.add(meta);
			}
			else {
				rMetaList.add(_getDmyMeta());
			}
		}
		return rMetaList.toArray(new MCReportMeta[rMetaList.size()]);
	}

	//////////////////////////////////
	// 【ここから】 以下のクラスからコピー/固定長ファイル用に修正したメソッド
	// PFBZL9030.PFBZL_FileInput_MC.IfRecvReportSet.PFCSVFile
	//////////////////////////////////
	@Override
	public void readSetValue(String fileName, MCRow r, int rowIndex,
			int metaIndex, MCReportMeta rmeta, String val) {

		int msgCnt = _msgL.size();
		try {
			// ファイルの値を設定
			super.readSetValue(fileName, r, rowIndex, metaIndex, rmeta, val);
			
			if(rmeta != _getDmyMeta()) {
				// 値に不整合がない場合に限り、各項目のチェックもここでやる
				_colValidate(r, rowIndex, rmeta, val);
			}
		}
		catch (MCException ex) {
			String colPath = rmeta == null ? null : rmeta.getColumnPath();
			_msgL.add(new MCMessage(_getIfR(), null, PFBZL0113, _fileDir, _fileName, rowIndex, colPath, _value, _getFormat(rmeta)));
		}
		r.setBooleanNE(_getErrFlg(), msgCnt != _msgL.size());	// エラーの有無
	}

	public MCMessageList getErrList() {
		return _msgL;
	}

	public void clearErrList() {
		_msgL.clear();
	}
	
	public void clear() {
		// insert処理したコンテナをクリアする
		
		// ファイルクローズ済み（全件insert済み)またはdataレコードが無いファイルの場合
		if (_bis == null) {
			_reportSetRowMap.clear();
			if (_trailerMap != null) {
				_trailerMap.clear();
			}
		}
		else {
			// 処理中(key:_headerCnt)データの1つ前までをクリア
			for (int i = _headerCnt-1; i > 0; i--) {
				_reportSetRowMap.remove(i);
				if (_trailerMap != null) {
					_trailerMap.remove(i);
				}
			}
		}
	}
	
	@Override
	public void readOpenAfter() {
		_bis = new BufferedInputStream(_fis);
	}

	@Override
	protected void fireReadFileCloseBefore() {
		super.fireReadFileCloseBefore();
		fireReadFileCloseBeforeInFixLen();
	}
	
	protected void fireReadFileCloseBeforeInFixLen() {
		if (_bis != null) {
			try {
				_bis.close();
			}
			catch(IOException ex) {
				// closeはERRORでも許す
				MCMessage msg = new MCMessage(PFBZL0100);
				MCLog.write(msg);
			}
			_bis = null;
		}
	}
	
	protected boolean isEmpty(Map<?, ?> m) {
		return m == null || m.isEmpty();
	}
	
	protected String joinKeyName(String... values) {
		return _fixLenFileFmt.joinKeyName(values);
	}
	
	//////////////////////////////////
	// 【ここから】 PFBZL9030.PFBZL_FileInput_MC.IfRecvReportSetのメソッド・変数にアクセスするための定義
	// すべて基底クラスで実装する
	// 基底クラス：PFBZL9030.PFBZL_FileInput_MC.IfRecvReportSet.PFFixLenFileReader
	//////////////////////////////////
	protected void _colValidate(MCRow row, int rowIdx, MCReportMeta meta, String val) {
	}
	protected String _getFormat(MCReportMeta rmeta) {
		return null;
	}
	protected MCReportMeta _getDmyMeta() {
		return null;
	}
	protected File _getFile() {
		return null;
	}
	protected PFT_SDRV_IF_R _getIfR() {
		return null;
	}
	protected String _getLabel(String colPath) {
		return null;
	}
	protected String _getErrFlg() {
		return null;
	}
	protected MCReportSet _getReportSet() {
		return null;
	}
	protected void _insertRptL() {
	}

	//////////////////////////////////
	// 【ここから】 （未使用）MCReportFileのabstractメソッド定義
	//////////////////////////////////
	@Override
	public void initRead() {
	}

	@Override
	public void initWrite() {
	}

	@Override
	public void writeOpenAfter() {
	}

	@Override
	public String setEscape(int rowIndex, int colIndex, String s, MCReportMeta rmeta) {
		return null;
	}

}
