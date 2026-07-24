package mcframe.serverMSBG.MSBGL5010;

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
 * "MSBGL_ArCmnService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_ArCmnService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBGL5010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_ArCmnService.ArCmn_Upd01 aArCmn_Upd01;

	protected void initArCmn_Upd01() {
		this.info = PDef.MS_MSBGL5010_ArCmn_Upd01_INFO;
		this.aArCmn_Upd01 = ((MSBGL_ArCmnService)this).new ArCmn_Upd01();
	}

	public static MSBGL_ArCmnService.ArCmn_Upd01 crtArCmn_Upd01() {
		MSBGL_ArCmnService lgc = new MSBGL_ArCmnService();
		lgc.initArCmn_Upd01();
		return lgc.aArCmn_Upd01;
	}

	protected void paramArCmn_Upd01(MCParam p) {
		if (this.aArCmn_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aArCmn_Upd01.up0());
		p.addUpBlock(aArCmn_Upd01.up1());
	}

	protected void doArCmn_Upd01() {
		aArCmn_Upd01.call();
	};

	/**
	 * ArCmn_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR createArCmn_Upd01_DtlR(){
		return mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR.create();
	}

	/**
	 * ArCmn_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR> createArCmn_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR.class);
	}

	/**
	 * ArCmn_Upd01_OpeTypブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR createArCmn_Upd01_OpeTypR(){
		return mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR.create();
	}

	/**
	 * ArCmn_Upd01_BillGrpブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR createArCmn_Upd01_BillGrpR(){
		return mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ArCmn_Upd01オペレーション.<p>
	 *
	 */
	abstract public class ArCmn_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ArCmn_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR up1;
		/** [ArCmn_Upd01_BillGrp]ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR aArCmn_Upd01_BillGrp;
		
		
		// コンストラクタ
		protected ArCmn_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR.class);
			up1 = mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR.create();
			aArCmn_Upd01_BillGrp = mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_ArCmnService)MSBGL_ArCmnService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ArCmn_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR createArCmn_Upd01_DtlR(){
			return mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR.create();
		}

		/**
		 * ArCmn_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR> createArCmn_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR.class);
		}

		/**
		 * ArCmn_Upd01_OpeTypブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR createArCmn_Upd01_OpeTypR(){
			return mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR.create();
		}

		/**
		 * ArCmn_Upd01_BillGrpブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR createArCmn_Upd01_BillGrpR(){
			return mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_seq</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ar_trd_grp_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_appl_schd_no</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>inpt_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>inpt_ac_ym</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bill_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>bill_iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt1</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt2</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt1</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt2</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt3</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>par_act_no</td></tr>
		 * 	<tr><td><br></td><td>par_act_seq</td></tr>
		 * 	<tr><td><br></td><td>bill_d_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ar_ope_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR
		 */
		public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_OpeTypR up1() {
			return up1;
		}



		/**
		 * [ArCmn_Upd01_BillGrp]ブロックのコンテナaArCmn_Upd01_BillGrpRを返します。
		 *
		 * @return ArCmn_Upd01_BillGrpR
		 */
		public mcframe.serverMSBG.MSBGL5010.ArCmn_Upd01_BillGrpR ArCmn_Upd01_BillGrp() {
			return aArCmn_Upd01_BillGrp;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArCmnService)MSBGL_ArCmnService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}