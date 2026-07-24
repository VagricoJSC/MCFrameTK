package mcframe.serverPFUC.PFUCL5010;

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
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import mcframe.commonCore.sys.MCSys;
import mcframe.commonCore.util.MCDataConvUtil;
import mcframe.commonCore.util.MCFileUtil;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.serverPFUD.PFUDL5000.*;
import mcframe.serverPFUD.PFUDL5020.*;
import mcframe.serverPFUD.PFUDL0040.*;

import static mcframe.serverCore.requester.MCRequestObject.*;
//FMCB CUSTOM_IMPORT END

/**
 * "PFUCL_AppSys"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFUCL_AppSys_MC extends PFUCL_AppSys_MC_A{
	//FMCB CUSTOM START
	/** 本クラス（スレッドセーフ対応用） */
	protected static final Class<PFUCL_AppSys> PFUCL_AppSys_CLAZZ = PFUCL_AppSys.class;

// ----- ＩＦ制御区分 -----

	/**
	 * ファイル形式
	 * 1：CSV形式（カンマ区切り）
	 * 2：TSV形式（タブ区切り）
	 * 3:固定長形式
	 */
	public static final String _file_type_csv = "1";

	public static final String _file_type_tsv = "2";

	public static final String _file_type_fix = "3";
	
	/**
	 * ファイルの１行目を見出し行として扱うかどうか
	 * true ：扱う
	 * false：扱わない
	 */
	public static final String _file_use_heading_t = "true";

	public static final String _file_use_heading_f = "false";

	/**
	 * ＢＯＭ（Byte Order Mark）を付加するかどうか
	 * true ：付加する
	 * false：付加しない
	 */
	public static final String _file_bom_t = "true";

	public static final String _file_bom_f = "false";

	/**
	 * ＥＤＩ関連の送信ファイルの作成単位
	 * 1：ＩＦ処理区分＋外部システムＣＤ単位でまとめる
	 * 2：ＩＦ処理区分＋外部システムＣＤ＋データＮＯ単位でまとめる
	 */
	public static final String _send_file_grp_1 = "1";

	public static final String _send_file_grp_2 = "2";

	/**
	 * ファイルに出力される文字列項目をダブルクォートで囲むかどうか
	 * true ：囲む
	 * false：囲まない
	 */
	public static final String _file_dbl_quart_t = "true";

	public static final String _file_dbl_quart_f = "false";

	/**
	 * ＦＴＰのモード
	 * 1：アクティブモード
	 * 2：パッシブモード
	 */
	public static final String _ftp_mode_active = "1";

	public static final String _ftp_mode_passive = "2";

	/**
	 * 転送ファイルのロック方式
	 * 1：リネーム方式
	 * 2：ステータス方式
	 */
	public static final String _transfer_lock_typ_rename = "1";
	public static final String _transfer_lock_typ_rename_msg = "1：リネーム方式";

	public static final String _transfer_lock_typ_status = "2";
	public static final String _transfer_lock_typ_status_msg = "2：ステータスファイル方式";

	/**
	 * ファイル送信方法
	 * 1：ファイルコピー、
	 * 2：ＦＴＰ（外部システム区分が「6：EDI_MCF」の場合は本指定は無効）
	 * 3：ＳＦＴＰ（外部システム区分が「6：EDI_MCF」の場合は本指定は無効）
	 */
	public static final String _send_typ_copy = "1";
	public static final String _send_typ_copy_msg = "1 : COPY";

	public static final String _send_typ_ftp = "2";
	public static final String _send_typ_ftp_msg = "2 : ftp";

	public static final String _send_typ_sftp = "3";
	public static final String _send_typ_sftp_msg = "3 : sftp";

	/**
	 * ファイル受信方法
	 * 2：ＦＴＰ（外部システム区分が「6：EDI_MCF」の場合は本指定は無効）
	 * 3：ＳＦＴＰ（外部システム区分が「6：EDI_MCF」の場合は本指定は無効）
	 */
	public static final String _recv_typ_ftp = _send_typ_ftp;
	public static final String _recv_typ_ftp_msg = _send_typ_ftp_msg;

	public static final String _recv_typ_sftp = _send_typ_sftp;
	public static final String _recv_typ_sftp_msg = _send_typ_sftp_msg;

	/**
	 * 出力するファイルのデフォルト文字セット
	 */
	public static final String _def_file_charset = "UTF-8";

	/**
	 * ＦＴＰポートのデフォルト数値セット
	 */
	public static final String _def_ftp_port = "21";

	/**
	 * ＳＦＴＰポートのデフォルト数値セット
	 */
	public static final String _def_sftp_port = "22";
	
	/**
	 * ＦＴＰ・ＳＦＴＰアクセスのリトライ上限回数
	 */
	public static final String _def_rtry_cnt = "3";

	/**
	 * ＦＴＰ・ＳＦＴＰアクセスのリトライするまでの待ち時間
	 */
	public static final String _def_wait_sec = "5";

	/**
	 * ステータスファイル接尾辞のデフォルト文字セット
	 */
	public static final String _def_sts_file_suffix = ".end";

	/**
	 * 送受信ファイルの保存先となるアプリケーションサーバローカルのデフォルトディレクトリ
	 */
	public static final String _def_local_dir = "{MCF_HOME}\\esb\\{CO_CD}\\{EXT_SYS_CD}\\{IF_PROC_TYP}";

	/**
	 * 固定長ファイルのフォーマットの保存先となるアプリケーションサーバローカルのデフォルトパス。<br>
	 * 送受信ファイルの保存先フォルダに含まれない位置に配置する。
	 */
	public static final String _def_file_fix_fmt_path = "{MCF_HOME}\\esb\\{CO_CD}\\{EXT_SYS_CD}\\fmt\\{IF_PROC_TYP}.json";

	/**
	 * ファイル名のデフォルト文字セット
	 */
	public static final String _def_file_nm = "{yyyyMMddHHmmssSSS}.dat";
	/**
	 * デフォルト値を設定するカラム（内容（文字列）、内容（数値））を選択
	 */
	public static final String _set_var_str = "1";

	public static final String _set_var_num = "2";
	
	protected static final String _map_key_connector = "^";

