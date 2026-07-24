package mcframe.serverPFBZ.PFBZL9030;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import java.io.File;
import mcframe.commonCore.report.container.MCCSVReportSet;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.report.MCCSVFile;
import mcframe.commonCore.report.MCFileReadListener;
import mcframe.commonCore.resource.MCFormatConst;
import mcframe.commonCore.sys.MCFactory;
import mcframe.serverCore.resource.MCConst;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverPFUD.PFUDL5010.*;
import mcframe.serverPFUD.PFUDL5020.*;
import mcframe.serverPFUD.PFUDL0040.*;
import mcframe.serverPFBZ.PFBZL9060.PFBZL_CSVFmt;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileFmt;
import mcframe.serverPFBZ.PFBZL9090.PFBZL_FixLenFileReader;
import mcframe.serverPFBZ.PFBZL9090.PFBZL_FixLenFileReportSet;
import java.util.Locale;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZL_FileInput"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZL_FileInput_MC extends PFBZL_FileInput_MC_A{
	//FMCB CUSTOM START
	/** 本クラス（スレッドセーフ対応用） */
	protected static final Class<PFBZL_FileInput> PFBZL_FileInput_CLAZZ = PFBZL_FileInput.class;
	
	/**
	 * CSV一行目のカラム名配列
	 */
	protected String[] _headingCols = null;
	
	/**
	 * CSVファイルのフォーマット情報
	 */
	protected PFBZL_CSVFmt _csvFmt;

	/**
	 * 固定長ファイルのフォーマット情報
	 */
	protected PFBZL_FixLenFileFmt _fixlenFileFmt;

	/**
	 * 読み飛ばし用のダミーメタ
	 */
	protected static final MCReportMeta _dmyMeta = new MCReportMeta("dummy", "", "dummy", false);
		
	/**
	 * ファイル入力クラスに実装するインタフェースクラス<br>
	 * 当該クラスはMCReportFileを継承したクラスに実装される想定
	 * 
	 */
	protected interface PFInputFile {

		/**
		 * ファイル読み込み時のエラー情報取得します
		 * 
		 * @return
		 */
		public MCMessageList getErrList();

		/**
		 * ファイル読み込み時のエラー情報をクリアします
		 * 
		 */
		public void clearErrList();
	
		/**
		 * 処理対象の印刷データを設定します
		 * 
		 */
		public void setReportSet(MCReportSet rset);
	
		/**
		 * 処理対象の印刷データを取得します
		 * 
		 */
		public MCReportSet getReportSet();
	
		/**
		 * ファイルを読み込みます
		 * 
		 */
		public void read(String fileName);
		
		/**
		 * コンテナをクリアします
		 */
		public void clear();
	}

	/**
	 * IF受信に使用するレポートセットのインスタンスを生成します
	 * 
	 * @param classL	IF受信テーブルのDBCのクラス
	 * @return			IF受信に使用するレポートセットのインスタンス
	 */
	public static <D extends MCDBContainer, S extends MCRow> IfRecvReportSet<D, S>
			createIfRecvReportSet(Class<S> classS, Class<D> classD) {
		return object(PFBZL_FileInput_CLAZZ)._createIfRecvReportSet(classS, classD);
	}

	/**
	 * IF受信に使用するレポートセットのインスタンスを生成します
	 * 
	 * @param classL	IF受信テーブルのDBCのクラス
	 * @return			IF受信に使用するレポートセットのインスタンス
	 */
	protected <D extends MCDBContainer, S extends MCRow> IfRecvReportSet<D, S>
			_createIfRecvReportSet(Class<S> classS, Class<D> classD) {
		return new IfRecvReportSet<D, S>(classS, classD);
	}

	/**
	 * IF送信でのファイルの入出力を扱うクラスです
	 *
	 * @param <D>	IF送信テーブルのDBCのインスタンスを生成するRowクラス
	 * @param <S>	レポートセットに格納するRowのクラス
	 * @param <L>	IF送信テーブルのDBCのクラス
	 */
	public class IfRecvReportSet<D extends MCDBContainer, S extends MCRow> {

		/**
		 * 読み込んだ行にエラーがあったか
		 * 
		 */
		protected static final String _$errFlg = "_errFlg_";
		
		
		/**
		 * 可変長CSVファイルのIOクラス
		 *
		 */
		protected class PFCSVFile extends MCCSVFile implements PFInputFile {

			/**
			 * ファイル読み込み時のエラー情報を格納します
			 * 
			 */
			private MCMessageList _msgL = new MCMessageList();
			
			
			@Override
			public void readSetValue(String fileName, MCRow r, int rowIndex,
					int metaIndex, MCReportMeta rmeta, String val) {

				if(rmeta == _dmyMeta) {
					return;
				}
				int msgCnt = _msgL.size();
				try {
					// ファイルの値を設定
					
					super.readSetValue(fileName, r, rowIndex, metaIndex, rmeta, val);
					
					// 値に不整合がない場合に限り、各項目のチェックもここでやる
					colValidate(r, rowIndex, rmeta, val);
				}
				catch (MCException ex) {
					String colPath = rmeta.getColumnPath();
					_msgL.add(new MCMessage(_ifR, null, PFBZL0008, _file.getParent(),
							_file.getName(), rowIndex + 1, getLabel(colPath), colPath,
							getFormat(rmeta), val));
				}
				r.setBooleanNE(_$errFlg, msgCnt != _msgL.size());	// エラーの有無
			}
			
			/**
			 * レポートメタの書式を取得します
			 * 
			 * @param rmeta
			 * @return 表示フォーマット
			 */
			protected String getFormat(MCReportMeta rmeta) {
				String format = rmeta.getFormat();
				if (!format.equals(MCFormatConst.NOFORMAT)) {
					if (rmeta.type() == MCDataType.DATE || 
							rmeta.type() == MCDataType.TIMESTAMP) {
						format = _fc.getDateOutputPattern(format);
					}
					else if (rmeta.type() == MCDataType.NUMBER) {
						format = _fc.getNumberOutputPattern(format);
					}
					if (format == null || format.trim().length() == 0) {
						format = rmeta.getFormat();
					}
				}
				return format;
			}
			
			@Override
			public MCMessageList getErrList() {
				return _msgL;
			}

			@Override
			public void clearErrList() {
				_msgL.clear();
			}
			
			@Override
			public void clear() {
			}
		}

		/**
		 * レポートメタの書式を取得します
		 * 
		 * @param rmeta
		 * @return
		 */
		protected String getFormat(MCReportMeta rmeta) {
			String format = rmeta.getFormat();
			if (!format.equals(MCFormatConst.NOFORMAT)) {
				if (rmeta.type() == MCDataType.DATE || 
						rmeta.type() == MCDataType.TIMESTAMP) {
					format = MCConst.format.getDateOutputPattern(format);
				}else if (rmeta.type() == MCDataType.NUMBER) {
					format = MCConst.format.getNumberOutputPattern(format);
				}
				if (format == null || format.trim().length() == 0) {
					format = rmeta.getFormat();
				}
			}
			return format;
		}

		/**
		 * ファイル入力時のイベントリスナークラス
		 * 
		 */
		protected class PFFileReadListener extends MCFileReadListener {
			
			/**
			 * insertする件数の単位
			 * 
			 */
			protected int _buffRows = MCConst.app.getInteger("PFBZ.PFBZL9030.read_buffer_rows", 1000);
			
			@Override
			public MCRow addRow(int rowIndex, MCRow r) {
				if (rowIndex >= _buffRows
				 && rowIndex % _buffRows == 0) {
					// reportSetの内容をinsertする処理
					insertRptL();
				}
				return super.addRow(rowIndex, r);
			}

			@Override
			public void fileCloseAfter() {
				insertRptL();
				super.fileCloseAfter();
			}

			
			@Override
			public void readHeadingLine(String[] values) {
				_headingCols = values;
				super.readHeadingLine(values);
			}

			protected HashMap<String, MCReportMeta[]> _csvHdrMetaArryMap = new HashMap<>();
			
			/**
			 * 読み取り時のメタ配列を、CSVのヘッダに応じて返す
			 * 
			 * CSV読み込み時には常に同じメタを返す前提
			 */
			@Override
			public MCReportMeta[] metaFix(MCReportMeta[] rMetas, int rowIndex,
					String[] values, MCRow r, String rType) {
				
				String bType = _rptSet.getBlockType(r);
				
				if (_csvHdrMetaArryMap.containsKey(bType)) {
					return _csvHdrMetaArryMap.get(bType);
				}
				
				if (_csvFmt != null) {
					String[] header = _csvFmt.getHeader(bType);
					if (header != null) {
						MCReportMeta[] metas = createReportMeta(r, header);
						_csvHdrMetaArryMap.put(bType, metas);
						return metas;
					}
				}
				
				if(_headingCols == null) {
					MCReportMeta[] metas = _rptSet.getReportMetaArray(bType);
					_csvHdrMetaArryMap.put(bType, metas);
					return metas;
				}
				else {
					MCReportMeta[] metas = createReportMeta(r, _headingCols);
					_csvHdrMetaArryMap.put(bType, metas);
					return metas;
				}
			}
			
			protected MCReportMeta[] createReportMeta(MCRow r, String[] header) {
				ArrayList<MCReportMeta> rMetaList = new ArrayList<MCReportMeta>();
				for(int i=0; i < header.length; i++) {
					MCReportMeta meta = _rptSet.getReportMeta(r, header[i]);
					if(meta != null) {
						rMetaList.add(meta);
					}
					else {
						rMetaList.add(_dmyMeta);
					}
				}
				return rMetaList.toArray(new MCReportMeta[rMetaList.size()]);
			}
			
		}

		/**
		 * レポートセットに設定するロウのクラス
		 * クラスは帳票実装仕様書から生成されたクラスであること
		 * 
		 */
		protected Class<S> _rptRowClass;
		
		/**
		 * 帳票実装仕様書から生成されたレポートセット
		 * 
		 */
		protected MCReportSet _rptSet;
		
		/**
		 * ファイルの入力先、名前
		 * 
		 */
		protected File _file = null;

		/**
		 * ファイル入力用のリーダ
		 * 
		 */
		protected PFInputFile _reader = null;

	 	/**
		 * データセット用のマッパー
	  	 * 
	 	 */
		protected MAUCC_RowMapperWith<D, S, PFT_SDRV_IF_R> _mapper = null;
		
		/**
		 * 帳票コンテナ上必須項目のカラム
		 * 		
		 */
		protected String[] _reqColumns = null;

		/**
		 * IF受信テーブルのRow
		 * 
		 */
		protected PFT_SDRV_IF_R _ifR = null;

		/**
		 * SQL Builder
		 */
		protected MCQueryApiBuilder _builder;
		
		/**
		 * DBコンテナ
		 */
		protected D _dbc;

		/**
		 * IF受信テーブルのDBC
		 */
		protected MCList<D> _ifL;

		/**
		 * 通信プロトコルマスタ管理クラス
		 * 
		 */
		protected PFUCL_AppSys.IfPrtclMgr<PFT_SDRV_IF_R> _ifPrtclMgr = crtRecvIfProtocolMgr();

		/**
		 * 取引先ＣＤを示す項目名称
		 */
		protected String _bp_cd = "bp_cd";
		
		/**
		 * 受信ファイルのうちIFテーブルに取り込まないデータの条件
		 */
		protected Map<String, String> _notImpCondSame = new HashMap<>();

		/**
		 * 受信ファイルのうちIFテーブルに取り込まないデータの条件
		 */
		protected Map<String, String> _notImpCondDiff = new HashMap<>();

		/**
		 * コンストラクタ
		 * 
		 */
		public IfRecvReportSet(Class<S> classS, Class<D> classD) {
			_rptRowClass = classS;
			_ifL   = MCList.create(classD);
			_dbc = (D)MCFactory.invokeStatic(classD, "create", null, null);
			_builder = MCQueryApiBuilder.create(_dbc);
		}

		/**
		 * レポートメタを設定します
		 * 
		 * @param rptSet
		 */
		public void setReportSet(MCReportSet rptSet) {
			_rptSet = rptSet;
		}

		/**
		 * レポートセットに格納するRowのMapperを設定します
		 * 
		 * @param mapper
		 */
		public void setRowMapper(MAUCC_RowMapperWith<D, S, PFT_SDRV_IF_R> mapper) {
			_mapper = mapper;
		}
		
		/**
		 * レポートセットに格納するRowの取引先CDを示すカラムを設定します
		 * 
		 * @param bpCdCol
		 */
		public void setBpCdCol(String bpCdCol) {
			_bp_cd = bpCdCol;
		}

		/**
		 * IFテーブル取込対象外データの条件を設定します。<br>
		 * HashMapに指定した値とファイルデータの値が同じ場合、IFテーブルに取込みません。<br>
		 * HashMapに指定したキーのうち一つでも一致する値があれば、取込対象外とします。
		 * 
		 * @param notImpCondSame
		 */
		public void setNotImpCondSame(HashMap<String, String> notImpCondSame) {
			_notImpCondSame = notImpCondSame;
		}

		/**
		 * IFテーブル取込対象外データの条件を設定します。<br>
		 * HashMapに指定した値とファイルデータの値が異なる場合、IFテーブルに取込みません。<br>
		 * HashMapに指定したキーのうち一つでも異なる値があれば、取込対象外とします。
		 * 
		 * @param notImpCondDiff
		 */
		public void setNotImpCondDiff(HashMap<String, String> notImpCondDiff) {
			_notImpCondDiff = notImpCondDiff;
		}

		/**
		 * ファイル入力に使用するクラスのインスタンスを取得します
		 * 
		 * @param ifR
		 * @return
		 */
		protected PFInputFile createInputReader(PFT_SDRV_IF_R ifR) {

			PFInputFile _in = null;
			String fileTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_TYPE, ifR.if_proc_typ());
			// 1. CSV(カンマ区切り), 2. TSV(タブ区切り）以外の場合は、 1. CSV(カンマ区切り)として扱う
			// ファイル変換の仕様についてはカートリッジで差し替え可能にする必要がある。
			if (!isSame(_file_type_csv, fileTyp) && !isSame(_file_type_tsv, fileTyp)) {
				fileTyp = _file_type_csv;
			}

			// CSV or TSV
			// ファイル読み出しのリーダークラスと、読み出しのレポートセットを設定
			PFCSVFile csvRpt = new PFCSVFile();
			csvRpt.setReportSet(MCCSVReportSet.create(_rptRowClass));
			
			String ifloc = MCConst.app.getString(MCConst.createKey("PF", "if_input", "locale"));
			if (!isNull(ifloc)) {
				Locale l = MCConst.convLocale(ifloc);
				csvRpt.setLocale(l);
				csvRpt.getReportSet().setLocale(l);
			}

			if (isSame(_file_type_tsv, fileTyp)) {
				csvRpt.setDelimiter(String.valueOf('\t'));	// タブ区切り
			}
			String use = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_USE_HEADING, ifR.if_proc_typ());
			csvRpt.useHeading(Boolean.valueOf(use));

			String dq = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_DBL_QUART, ifR.if_proc_typ());
			csvRpt.setDoubleQuotation(Boolean.valueOf(dq));

			String bom = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_BOM, ifR.if_proc_typ());
			csvRpt.setWriteBOM(Boolean.valueOf(bom));

			String charSet = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_CHARSET, ifR.if_proc_typ());
			if (!isNull(charSet)) {
				csvRpt.setCharset(charSet);
			}
			
			// １行目をヘッダ行とせずに項目の並び順を変更する
			setCsvFmt(ifR, csvRpt);
			
			_in = csvRpt;
		
			// _readerだとfireされない
			_in.getReportSet().addReadListener(new PFFileReadListener());
			
			return _in;
		}

		/**
		 * ＣＳＶファイルの項目の並び順を変更する
		 */
		protected void setCsvFmt(PFT_SDRV_IF_R ifR, PFCSVFile csvRpt) {
			// １行目を見出し行として使用する場合はそれに従う。
			if (csvRpt == null || csvRpt.isHeading()) {
				return ;
			}
			
			String fmtPath = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_CSV_FMT_PATH, ifR.if_proc_typ());
			if (isNull(fmtPath)) {
				return ;
			}
			
			File file = new File(fmtPath);
			if (!file.exists()) {
				throw new MCAppException(ifR, null, PFBZL0003, file.getParent(), file.getName());
			}
			else if (file.length() <= 0) {
				throw new MCAppException(ifR, null, PFBZL0011, ifR.if_proc_typ(), file.getParent(), file.getName());
			}
			
			PFBZL_CSVFmt fmt = new PFBZL_CSVFmt();
			fmt.init();
			fmt.checkFmt(fmtPath, ifR);
			if (fmt.hasErr()) {
				MCAppException ex = new MCAppException(ifR, null, PFBZL0118, ifR.ext_sys_cd(), ifR.if_proc_typ(), file.getParent(), file.getName());
				ex.addCauseMessageList(fmt.getErrMsgList());
				throw ex;
			}
			_csvFmt = fmt;
			
		}

		/**
		 * 固定長ファイル入力に使用するクラスのインスタンスを取得します。
		 * @param ifR IF受信テーブルのRow
		 * @return ファイル入力クラス
		 */
		protected PFInputFile createFixLenFileInputReader(PFT_SDRV_IF_R ifR) {
			PFInputFile _in = null;
			PFFixLenFileReader fileReader = createPFFixLenFileReader(ifR);
			fileReader.setReportSet(PFBZL_FixLenFileReportSet.create(_rptRowClass));

			String bom = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_BOM, ifR.if_proc_typ());
			fileReader.setBOM(Boolean.valueOf(bom));

			String charSet = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_CHARSET, ifR.if_proc_typ());
			if (!isNull(charSet)) {
				fileReader.setCharset(charSet);
			}

			PFBZL_FixLenFileFmt fmt= createPFBZL_FixLenFileFmt(ifR);
			fileReader.setFixLenFileFmt(fmt);
			
			_in = fileReader;
			
			return _in;
		}

		protected PFFixLenFileReader createPFFixLenFileReader(PFT_SDRV_IF_R ifR) {
			return new PFFixLenFileReader();
		}

		protected PFBZL_FixLenFileFmt createPFBZL_FixLenFileFmt(PFT_SDRV_IF_R ifR) {
			// 個別フォーマットファイル
			String fmtPath = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH, ifR.if_proc_typ());
			// 共通フォーマットファイル
			String settingPath = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_FIX_SETTING_PATH, ifR.if_proc_typ());
			
			return PFBZL_FixLenFileFmt.createRead(ifR.ext_sys_cd(), ifR.if_proc_typ(), fmtPath, settingPath, ifR);
		}

		/**
		 * 固定長ファイルのIOクラス
		 */
		protected class PFFixLenFileReader extends PFBZL_FixLenFileReader implements PFInputFile {
			// ファイル入力処理はすべてPFBZL_FixLenFileReaderで実装する。
			// このクラス内でした呼び出せないメソッド（可変長ファイルと共通の処理など）の呼び出しメソッドを実装する。

			@Override
			protected void _colValidate(MCRow row, int rowIdx, MCReportMeta meta, String val) {
				colValidate(row, rowIdx, meta, val);
			}
			
			@Override
			protected String _getFormat(MCReportMeta rmeta) {
				return getFormat(rmeta);
			}
			
			@Override
			protected MCReportMeta _getDmyMeta() {
				return _dmyMeta;
			}
			
			@Override
			protected File _getFile() {
				return _file;
			}
			
			@Override
			protected PFT_SDRV_IF_R _getIfR() {
				return _ifR;
			}
			
			@Override
			protected String _getLabel(String colPath) {
				return getLabel(colPath);
			}
			
			@Override
			protected String _getErrFlg() {
				return _$errFlg;
			}

			@Override
			protected MCReportSet _getReportSet() {
				return _rptSet;
			}
			
			@Override
			protected void _insertRptL() {
				insertRptL();
			}
		}

		/**
		 * 初期化
		 * 
		 * @param ifR
		 */
		public void init(PFT_SDRV_IF_R sdrvIfR, PFT_IF_FILE_R ifFileR) {

			_file = new File(
					ifFileR.getStringNE(PFT_IF_FILE_R.$file_path)
					, ifFileR.getStringNE(PFT_IF_FILE_R.$file_nm));
			if (!_file.exists()) {
				throw new MCAppException(
					ifFileR, null, PFBZL0003,
					ifFileR.getStringNE(PFT_IF_FILE_R.$file_path)
					, ifFileR.getStringNE(PFT_IF_FILE_R.$file_nm));
			}
			else if (_file.length() <= 0) {
				throw new MCAppException(
					ifFileR, null, PFBZL0011, sdrvIfR.if_proc_typ(),
					ifFileR.getStringNE(PFT_IF_FILE_R.$file_path)
					, ifFileR.getStringNE(PFT_IF_FILE_R.$file_nm));
			}
			
			_ifR = sdrvIfR;
			// コード変換処理の有無にかかわらず、ＰＧ実行状況区分は「未処理」とする。
			_ifR.setStringNE(_$exe_sts_typ, MAC_EXE_STS_TYP.NOT_EXE.value());
			_ifPrtclMgr.init(_ifR);
			
			if (isFixLenFileFmt()) {
				_reader = createFixLenFileInputReader(_ifR);
			}
			else {
				_reader = createInputReader(_ifR);
			}
			

			String[] arr = _rptRowClass.getName().split("\\.");	// [mcframe][commonEXB][EXBR0010][DtlR]
			String pkg = arr[0] + "/" + arr[1] + "/" + arr[2];
			MCConst.loadInit(pkg);
		}

		protected boolean isFixLenFileFmt() {
			String fileTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_TYPE, _ifR.if_proc_typ());
			return isSame(_file_type_fix, fileTyp);
		}

		/**
		 * ファイルの内容を読み出します<br>
		 * また、読み出した内容はDBに登録します
		 * 
		 */
		public void read() {
			_reader.read(_file.getAbsolutePath());
		}

		/**
		 * ファイルから読み込んだIFデータをテーブルに格納します
		 * 
		 */
		@SuppressWarnings("unchecked")
		protected void insertRptL() {
			MCReportSet rpt = _reader.getReportSet();
			try {
				MCList<?> rptL = rpt.getAll();
				// 発番はマッパーで行う
				doSeqCache(getIfSeqTypForDtl(_ifR.if_proc_typ())  , rptL.size());

				for (Object objR : rptL) {
					S srcR = (S)objR;
					
					// エラーがあったら全件rollbackするので、追加する必要はない
					if (!srcR.getBooleanNE(_$errFlg)) {
						D destR = _ifL.createRow();
						copy(destR, srcR, _ifR, _mapper);
						setExeStsTyp(destR);
						if (_notImpCondSame != null) {
							boolean notImp = false;
							for (String key : _notImpCondSame.keySet()) {
								notImp = srcR.getString(key).equals(_notImpCondSame.get(key));
								if (notImp) {
									break;
								}
							}
							if (notImp) {
								continue;
							}
						}

						if (_notImpCondDiff != null) {
							boolean notImp = false;
							for (String key : _notImpCondDiff.keySet()) {
								notImp = !srcR.getString(key).equals(_notImpCondDiff.get(key));
								if (notImp) {
									break;
								}
							}
							if (notImp) {
								continue;
							}
						}
						_ifL.add(destR);
					}
				}
				// エラーがあったら全件rollbackするので、追加する必要はない
				if (!_ifL.isEmpty()
				 && _reader.getErrList().isEmpty()) {
					dbInsert(createSqlId(LOGIC_ID, _dbc, "I02"), _ifL, _builder);
				}
			}
			catch (MCException ex) {
				handleAppEx(ex, _reader.getErrList());
			}
			finally {
				_ifL.clear();
				rpt.clear();
				_reader.clear();
			}
		}
		
		protected void handleAppEx(MCException ex, MCMessageList msgL) {
			msgL.add(
				new MCMessage(_ifR, null, ex.getID(), (Object[])ex.getBindArray()));
			for (MCMessage msg : ex.getCauseMessageList()) {
				msgL.add(
					new MCMessage(_ifR, null, msg.getID(), (Object[])msg.getBindArray()));
			}
			if (ex.getCause() != null) {
				Throwable th = ex.getCause();
				MCException cause = th instanceof MCException ? (MCException)th : new MCException(th);
				msgL.add(new MCMessage(
					_ifR, null, cause.getID(), (Object[])cause.getBindArray()));
			}
		}
		
		/**
		 * ＰＧ実行状況区分を設定します
		 * 
		 */
		protected void setExeStsTyp(D destR) {
			destR.setString(_$exe_sts_typ, _ifR.getStringNE(_$exe_sts_typ));
			destR.setBoolean(_$imp_flg,
				MAC_EXE_STS_TYP.isNOT_EXE(_ifR.getStringNE(_$exe_sts_typ)));
		}

		/**
		 * 必須項目のカラムを設定します
		 * 
		 * @param cols
		 */
		public void setReqColumns(String... cols) {
			_reqColumns = cols;
		}

		/**
		 * カラムに対してメタ定義が妥当かを判定します
		 * 
		 * @param row
		 * @param rowIdx
		 * @param meta
		 * @return
		 */
		protected void colValidate(MCRow row, int rowIdx, MCReportMeta meta, String val) {
			if(meta == null){
				//レポートセットのメタ指定よりデータ行の項目数が多い場合は以降のチェックをスキップ
				return;
			}
			String colPath = meta.getColumnPath();
			// 項目定義チェック
			MCMessageList msgL = row.validate(colPath);
			
			// DBに値を保存するためのチェックのため、マイナスチェックエラーを不具合扱いしない
			// そこで、row.validate(colPath)の戻りのmsgLのから負値のメッセージ
			// (FCBBC0065)を除外する
			MCMessageList wkMsgL = new MCMessageList();
			for (MCMessage msg :msgL) {
				if(!isSame(mcframe.commonCore.notice.Core_Msg.FCBBC0065, msg.getID())) {
					wkMsgL.add(msg);
				}
			}
			if (!wkMsgL.isEmpty()) {
				_reader.getErrList().add(
						new MCMessage(_ifR, null, PFBZL0009, _file.getParent(),
								_file.getName(), rowIdx + 1, getLabel(colPath), colPath,
								val));
				for (MCMessage msg : msgL) {
					_reader.getErrList().add(
						new MCMessage(_ifR, null, msg.getID(), (Object[])msg.getBindArray()));
				}
			}

			// 必須チェック
			if(_reqColumns == null) {
				//必須項目なしの場合はスキップ
				return;
			}
			for (String col : _reqColumns) {
				if (isSame(col, colPath)) {
					if (isNull(val)) {
						_reader.getErrList().add(
								new MCMessage(_ifR, null, PFBZL0010, _file.getParent(),
										_file.getName(), rowIdx + 1, getLabel(colPath),
										colPath));
					}
					break;
				} 
			}
		}
		
		/**
		 * ファイル読み込み時のエラー情報を取得します
		 * 
		 * @return
		 */
		public MCMessageList getErrList() {
			return _reader == null ? null : _reader.getErrList();
		}

		/**
		 * 帳票項目のラベル名を取得します
		 * 
		 * @param colPath
		 * @return
		 */
		protected String getLabel(String colPath) {
			String[] arr = _rptRowClass.getName().split("\\.");	// [mcframe][commonEXB][EXBR0010][DtlR]
			String blk = arr[arr.length - 1];					// DtlR
			blk = blk.substring(0, blk.length() - 1);			// Dtl

			return getRptLabel(_rptSet.getModuleID(), _rptSet.getReportID(), blk, colPath);
		}
		
		/**
		 * 取得したレポートセットをIFテーブルに格納します
		 * 
		 */
		@SuppressWarnings("unchecked")
		protected void insertRptL(MCReportSet rpt) {
			try {
				MCList<?> rptL = rpt.getAll();
				// 発番はマッパーで行う
				doSeqCache(getIfSeqTypForDtl(_ifR.if_proc_typ())  , rptL.size());

				for (Object objR : rptL) {
					S srcR = (S)objR;
					
					// エラーがあったら全件rollbackするので、追加する必要はない
					if (!srcR.getBooleanNE(_$errFlg)) {
						D destR = _ifL.createRow();
						copy(destR, srcR, _ifR, _mapper);
						setExeStsTyp(destR);
						_ifL.add(destR);
					}
				}
				// エラーがあったら全件rollbackするので、追加する必要はない
				if (!_ifL.isEmpty()
				 && _reader.getErrList().isEmpty()) {
					dbInsert(createSqlId(LOGIC_ID, _dbc, "I01"), _ifL, _builder);
				}
			}
			catch (MCException ex) {
				handleAppEx(ex, _reader.getErrList());
			}
			finally {
				_ifL.clear();
				rpt.clear();
				_reader.clear();
			}
		}
		public MAUCC_RowMapperWith<D, S, PFT_SDRV_IF_R> getMapper() {
			return _mapper;
		}
		
		public MCList<D> getIfL() {
			return _ifL;
		}
		
		public MCReportSet getReportSet() {
			return _rptSet;
		}
		
		public Class<S> getReportSetClass() {
			return _rptRowClass;
		}

		public MCQueryApiBuilder getBuilder() {
			return _builder;
		}
	}
	//FMCB CUSTOM END
}