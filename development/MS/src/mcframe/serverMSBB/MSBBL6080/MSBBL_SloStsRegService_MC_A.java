package mcframe.serverMSBB.MSBBL6080;

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
 * "MSBBL_SloStsRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SloStsRegService_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBL6080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SloStsRegService.SloSts_Ins01 aSloSts_Ins01;

	protected void initSloSts_Ins01() {
		this.info = PDef.MS_MSBBL6080_SloSts_Ins01_INFO;
		this.aSloSts_Ins01 = ((MSBBL_SloStsRegService)this).new SloSts_Ins01();
	}

	public static MSBBL_SloStsRegService.SloSts_Ins01 crtSloSts_Ins01() {
		MSBBL_SloStsRegService lgc = new MSBBL_SloStsRegService();
		lgc.initSloSts_Ins01();
		return lgc.aSloSts_Ins01;
	}

	protected void paramSloSts_Ins01(MCParam p) {
		if (this.aSloSts_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloSts_Ins01.up0());
	}

	protected void doSloSts_Ins01() {
		aSloSts_Ins01.call();
	};

	/**
	 * SloSts_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6080.SloSts_DtlR createSloSts_DtlR(){
		return mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.create();
	}

	/**
	 * SloSts_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> createSloSts_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.class);
	}
	protected MSBBL_SloStsRegService.SloSts_Ins02 aSloSts_Ins02;

	protected void initSloSts_Ins02() {
		this.info = PDef.MS_MSBBL6080_SloSts_Ins02_INFO;
		this.aSloSts_Ins02 = ((MSBBL_SloStsRegService)this).new SloSts_Ins02();
	}

	public static MSBBL_SloStsRegService.SloSts_Ins02 crtSloSts_Ins02() {
		MSBBL_SloStsRegService lgc = new MSBBL_SloStsRegService();
		lgc.initSloSts_Ins02();
		return lgc.aSloSts_Ins02;
	}

	protected void paramSloSts_Ins02(MCParam p) {
		if (this.aSloSts_Ins02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSloSts_Ins02.up0());
	}

	protected void doSloSts_Ins02() {
		aSloSts_Ins02.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * SloSts_Ins01オペレーション.<p>
	 *
	 * 受注明細ＮＯをもとに受注状況を登録します。<br>
	 */
	abstract public class SloSts_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloSts_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> up0;
		
		
		// コンストラクタ
		protected SloSts_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SloStsRegService)MSBBL_SloStsRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SloSts_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6080.SloSts_DtlR createSloSts_DtlR(){
			return mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.create();
		}

		/**
		 * SloSts_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> createSloSts_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_sts.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.slo_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.unit_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.qty</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.upri</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.amt</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.bill_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.biz_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.insp_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.xfr_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloStsRegService)MSBBL_SloStsRegService_MC_A.this).info;
		}


	}
	/**
	 * SloSts_Ins02オペレーション.<p>
	 *
	 * 手配ＮＯをもとに受注状況を登録します。<br>
	 */
	abstract public class SloSts_Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "SloSts_Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> up0;
		
		
		// コンストラクタ
		protected SloSts_Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SloStsRegService)MSBBL_SloStsRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * SloSts_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6080.SloSts_DtlR createSloSts_DtlR(){
			return mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.create();
		}

		/**
		 * SloSts_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> createSloSts_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6080.SloSts_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_sts.slo_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.unit_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.qty</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.upri</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.amt</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.slo_prms_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.rcpt_iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.bill_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.biz_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.insp_no</td></tr>
		 * 	<tr><td><br></td><td>slo_sts.insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6080.SloSts_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloStsRegService)MSBBL_SloStsRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}