// ----- オペレーション連携 -----
	
	/**
	 * ＰＧ実行状況区分
	 */
	public static final String _$exe_sts_typ = "exe_sts_typ";

	/**
	 * 取込対象ＦＬＧ
	 */
	public static final String _$imp_flg = "imp_flg";

	/**
	 * 業務情報１～20
	 * 
	 */
	public static final String[] _$attrs = {
		"attr_char1", "attr_char2", "attr_char3", "attr_char4", "attr_char5",
		"attr_char6", "attr_char7", "attr_char8", "attr_char9", "attr_char10",
		"attr_num1",  "attr_num2",  "attr_num3",  "attr_num4",  "attr_num5",
		"attr_dt1",   "attr_dt2",   "attr_dt3",   "attr_dt4",   "attr_dt5"
	};
	
	/**
	 * オペレーション文字列からモジュールID、ロジックID、オペレーションIDを取得します
	 * 
	 * @param operation	オペレーション文字列
	 * @return	[0]：モジュールID
	 * 			[1]：ロジックID
	 * 			[2]：オペレーションID
	 */
	protected String[] parseOperation(String operation) {
		if (isNull(operation)) {
			throw new MCAppException(PFUCL0004);
		}
		String[] arr = operation.split("\\."), ret = new String[3];
		if (arr.length == 3) {
			System.arraycopy(arr, 0, ret, 0, arr.length);
		}
		return ret;
	}

	/**
	 * オペレーションのインスタンスを生成します
	 * 
	 * @param ope	オペレーション文字列
	 * @param clazz	オペレーションクラス
	 * @return		オペレーションのインスタンス
	 */
	protected <T extends IfMCOperation> T createOperation(String ope, Class<T> clazz) {
		String[] arr = parseOperation(ope);
		return createOperation(
				arr[0],		// moduleId
				arr[1],		// logicId
				arr[2],		// operationId
				clazz);
	}

	/**
	 * オペレーションを実行します
	 * 	
	 * @param ope	オペレーションのインスタンス
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		オペレーションからの戻りのデータコンテナ（≠下り電文）
	 */
	@SuppressWarnings("unchecked")
	protected <L extends MCList<?>> L execOperation(IfMCOperation ope, L upIfL) {
		if (ope instanceof PFUDL_LogicBase.OperationBase) {
			PFUDL_LogicBase.OperationBase o = (PFUDL_LogicBase.OperationBase)ope;
			o.shareL = upIfL;	// 電文経由ではなく、直接わたす
			o.exec();
			return (L)o.shareL;	// 電文経由ではなく、直接もらう
		}
		else {
			ope.exec();
			return null;
		}
	}
	
	/**
	 * 送信前コード変換処理オペレーションを呼び出します
	 * 
	 * @param ope	前処理オペレーション
	 * @param upL	オペレーションの上り電文
	 * @return		オペレーションからの戻りのデータコンテナ（≠下り電文）
	 */
	public static <L extends MCList<?>> L callPreOperation(String ope, MCList<ConvDtlR> upL) {
		return object(PFUCL_AppSys_CLAZZ)._callConvOperation(ope, upL, null, true);
	}
	
	/**
	 * 送信後コード変換処理オペレーションを呼び出します
	 * 
	 * @param ope	後処理オペレーション
	 * @param upL	オペレーションの上り電文
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		オペレーションからの戻りのデータコンテナ（≠下り電文）
	 */
	public static <L extends MCList<?>> L callPostOperation(String ope, MCList<ConvDtlR> upL, L upIfL) {
		return object(PFUCL_AppSys_CLAZZ)._callConvOperation(ope, upL, upIfL, false);
	}

	/**
	 * データ変換オペレーションを呼び出します
	 * 
	 * @param ope	前処理／後処理オペレーション
	 * @param upL	オペレーションの上り電文
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		オペレーションからの戻りのデータコンテナ（≠下り電文）
	 */
	protected <L extends MCList<?>> L _callConvOperation(String ope, MCList<ConvDtlR> upL, L upIfL, boolean isPre) {

		IfPFUDL_SendRecvIf_Conv01 o = null;
		L retL = null;
		try {
			o = createOperation(ope, IfPFUDL_SendRecvIf_Conv01.class);
			o.up0().setAll(upL);
			retL = execOperation(o, upIfL);
			upL.setAll(o.down0());
		}
		catch (Exception ex) {
			upL.setString(ConvDtlR.$sdrv_sts_typ, isPre ? 
					MAC_SDRV_STS_TYP.SEND_CONV_ERR.value() :
					MAC_SDRV_STS_TYP.RECV_CONV_ERR.value() 
					);

			MCAppException e = new MCAppException(PFUCL0001, ope);
			e.addCauseMessage(new MCException(ex).getMCMessage());
			handleEx(e, upL);
		}
		finally {
			setMsgPoolCauseRows(upL);
		}
		return retL;
	}

	/**
	 * データ出力オペレーションを呼び出します
	 * 
	 * @param ope	データ出力オペレーション
	 * @param upL	オペレーションの上り電文
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		ファイル出力用オペレーションクラス
	 */
	public static <L extends MCList<?>> IfPFUDL_SendRecvIf_Conv02 callWriteOperation(String ope, MCList<SdrvDtlR> upL, L upIfL) {
		return object(PFUCL_AppSys_CLAZZ)._callWriteOperation(ope, upL, upIfL);
	}

	/**
	 * データ出力オペレーションを呼び出します
	 * 
	 * @param ope	データ出力オペレーション
	 * @param upL	オペレーションの上り電文
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		ファイル出力用オペレーションクラス
	 */
	protected <L extends MCList<?>> IfPFUDL_SendRecvIf_Conv02 _callWriteOperation(String ope, MCList<SdrvDtlR> upL, L upIfL) {

		if (upL == null || upL.isEmpty()) {
			return null;
		}		

		IfPFUDL_SendRecvIf_Conv02 o = null;
		try {
			o = createOperation(ope, IfPFUDL_SendRecvIf_Conv02.class);
			o.up0().setAll(upL);
			execOperation(o, upIfL);
		}
		catch (Exception ex) {
			MCLog.write(ex);
			MCAppException e = new MCAppException(PFUCL0002, ope);
			e.addCauseMessage(new MCException(ex).getMCMessage());
			handleEx(e, upL);
		}
		finally {
			upL.setAll(o.down0());
			setMsgPoolCauseRows(upL);
		}

		return o;
	}

	/**
	 * データ入力オペレーションを呼び出します
	 * 
	 * @param ope	データ入力オペレーション
	 * @param upL	オペレーションの上り電文
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		オペレーションからの戻りのデータコンテナ（≠下り電文）
	 */
	public static <L extends MCList<?>> L callReadOperation(String ope, MCList<SdrvDtlR> upL, L upIfL) {
		return object(PFUCL_AppSys_CLAZZ)._callReadOperation(ope, upL, upIfL);
	}


	/**
	 * データ入力オペレーションを呼び出します
	 * 
	 * @param ope	データ入力オペレーション
	 * @param upL	オペレーションの上り電文
	 * @param upIfL	オペレーションに渡すデータコンテナ（≠上り電文）
	 * @return		オペレーションからの戻りのデータコンテナ（≠下り電文）
	 */
	protected <L extends MCList<?>> L _callReadOperation(String ope, MCList<SdrvDtlR> upL, L upIfL) {

		if (upL == null || upL.isEmpty()) {
			return null;
		}		

		IfPFUDL_SendRecvIf_Conv03 o = null;
		L retL = null;
		try {
			o = createOperation(ope, IfPFUDL_SendRecvIf_Conv03.class);
			o.up0().setAll(upL);
			retL = execOperation(o, upIfL);
			upL.setAll(o.down0());
		}
		catch (Exception ex) {
			MCLog.write(ex);
			upL.setString(SdrvDtlR.$sdrv_sts_typ, MAC_SDRV_STS_TYP.RECV_ERR.value());

			MCAppException e = new MCAppException(PFUCL0003, ope);
			e.addCauseMessage(new MCException(ex).getMCMessage());
			handleEx(e, upL);
		}
		finally {
			setMsgPoolCauseRows(upL);
		}

		return retL;
	}
	
	
	/**
	 * ESBアダプタによるESBデータ取り込み処理を実行します
	 * 
	 * @param ope	取り込みオペレーション
	 * @param upL	オペレーションの上り電文
	 */
	public static void callImpOperation(String ope, MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> upL) {
		object(PFUCL_AppSys_CLAZZ)._callImpOperation(ope, upL);
	}
	
	/**
	 * ESBアダプタによるESBデータ取り込み処理を実行します
	 * 
	 * @param ope	取り込みオペレーション
	 * @param upL	オペレーションの上り電文
	 */
	protected void _callImpOperation(String ope, MCList<mcframe.serverPFUD.PFUDL0040.Upd01_DtlR> upL) {
		IfPFUDL_ESBRecvIf_Upd01 o = PFUDL_ESBRecvIf.crtUpd01();
		o = createOperation(ope, IfPFUDL_ESBRecvIf_Upd01.class);
		o.up0().setAll(upL);
		o.exec();
	}

