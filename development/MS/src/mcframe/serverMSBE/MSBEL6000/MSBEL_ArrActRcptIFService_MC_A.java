package mcframe.serverMSBE.MSBEL6000;

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
 * "MSBEL_ArrActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ArrActRcptIFService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL6000";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ArrActRcptIFService.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL6000_Chk01_INFO;
		this.aChk01 = ((MSBEL_ArrActRcptIFService)this).new Chk01();
	}

	public static MSBEL_ArrActRcptIFService.Chk01 crtChk01() {
		MSBEL_ArrActRcptIFService lgc = new MSBEL_ArrActRcptIFService();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * ArrActIF_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR createArrActIF_CtrlR(){
		return mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR.create();
	}

	/**
	 * ArrActIF_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR createArrActIF_DtlR(){
		return mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.create();
	}

	/**
	 * ArrActIF_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> createArrActIF_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);
	}
	protected MSBEL_ArrActRcptIFService.ArrActIF_Upd01 aArrActIF_Upd01;

	protected void initArrActIF_Upd01() {
		this.info = PDef.MS_MSBEL6000_ArrActIF_Upd01_INFO;
		this.aArrActIF_Upd01 = ((MSBEL_ArrActRcptIFService)this).new ArrActIF_Upd01();
	}

	public static MSBEL_ArrActRcptIFService.ArrActIF_Upd01 crtArrActIF_Upd01() {
		MSBEL_ArrActRcptIFService lgc = new MSBEL_ArrActRcptIFService();
		lgc.initArrActIF_Upd01();
		return lgc.aArrActIF_Upd01;
	}

	protected void paramArrActIF_Upd01(MCParam p) {
		if (this.aArrActIF_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArrActIF_Upd01.up0());
		p.addUpBlock(aArrActIF_Upd01.up1());
		p.addDownBlock(aArrActIF_Upd01.down0());
	}

	protected void doArrActIF_Upd01() {
		aArrActIF_Upd01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 入荷実績登録オペレーション用のチェック処理です。<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);

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
			invoke((MSBEL_ArrActRcptIFService)MSBEL_ArrActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ArrActIF_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR createArrActIF_CtrlR(){
			return mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR.create();
		}

		/**
		 * ArrActIF_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR createArrActIF_DtlR(){
			return mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.create();
		}

		/**
		 * ArrActIF_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> createArrActIF_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);
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
		 * @see mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR up0() {
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
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> up1() {
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
		 * @see mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR down0() {
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
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ret_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActRcptIFService)MSBEL_ArrActRcptIFService_MC_A.this).info;
		}


	}
	/**
	 * ArrActIF_Upd01オペレーション.<p>
	 *
	 * 外部システムから入荷実績の登録、更新、取消を行います。<br>
	 */
	abstract public class ArrActIF_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArrActIF_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> down0;
		
		
		// コンストラクタ
		protected ArrActIF_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);

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
			invoke((MSBEL_ArrActRcptIFService)MSBEL_ArrActRcptIFService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ArrActIF_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR createArrActIF_CtrlR(){
			return mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR.create();
		}

		/**
		 * ArrActIF_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR createArrActIF_DtlR(){
			return mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.create();
		}

		/**
		 * ArrActIF_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> createArrActIF_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR.class);
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
		 * @see mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL6000.ArrActIF_CtrlR up0() {
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
		 * 	<tr><td><br></td><td>arr_act.arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_tm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.arr_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rcpt_iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ver_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sret_fr_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ret_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ship_fr_valid_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sync_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.edi_bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>arr_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wms_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.ext_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>crt_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>pre_outsrc_act_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>arr_dpt_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_usr_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_valid_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char2_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char3_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>arr_act.dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act.dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL6000.ArrActIF_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ArrActRcptIFService)MSBEL_ArrActRcptIFService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}