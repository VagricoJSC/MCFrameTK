package mcframe.serverMSBB.MSBBL6230;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBBL_DlvInstRcptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_DlvInstRcptService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL6230";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 aDlvInstRcv_Chk01;

	protected void initDlvInstRcv_Chk01() {
		this.info = PDef.MS_MSBBL6230_DlvInstRcv_Chk01_INFO;
		this.aDlvInstRcv_Chk01 = ((MSBBL_DlvInstRcptService)this).new DlvInstRcv_Chk01();
	}

	public static MSBBL_DlvInstRcptService.DlvInstRcv_Chk01 crtDlvInstRcv_Chk01() {
		MSBBL_DlvInstRcptService lgc = new MSBBL_DlvInstRcptService();
		lgc.initDlvInstRcv_Chk01();
		return lgc.aDlvInstRcv_Chk01;
	}

	protected void paramDlvInstRcv_Chk01(MCParam p) {
		if (this.aDlvInstRcv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRcv_Chk01.up0());
		p.addDownBlock(aDlvInstRcv_Chk01.down0());
	}

	protected void doDlvInstRcv_Chk01() {
		aDlvInstRcv_Chk01.call();
	};

	/**
	 * DlvInstRcv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR createDlvInstRcv_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.create();
	}

	/**
	 * DlvInstRcv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> createDlvInstRcv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
	}
	protected MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 aDlvInstRcv_Upd01;

	protected void initDlvInstRcv_Upd01() {
		this.info = PDef.MS_MSBBL6230_DlvInstRcv_Upd01_INFO;
		this.aDlvInstRcv_Upd01 = ((MSBBL_DlvInstRcptService)this).new DlvInstRcv_Upd01();
	}

	public static MSBBL_DlvInstRcptService.DlvInstRcv_Upd01 crtDlvInstRcv_Upd01() {
		MSBBL_DlvInstRcptService lgc = new MSBBL_DlvInstRcptService();
		lgc.initDlvInstRcv_Upd01();
		return lgc.aDlvInstRcv_Upd01;
	}

	protected void paramDlvInstRcv_Upd01(MCParam p) {
		if (this.aDlvInstRcv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInstRcv_Upd01.up0());
		p.addDownBlock(aDlvInstRcv_Upd01.down0());
	}

	protected void doDlvInstRcv_Upd01() {
		aDlvInstRcv_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DlvInstRcv_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理、項目値の補完<br>
	 */
	abstract public class DlvInstRcv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRcv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected DlvInstRcv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_DlvInstRcptService)MSBBL_DlvInstRcptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DlvInstRcv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR createDlvInstRcv_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.create();
		}

		/**
		 * DlvInstRcv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> createDlvInstRcv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_DlvInstRcptService)MSBBL_DlvInstRcptService_MC_A.this).info;
		}


	}
	/**
	 * DlvInstRcv_Upd01オペレーション.<p>
	 *
	 */
	abstract public class DlvInstRcv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInstRcv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected DlvInstRcv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_DlvInstRcptService)MSBBL_DlvInstRcptService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DlvInstRcv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR createDlvInstRcv_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.create();
		}

		/**
		 * DlvInstRcv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> createDlvInstRcv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.cst_dlv_inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>rcpt.tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rcpt.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt.dlv_inst_rcpt_rev</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6230.DlvInstRcv_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_DlvInstRcptService)MSBBL_DlvInstRcptService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}