// ---- マスタ取得 -----

	/**
	 * データＮＯ
	 */
	public static final String _$data_no = "data_no";

	/**
	 * データ行ＮＯ
	 */
	public static final String _$data_lno = "data_lno";

	/**
	 * ＩＦ処理区分
	 */
	public static final String _$if_proc_typ = "if_proc_typ";
		
	/**
	 * 外部システムＣＤ
	 */
	public static final String _$ext_sys_cd = "ext_sys_cd";

	/**
	 * 制御トランとアダプタマスタを紐付けるキー
	 * 
	 */
	public static final String[] _$ifKey = {_$data_no};
	

	// ---- HTTPヘッダマスタ-----
	/**
	 * HTTPヘッダマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	HTTPヘッダマスタの管理クラス
	 */
	public static HttpHdrMgr<MCRow> crtHttpHdrMgr() {
		return object(PFUCL_AppSys_CLAZZ)._crtHttpHdrMgr();
	}
	/**
	 * ＩＦアダプタマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	ＩＦアダプタマスタの管理クラス
	 * 
	 */
	protected HttpHdrMgr<MCRow> _crtHttpHdrMgr() { 
		return new HttpHdrMgr<MCRow>();
	}
	/**
	 * HTTPヘッダを管理するクラス 
	 */
	public class HttpHdrMgr<T extends MCRow> {
		/**
		 *  HTTPヘッダマスタ
		 */
		protected MCList<MAM_HTTP_HEADER_R> _hdrL = null;
		
		/**
		 *  HTTPヘッダキー(外部システムＣＤ、ＩＦ処理区分)
		 */
		protected MAM_HTTP_HEADER_R _hdrKey = null;
		
		/**
		 * HTTPヘッダマスタを取得します
		 * 
		 */
		public <T extends MCRow>void set(T ifR) {
		
			if(isNull(ifR) || isSameKey(ifR, _hdrKey)) {
				return;
			}
			init(ifR);
		}
		/**
		 * HTTPヘッダ管理クラスを初期化します
		 * 
		 */
		public <T extends MCRow>void init(T ifR) {
			if(ifR == null
					|| isNull(ifR.getStringNE(MAM_HTTP_HEADER_R.$ext_sys_cd)) 
					|| isNull(ifR.getStringNE(MAM_HTTP_HEADER_R.$if_proc_typ))
					) {
				return;
			}
			_hdrKey = MAM_HTTP_HEADER_R.create();
			_hdrKey.if_proc_typ(ifR.getStringNE(MAM_HTTP_HEADER_R.$if_proc_typ));
			_hdrKey.ext_sys_cd(ifR.getStringNE(MAM_HTTP_HEADER_R.$ext_sys_cd));
			init(_hdrKey);
		}
		/**
		 * ＩＦアダプタ管理クラスを初期化します
		 * 
		 */
		public void init(MAM_HTTP_HEADER_R hdrKey) {
			if(isNull(hdrKey) || hdrKey.isEmpty()) {
				return;
			}
			_hdrKey = hdrKey;
			_hdrL = MCList.create(MAM_HTTP_HEADER_R.class);
			MAM_HTTP_HEADER_R t = MAM_HTTP_HEADER_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelectAll();
			builder.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), _hdrKey.ext_sys_cd());
			builder.addWhereWithAnd(t.if_proc_typ.eq(bind("1")).or(t.if_proc_typ.isNull()), _hdrKey.if_proc_typ());
			builder.setOrderByAsc(t.if_proc_typ);
			dbSelect(createSqlId(LOGIC_ID, t, "S02"), _hdrL, builder);
		}
		/**
		 * ＩＦ処理区分と外部システムＣＤをキーにHTTPヘッダマスタを返します
		 * （ＩＦ処理区分が一致するレコードとＩＦ処理区分がnullのレコードを返します）
		 * 
		 * @adptrR		ＩＦアダプタマスタレコード
		 * @return		ＩＦアダプタマスタのリスト
		 */
		public <T extends MCRow>MCList<MAM_HTTP_HEADER_R> getHttpHeaderL(T ifR) {
			
			if(isNull(_hdrL) || _hdrL.isEmpty()) {
				init(ifR);
			}
			else {
				set(ifR);
			}
			return _hdrL;
		}
		/**
		 * 送受信対象ＩＦデータの比較をします
		 * 
		 * @param ifR	送受信対象ＩＦデータ
		 * @param bkR	送受信対象ＩＦデータ
		 * @return		比較結果
		 */
		public <T extends MCRow>boolean isSameKey(T ifR, MAM_HTTP_HEADER_R bkR) {
			return
				isSame(ifR.getStringNE(MAM_HTTP_HEADER_R.$ext_sys_cd), bkR.ext_sys_cd())
				&& isSame(ifR.getStringNE(MAM_HTTP_HEADER_R.$if_proc_typ), bkR.if_proc_typ());
		}
	}
	
	// ---- ＩＦアダプタマスタ　（外部システムマスタを含む） -----


	/**
	 * ＩＦアダプタマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	ＩＦアダプタマスタの管理クラス
	 */
	public static IfAdptrMgr<MCRow> crtIfAdptrlMgr() {
		PFUCL_AppSys clazz = object(PFUCL_AppSys_CLAZZ);
		if (clazz == null) {
			return null;
		}
		return object(PFUCL_AppSys_CLAZZ)._crtIfAdptrlMgr();
	}

	/**
	 * ＩＦアダプタマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	ＩＦアダプタマスタの管理クラス
	 * 
	 */
	protected IfAdptrMgr<MCRow> _crtIfAdptrlMgr() { 
		return new IfAdptrMgr<MCRow>();
	}

	/**
	 * アダプタを管理するクラス 
	 *
	 */
	public class IfAdptrMgr<T extends MCRow> {


		/**
		 *  アダプタマスタ
		 */
		protected  MCList<MAM_IF_ADAPTER_R> _adptrL = null;

		/**
		 *  アダプタキー(外部システムＣＤ、ＩＦ処理区分)
		 */
		protected  MAM_IF_ADAPTER_R _adptrKey = null;

		/**
		 * ＩＦアダプタマスタを取得します
		 * 
		 */
		public <T extends MCRow>void set(T ifR) {
		
			if(isNull(ifR) || isSameKey(ifR,_adptrKey)) {
				return;
			}
			init(ifR);
		}
			
		/**
		 * ＩＦアダプタ管理クラスを初期化します
		 * 
		 */
		public <T extends MCRow>void init(T ifR) {
			if(ifR == null
					|| isNull(ifR.getStringNE(MAM_IF_ADAPTER_R.$ext_sys_cd)) 
					|| isNull(ifR.getStringNE(MAM_IF_ADAPTER_R.$if_proc_typ))
					) {
				return;
			}
			_adptrKey = MAM_IF_ADAPTER_R.create();
			_adptrKey.if_proc_typ(ifR.getStringNE(MAM_IF_ADAPTER_R.$if_proc_typ));
			_adptrKey.ext_sys_cd(ifR.getStringNE(MAM_IF_ADAPTER_R.$ext_sys_cd));
			init(_adptrKey);
		}

		/**
		 * ＩＦアダプタ管理クラスを初期化します
		 * 
		 */
		public void init(MAM_IF_ADAPTER_R adptrKey) {
			if(isNull(adptrKey) || adptrKey.isEmpty()) {
				return;
			}
			_adptrKey = adptrKey;
			_adptrL = MCList.create(MAM_IF_ADAPTER_R.class);

			MAM_IF_ADAPTER_R t = MAM_IF_ADAPTER_R.create("T");
			MAM_EXT_SYS_R t2 = MAM_EXT_SYS_R.create("T2");

			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelectAll();
			builder.addSelect(t2.ext_sys_nm);
			builder.addSelect(t2.ext_sys_typ);
			builder.addSelect(t2.real_imp_flg);
			builder.addSelect(t2.web_api_flg);
			builder.addSelect(t2.cmd_exec_flg);
			builder.addLeftOuterJoin(t2, t.ext_sys_cd.eq(t2.ext_sys_cd));
			builder.addWhereWithAnd(t.st_dt.lte(bind("1")), getToday());
			builder.addWhereWithAnd(t.end_dt.gte(bind("1")), getToday());
			builder.addWhereWithAnd(t.if_proc_typ.eq(bind("1")), _adptrKey.if_proc_typ());
			builder.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), _adptrKey.ext_sys_cd());
			builder.setOrderByAsc(t.ext_sys_cd);
			dbSelect(createSqlId(LOGIC_ID, t, "S03"), _adptrL, builder);
			_adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);

			//標準アダプタをセットする
			if(_adptrL.isEmpty()) {
				MAM_EXT_SYS_R t_ = MAM_EXT_SYS_R.create("T");
				MCQueryApiBuilder builder_ = MCQueryApiBuilder.create(t_);
				builder_.addWhereWithAnd(t_.ext_sys_cd.eq(bind("1")), _adptrKey.ext_sys_cd());
				dbSelect(createSqlId(LOGIC_ID, t_, "S04"), t_, builder_);

				MAM_IF_ADAPTER_R r = MAM_IF_ADAPTER_R.create();
				r.if_proc_typ(_adptrKey.if_proc_typ());
				r.ext_sys_cd(_adptrKey.ext_sys_cd());
				r.ext_sys_nm(t_.ext_sys_nm());
				r.addStringColumn("EXT_SYS_TYP", t_.ext_sys_typ());
				r.addStringColumn("real_imp_flg", MCBooleanUtil.booleanToDBString(t_.real_imp_flg()));
				r.addStringColumn("web_api_flg", MCBooleanUtil.booleanToDBString(t_.web_api_flg()));
				r.addStringColumn("cmd_exec_flg", MCBooleanUtil.booleanToDBString(t_.cmd_exec_flg()));
				_adptrL.add(r);
			}
			setStdAdapter(_adptrL);
		}

		/**
		 * ＩＦ処理区分と外部システムＣＤをキーにＩＦアダプタマスタを返します
		 * （運用日付において有効なレコードをすべて返します）
		 * 
		 * @adptrR		IFアダプタマスタレコード
		 * @return		ＩＦアダプタマスタのリスト
		 */
		public <T extends MCRow>MCList<MAM_IF_ADAPTER_R> getIfAdapterL(T ifR) {
			
			if(isNull(_adptrL) || _adptrL.isEmpty()) {
				init(ifR);
			}
			else {
				set(ifR);
			}
			return _adptrL;
		}

	
		/**
		 * 送受信対象ＩＦデータの比較をします
		 * 
		 * @param ifR	送受信対象ＩＦデータ
		 * @param bkR	送受信対象ＩＦデータ
		 * @return		比較結果
		 */
		public <T extends MCRow>boolean isSameKey(T ifR, MAM_IF_ADAPTER_R bkR) {
			return
				isSame(ifR.getStringNE(MAM_IF_ADAPTER_R.$ext_sys_cd), bkR.ext_sys_cd())
				&& isSame(ifR.getStringNE(MAM_IF_ADAPTER_R.$if_proc_typ), bkR.if_proc_typ());
		}
		
		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーに外部システム区分を返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			外部システム区分
		 */
		public String getExtSysTyp(PFT_SDRV_IF_R ifR) {
			
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(adptrL == null || adptrL.isEmpty()) {
				return null;
			}
			adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
			return adptrL.getStringNE(0, MAM_EXT_SYS_R.$ext_sys_typ);
		}

		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにリアルタイム取込ＦＬＧを返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			リアルタイム取込ＦＬＧ
		 */
		public boolean getRealImpFlg(PFT_SDRV_IF_R ifR) {
			
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(adptrL == null || adptrL.isEmpty()) {
				return false;
			}
			adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
			return MCBooleanUtil.dbStringToBoolean(adptrL.getStringNE(0, MAM_EXT_SYS_R.$real_imp_flg));
		}
		
		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにWebAPIＦＬＧを返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			WebAPIＦＬＧ
		 */
		public boolean getWebApiFlg(PFT_SDRV_IF_R ifR) {
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(adptrL == null || adptrL.isEmpty()) {
				return false;
			}
			adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
			return MCBooleanUtil.dbStringToBoolean(adptrL.getStringNE(0, MAM_EXT_SYS_R.$web_api_flg));
		}
		
		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにコマンド実行ＦＬＧを返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			コマンド実行ＦＬＧ
		 */
		public boolean getCmdExecFlg(PFT_SDRV_IF_R ifR) {
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(adptrL == null || adptrL.isEmpty()) {
				return false;
			}
			adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
			return MCBooleanUtil.dbStringToBoolean(adptrL.getStringNE(0, MAM_EXT_SYS_R.$cmd_exec_flg));
		}
		
		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにコード変換処理を返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			コード変換処理
		 */
		public String getConvOpe(PFT_SDRV_IF_R ifR) {
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(!isNull(adptrL) && !adptrL.isEmpty()) {
				adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
				return adptrL.getStringNE(0, MAM_IF_ADAPTER_R.$conv_ope);
			}
			return null;
		}

		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにファイル変換処理を返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			ファイル入出力処理
		 */
		public String getFileIoOpe(PFT_SDRV_IF_R ifR) {
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(!isNull(adptrL) && !adptrL.isEmpty()) {
				adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
				return adptrL.getStringNE(0, MAM_IF_ADAPTER_R.$file_io_ope);
			}
			return null;
		}

		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにWebAPIオペレーションを返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			WebAPI処理
		 */
		public String getWebApiOpe(PFT_SDRV_IF_R ifR) {
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(!isNull(adptrL) && !adptrL.isEmpty()) {
				adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
				return adptrL.getStringNE(0, MAM_IF_ADAPTER_R.$web_api_ope);
			}
			return null;
		}
		
		/**
		 * 外部システムＣＤ、ＩＦ処理区分をキーにコマンド実行オペレーションを返す
		 *  
		 * @param ifR		送受信対象ＩＦデータ
		 * @return			コマンド実行処理
		 */
		public String getCmdExecOpe(PFT_SDRV_IF_R ifR) {
			MCList<MAM_IF_ADAPTER_R> adptrL = getIfAdapterL(ifR);
			if(!isNull(adptrL) && !adptrL.isEmpty()) {
				adptrL.sort(SortType.DESC, MAM_IF_ADAPTER_R.$st_dt);
				return adptrL.getStringNE(0, MAM_IF_ADAPTER_R.$cmd_exec_ope);
			}
			return null;
		}
		
		/**
		 * 送受信対象ＩＦに対応する送受信制御マスタを取得します<br>
	 	 * 取得した結果は戻り値のMCJoinKeyで取得できます
	 	 *  
		 * @param ifL		送受信対象ＩＦデータ
		 * @param adptrL	IFアダプタマスタ
		 * @return			ＩＦデータとアダプタマスタを紐付けたキー
		 */
		public MCJoinKey<MCList<MAM_IF_ADAPTER_R>> mrgIfAdptr(MCList<PFT_SDRV_IF_R> ifL, MCList<MAM_IF_ADAPTER_R> adptrL) {
		
			ifL.sort(
				_$if_proc_typ,
				_$ext_sys_cd
			);

			MCList<MAM_IF_ADAPTER_R> workL = null;
			for (PFT_SDRV_IF_R ifR : ifL) {
				workL = getIfAdapterL(ifR);
				if(!workL.isEmpty() && !isNull(workL.get(0))) {
					workL.get(0).setNumberNE(_$data_no, ifR.getNumberNE(_$data_no));	// 紐付けるキーで使用
					
					adptrL.add(workL.get(0).clone());
				}
			}

			return ifL.join(_$ifKey, adptrL, _$ifKey);
		}		
	}
	

