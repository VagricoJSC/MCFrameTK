package mcframe.serverMSBE.MSBEL5010;

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
 * "MSBEL_IoActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_IoActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_IoActService.IoAct_Ins01 aIoAct_Ins01;

	protected void initIoAct_Ins01() {
		this.info = PDef.MS_MSBEL5010_IoAct_Ins01_INFO;
		this.aIoAct_Ins01 = ((MSBEL_IoActService)this).new IoAct_Ins01();
	}

	public static MSBEL_IoActService.IoAct_Ins01 crtIoAct_Ins01() {
		MSBEL_IoActService lgc = new MSBEL_IoActService();
		lgc.initIoAct_Ins01();
		return lgc.aIoAct_Ins01;
	}

	protected void paramIoAct_Ins01(MCParam p) {
		if (this.aIoAct_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIoAct_Ins01.up0());
	}

	protected void doIoAct_Ins01() {
		aIoAct_Ins01.call();
	};

	/**
	 * IoAct_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR createIoAct_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR.create();
	}

	/**
	 * IoAct_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR> createIoAct_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR.class);
	}
	protected MSBEL_IoActService.IoAct_Upd01 aIoAct_Upd01;

	protected void initIoAct_Upd01() {
		this.info = PDef.MS_MSBEL5010_IoAct_Upd01_INFO;
		this.aIoAct_Upd01 = ((MSBEL_IoActService)this).new IoAct_Upd01();
	}

	public static MSBEL_IoActService.IoAct_Upd01 crtIoAct_Upd01() {
		MSBEL_IoActService lgc = new MSBEL_IoActService();
		lgc.initIoAct_Upd01();
		return lgc.aIoAct_Upd01;
	}

	protected void paramIoAct_Upd01(MCParam p) {
		if (this.aIoAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
	}

	protected void doIoAct_Upd01() {
		aIoAct_Upd01.call();
	};

	/**
	 * IoAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR createIoAct_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR.create();
	}

	/**
	 * IoAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR> createIoAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * IoAct_Ins01オペレーション.<p>
	 *
	 * 受払実績ワークを作成する<br>
	 */
	abstract public class IoAct_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IoAct_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR> up0;
		
		
		// コンストラクタ
		protected IoAct_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR.class);

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
			invoke((MSBEL_IoActService)MSBEL_IoActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IoAct_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR createIoAct_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR.create();
		}

		/**
		 * IoAct_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR> createIoAct_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wia.data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>wia.can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>wia.act_tm</td></tr>
		 * 	<tr><td><br></td><td>wia.act_no</td></tr>
		 * 	<tr><td><br></td><td>wia.act_seq</td></tr>
		 * 	<tr><td><br></td><td>wia.act_rev_no</td></tr>
		 * 	<tr><td><br></td><td>wia.act_d_no</td></tr>
		 * 	<tr><td><br></td><td>wia.act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>wia.act_io_no</td></tr>
		 * 	<tr><td><br></td><td>wia.act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>wia.un_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>wia.temp_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.trn_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.gi_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.gr_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>wia.act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.mfg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wia.stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>wia.gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.gr_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.gr_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.lot_no</td></tr>
		 * 	<tr><td><br></td><td>wia.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>wia.sno1</td></tr>
		 * 	<tr><td><br></td><td>wia.sno2</td></tr>
		 * 	<tr><td><br></td><td>wia.sno3</td></tr>
		 * 	<tr><td><br></td><td>wia.sno4</td></tr>
		 * 	<tr><td><br></td><td>wia.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.fix_no</td></tr>
		 * 	<tr><td><br></td><td>wia.gi_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.gr_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.in_xfr_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>wia.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wia.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>wia.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.xrate</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wia.slo_no</td></tr>
		 * 	<tr><td><br></td><td>wia.po_no</td></tr>
		 * 	<tr><td><br></td><td>wia.iv_no</td></tr>
		 * 	<tr><td><br></td><td>wia.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wia.bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.acst_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>wia.dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>wia.dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>wia.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.spot_flg</td></tr>
		 * 	<tr><td><br></td><td>wia.sttl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>wia.sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wia.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wia.purc_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wia.itm_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wia.mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>wia.mfg_st_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wia.yield_rate</td></tr>
		 * 	<tr><td><br></td><td>wia.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>wia.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>wia.par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>wia.par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wia.par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wia.par_lot_no</td></tr>
		 * 	<tr><td><br></td><td>wia.par_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>wia.par_sno1</td></tr>
		 * 	<tr><td><br></td><td>wia.par_sno2</td></tr>
		 * 	<tr><td><br></td><td>wia.par_sno3</td></tr>
		 * 	<tr><td><br></td><td>wia.par_sno4</td></tr>
		 * 	<tr><td><br></td><td>wia.stktk_diff_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.pack_xfr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.pack_xfr_qty</td></tr>
		 * 	<tr><td><br></td><td>wia.mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.arr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.yield_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.io_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.accpt_dfct_flg</td></tr>
		 * 	<tr><td><br></td><td>wia.no_gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>wia.acxfr_stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>wia.acxfr_stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.acxfr_stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wia.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char4</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char5</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char6</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char7</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char8</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char9</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_char10</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_num1</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_num2</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_num3</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>wia.sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>wia.rsn_cd2</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Ins01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IoActService)MSBEL_IoActService_MC_A.this).info;
		}


	}
	/**
	 * IoAct_Upd01オペレーション.<p>
	 *
	 * 受払実績を作成する<br>
	 */
	abstract public class IoAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "IoAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** [IoAct_Upd01_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR> aIoAct_Upd01_Dtl;
		
		
		// コンストラクタ
		protected IoAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			aIoAct_Upd01_Dtl = MCList.create(mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_IoActService)MSBEL_IoActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * IoAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR createIoAct_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR.create();
		}

		/**
		 * IoAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR> createIoAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------


		/**
		 * [IoAct_Upd01_Dtl]ブロックのコンテナaIoAct_Upd01_DtlLを返します。
		 *
		 * @return IoAct_Upd01_DtlL
		 */
		public MCList<mcframe.serverMSBE.MSBEL5010.IoAct_Upd01_DtlR> IoAct_Upd01_Dtl() {
			return aIoAct_Upd01_Dtl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IoActService)MSBEL_IoActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}