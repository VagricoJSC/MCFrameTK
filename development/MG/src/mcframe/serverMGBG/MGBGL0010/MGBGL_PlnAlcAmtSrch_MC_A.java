package mcframe.serverMGBG.MGBGL0010;

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
 * "MGBGL_PlnAlcAmtSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGL_PlnAlcAmtSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBGL0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGL_PlnAlcAmtSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBGL0010_Srch01_INFO;
		this.aSrch01 = ((MGBGL_PlnAlcAmtSrch)this).new Srch01();
	}

	public static MGBGL_PlnAlcAmtSrch.Srch01 crtSrch01() {
		MGBGL_PlnAlcAmtSrch lgc = new MGBGL_PlnAlcAmtSrch();
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
	public mcframe.serverMGBG.MGBGL0010.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBG.MGBGL0010.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL0010.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBG.MGBGL0010.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBG.MGBGL0010.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBG.MGBGL0010.Srch01_RsltR.class);
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
		private final mcframe.serverMGBG.MGBGL0010.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBG.MGBGL0010.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL0010.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBG.MGBGL0010.Srch01_RsltR.class);

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
			invoke((MGBGL_PlnAlcAmtSrch)MGBGL_PlnAlcAmtSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0010.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBG.MGBGL0010.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL0010.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBG.MGBGL0010.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBG.MGBGL0010.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBG.MGBGL0010.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_rec_typ</td></tr>
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
		 * 	<tr><td><br></td><td>trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_calc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_calc_no</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>not_my_wg_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pre_alc_fin_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL0010.Srch01_CndR
		 */
		public mcframe.serverMGBG.MGBGL0010.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>alc_rec_typ</td></tr>
		 * 	<tr><td><br></td><td>alc_rec_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>alc_ac_nm</td></tr>
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
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_calc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_calc_no</td></tr>
		 * 	<tr><td><br></td><td>pre_alc_fin_flg</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
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
		public MCList<mcframe.serverMGBG.MGBGL0010.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PlnAlcAmtSrch)MGBGL_PlnAlcAmtSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}