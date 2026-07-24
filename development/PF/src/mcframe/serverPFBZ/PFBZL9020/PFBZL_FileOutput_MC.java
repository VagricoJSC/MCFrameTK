package mcframe.serverPFBZ.PFBZL9020;

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
import mcframe.serverPFBZ.PFBZL9050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverPFBZ.PFBZL9060.PFBZL_CSVFmt;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileInfo;
import mcframe.serverPFBZ.PFBZL9070.PFBZL_FixLenFileFmt;
import mcframe.serverPFBZ.PFBZL9080.PFBZL_FixLenFileWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import mcframe.commonCore.report.container.MCReportMeta;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.MCCSVFile;
import mcframe.commonCore.report.MCFileWriteListener;
import mcframe.commonCore.sys.MCFactory;
import mcframe.serverCore.mcjdbc.MCCursor;
import static mcframe.serverCore.requester.MCRequestObject.*;

import mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys;
import static mcframe.serverPFUC.PFUCL5010.PFUCL_AppSys.*;
import mcframe.serverPFBZ.PFBZL9010.PFBZL_CodeConvert;
import java.util.Map;
import mcframe.serverPFUD.PFUDL5010.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;
import java.util.Locale;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBZL_FileOutput"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBZL_FileOutput_MC extends PFBZL_FileOutput_MC_A{
	//FMCB CUSTOM START

	/** 本クラス（スレッドセーフ対応用） */
	protected static final Class<PFBZL_FileOutput> PFBZL_FileOutput_CLAZZ = PFBZL_FileOutput.class;
	
	/**
	 * CSVファイルのフォーマット情報
	 */
	protected PFBZL_CSVFmt _csvFmt;
	
	/**
	 * IF送信に使用するレポートセットのインスタンスを生成します
	 * 
	 * @param clazzD	レポートセットに格納するRowのクラス
	 * @param clazzS	ＩＦテーブルのDBCのクラス
	 * @return			ＩＦF送信に使用するレポートセットのインスタンス
	 */
	public static <D extends MCRow, S extends MCDBContainer> IfSendReportSet<D, S>
			createIfSendReportSet(Class<D> clazzD, Class<S> clazzS) {
		return object(PFBZL_FileOutput_CLAZZ)._createIfSendReportSet(clazzD, clazzS);
	}

	/**
	 * IF送信に使用するレポートセットのインスタンスを生成します
	 * 
	 * @param clazzD	レポートセットに格納するRowのクラス
	 * @param clazzS	ＩＦテーブルのDBCのクラス
	 * @return			ＩＦ送信に使用するレポートセットのインスタンス
	 */
	protected <D extends MCRow, S extends MCDBContainer> IfSendReportSet<D, S>
			_createIfSendReportSet(Class<D> clazzD, Class<S> clazzS) {
		return new IfSendReportSet<D, S>(clazzD, clazzS);
	}
	
	/**
	 * IF送信に使用するレポートセットのインスタンスを生成します
	 * <br>出力するファイルのデータをヘッダ・明細の形式にする場合に使用します
	 * 
	 * @param clazzH レポートセットに格納するヘッダRowのクラス
	 * @param clazzD レポートセットに格納する明細Rowのクラス
	 * @param clazzS IFテーブルのDBCのクラス
	 * @return IF送信に使用するレポートセットのインスタンス
	 */
	public static <H extends MCRow, D extends MCRow, S extends MCDBContainer> IfSendReportSet<D, S>
			createIfSendReportSet(Class<H> clazzH, Class<D> clazzD, Class<S> clazzS) {
		return object(PFBZL_FileOutput_CLAZZ)._createIfSendReportSet(clazzH, clazzD, clazzS);
	}

	/**
	 * IF送信に使用するレポートセットのインスタンスを生成します
	 * 
	 * @param clazzH
	 * @param clazzD
	 * @param clazzS
	 * @return IF送信に使用するレポートセットのインスタンス
	 */
	protected <H extends MCRow, D extends MCRow, S extends MCDBContainer> IfSendReportSet<D, S>
			_createIfSendReportSet(Class<H> clazzH, Class<D> clazzD, Class<S> clazzS) {
		IfSendReportSet<D, S> ifSendReportSet = new IfSendReportSet<D, S>(clazzD, clazzS);
		ifSendReportSet.setHeaderClass(clazzH);
		return ifSendReportSet;
	}

	/**
	 * IF送信でのファイルの入出力を扱うクラスです
	 *
	 * @param <D>	レポートセットに格納するRowのクラス
	 * @param <S>	ＩＦ送信テーブルのDBCのインスタンスを生成するRowクラス
	 */
	public class IfSendReportSet<D extends MCRow, S extends MCDBContainer> {

		/**
		 * IFテーブルのDBCのインスタンス
		 * 	
		 */
		protected PFBZL_CodeConvert.IfDBContainer<S> _ifDBC = null;

		/**
		 * ファイル出力用のレポートセット
		 * 
		 */
		protected MCReportSet _rptSet = null;

		/**
		 * データ登録用のレポートセット（_rptSetの累積データ）
		 * 
		 */
		protected java.util.ArrayList<MCReportSet> _rptSetL;
		
		/**
		 * ファイル出力用のレポートファイル
		 * 
		 */
		protected MCCSVFile _rptFile = null;
		
		/**
		 * ファイルの出力先、名前
		 * 
		 */
		protected File _file = null;

		/**
		 * 固定長形式のファイル出力処理
		 */
		protected PFBZL_FixLenFileWriter _fixLenFileWriter;
		
		protected String _extPtn = "PF.PFBZL9020.writer";

		/**
		 * ファイル出力形式
		 */
		protected String _fileTyp;

	 	/**
		 * データセット用のマッパー
	  	 * 
	 	 */
		protected MCRowMapper<D, S> _mapper = null;

	 	/**
		 * データ受信用のマッパー
	  	 * 
	 	 */
		protected MCRowMapper<D, S> _mapperR = null;

		/**
		 * 通信ルールマスタ管理クラス
		 * 
		 */
		protected PFUCL_AppSys.IfPrtclMgr<S> _ifPrtclMgr = crtSendIfProtocolMgr();
		
		/**
		 * 出力結果格納
		 * 
		 */
		protected HashMap<MCNumber, File> _retMap = new HashMap<>();
		
		/**
		 * レポートセットに格納するヘッダRowのクラス
		 * <br>出力するファイルのデータをヘッダ・明細の形式にする場合に使用します
		 */
		protected Class<D> _clazzH = null;

		/**
		 * IF送受信テーブルのクラス
		 * 
		 */
		protected Class<S> _classS;
		
		/**
		 * IF送受信変換のクラス
		 * 
		 */
		protected mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase02 _classZ;

		/**
		 * ヘッダデータセット用のマッパー
		 * <br>出力するファイルのデータをヘッダ・明細の形式にする場合に使用します
		 */
		protected MCRowMapper<D, S> _mapperH = null;

		/**
		 * ヘッダ・明細形式の使用 <br>
		 * trueの場合、ヘッダ・明細形式でファイル出力します
		 */
		protected boolean _useHeaderDetails = false;

		/**
		 * 送信IFテーブルのうちヘッダのキーとなる項目
		 */
		protected String[] _headerKeys = null;

		/**
		 * スタートレコードのMCRow
		 */
		protected MCRow _startRecord = null;

		/**
		 * ヘッダレコードのMCRow
		 */
		protected MCRow _headerRecord = null;

		/**
		 * トレーラレコードのMCRow
		 */
		protected MCRow _trailerRecord = null;

		/**
		 * エンドレコードのMCRow
		 */
		protected MCRow _endRecord = null;

		/**
		 * ヘッダデータとなる条件
		 */
		protected HashMap<String, String> _headCriterion = null;

		/**
		 * フェッチサイズ
		 */
		protected Integer _fetchSize = -1;

		/**
		 * レポートセットに格納するRowのクラスリスト
		 */
		protected ArrayList<Class<D>> _nClazz = new ArrayList<>();

		/**
		 * データセット用のマッパーのリスト
		 */
		protected ArrayList<MCRowMapper<D, S>> _nMapper = new ArrayList<>();

		/**
		 * ファイル重複エラーフラグ
		 */
		protected boolean _fileDupErr = false;
		
		/**
		 * ラベル変換の条件
		 */
		protected String _replaceFlg = null;
		
		/**
		 * ラベル変換のリスト
		 */
		protected MCList<MCRow> _replaceL = MCList.create(MCRow.class);
		
		protected String[] _prefixCols;
		
		/**
		 * ファイル出力時のイベントリスナークラス
		 */
		protected class PFCSVFileWriterListner extends MCFileWriteListener {
			@Override
			public String writeHeadingLine(String heading, MCReportSet rset) {
				StringBuffer buff = new StringBuffer();
				MCReportMeta[] arr = rset.getReportMetaArray(0);
				for (int i=0; i<arr.length; i++) {
					MCReportMeta rMeta = arr[i];
					if (i > 0) {
						buff.append(_rptFile.getDelimiter());
					}
					buff.append(rMeta.getHeaderName());
				}
				
				if (isSame(_replaceFlg, "1")) {
					return replaceRabel(buff.toString());
				}
				
				return buff.toString();
			}
			
			protected HashMap<String, MCReportMeta[]> _csvHdrMetaArryMap = new HashMap<>();
			
			@Override
			public MCReportMeta[] metaFix(MCReportMeta[] rMetas, int rowIndex, MCRow r, String rType) {
				if (_csvHdrMetaArryMap.containsKey(rType)) {
					return _csvHdrMetaArryMap.get(rType);
				}
				
				if (_csvFmt != null) {
					String[] header = _csvFmt.getHeader(rType);
					if (header != null) {
						MCReportMeta[] metas = createReportMeta(r, header);
						_csvHdrMetaArryMap.put(rType, metas);
						return metas;
					}
				}
				
				MCReportMeta[] metas = super.metaFix(rMetas, rowIndex, r, rType);
				_csvHdrMetaArryMap.put(rType, metas);
				return metas;
			}
			
			protected MCReportMeta[] createReportMeta(MCRow r, String[] header) {
				ArrayList<MCReportMeta> rMetaList = new ArrayList<MCReportMeta>();
				for(int i=0; i < header.length; i++) {
					MCReportMeta meta = _rptSet.getReportMeta(r, header[i]);
					if(meta != null) {
						rMetaList.add(meta);
					}
					else {
						rMetaList.add(new MCReportMeta(mcframe.commonMA.meta.MA_META.STR20, header[i], "", header[i], false));
					}
				}
				return rMetaList.toArray(new MCReportMeta[rMetaList.size()]);
			}
		}
		
		/**
		 * ファイルラベルを変換します
		 * @param aftStr 
		 * @return 
		 */
		public String replaceRabel(String headStr) {
			String buffStr = headStr;
			for (MCRow r : _replaceL) {
				buffStr = buffStr.replace("," + r.getString("rep_rabel_fr")+ ","
						, "," + r.getString("rep_rabel_to") + ",");
			}
			return buffStr;
		}
		
		/**
		 * ラベル変換を設定します
		 */
		public void setReplaceRabel(String replaceFlg, MCList<MCRow> replaceL) {
			_replaceFlg = replaceFlg;
			_replaceL = replaceL;
		}

		/**
		 * コンストラクタ
		 * 
		 * @param clazzD
		 * @param clazzS
		 */
		public IfSendReportSet(Class<D> clazzD, Class<S> clazzS) {
			_ifDBC = PFBZL_CodeConvert.crtSendIfDBContainer(clazzS);
			_nClazz.add(clazzD);
			_classS = clazzS;
		}
		
		/**
		 * レポートセットを設定します
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
		public void setRowMapper(MCRowMapper<D, S> mapper) {
			_mapper = mapper;
			_nMapper.add(mapper);
		}

		/**
		 * レポートセットに格納する受信用RowのMapperRを設定します
		 * 
		 * @param mapper
		 */
		public void setRowMapperR(MCRowMapper<D, S> mapperR) {
			_mapperR = mapperR;
		}

		/**
		 * レポートセットに格納するヘッダRowのクラスを設定します
		 * <br>出力するファイルのデータをヘッダ・明細の形式にする場合に使用します
		 * 
		 * @param clazzH
		 */
		protected <H> void setHeaderClass(Class<H> clazzH) {
			_clazzH = (Class<D>) clazzH;
			_useHeaderDetails = true;
		}

		/**
		 * IF受信変換のクラスを設定します
		 * @param clazzZ
		 */
		public void setConvClass(mcframe.serverPFUD.PFUDL5010.PFUDL_SendRecvLogicBase.ConvBase02 clazzZ) {
			_classZ = clazzZ;
		}

		/**
		 * レポートセットに格納するRowのMapperHを設定します
		 * <br>出力するファイルのデータをヘッダ・明細の形式にする場合に使用します
		 * 
		 * @param mapperH 
		 */
		public void setRowMapperH(MCRowMapper<D, S> mapperH) {
			_mapperH = mapperH;
		}

		/**
		 * 出力するファイルのヘッダデータを構成するキー項目を設定します
		 * 
		 * @param headerKeys
		 */
		public void setHeaderKeys(String[] headerKeys) {
			_headerKeys = headerKeys;
		}

		/**
		 * スタートレコードを設定します
		 * 
		 * @param startRecord
		 */
		public void setStartRecord(MCRow startRecord) {
			_startRecord = startRecord;
		}

		/**
		 * ヘッダレコードを設定します
		 * 
		 * @param headerRecord
		 */
		public void setHeaderRecord(MCRow headerRecord) {
			_headerRecord = headerRecord;
		}

		/**
		 * トレーラレコードを設定します
		 * 
		 * @param trailerRecord
		 */
		public void setTrailerRecord(MCRow trailerRecord) {
			_trailerRecord = trailerRecord;
		}

		/**
		 * エンドレコードを設定します
		 * 
		 * @param endRecord
		 */
		public void setEndRecord(MCRow endRecord) {
			_endRecord = endRecord;
		}

		/**
		 * ヘッダデータの条件を設定します
		 * 
		 * @param criterion
		 */
		public void setHeadCriterion(HashMap<String, String> criterion) {
			_headCriterion = criterion;
		}

		/**
		 * フェッチサイズを設定します
		 * 
		 * @param fetchSize
		 */
		public void setFetchSize(int fetchSize) {
			_fetchSize = fetchSize;
		}

		/**
		 * レポートセットに格納するクラスのリストを設定します。<br>
		 * インスタンス生成時に作成されたリストは上書きされます。
		 * 
		 * @param nClazz
		 */
		public void setNClazz(ArrayList<Class<?>> nClazz) {
			_nClazz = (ArrayList) nClazz;
		}

		/**
		 * データセット用のマッパーのリストを設定します。<br>
		 * インスタンス生成時に作成されたリストは上書きされます。
		 * 
		 * @param nMapper
		 */
		public void setNRowMapper(ArrayList<MCRowMapper<?, ?>> nMapper) {
			_nMapper = (ArrayList) nMapper;
		}

		public void setPrefixCols(String... cols) {
			_prefixCols = cols;
		}

		/**
		 * ファイル出力を行います
		 * 
		 */
		public void writeMCF() {
			if (_rptSet == null) {
				return;
			}
			writePre();
			writeMainMCF();
			writePost();
		}

		public void writePre() {
			// 対象データが存在するか
			_ifDBC.checkIfL();
		
			// 対象のデータはワークテーブルに書かれているので、ここでは引数を使用しない
			_ifDBC.initSelect();
			_ifDBC.addSelectIfCtrlColumns();
			_ifDBC.addWhereIfWrite();
			_ifDBC.setOrderBy();
			
		}
		
		public void writePost() {
			//カスタマイズ用
		}

		/**
		 * ファイル出力を行います
		 * 
		 */
		public void write() {
			if (_rptSet == null) {
				return;
			}
			writePre();
			writeMain();
			writePost();
		}

		/**
		 * ファイル出力を行います
		 * 
		 */
		public void writeMain() {
			PFW_SDRV_IF_R ifR = getPfwSdrvIfR();
			if (ifR == null) {
				return ;
			}
			initFile(ifR);
			
			//送信ファイルグループ
			boolean isExtSys = isSame(
					PFUCL_AppSys._send_file_grp_1,
					_ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, ifR.getStringNE(_$if_proc_typ)));
			editDBBuilder(_ifDBC.getBuilder(), isExtSys);
			
			boolean init = true;
			MCCursor<S> cur = null;
			try {
				S bkR = null;
				cur = _ifDBC.getBuilder()
						.buildSelect(createSqlId(LOGIC_ID, _ifDBC.getBuilder().getBaseDbc(), "S02"))
						.openCursor(_classS);
				while (cur.dbFetch(_fetchSize) > 0) {
					MCList<S> fetchList = cur.getList();

					if (isExtSys) {
						toFileForExtSys(fetchList, init);
					}
					else {
						bkR = toFileForDataNo(bkR, fetchList);
					}
					//初期化のフラグを落とす
					init = false;
				}
			}
			finally {
				try {
					if (isFixLenFmt()) {
						if (_fixLenFileWriter != null) {
							_fixLenFileWriter.writeClose();
						}
					}
					else {
						if (!init) {
							_rptFile.writeClose();
						}
					}
				}
				finally {
					cur.dbCloseCur();
				}
			}
		}

		/**
		 * 帳票コンテナへのデータ保持を行います
		 * 
		 */
		public void writeMainMCF() {
			MCCursor<S> cur = null;
			try {
				cur = _ifDBC.getBuilder()
						.buildSelect(createSqlId(LOGIC_ID,
								_ifDBC.getBuilder().getBaseDbc(), "S03"))
						.openCursor(_classS);
				while (cur.dbFetch() > 0) {
					MCList<S> fetchList = cur.getList();
					setIfRptSetData(fetchList);

					if (_rptSetL == null) {
						_rptSetL = new ArrayList<MCReportSet>();
						_rptSetL.add(_rptSet.clone());
					}
					else {
						_rptSetL.clear();
						_rptSetL.add(_rptSet.clone());
					}
				}
			}
			finally {
				cur.dbCloseCur();
			}
		}

		protected PFW_SDRV_IF_R getPfwSdrvIfR() {
			MCList<PFW_SDRV_IF_R> sdrvDtlL = _ifDBC.getPfwSdrvIfL();
			if (isNull(sdrvDtlL)) {
				return null;
			}
			return sdrvDtlL.get(0);
		}

		/**
		 * ファイル出力前の初期処理
		 * 		
		 * @param bkR
		 * @return
		 */
		protected void initFile(MCRow ifR) {

			_ifPrtclMgr.set(ifR);
			String ifProcTyp = ifR.getStringNE(_$if_proc_typ);
			_file = _ifPrtclMgr.getLocalFile(ifProcTyp);
			_fileTyp = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_TYPE, ifProcTyp);
			String extSysCd = ifR.getStringNE(_$ext_sys_cd);

			// ファイル変換の仕様についてはカートリッジで差し替え可能にする必要がある。
			if (isFixLenFmt()) {
				initFileInFixLenFmt(ifR, ifProcTyp, extSysCd);
			}
			else {
				// 1. CSV(カンマ区切り), 2. TSV(タブ区切り）以外の場合は、 1. CSV(カンマ区切り)として扱う
				if (!isSame(_file_type_csv, _fileTyp) && !isSame(_file_type_tsv, _fileTyp)) {
					_fileTyp = _file_type_csv;
				}
				initFileInCSV(ifR, ifProcTyp, extSysCd);
			}
		}

		protected boolean isFixLenFmt() {
			return isSame(_file_type_fix, _fileTyp);
		}

		protected void initFileInCSV(MCRow ifR, String ifProcTyp, String extSysCd) {
			// CSV or TSV
			MCCSVFile csvRpt =  new MCCSVFile();
			
			if (isSame(_file_type_tsv, _fileTyp)) {
				csvRpt.setDelimiter(String.valueOf('\t'));	// タブ区切り
			}
			String use = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_USE_HEADING, ifProcTyp);
			csvRpt.useHeading(Boolean.valueOf(use));

			String dq = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_DBL_QUART, ifProcTyp);
			csvRpt.setDoubleQuotation(Boolean.valueOf(dq));

			String bom = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_BOM, ifProcTyp);
			csvRpt.setWriteBOM(Boolean.valueOf(bom));

			// １行目をヘッダ行とせずに項目の並び順を変更する
			setCsvFmt(ifR, csvRpt);

			_rptFile = csvRpt;

			_rptFile.setReportSet(_rptSet);

			String ifloc = MCConst.app.getString(MCConst.createKey("PF", "if_output", "locale"));

			if (!isNull(ifloc)) {
				Locale l = MCConst.convLocale(ifloc);
				_rptFile.setLocale(l);
				_rptSet.setLocale(l);
			}
			
			_rptFile.setManualClose(true);
			if (_rptFile instanceof MCCSVFile) {
				_rptFile.addWriteListener(new PFCSVFileWriterListner());
			}

			String charSet = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_CHARSET, ifProcTyp);
			if (!isNull(charSet)) {
				_rptFile.setCharset(charSet);
			}
		}

		/**
		 * ＣＳＶファイルの項目の並び順を変更する
		 */
		protected void setCsvFmt(MCRow ifR, MCCSVFile csvRpt) {
			// １行目を見出し行として使用する場合はそれに従う。
			if (csvRpt == null || csvRpt.isHeading()) {
				return ;
			}
			
			String ifProcTyp = ifR.getStringNE(_$if_proc_typ);
			String extSysCd = ifR.getStringNE(_$ext_sys_cd);
			
			String fmtPath = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_CSV_FMT_PATH, ifProcTyp);
			if (isNull(fmtPath)) {
				return ;
			}
			
			File file = new File(fmtPath);
			if (!file.exists()) {
				throw new MCAppException(ifR, null, PFBZL0003, file.getParent(), file.getName());
			}
			else if (file.length() <= 0) {
				throw new MCAppException(ifR, null, PFBZL0011, ifProcTyp, file.getParent(), file.getName());
			}
			
			PFBZL_CSVFmt fmt = new PFBZL_CSVFmt();
			fmt.init();
			fmt.checkFmt(fmtPath, ifR);
			if (fmt.hasErr()) {
				MCAppException ex = new MCAppException(ifR, null, PFBZL0118, extSysCd, ifProcTyp, file.getParent(), file.getName());
				ex.addCauseMessageList(fmt.getErrMsgList());
				throw ex;
			}
			_csvFmt = fmt;
			
		}

		protected void editDBBuilder(MCQueryApiBuilder builder, boolean isExtSys) {
			if (isFixLenFmt()) {
				editDBBuilderInFixLenFmt(builder, isExtSys);
			}
		}

		/**
		 * レポートセットのデータセットアップ
		 * 
		 * @param fRow
		 * @param ifL
		 */
		protected void setIfRptSetData(MCList<S> ifL) {
			try {
				if (_classZ != null) {
					_classZ.initCache(ifL);
				}
				if (!_useHeaderDetails) {

					if (!isNull(_startRecord)) {
						_rptSet.addRow(_startRecord);
					}

					for (S srcR : ifL) {
						if (!isNull(_headerRecord)) {
							_rptSet.addRow(_headerRecord);
						}

						for (int i = 0; i < _nClazz.size(); i++) {
							D destR = create(_nClazz.get(i));
							copy(destR, srcR, _nMapper.get(i));
							_rptSet.addRow(destR);
						}

						if (!isNull(_trailerRecord)) {
							_rptSet.addRow(_trailerRecord);
						}
					}

					if (!isNull(_endRecord)) {
						_rptSet.addRow(_endRecord);
					}
				}
				else {
					if (isNull(ifL)) {
						return;
					}

					if (!isNull(_startRecord)) {
						_rptSet.addRow(_startRecord);
					}

					for (MCList<S> grpL : ifL.groupList(_headerKeys)) {
						D hdrR = create(_clazzH);
						MCList<D> dtlL = MCList.create(_nClazz.get(0));

						if (_headCriterion != null) {
							for (S r : grpL) {
								copy(hdrR, r, _mapperH);

								for (Map.Entry<String, String> e : _headCriterion.entrySet()) {
									if (!isSame(r.getString(e.getKey()), e.getValue())) {
										hdrR.clear();
										break;
									}
								}

								if (!hdrR.isEmpty()) {
									break;
								}
							}

							if (hdrR.isEmpty()) {
								continue;
							}
						}
						else {
							copy(hdrR, grpL.get(0), _mapperH);
						}

						addAll(dtlL, grpL, _nMapper.get(0));

						if (!isNull(_headerRecord)) {
							_rptSet.addRow(_headerRecord);
						}
	
						_rptSet.addRow(hdrR);
						_rptSet.addAll(dtlL);

						if (!isNull(_trailerRecord)) {
							_rptSet.addRow(_trailerRecord);
						}
					}

					if (!isNull(_endRecord)) {
						_rptSet.addRow(_endRecord);
					}
				}
			}
			catch (MCException ex) {
				throw ex;			// エラーは呼び元で設定する
			}
		}
		
		/**
		 * 出力したファイル情報を取得します
		 * 
		 * @return
		 */
		public ArrayList<MCReportSet> getRptSetL() {
			return _rptSetL;
		}


		/**
		 * 送信グループが外部システム単位の場合のファイル出力
		 * 
		 * @param ifL
		 */
		protected void toFileForExtSys(MCList<S> ifL, boolean initFlg) {
			try {
				setIfRptSetData(ifL);
				toFile(ifL.get(0), initFlg);
				for (S srcR : ifL) {
					_retMap.put(srcR.getNumberNE(_$data_no), _file);
				}
			}
			catch (MCException ex) {
				_retMap.clear();	// 全件エラー
				throw ex;			// エラーは呼び元で設定する
			}
		}

		/**
		 * 送信グループが外部システム＋データＮＯ単位の場合のファイル出力
		 * 
		 * @param bkR
		 * @param ifL
		 */
		protected S toFileForDataNo(S bkR, MCList<S> ifL) {

			if (_fileDupErr) {
				return null;
			}

			for (MCList<S> dataL : ifL.groupList(_$data_no)) {
				S fRow = dataL.get(0);
				try {
					setIfRptSetData(dataL);

					if (bkR != null && isSame(fRow.getNumberNE(_$data_no), bkR.getNumberNE(_$data_no))) {
						// データＮＯが一致している場合は常に追記
						toFile(null, false);
					}
					else {
						// データＮＯが不一致の場合、別ファイルに記入(初期化時)
						toFile(fRow, true);
						
						// データＮＯ毎にファイルとのＭＡＰを保持
						_retMap.put(fRow.getNumberNE(_$data_no), _file);						
					}
				}
				catch (MCException ex) {
					handleEx(ex, dataL);	
					_retMap.put(fRow.getNumberNE(_$data_no), null);

					if (_fileDupErr) {
						return null;
					}
				}
				bkR = fRow;
			}
			return ifL.get(ifL.size() - 1);
		}

		/**
		 * ファイルを出力します
		 * 
		 * @param row
		 */
		protected void toFile(S srcR, boolean initFlg) {

			if (_rptSet.size() <= 0) {
				return;
			}
			
			if (initFlg && srcR != null) {
				_ifPrtclMgr.set(srcR);
				MAC_IF_PROC_TYP ifProcTyp = MAC_IF_PROC_TYP.getNE(srcR.getStringNE(_$if_proc_typ));
				_file = _ifPrtclMgr.getLocalFile(ifProcTyp);
				addFileNamePrefix();
				if (_file.exists()) {
					_fileDupErr = true;
					
					throw new MCAppException(PFBZL0503, _file.getName(),
							srcR.getStringNE(_$ext_sys_cd),
							MAC_IF_CTL_TYP.FILE_NM.value());
				}
			}
			
			if (isFixLenFmt()) {
				toFileInFixLenFmt(srcR, initFlg);
			}
			else {
				toFileInCSV(srcR, initFlg);
			}
			
			_rptSet.clear();
		}
		protected void addFileNamePrefix() {
			if (_prefixCols == null) return;
			MCRow destR = _rptFile.getReportSet().getAll().get(0);
			String name = _file.getName();
			String path = _file.getParent();
			String prefix = "";
			for(String prefixCol : _prefixCols) {
				prefix += (getColValueAsStr(destR,prefixCol) + "_");
			}
			_file = new File(path, prefix + name);
		}

		protected String getColValueAsStr(MCRow tgtR, String name) {
			MCDataType dataType = tgtR.getDataType(name);
			String result = "null";
			if (isNull(dataType)) {
				return result;
			}
			switch(dataType) {
				case STRING:
					String strVal = tgtR.getStringNE(name);
					result = !isNull(strVal) ? replaceInvlidStr(strVal) : result;
					break;
				case NUMBER:
					MCNumber numVal = tgtR.getNumberNE(name);
					result = !isNull(numVal) ? numVal.toString() : result;
					break;
				case DATE:
					MCDate dateVal = tgtR.getDateNE(name);
					result = !isNull(dateVal) ? dateVal.toString("yyyyMMdd") : result;
					break;
				case TIMESTAMP:
					MCTimestamp timeStampVal = tgtR.getTimestampNE(name);
					result = !isNull(timeStampVal) ? timeStampVal.toString("yyyyMMdd") : result;
					break;
				default:
					break;
			}
			return result;
		}
		
		protected String invalidStr = "[\\\\/:*?\"<>|]";
		protected String replaceInvlidStr(String str) {
			return str.replaceAll(invalidStr, "-");
		}

		protected void toFileInCSV(S srcR, boolean initFlg) {
			boolean isHeading = _rptFile.isHeading();
			if (initFlg && srcR != null) {
				_rptFile.append(false);
			}
			else {
				_rptFile.useHeading(false); //追記時は常にヘッダはオフ
				_rptFile.append(true);
			}

			_rptFile.write(_file.toString());
			_rptFile.writeClose();
			_rptFile.useHeading(isHeading);
		}

		protected void initFileInFixLenFmt(MCRow ifR, String ifProcTyp, String extSysCd) {
			if (_useHeaderDetails || _nMapper.size() != 1
					|| !isNull(_startRecord) || !isNull(_headerRecord)
					|| !isNull(_trailerRecord) || !isNull(_endRecord)) {
				throw new MCException(PFBZL0095, extSysCd, ifProcTyp);
			}
			
			String charset = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_CHARSET, ifProcTyp);
			String bom = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_BOM, ifProcTyp);
			PFBZL_FixLenFileFmt fmt = createPFBZL_FixLenFileFmt(ifR, ifProcTyp, extSysCd);
			
			PFBZL_FixLenFileWriter writer = createPFBZL_FixLenFileWriter(ifR, ifProcTyp, extSysCd);
			writer.setFixLenFileFmt(fmt);
			writer.setCharset(charset);
			writer.setWriteBOM(Boolean.valueOf(bom));
			_fixLenFileWriter = writer;
		}

		protected PFBZL_FixLenFileWriter createPFBZL_FixLenFileWriter(MCRow ifR, String ifProcTyp, String extSysCd) {
			return new PFBZL_FixLenFileWriter();
		}

		protected PFBZL_FixLenFileFmt createPFBZL_FixLenFileFmt(MCRow ifR, String ifProcTyp, String extSysCd) {
			PFBZL_FixLenFileFmt fmt = new PFBZL_FixLenFileFmt();
			fmt.setExtFmt(_extPtn);
			String fmtPath = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH, ifProcTyp);
			String settingPath = _ifPrtclMgr.getIfCtlString(MAC_IF_CTL_TYP.FILE_FIX_SETTING_PATH, ifProcTyp);
			return PFBZL_FixLenFileFmt.createWrite(extSysCd, ifProcTyp, fmtPath, settingPath, ifR, fmt, null);
		}

		protected void editDBBuilderInFixLenFmt(MCQueryApiBuilder builder, boolean isExtSys) {
			if (_fixLenFileWriter == null || builder == null) {
				return ;
			}
			PFBZL_FixLenFileInfo fmtInfo = _fixLenFileWriter.getFileInfo();
			Map<String, Object> extInfo = fmtInfo.getExtInfo(_extPtn);
			if (extInfo == null) {
				return ;
			}
			String[] sort = (String[]) extInfo.get("sort");
			if (sort != null) {
				MCDBContainer dbc = builder.getBaseDbc();
				ArrayList<String> sortL = new ArrayList<>();
				if (isExtSys == false) {
					if (dbc.contains("data_no")) {
						sortL.add("data_no");
					}
				}
				for (String col : sort) {
					if (dbc.contains(col) && !sortL.contains(col)) {
						sortL.add(col);
					}
				}
				if (!sortL.isEmpty()) {
					boolean firstFlg = true;
					for (String col : sortL) {
						if (firstFlg) {
							builder.setOrderByAsc(dbc.getColumn$(col));
							firstFlg = false;
						}
						else {
							builder.addOrderByAsc(dbc.getColumn$(col));
						}
					}
				}
			}
		}

		@SuppressWarnings("unchecked")
		protected void toFileInFixLenFmt(S srcR, boolean initFlg) {
			if (initFlg) {
				_fixLenFileWriter.writeClose();
				_fixLenFileWriter.setFilePath(_file.toString());
			}
			_fixLenFileWriter.addList(_rptSet.getAll());
			_fixLenFileWriter.write();
		}

		/**
		 * レポートセットに格納するRowクラスのインスタンスを生成します
		 * 
		 * @param clazz	レポートセットに格納するRowのクラス
		 * @return		Rowのインスタンス
		 */
		protected D create(Class<D> clazz) {
			Object obj = MCFactory.invokeStatic(clazz, "create", null, null);
			try {
				return clazz.cast(obj);
			}
			catch (Exception ex) {
				// Class#cast
				// インスタンスの生成に失敗
				throw new MCException(ex, PFBZL0002, clazz.getName());
			}
		}
		
		/**
		 * 出力したファイル情報を取得します
		 * 
		 * @return
		 */
		public HashMap<MCNumber, File> getRetInf() {
			return _retMap;
		}
	}
	/**
	 * Send01オペレーション.<p>
	 *
	 * 対象の業務ＩＦデータを検索する<br>
	 */
	public class Send01 extends PFBZL_FileOutput_MC_A.Send01 {
		/**
		 * 送受信コード変換時のＩＦ処理区分と対象ＩＦテーブルのマップ
		 */
		protected Map<String, MCList<MCDBContainer>> _ifProcTypTableMap = null;
		/**
		 * 対象のＩＦ処理区分と下り電文ブロックのマップ
		 */
		protected Map<String, MCList> _ifProcTypDownMap = null;
		/**
		 * 送信日時
		 */
		protected MCDate _send_tm = MCDate.now();

		@Override
		protected void call() {
			super.call();
			
			if (getIfProcTypTableMap() == null || getIfProcTypTableMap().isEmpty()
					|| getIfProcTypDownMap() == null || getIfProcTypDownMap().isEmpty()) {
				return;
			}
			
			for (Map.Entry<String, MCList<MCDBContainer>> ifProcTypE : getIfProcTypTableMap().entrySet()) {
				if (ifProcTypE.getValue() == null) {
					continue;
				}
				
				PFBZL_SendRecvIfCtrl.Srch01 ope = PFBZL_SendRecvIfCtrl.crtSrch01();
				MCRow.copyall(ope.up0(), up0());
				ope.up0().if_proc_typ(ifProcTypE.getKey());
				ope.up0().notyet_flg(false);
				ope.up0().send_conv_err_flg(false);
				ope.up0().send_conv_ok_flg(true);
				ope.exec();
				
				// 取得した送受信ＩＦデータを送信済に更新
				if (ope.down0().isEmpty()) {
					continue;
				}
				updSdrvIf(ope.down0());
				
				// 業務ＩＦデータを取得
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(ifProcTypE.getValue().createRow());
				getAppDate(ope.down0(), ifProcTypE.getKey(), ifProcTypE.getValue(), builder);
			}
		}
		
		/**
		 * 対象のＩＦ処理区分と業務ＩＦテーブルのマップを設定する
		 */
		public void setIfProcTypTableMap(Map<String, MCList<MCDBContainer>> ifProcTypTableMap) {
			_ifProcTypTableMap = ifProcTypTableMap;
		}
		/**
		 * 対象のＩＦ処理区分と下り電文のマップを設定する
		 */
		public void setIfProcTypDownMap(Map<String, MCList> ifProcTypDownMap) {
			_ifProcTypDownMap = ifProcTypDownMap;
		}
		
		protected Map<String, MCList<MCDBContainer>> getIfProcTypTableMap() {
			return _ifProcTypTableMap;
		}
		protected Map<String, MCList> getIfProcTypDownMap() {
			return _ifProcTypDownMap;
		}
		
		/**
		 * 送受信ＩＦを送信済に更新する
		 * @param downL
		 */
		protected void updSdrvIf(MCList<Srch01_DtlR> downL) {
			downL.setString(Srch01_DtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.SEND_OK.value());
			downL.setDate(Srch01_DtlR.$sdrv_tm, _send_tm);
			downL.setString(Srch01_DtlR.$sdrv_clt_id, MCSys.user.clientID());
			downL.setString(Srch01_DtlR.$sdrv_usr_id, MCSys.user.ID());
			downL.setString(Srch01_DtlR.$sdrv_usr_nm, MCSys.user.name());

			PFT_SDRV_IF_R dbc = PFT_SDRV_IF_R.create("T");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
			MCList<PFT_SDRV_IF_R> sdrvIfL = MCList.create(PFT_SDRV_IF_R.class);
			for (Srch01_DtlR r : downL) {
				sdrvIfL.add(r.sdrvIf());
			}
			builder.setSet(dbc.sdrv_sts_typ, dbc.sdrv_tm, dbc.sdrv_clt_id,
					dbc.sdrv_usr_id, dbc.sdrv_usr_nm);
			dbUpdateKey(createSqlId(LOGIC_ID, dbc, "U01"), sdrvIfL,
					builder);
		}
		
		/**
		 * 業務ＩＦデータを取得し、ファイル出力時のマッパーを使用して下り電文を作成する
		 * @param downL
		 * @param ifProcTyp
		 * @param tgtTableL
		 * @param builder
		 */
		protected void getAppDate(MCList<Srch01_DtlR> downL, String ifProcTyp, MCList<MCDBContainer> tgtTableL, MCQueryApiBuilder builder) {
			Srch01_DtlR downR = downL.get(0);
			String fileIoOpe = downR.file_io_ope();
			PFUDL_SendRecvLogicBase.ConvBase02 ope = crtOperation(fileIoOpe, PFUDL_SendRecvLogicBase.ConvBase02.class);
			PFBZL_FileOutput.IfSendReportSet ifSendReportSet = ope.getIfSendReportSet();
			if (ifSendReportSet == null) {
				return;
			}

			MCDBContainer dbc = tgtTableL.createRow();
			MCNumberPermColumn data_no = (MCNumberPermColumn) dbc.getColumn$("data_no");
			MCNumberPermColumn data_lno = (MCNumberPermColumn) dbc.getColumn$("data_lno");

			builder.setWhere(data_no.eq(bind("data_no")));
			builder.setOrderByAsc(data_no, data_lno);
			dbSelect(createSqlId(LOGIC_ID, dbc, "S01"), tgtTableL,
					builder, downL);
			
			MCList tgtDownL = getIfProcTypDownMap().get(ifProcTyp);
			if (tgtDownL == null) {
				return;
			}
			
			for (MCDBContainer r : tgtTableL) {
				MCRow tgtDownR = tgtDownL.add();
				copy(tgtDownR, r, ifSendReportSet._mapper);
			}
		}
		
		/**
		 * オペレーションのインスタンスを生成
		 * 
		 * @param ope	オペレーション文字列
		 * @param clazz	オペレーションクラス
		 * @return		オペレーションのインスタンス
		 */
		protected <T extends IfMCOperation> T crtOperation(String ope, Class<T> clazz) {
			String[] arr = parseOperation(ope);
			return createOperation(
					arr[0],		// moduleId
					arr[1],		// logicId
					arr[2],		// operationId
					clazz);
		}

		/**
		 * オペレーション文字列からモジュールID、ロジックID、オペレーションIDを取得
		 * 
		 * @param operation	オペレーション文字列
		 * @return	[0]：モジュールID
		 * 			[1]：ロジックID
		 * 			[2]：オペレーションID
		 */
		protected String[] parseOperation(String operation) {
			if (isNull(operation)) {
				return null;
			}
			String[] arr = operation.split("\\."), ret = new String[3];
			if (arr.length == 3) {
				System.arraycopy(arr, 0, ret, 0, arr.length);
			}
			return ret;
		}
	}

	//FMCB CUSTOM END
}