package mcframe.serverMSBC.MSBCL1090;

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
 * "MSBCL_InptListSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_InptListSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL1090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_InptListSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL1090_Srch01_INFO;
		this.aSrch01 = ((MSBCL_InptListSrch)this).new Srch01();
	}

	public static MSBCL_InptListSrch.Srch01 crtSrch01() {
		MSBCL_InptListSrch lgc = new MSBCL_InptListSrch();
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
	public mcframe.serverMSBC.MSBCL1090.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL1090.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1090.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBC.MSBCL1090.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1090.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1090.Srch01_RsltR.class);
	}

	/**
	 * Srch01_YieldRsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR createSrch01_YieldRsltR(){
		return mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR.create();
	}

	/**
	 * Srch01_YieldRsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR> createSrch01_YieldRsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 投入予定・投入実績・ロス実績及び、親品目・工程の情報を検索する<br>
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
		private final mcframe.serverMSBC.MSBCL1090.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1090.Srch01_RsltR> down0;
		/** [Srch01_YieldRslt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR> aSrch01_YieldRslt;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL1090.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL1090.Srch01_RsltR.class);
			aSrch01_YieldRslt = MCList.create(mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR.class);

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
			invoke((MSBCL_InptListSrch)MSBCL_InptListSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1090.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL1090.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1090.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBC.MSBCL1090.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1090.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1090.Srch01_RsltR.class);
		}

		/**
		 * Srch01_YieldRsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR createSrch01_YieldRsltR(){
			return mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR.create();
		}

		/**
		 * Srch01_YieldRsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR> createSrch01_YieldRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_mode1</td></tr>
		 * 	<tr><td><br></td><td>srch_mode2</td></tr>
		 * 	<tr><td><br></td><td>oper_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_stt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_ord_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_stt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_no_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_hm_to</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_hm_fr</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_hm_to</td></tr>
		 * 	<tr><td><br></td><td>inpt_ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>inpt_ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_fr</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_to</td></tr>
		 * 	<tr><td><br></td><td>pr_rate_inc_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>not_alloc_srch_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>chd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL1090.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL1090.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_rem_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_schd_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pr_rate</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>loss_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>loss_act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>loss_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>loss_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>loss_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>act_lot_no</td></tr>
		 * 	<tr><td><br></td><td>act_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>act_hm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_hm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_schd_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>st_act_dt</td></tr>
		 * 	<tr><td><br></td><td>st_act_hm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_hm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>par_base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>par_act_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_act_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>par_inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>par_inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>oper_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>par_sno1</td></tr>
		 * 	<tr><td><br></td><td>par_sno2</td></tr>
		 * 	<tr><td><br></td><td>par_sno3</td></tr>
		 * 	<tr><td><br></td><td>par_sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_usr_nm</td></tr>
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
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>par_itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL1090.Srch01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Srch01_YieldRslt]ブロックのコンテナaSrch01_YieldRsltLを返します。
		 *
		 * @return Srch01_YieldRsltL
		 */
		public MCList<mcframe.serverMSBC.MSBCL1090.Srch01_YieldRsltR> Srch01_YieldRslt() {
			return aSrch01_YieldRslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_InptListSrch)MSBCL_InptListSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}