package mcframe.serverMSBE.MSBEL2200;

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
 * "MSBEL_RcptIvTrgtSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_RcptIvTrgtSel_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL2200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_RcptIvTrgtSel.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL2200_Srch01_INFO;
		this.aSrch01 = ((MSBEL_RcptIvTrgtSel)this).new Srch01();
	}

	public static MSBEL_RcptIvTrgtSel.Srch01 crtSrch01() {
		MSBEL_RcptIvTrgtSel lgc = new MSBEL_RcptIvTrgtSel();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2200.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL2200.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL2200.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBE.MSBEL2200.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL2200.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL2200.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索モードに従い、受領インボイス登録対象の入荷予定、入荷実績を検索する<br>
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
		private final mcframe.serverMSBE.MSBEL2200.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL2200.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL2200.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL2200.Srch01_RsltR.class);

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
			invoke((MSBEL_RcptIvTrgtSel)MSBEL_RcptIvTrgtSel_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2200.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL2200.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL2200.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBE.MSBEL2200.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL2200.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL2200.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_mode</td></tr>
		 * 	<tr><td><br></td><td>not_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>part_arr_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>arr_dt_to</td></tr>
		 * 	<tr><td><br></td><td>arr_hm_to</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>incl_not_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL2200.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL2200.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sim_cnd_grp_no</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>arr_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_hm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>in_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>in_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>in_to_tel</td></tr>
		 * 	<tr><td><br></td><td>in_to_fax</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>inc_ctax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_ctax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_ctax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>purc_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>po_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_trd_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_xrate</td></tr>
		 * 	<tr><td><br></td><td>slo_ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>slo_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>selectable_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
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
		public MCList<mcframe.serverMSBE.MSBEL2200.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_RcptIvTrgtSel)MSBEL_RcptIvTrgtSel_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}