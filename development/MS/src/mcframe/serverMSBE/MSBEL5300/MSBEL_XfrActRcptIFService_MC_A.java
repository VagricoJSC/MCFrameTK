package mcframe.serverMSBE.MSBEL5300;

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
 * "MSBEL_XfrActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_XfrActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5300";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_XfrActRcptIFService.XfrActIF_Chk01 aXfrActIF_Chk01;

	protected void initXfrActIF_Chk01() {
		this.info = PDef.MS_MSBEL5300_XfrActIF_Chk01_INFO;
		this.aXfrActIF_Chk01 = ((MSBEL_XfrActRcptIFService)this).new XfrActIF_Chk01();
	}

	public static MSBEL_XfrActRcptIFService.XfrActIF_Chk01 crtXfrActIF_Chk01() {
		MSBEL_XfrActRcptIFService lgc = new MSBEL_XfrActRcptIFService();
		lgc.initXfrActIF_Chk01();
		return lgc.aXfrActIF_Chk01;
	}

	protected void paramXfrActIF_Chk01(MCParam p) {
		if (this.aXfrActIF_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActIF_Chk01.up0());
		p.addUpBlock(aXfrActIF_Chk01.up1());
		p.addDownBlock(aXfrActIF_Chk01.down0());
		p.addDownBlock(aXfrActIF_Chk01.down1());
	}

	protected void doXfrActIF_Chk01() {
		aXfrActIF_Chk01.call();
	};

	/**
	 * XfrActIF_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR createXfrActIF_CtrlR(){
		return mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR.create();
	}

	/**
	 * XfrActIF_HdrDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR createXfrActIF_HdrDtlR(){
		return mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.create();
	}

	/**
	 * XfrActIF_HdrDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> createXfrActIF_HdrDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);
	}
	protected MSBEL_XfrActRcptIFService.XfrActIF_Upd01 aXfrActIF_Upd01;

	protected void initXfrActIF_Upd01() {
		this.info = PDef.MS_MSBEL5300_XfrActIF_Upd01_INFO;
		this.aXfrActIF_Upd01 = ((MSBEL_XfrActRcptIFService)this).new XfrActIF_Upd01();
	}

	public static MSBEL_XfrActRcptIFService.XfrActIF_Upd01 crtXfrActIF_Upd01() {
		MSBEL_XfrActRcptIFService lgc = new MSBEL_XfrActRcptIFService();
		lgc.initXfrActIF_Upd01();
		return lgc.aXfrActIF_Upd01;
	}

	protected void paramXfrActIF_Upd01(MCParam p) {
		if (this.aXfrActIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aXfrActIF_Upd01.up0());
		p.addUpBlock(aXfrActIF_Upd01.up1());
		p.addDownBlock(aXfrActIF_Upd01.down0());
	}

	protected void doXfrActIF_Upd01() {
		aXfrActIF_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * XfrActIF_Chk01オペレーション.<p>
	 *
	 * 移動実績登録用のチェック処理です。<br>
	 */
	abstract public class XfrActIF_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActIF_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> down1;
		
		
		// コンストラクタ
		protected XfrActIF_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrActRcptIFService)MSBEL_XfrActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * XfrActIF_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR createXfrActIF_CtrlR(){
			return mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR.create();
		}

		/**
		 * XfrActIF_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR createXfrActIF_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.create();
		}

		/**
		 * XfrActIF_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> createXfrActIF_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActRcptIFService)MSBEL_XfrActRcptIFService_MC_A.this).info;
		}


	}
	/**
	 * XfrActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから移動実績の登録、更新、取消を行います。<br>
	 */
	abstract public class XfrActIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "XfrActIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> down0;
		
		
		// コンストラクタ
		protected XfrActIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_XfrActRcptIFService)MSBEL_XfrActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * XfrActIF_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR createXfrActIF_CtrlR(){
			return mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR.create();
		}

		/**
		 * XfrActIF_HdrDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR createXfrActIF_HdrDtlR(){
			return mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.create();
		}

		/**
		 * XfrActIF_HdrDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> createXfrActIF_HdrDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_upd_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>agg_gi_loc_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5300.XfrActIF_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_inst_no</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xah.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.gr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.xfr_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xah.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xah.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xah.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>xad.xfr_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gi_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>xad.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>xad.lot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>xad.sno1</td></tr>
		 * 	<tr><td><br></td><td>xad.sno2</td></tr>
		 * 	<tr><td><br></td><td>xad.sno3</td></tr>
		 * 	<tr><td><br></td><td>xad.sno4</td></tr>
		 * 	<tr><td><br></td><td>xad.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>xad.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>xad.skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>xad.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>xad.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>xad.intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>xad.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>xad.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>xad.ext_xfr_act_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5300.XfrActIF_HdrDtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_XfrActRcptIFService)MSBEL_XfrActRcptIFService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}