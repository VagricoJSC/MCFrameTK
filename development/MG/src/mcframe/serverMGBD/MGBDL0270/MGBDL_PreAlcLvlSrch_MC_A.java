package mcframe.serverMGBD.MGBDL0270;

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
 * "MGBDL_PreAlcLvlSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDL_PreAlcLvlSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBDL0270";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBDL_PreAlcLvlSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBDL0270_Srch01_INFO;
		this.aSrch01 = ((MGBDL_PreAlcLvlSrch)this).new Srch01();
	}

	public static MGBDL_PreAlcLvlSrch.Srch01 crtSrch01() {
		MGBDL_PreAlcLvlSrch lgc = new MGBDL_PreAlcLvlSrch();
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
	public mcframe.serverMGBD.MGBDL0270.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBD.MGBDL0270.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBD.MGBDL0270.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBD.MGBDL0270.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBD.MGBDL0270.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBD.MGBDL0270.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMGBD.MGBDL0270.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBD.MGBDL0270.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBD.MGBDL0270.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBD.MGBDL0270.Srch01_RsltR.class);

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
			invoke((MGBDL_PreAlcLvlSrch)MGBDL_PreAlcLvlSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0270.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBD.MGBDL0270.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBD.MGBDL0270.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBD.MGBDL0270.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBD.MGBDL0270.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBD.MGBDL0270.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_lvl_fr</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_lvl_to</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>src_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>src_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_seq</td></tr>
		 * 	<tr><td><br></td><td>src_pre_alc_seq</td></tr>
		 * 	<tr><td><br></td><td>top_pre_alc_seq</td></tr>
		 * 	<tr><td><br></td><td>fin_only_flg</td></tr>
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
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_lvl_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>ym_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd1_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd2_flg</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd3_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_no_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ_flg</td></tr>
		 * 	<tr><td><br></td><td>src_wg_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>src_pre_alc_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>top_pre_alc_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>fin_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_flg10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBD.MGBDL0270.Srch01_CndR
		 */
		public mcframe.serverMGBD.MGBDL0270.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pre_alc_lvl</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bp_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_alc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>src_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>src_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_rate_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_seq</td></tr>
		 * 	<tr><td><br></td><td>src_pre_alc_seq</td></tr>
		 * 	<tr><td><br></td><td>top_pre_alc_seq</td></tr>
		 * 	<tr><td><br></td><td>fin_flg</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBD.MGBDL0270.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBDL_PreAlcLvlSrch)MGBDL_PreAlcLvlSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}