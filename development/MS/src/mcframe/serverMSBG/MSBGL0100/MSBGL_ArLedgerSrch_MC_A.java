package mcframe.serverMSBG.MSBGL0100;

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
 * "MSBGL_ArLedgerSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBGL_ArLedgerSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBGL0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBGL_ArLedgerSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBGL0100_Srch01_INFO;
		this.aSrch01 = ((MSBGL_ArLedgerSrch)this).new Srch01();
	}

	public static MSBGL_ArLedgerSrch.Srch01 crtSrch01() {
		MSBGL_ArLedgerSrch lgc = new MSBGL_ArLedgerSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0100.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBG.MSBGL0100.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0100.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBG.MSBGL0100.Srch01_HdrR.create();
	}

	/**
	 * Srch01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R createSrch01_Dtl1R(){
		return mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R.create();
	}

	/**
	 * Srch01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R> createSrch01_Dtl1L(){
		return MCList.create(mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R.class);
	}

	/**
	 * Srch01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R createSrch01_Dtl2R(){
		return mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R.create();
	}

	/**
	 * Srch01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R> createSrch01_Dtl2L(){
		return MCList.create(mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売掛元帳の情報（売掛残高情報、売上・入金の請求明細、手形の情報）を取得する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0100.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBG.MSBGL0100.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBG.MSBGL0100.Srch01_CndR.create();
			down0 = mcframe.serverMSBG.MSBGL0100.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R.class);
			down2 = MCList.create(mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBGL_ArLedgerSrch)MSBGL_ArLedgerSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0100.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBG.MSBGL0100.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0100.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBG.MSBGL0100.Srch01_HdrR.create();
		}

		/**
		 * Srch01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R createSrch01_Dtl1R(){
			return mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R.create();
		}

		/**
		 * Srch01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R> createSrch01_Dtl1L(){
			return MCList.create(mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R.class);
		}

		/**
		 * Srch01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R createSrch01_Dtl2R(){
			return mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R.create();
		}

		/**
		 * Srch01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R> createSrch01_Dtl2L(){
			return MCList.create(mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sign_rivrs_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0100.Srch01_CndR
		 */
		public mcframe.serverMSBG.MSBGL0100.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>init_bal</td></tr>
		 * 	<tr><td><br></td><td>sls_amt</td></tr>
		 * 	<tr><td><br></td><td>ret_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>end_bal</td></tr>
		 * 	<tr><td><br></td><td>not_appl_note_amt</td></tr>
		 * 	<tr><td><br></td><td>exc_gain_loss</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBG.MSBGL0100.Srch01_HdrR
		 */
		public mcframe.serverMSBG.MSBGL0100.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_d_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_seq</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sls_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>sls_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_multi_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>row_num</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bill_d_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>act_no</td></tr>
		 * 	<tr><td><br></td><td>act_rev</td></tr>
		 * 	<tr><td><br></td><td>act_seq</td></tr>
		 * 	<tr><td><br></td><td>act_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_cd</td></tr>
		 * 	<tr><td><br></td><td>rcv_mtd_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>acst_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBG.MSBGL0100.Srch01_Dtl2R> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBGL_ArLedgerSrch)MSBGL_ArLedgerSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}