// ---- ＩＦ通信ルールマスタ -----

	/**
	 * 送信用のＩＦ通信ルールマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	ＩＦ通信ルールマスタの管理クラス
	 */
	public static <S extends MCRow> IfPrtclMgr<S> crtSendIfProtocolMgr() { 
		PFUCL_AppSys clazz = object(PFUCL_AppSys_CLAZZ);
		if (clazz == null) {
			return null;
		}
		return object(PFUCL_AppSys_CLAZZ)._crtIfProtocolMgr(true);
	}

	/**
	 * 受信用のＩＦ通信ルールマスタを管理するクラスのインスタンスを取得します
	 * @return	ＩＦ通信ルールマスタの管理クラス
	 */
	public static <T extends MCRow> IfPrtclMgr<T> crtRecvIfProtocolMgr() { 
		PFUCL_AppSys clazz = object(PFUCL_AppSys_CLAZZ);
		if (clazz == null) {
			return null;
		}
		return object(PFUCL_AppSys_CLAZZ)._crtIfProtocolMgr(false);
	}

	/**
	 * ＩＦ通信ルールマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @param ifR	参照する通信ルールの対象
	 * @param isSend	送受信選択
	 * @return	ＩＦ通信ルールマスタの管理クラス
	 */
	protected <T extends MCRow> IfPrtclMgr<T> _crtIfProtocolMgr(boolean isSend) {
		return new IfPrtclMgr<T>(isSend);
	}

	/**
	 * ＩＦ通信ルールマスタを管理するクラス 
	 *
	 */
	public class IfPrtclMgr<T extends MCRow> {


		/**
		 * ＩＦ通信ルールマスタで扱うプレースホルダを定義するクラス 
		 *
		 */
		public class PlaceHolder {
			/**
			 * MCF_HOME
			 */
			public static final String MCF_HOME = "{MCF_HOME}";

			/**
			 * 会社CD
			 */
			public static final String CO_CD = "{CO_CD}";

			/**
			 * ＩＦ処理区分
			 */
			public static final String IF_PROC_TYP = "{IF_PROC_TYP}";

			/**
			 * 外部システムＣＤ
			 */
			public static final String EXT_SYS_CD = "{EXT_SYS_CD}";

			/**
			 * ユーザID
			 */
			public static final String USER = "{USER}";

			/**
			 * データNO
			 */
			public static final String DATA_NO = "{DATA_NO}";
		}

		/**
		 * 送受信ＩＦ
		 * 
		 * キーとして必須の値は外部システムＣＤのみ
		 */
		protected PFT_SDRV_IF_R _ifR = null;

		/**
		 * 送信用 or 受信用
		 * 
		 */
		protected boolean _isSend = false;

		/**
		 * コンストラクタ
		 * 
		 * @param isSend
		 */
		IfPrtclMgr(boolean isSend) {
			_isSend = isSend;
		}

		/**
		 * 通信ルールマスタ取得のキーが変更されている場合に初期化します
		 * 
		 * @param <S>
		 */
		public <S extends MCRow> void set(S s) {
			// 外部システムＣＤが不一致の場合、もしくは未指定の場合、再読み込みを指示
			boolean isRead = _ifR == null
					 || !isSame(_ifR.ext_sys_cd(), s.getStringNE(_$ext_sys_cd));

			if (isRead) {
				if(_ifR == null) {
					_ifR = PFT_SDRV_IF_R.create();
				}
				_ifR.ext_sys_cd(s.getStringNE(_$ext_sys_cd));
				_ifR.if_proc_typ(s.getStringNE(_$if_proc_typ));
				readIfPrtclL();
			}
			// ＩＦ処理区分が不一致の場合は、再読み込みはせず、ＩＦ処理区分のみ差し替える
			else if(!isSame(_ifR.if_proc_typ(), s.getStringNE(_$if_proc_typ))) {
				_ifR.if_proc_typ(s.getStringNE(_$if_proc_typ));
			}
			_ifR.data_no(s.getNumberNE(_$data_no));
		}
		
		/**
		 * 通信ルールマスタ取得のキーが変更されている場合に初期化します
		 * 
		 * @param extSysCd 外部システムコード
		 * @param ifProcTypStr ＩＦ処理区分
		 */
		public <S extends MCRow> void set(String extSysCd, String ifProcTypStr) {
			
			// 外部システムＣＤが不一致の場合、もしくは未指定の場合、再読み込みを指示
			boolean isRead = false;
			
			if(_ifR == null) {
				isRead = true;
				_ifR = PFT_SDRV_IF_R.create();
			}
			if(!isSame(_ifR.ext_sys_cd(), extSysCd)) {
				isRead = true;
				_ifR.ext_sys_cd(extSysCd);

			}
			// ＩＦ処理区分が指定されている場合はその値で上書きする
			if(!isNull(ifProcTypStr)) {
				_ifR.if_proc_typ(ifProcTypStr);
			}

			if (isRead) {
				readIfPrtclL();
			}
		}

		/**
		 * 通信ルールマスタの管理クラスを初期化します
		 * 
		 * 通信対象の外部システム単位にキャッシュします
		 * @param String 外部システムＣＤ
		 */
		public <S extends MCRow> void init(String extSysCd) {

			if(isNull(extSysCd)) {
				return;
			}
			if(_ifR == null) {
				_ifR = PFT_SDRV_IF_R.create();
			}
			
			_ifR.ext_sys_cd(extSysCd);
			init(_ifR);
		}


		/**
		 * 通信ルールマスタの管理クラスを初期化します
		 * 
		 * 通信対象の外部システム単位にキャッシュします
		 * @param <S>
		 */
		public <S extends MCRow> void init(S s) {
						
			if(_ifR == null) {
				_ifR = PFT_SDRV_IF_R.create();
			}
			_ifR.ext_sys_cd(s.getStringNE(PFT_SDRV_IF_R.$ext_sys_cd));
			// if_proc_typは参考情報（ロジックには使用しない）
			_ifR.if_proc_typ(s.getStringNE(PFT_SDRV_IF_R.$if_proc_typ));
			_ifR.data_no(s.getNumberNE(PFT_SDRV_IF_R.$data_no));
			
			init(_ifR);
		}

		/**
		 * 通信ルールマスタの管理クラスを初期化します
		 * 
		 * 通信対象の外部システム単位にキャッシュします
		 * 
		 * @param ifR
		 */
		public void init(PFT_SDRV_IF_R ifR) {
			_ifR = ifR;
			readIfPrtclL();
		}

		/**
		 * ＩＦ通信ルールマスタを管理するマップ
		 */
		protected Map<String, MAM_IF_PROTOCOL_R> _prtcMap = new HashMap<String, MAM_IF_PROTOCOL_R>();

		/**
		 * ＩＦ通信ルールのマップを反します<br>
		 * @return _prtcMap
		 */
		public Map<String, MAM_IF_PROTOCOL_R> getIfPrtclMap() {
			if(_prtcMap.isEmpty()) {
				readIfPrtclL();
			}
			return _prtcMap;
		}

		/**
		 * マップのキー
		 * @param prtclR ＩＦ通信ルールマスタコンテナ
		 * @return
		 */
		protected String getIfPrtclMapKey(MAM_IF_PROTOCOL_R prtclR) {
			StringBuilder sb = new StringBuilder();
			sb.append(prtclR.if_ctl_typ());
			if(!isNull(prtclR.if_proc_typ())) {
				sb.append(_map_key_connector);
				sb.append(prtclR.if_proc_typ());
			}
			return sb.toString();
		}

		/**
		 * マップのキー
		 * @param ifCtlTyp ＩＦ制御区分
		 * @param ifProcTypStr ＩＦ処理区分
		 * @return
		 */
		protected String getIfPrtclMapKey(MAC_IF_CTL_TYP ifCtlTyp, String ifProcTypStr) {
			if(ifProcTypStr == null) {
				return ifCtlTyp.value();
			}
			StringBuilder sb = new StringBuilder();
			sb.append(ifCtlTyp.value());
			sb.append(_map_key_connector);
			sb.append(ifProcTypStr);
			return sb.toString();
		}
		
		
		/**
		 * 外部システムCDをキーにＩＦ通信ルールマスタを取得します<br>
		 * 取得したマスタはマップにキャッシュします。ＩＦ処理区分違いのマスタ値は同時にキャッシュします。
		 * 
		 */
		protected void readIfPrtclL() {
			_prtcMap.clear();
			if(_ifR == null || isNull(_ifR.ext_sys_cd())) {
				return;
			}
			MCList<MAM_IF_PROTOCOL_R> prtclL = MCList.create(MAM_IF_PROTOCOL_R.class);
			MAM_IF_PROTOCOL_R t = MAM_IF_PROTOCOL_R.create("T1");
			MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
			builder.setSelectAll();
			builder.addWhereWithAnd(t.ext_sys_cd.eq(bind("1")), _ifR.getStringNE(_$ext_sys_cd));
			builder.setOrderByAsc(t.if_ctl_typ);
			dbSelect(createSqlId(LOGIC_ID, t, "S01"), prtclL, builder);
			
			if(!prtclL.isEmpty()) {
				for (MAM_IF_PROTOCOL_R r : prtclL) {
					String prtclMapKey = getIfPrtclMapKey(r);
					if (!_prtcMap.containsKey(prtclMapKey)) {
						if (!isNull(r.var_str())) {
							r.var_str(r.var_str());
						}
						_prtcMap.put(prtclMapKey, r);
					}
				}
			}
			for (String[] typ : getDefIfCtlTyp()) {
				if (!_prtcMap.containsKey(typ[0])) {
					MAM_IF_PROTOCOL_R r = MAM_IF_PROTOCOL_R.create();
					r.ext_sys_cd(_ifR.getStringNE(_$ext_sys_cd));

					// 内容（文字列）に設定
					if (isSame(_set_var_str, typ[1])) {
						if (!isNull(typ[2])) {
							r.var_str(typ[2]);
						}
						// FILE_NMのデフォルト値を設定
						else {
							r.var_str(_def_file_nm);
						}
					}
					// 内容（数値）に設定
					else {
						r.var_num(Integer.valueOf(typ[2]));
					}
					_prtcMap.put(typ[0], r);
				}
			}
		}

		/**
		 * ＩＦ通信ルールマスタの設定省略時に設定対象になっている<br>
		 * ＩＦ制御区分とデフォルト値を取得
		 * 
		 */
		protected String[][] getDefIfCtlTyp() {
			return  new String[][]{
					{MAC_IF_CTL_TYP.FILE_BOM.value(),           _set_var_str, _file_bom_f},
					{MAC_IF_CTL_TYP.FILE_CHARSET.value(),       _set_var_str, _def_file_charset},
					{MAC_IF_CTL_TYP.FILE_DBL_QUART.value(),     _set_var_str, _file_dbl_quart_t},
					{MAC_IF_CTL_TYP.FILE_NM.value(),            _set_var_str, ""},
					{MAC_IF_CTL_TYP.FILE_TYPE.value(),          _set_var_str, _file_type_csv},
					{MAC_IF_CTL_TYP.FILE_USE_HEADING.value(),   _set_var_str, _file_use_heading_f},
					{MAC_IF_CTL_TYP.FTP_MODE.value(),           _set_var_str, _ftp_mode_passive},
					{MAC_IF_CTL_TYP.FTP_PORT.value(),           _set_var_num, _def_ftp_port},
					{MAC_IF_CTL_TYP.FTP_RTRY_CNT.value(),       _set_var_num, _def_rtry_cnt},
					{MAC_IF_CTL_TYP.FTP_WAIT_SEC.value(),       _set_var_num, _def_wait_sec},
					{MAC_IF_CTL_TYP.RECV_TYP.value(),           _set_var_str, _recv_typ_ftp},
					{MAC_IF_CTL_TYP.SFTP_PORT.value(),          _set_var_num, _def_sftp_port},
					{MAC_IF_CTL_TYP.SFTP_RTRY_CNT.value(),      _set_var_num, _def_rtry_cnt},
					{MAC_IF_CTL_TYP.SFTP_WAIT_SEC.value(),      _set_var_num, _def_wait_sec},
					{MAC_IF_CTL_TYP.FILE_FIX_FMT_PATH.value(),  _set_var_str, _def_file_fix_fmt_path},
					{MAC_IF_CTL_TYP.LOCAL_DIR.value(),          _set_var_str, _def_local_dir},
					{MAC_IF_CTL_TYP.SEND_FILE_GRP.value(),      _set_var_str, _send_file_grp_1},
					{MAC_IF_CTL_TYP.STS_FILE_SUFFIX.value(),    _set_var_str, _def_sts_file_suffix},
					{MAC_IF_CTL_TYP.TRANSFER_LOCK_TYP.value(),  _set_var_str, _transfer_lock_typ_rename}
			};
		}

		/**
		 * ＩＦ処理区分がブランクで、ＩＦ制御区分が一致する内容（文字列）を取得します<br>
		 * 
		 * 事前に外部システムＣＤをキーにＩＦ通信ルールマスタを読み出しておく必要があります。
		 * 
		 * @param ifCtlTyp	ＩＦ制御区分
		 * @return	内容（文字列）
		 * 
		 */
		public String getIfCtlString(MAC_IF_CTL_TYP ifCtlTyp) {
			if(ifCtlTyp == null) {
				return null;
			}
			if (_prtcMap.containsKey(ifCtlTyp.value())) {
				return _prtcMap.get(ifCtlTyp.value()).var_str();
			}
			return null;
		}
		
		/**
		 * ＩＦ制御区分・ＩＦ処理区分に一致する内容（文字列）を取得します<br>
		 * 
		 * ＩＦ処理区分ごとのマスタ設定が存在しない場合は、ＩＦ処理区分を指定しないマスタの値を返します。
		 * 事前に外部システムＣＤをキーにＩＦ通信ルールマスタを読み出しておく必要があります。
		 * 
		 * @param ifCtlTyp	ＩＦ制御区分
		 * @param ifProctypStr ＩＦ処理区分
		 * @return	内容（文字列）
		 * 
		 */
		public String getIfCtlString(MAC_IF_CTL_TYP ifCtlTyp, String ifProcTypStr) {
			
			// ＩＦ処理区分の差し替えを実行（プレースフォルダ指定用に随時差し替える）
			String ifCtlStr = null;
			
			if(!isNull(ifProcTypStr) && _ifR != null) {
				_ifR.if_proc_typ(ifProcTypStr);
			}
			
			// マップからＩＦ処理区分指定、ＩＦ処理区分指定なしの二段階で設定値を取得
			String keyStr = getIfPrtclMapKey(ifCtlTyp, ifProcTypStr);
			if (_prtcMap.containsKey(keyStr)) {
				ifCtlStr = _prtcMap.get(keyStr).var_str();
			}
			else if (_prtcMap.containsKey(ifCtlTyp.value())) {
				ifCtlStr =  _prtcMap.get(ifCtlTyp.value()).var_str();
			}

			// ディレクトリ、ファイル名の場合はプレースホルダーの変換をしてから返す
			if(	MAC_IF_CTL_TYP.isLOCAL_DIR(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isSEND_RMT_DIR(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isRECV_RMT_DIR(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isFILE_NM(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isFILE_CSV_FMT_PATH(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isFILE_FIX_FMT_PATH(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isFILE_FIX_SETTING_PATH(ifCtlTyp)
				|| MAC_IF_CTL_TYP.isSFTP_KEY_FILE_PATH(ifCtlTyp)
					){
					return convPlaceHolder(ifCtlStr);
			}
			return ifCtlStr;
			
		}


		/**
		 * ＩＦ制御区分に一致する内容（数値）を取得します<br>
		 * 
		 * 事前に外部システムＣＤをキーにＩＦ通信ルールマスタを読み出しておく必要があります。
		 * 
		 * @param ifCtlTyp	ＩＦ制御区分
		 * @return	内容（数値）
		 */
		public MCNumber getIfCtlNumber(MAC_IF_CTL_TYP ifCtlTyp) {
			if (_prtcMap.containsKey(ifCtlTyp.value())) {
				return _prtcMap.get(ifCtlTyp.value()).var_num();
			}
			return null;
		}

		/**
		 * ＩＦ制御区分に一致する内容（数値）を取得します<br>
		 * 
		 * ＩＦ処理区分ごとのマスタ設定が存在しない場合は、ＩＦ処理区分を指定しないマスタの値を返します。
		 * 事前に外部システムＣＤをキーにＩＦ通信ルールマスタを読み出しておく必要があります。
		 * 
		 * @param ifCtlTyp	ＩＦ制御区分
		 * @param ifProcTypStr	ＩＦ処理区分
		 * @return	内容（数値）
		 */
		public MCNumber getIfCtlNumber(MAC_IF_CTL_TYP ifCtlTyp, String ifProcTypStr) {

			// ＩＦ処理区分の差し替えを実行（プレースフォルダ指定用に随時差し替える）
			if(!isNull(ifProcTypStr)) {
				_ifR.if_proc_typ(ifProcTypStr);
			}
			
			// マップからＩＦ処理区分指定、ＩＦ処理区分指定なしの二段階で設定値を取得
			String keyStr = getIfPrtclMapKey(ifCtlTyp, ifProcTypStr);
			if (_prtcMap.containsKey(keyStr)) {
				return _prtcMap.get(keyStr).var_num();
			}
			else if (_prtcMap.containsKey(ifCtlTyp.value())) {
				return _prtcMap.get(ifCtlTyp.value()).var_num();
			}
			return null;
		}

		/**
		 * ＩＦ通信ルールマスタからディレクトリ情報を取得します<br>
		 * 未設定の場合MCAppExceptionが発生します
		 * 
		 * @param ifCtlTyp	ＩＦ制御区分
		 * @return	ディレクトリ
		 */
		protected String getSdrvDir(MAC_IF_CTL_TYP ifCtlTyp) {
			return getSdrvDir(ifCtlTyp, null, true);
		}

		/**
		 * ＩＦ通信ルールマスタからディレクトリ情報を取得します<br>
		 * 未設定の場合MCAppExceptionが発生します
		 * 
		 * @param ifCtlTyp		ＩＦ制御区分
		 * @param ifProcTypStr	ＩＦ処理区分
		 * @return	ディレクトリ
		 */
		protected String getSdrvDir(MAC_IF_CTL_TYP ifCtlTyp, String ifProcTypStr) {
			
			return getSdrvDir(ifCtlTyp, ifProcTypStr, true);
		}

		/**
		 * ＩＦ通信ルールマスタからディレクトリ情報を取得します
		 * 
		 * @param ifCtlTyp	ＩＦ制御区分
		 * @param existChk	存在チェックをするか
		 * @return	ディレクトリ
		 */
		protected String getSdrvDir(MAC_IF_CTL_TYP ifCtlTyp, boolean existChk) {
			return getSdrvDir(ifCtlTyp, null, existChk);
		}


		/**
		 * ＩＦ通信ルールマスタからディレクトリ情報を取得します
		 * （フォルダ作成をしない場合、NULLが戻ることに注意）
		 * 
		 * @param ifCtlTyp		ＩＦ制御区分
		 * @param ifProcTypStr	ＩＦ処理区分
		 * @param existChk		存在チェックをするか
		 * @return	ディレクトリ
		 */
		protected String getSdrvDir(MAC_IF_CTL_TYP ifCtlTyp, String ifProcTypStr, boolean existChk) {

			// ディレクトリを取得し、プレースホルダの置き換えを実行
			String dir = convPlaceHolder(getIfCtlString(ifCtlTyp, ifProcTypStr));
			if (existChk && isNull(dir)) {
				throw new MCAppException(
					PFUCL0005,
					_ifR.ext_sys_cd(),
					ifCtlTyp.value());
			}
			// ディレクトリ作成の指定がある場合

			//「(1)ローカル」が存在しない場合に作成する。
			if	(MAC_IF_CTL_TYP.isLOCAL_DIR(ifCtlTyp)) {
				makeDir(dir,true);
			}
			//「(2)ファイル送信区分がコピーの場合の送信先」が存在しない場合に作成する。
			else if	(_isSend &&
				MAC_IF_CTL_TYP.isSEND_RMT_DIR(ifCtlTyp) &&
				isSame(getIfCtlString(MAC_IF_CTL_TYP.SEND_TYP), _send_typ_copy)) {
				makeDir(dir,false);
			}
			
			// ローカルディレクトリには ready を付与する
			if (MAC_IF_CTL_TYP.isLOCAL_DIR(ifCtlTyp)) {
				File f = new File(dir, _IF_FLDR_READY);
				dir = f.getAbsolutePath();
			}
			return dir;
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容からローカルディレクトリ（LOCAL_DIR）を取得します
		 * 
		 * ＩＦ制御区分ごとに指定された形式に従いディレクトリ文字列を返します。
		 * マスタ指定が無い場合は、標準のディレクトリ文字列を返します。
		 * 
		 * @return String ローカルのルートディレクトリ
		 */
		public String getLocalDir() {
			return getSdrvDir(MAC_IF_CTL_TYP.LOCAL_DIR);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容からローカルディレクトリ（LOCAL_DIR）を取得します
		 * 
		 * ＩＦ処理区分ごとの指定がある場合は、ＩＦ処理区分ごとに、ＩＦ制御区分ごとに指定された形式に従いディレクトリ文字列を返します。
		 * ＩＦ処理区分ごとの指定が無い場合は、ＩＦ制御区分ごとに指定された形式に従いディレクトリ文字列を返します。
		 * マスタ指定が無い場合は、標準のディレクトリ文字列を返します。
		 * 
		 * @return String ローカルのルートディレクトリ
		 */
		public String getLocalDir(String ifProcTypStr) {
			return getSdrvDir(MAC_IF_CTL_TYP.LOCAL_DIR, ifProcTypStr);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容からファイル名（FILE_NM）を取得します
		 * 
		 * ＩＦ制御区分ごとに指定された形式に従いファイル名を返します。
		 * マスタ指定が無い場合、または「ファイル名の指定」と「ファイル作成単位の指定」が矛盾する場合は、標準のファイル名を返します。
		 * @return
		 */
		public String getFileName() {
			return getFileName((String)null);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容からファイル名（FILE_NM）を取得します
		 * 
		 * ＩＦ処理区分ごとの指定がある場合は、ＩＦ処理区分ごとに、ＩＦ制御区分ごとに指定された形式に従いファイル名を返します。
		 * ＩＦ処理区分ごとの指定が無い場合は、ＩＦ制御区分ごとに指定された形式に従いファイル名を返します。
		 * マスタ指定が無い場合、または「ファイル名の指定」と「ファイル作成単位の指定」が矛盾する場合は、標準のファイル名を返します。
		 * 
		 * @param ifProcTypStr ＩＦ処理区分
		 * @return String ＩＦ通信ルールの定義で整形されたファイル名
		 */
		public String getFileName(String ifProcTypStr) {

			String name = getIfCtlString(MAC_IF_CTL_TYP.FILE_NM, ifProcTypStr);
			// ファイル名の指定が無い場合、
			//および、「ファイル名の指定」と「ファイル作成単位の指定」が矛盾する場合は、標準のファイル名とする。
			if (isNull(name)
				 || (_isSend
					 && !isSame(getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, ifProcTypStr),  _send_file_grp_2)
					 && name.indexOf(PlaceHolder.DATA_NO) >= 0)) {
				name = getMCTimestamp().toString() + ".dat";
			}

			return convPlaceHolder(name);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容からファイル（ローカルディレクトリ、名前）を取得します
		 * 
		 * 原則、ＩＦ処理区分に依存しないフォルダが戻ります。
		 * プレースフォルダに{IF_PROC_TYP}がある場合は、
		 * そのまま{IF_PROC_TYP}が返ります。
		 * 
		 * @return ファイル
		 */
		public File getLocalFile() {
			return new File(getLocalDir(), getFileName());
		}

		
		/**
		 * ＩＦ通信ルールマスタの設定内容からファイル（ローカルディレクトリ、名前）を取得します
		 * （ＩＦ処理区分ごとのマスタ設定の有無を確認）
		 * 
		 * @param ifProcTyp
		 * @return ファイル
		 */
		public File getLocalFile(MAC_IF_PROC_TYP ifProcTyp) {
			if(ifProcTyp == null){
				return new File(getLocalDir(), getFileName());
			}
			return new File(getLocalDir(ifProcTyp.value()), getFileName(ifProcTyp.value()));
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容からファイル（ローカルディレクトリ、名前）を取得します
		 * （ＩＦ処理区分ごとのマスタ設定の有無を確認）
		 * 
		 * @param ifProcTypStr
		 * @return ファイル
		 */
		public File getLocalFile(String ifProcTypStr) {
			return new File(getLocalDir(ifProcTypStr), getFileName(ifProcTypStr));
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容から送信先のリモートディレクトリ（SEND_RMT_DIR）を取得します
		 * 
		 * @return 送信先リモートディレクトリ文字列
		 */
		public String getSendRemoteDir() {
			return getSdrvDir(MAC_IF_CTL_TYP.SEND_RMT_DIR);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容から送信先のリモートディレクトリ（SEND_RMT_DIR）を取得します
		 * @param  ifProcTypStr ＩＦ処理区分
		 * @return 送信先リモートディレクトリ文字列
		 */
		public String getSendRemoteDir(String ifProcTypStr) {
			return getSdrvDir(MAC_IF_CTL_TYP.SEND_RMT_DIR, ifProcTypStr);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容から受信元のリモートディレクトリ（RECV_RMT_DIR）を取得します
		 * 
		 * @param existChk 存在チェック 
		 * @return 受信元リモートディレクトリ文字列
		 */
		public String getRecvRemoteDir(boolean existChk) {
			return getSdrvDir(MAC_IF_CTL_TYP.RECV_RMT_DIR, existChk);
		}

		/**
		 * ＩＦ通信ルールマスタの設定内容から受信元のリモートディレクトリ（RECV_RMT_DIR）を取得します
		 * （ＩＦ処理区分ごとのマスタ設定の有無を確認）
		 * 
		 * @param ifProcTypStr ＩＦ処理区分
		 * @return 受信元リモートディレクトリ文字列
		 */
		public String getRecvRemoteDir(String ifProcTypStr, boolean existChk) {
			return getSdrvDir(MAC_IF_CTL_TYP.RECV_RMT_DIR, ifProcTypStr, existChk);
		}

		/**
		 * 文字列中のプレースホルダを展開します
		 * 		
		 * @param str
		 * @param target
		 * @param replacement
		 * @return
		 */
		protected String convPlaceHolder(String str, String target, MCNumber replacement) {
			if (!isNull(replacement)) {
				str = convPlaceHolder(str, target, replacement.toString());
			}
			return str;
		}

		protected String convPlaceHolder(String str, String target, String replacement) {
			if (!isNull(replacement)) {
				str = str.replace(target, replacement);
			}
			return str;
		}

		/**
		 * 文字列中のプレースホルダを展開します
		 * 
		 * @param str　変換対象の文字列
		 * @return
		 */
		protected String convPlaceHolder(String str) {
			return convPlaceHolder(str, _ifR);
		}
		/**
		 * 文字列中のプレースホルダを展開します
		 * 
		 * @param str　変換対象の文字列
		 * @param ifR プレースフォルダを指定する送受信ＩＦレコード
		 * @param noConv 変換不要なプレースフォルダのリスト
		 * @return
		 */
		public String convPlaceHolder(String str, PFT_SDRV_IF_R ifR,  String... noConvL) {
			
			boolean phMcfHomeFlg = false;
			boolean pfCoCdFlg = false;
			boolean phIfProcTypFlg = false;
			boolean phExtSysCdFlg = false;
			boolean phUserFlg = false;
			boolean phDataNoFlg = false;
			
			for(String noConv : noConvL) {
				if(isSame(noConv, PlaceHolder.MCF_HOME)) {
					phMcfHomeFlg = true ;
				}
				if(isSame(noConv, PlaceHolder.CO_CD)) {
					pfCoCdFlg = true ;
				}
				if(isSame(noConv, PlaceHolder.IF_PROC_TYP)) {
					phIfProcTypFlg = true ;
				}
				if(isSame(noConv, PlaceHolder.EXT_SYS_CD)) {
					phExtSysCdFlg = true ;
				}
				if(isSame(noConv, PlaceHolder.USER)) {
					phUserFlg = true ;
				}
				if(isSame(noConv, PlaceHolder.DATA_NO)) {
					phDataNoFlg = true ;
				}
			}

			if (!isNull(str)) {
				if(!phMcfHomeFlg) {
					str = convPlaceHolder(str, PlaceHolder.MCF_HOME, MCSys.env.MCF_HOME());
				}
				if(!pfCoCdFlg) {
					str = convPlaceHolder(str, PlaceHolder.CO_CD, MCSys.user.coCD());
				}
				if(!phIfProcTypFlg) {
					str = convPlaceHolder(str, PlaceHolder.IF_PROC_TYP, ifR.if_proc_typ());
				}
				if(!phExtSysCdFlg) {
					str = convPlaceHolder(str, PlaceHolder.EXT_SYS_CD, ifR.ext_sys_cd());
				}
				if(!phUserFlg) {
					str = convPlaceHolder(str, PlaceHolder.USER, MCSys.user.ID());
				}
				if(!phDataNoFlg) {
					if (isSame(getIfCtlString(MAC_IF_CTL_TYP.SEND_FILE_GRP, ifR.if_proc_typ()),  _send_file_grp_2)) {
						str = convPlaceHolder(str, PlaceHolder.DATA_NO, ifR.data_no());
					}
				}
				
				// 残るプレースホルダ（{}で囲まれた文字列）は日付の書式に変換する
				MCTimestamp ts = getMCTimestamp();
				Matcher m = Pattern.compile("(\\{.+?\\})").matcher(str);
				while (m.find()) {
					String s = m.group(0);
					String fmt = s.substring(1, s.length() - 1);	// {}を除外
					try {
						str = convPlaceHolder(str, s, ts.toString(fmt));
					}
					catch (Exception ex) {
						// 変換できなかったものはそのままにする
					}
				}
			}
			return str;
		}
	}

// ---- その他 -----
	/**
	 * MCシステム日時を取得します<br>
	 * システム内で同一の日時が取得されないよう、１ミリ秒スリープ後に取得します
	 * 
	 * @return
	 */
	public static MCTimestamp getMCTimestamp() {
		try {
			Thread.sleep(1);	// ロックの前後で同一にならないように
		}
		catch (InterruptedException ex) {
			//万が一割り込みが発生した場合に、一意性のある値を返すよう。
			//と思われるが、念のため処理を中断する。
			throw new MCException(ex,PFBZL0062);
		}
		
		return MCTimestamp.now();
	}

	/**
	 * WebAPI送信時の日付型のフォーマット
	 */
	public static String _DATE_FORMAT = "";
	/**
	 * WebAPI送信時のタイムスタンプ型のフォーマット
	 */
	public static String _TIME_STAMP_FORMAT = "";

	/**
	 * JSON変換用ユーティリティー
	 * @param ifProctypStr ＩＦ処理区分
	 */
	public static mcframe.commonCore.util.MCDataConvUtil.JSON createJsonObj(String ifProcTypStr) {
		_DATE_FORMAT = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.DATE_FORMAT, ifProcTypStr);
		_TIME_STAMP_FORMAT = ifPrtclMgr().getIfCtlString(MAC_IF_CTL_TYP.TIME_STAMP_FORMAT, ifProcTypStr);
		
		MCDataConvUtil.JSON json = MCDataConvUtil.JSON.create().setNumberFormat(MCDataConvUtil.JSON.NumberFormatType.S_NUMBER);
		if (!isNull(_DATE_FORMAT)) {
			json.setDateFormat(_DATE_FORMAT);
		}
		if (!isNull(_TIME_STAMP_FORMAT)) {
			json.setTimestampFormat(_TIME_STAMP_FORMAT);
		}
		return json;
	}
	/**
	 * ＩＦ処理区分以下のフォルダ（ready）
	 */
	public static final String _IF_FLDR_READY = "ready";

	/**
	 * ＩＦ処理区分以下のフォルダ（trash）
	 */
	public static final String _IF_FLDR_TRASH = "trash";

	/**
	 * ＩＦ処理区分以下のフォルダ（err）
	 */
	public static final String _IF_FLDR_ERROR = "error";

	/**
	 * ＩＦ処理区分以下のフォルダ
	 */
	protected static final String[] _IF_FLDR = {_IF_FLDR_READY, _IF_FLDR_TRASH, _IF_FLDR_ERROR};

	/**
	 * ＩＦ処理区分以下のフォルダ名（ready, trash, errのいずれか）を削ります
	 * 
	 * @param path
	 * @return
	 */
	public static String suppressDir(String path) {

		File f = new File(path);
		String name = f.getName();
		for (String fldr : _IF_FLDR) {
			if (isSame(fldr, name)) {
				return f.getParent();
			}
		}
		return path;
	}

	/**
	 * ＩＦファイルをreadyからtrashフォルダに移動します
	 * 
	 * @param fpath
	 * @param fname
	 * @param fsuffix
	 */
	public static void moveToTrash(String fpath, String fname) {
		moveToTrash(fpath, fname, null);
	}
	public static void moveToTrash(String fpath, String fname, String fsuffix) {
		//ダミーファイルの移動
		if (!isNull(fsuffix)) {
			moveToIfFolder(fpath, fname + fsuffix, _IF_FLDR_TRASH);
		}
		//本体の移動
		moveToIfFolder(fpath, fname, _IF_FLDR_TRASH);
	}

	/**
	 * ＩＦファイルをreadyからerrフォルダに移動します
	 * 
	 * @param fpath
	 * @param fname
	 * @param fsuffix
	 */
	public static void moveToErr(String fpath, String fname) {
		moveToErr(fpath, fname, null);
	}
	public static void moveToErr(String fpath, String fname, String fsuffix) {
		moveToIfFolder(fpath, fname, _IF_FLDR_ERROR);
		if (!isNull(fsuffix)) {
			moveToIfFolder(fpath, fname + fsuffix, _IF_FLDR_ERROR);
		}
	}

	/**
	 * ＩＦファイルを指定されたフォルダに移動します<br>
	 * ファイルが存在しない場合Exceptionをthrowします
	 * 
	 * @param fpath
	 * @param fname
	 * @param ifFolder
	 */
	protected static void moveToIfFolder(String fpath, String fname, String ifFolder) {

		File fr = new File(fpath, fname);
		if (!fr.exists()) {
			throw new MCAppException(PFUCL0006, fname, fpath);
		}

		String toDir = suppressDir(fr.getParent()) + File.separator + ifFolder;
		File to = new File(toDir, fname);
		if (to.exists()) {
			to.delete();
		}

		if (!fr.renameTo(to)) {
			throw new MCAppException(
				PFUCL0007, fname, fpath, to.getAbsolutePath());
		}
	}
	
	/**
	 * ＩＦファイルを削除します。<br>
	 * 
	 * @param fpath
	 * @param fname
	 * @param ifFolder
	 */
	public static void deleteFile(String fpath, String fname) {
		File fr = new File(fpath, fname);
		
		if (fr.exists()) {
			fr.delete();
		}
	}
	
	/**
	 * ready, trash, errorフォルダを作成します<br>
	 * 
	 * @param fpath
	 */
	public static void makeDir(String fpath, boolean isLocal) {
		File f = null;
		
		if(isLocal) {
			for (String fldr : _IF_FLDR) {
				f = new File(fpath, fldr);
				if (!f.exists()) {
					MCFileUtil.mkDir(f);
				}
			}
		}
		else {
			f = new File(fpath);
			if (!f.exists()) {
				MCFileUtil.mkDir(f);
			}
		}
	}
	

	protected IfPrtclMgr<MCRow> _ifPrtclMgrList = null;
	/**
	 * ＩＦ通信ルールマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	ＩＦ通信ルールマスタの管理クラス
	 */
	public static IfPrtclMgr<MCRow> ifPrtclMgr() {
		return object(PFUCL_AppSys_CLAZZ)._ifPrtclMgr();
	}
	protected IfPrtclMgr<MCRow> _ifPrtclMgr() {
		if (_ifPrtclMgrList == null) _ifPrtclMgrList = crtSendIfProtocolMgr();
		return _ifPrtclMgrList;
	}
	
	protected IfAdptrMgr<MCRow> _ifAdptrMgrList = null;
	/**
	 * ＩＦアダプタマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	ＩＦアダプタマスタの管理クラス
	 */
	public static IfAdptrMgr<MCRow> ifAdptrMgr() {
		return object(PFUCL_AppSys_CLAZZ)._ifAdptrMgr();
	}
	protected IfAdptrMgr<MCRow> _ifAdptrMgr() {
		if (_ifAdptrMgrList == null) _ifAdptrMgrList = crtIfAdptrlMgr();
		return _ifAdptrMgrList;
	}
	
	protected HttpHdrMgr<MCRow> _httphdrMgrList = null;
	/**
	 * HTTPヘッダマスタを管理するクラスのインスタンスを取得します
	 * 
	 * @return	HTTPヘッダマスタの管理クラス
	 */
	public static HttpHdrMgr<MCRow> httpHdrMgr() {
		return object(PFUCL_AppSys_CLAZZ)._httpHdrMgr();
	}
	protected HttpHdrMgr<MCRow> _httpHdrMgr() {
		if (_httphdrMgrList == null) _httphdrMgrList = crtHttpHdrMgr();
		return _httphdrMgrList;
	}
	//FMCB CUSTOM END
}