package mcframe.serverMGBF.MGBFL0260;

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
 * "MGBFL_CostIoSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBFL_CostIoSrch_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBFL0260";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBFL_CostIoSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBFL0260_Srch01_INFO;
		this.aSrch01 = ((MGBFL_CostIoSrch)this).new Srch01();
	}

	public static MGBFL_CostIoSrch.Srch01 crtSrch01() {
		MGBFL_CostIoSrch lgc = new MGBFL_CostIoSrch();
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
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0260.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBF.MGBFL0260.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0260.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBF.MGBFL0260.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0260.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0260.Srch01_RsltR.class);
	}

	/**
	 * Srch01_MstrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBF.MGBFL0260.Srch01_MstrR createSrch01_MstrR(){
		return mcframe.serverMGBF.MGBFL0260.Srch01_MstrR.create();
	}

	/**
	 * Srch01_MstrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBF.MGBFL0260.Srch01_MstrR> createSrch01_MstrL(){
		return MCList.create(mcframe.serverMGBF.MGBFL0260.Srch01_MstrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価個別受払表を検索する<br>
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
		private final mcframe.serverMGBF.MGBFL0260.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0260.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBF.MGBFL0260.Srch01_MstrR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBF.MGBFL0260.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMGBF.MGBFL0260.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMGBF.MGBFL0260.Srch01_MstrR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBFL_CostIoSrch)MGBFL_CostIoSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0260.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBF.MGBFL0260.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0260.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBF.MGBFL0260.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0260.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0260.Srch01_RsltR.class);
		}

		/**
		 * Srch01_MstrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBF.MGBFL0260.Srch01_MstrR createSrch01_MstrR(){
			return mcframe.serverMGBF.MGBFL0260.Srch01_MstrR.create();
		}

		/**
		 * Srch01_MstrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBF.MGBFL0260.Srch01_MstrR> createSrch01_MstrL(){
			return MCList.create(mcframe.serverMGBF.MGBFL0260.Srch01_MstrR.class);
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
		 * 	<tr><td><br></td><td>cost_io_id</td></tr>
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
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>no_bp_flg</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>except_other_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_flg</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBF.MGBFL0260.Srch01_CndR
		 */
		public mcframe.serverMGBF.MGBFL0260.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_no</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mng_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>qty01</td></tr>
		 * 	<tr><td><br></td><td>amt01</td></tr>
		 * 	<tr><td><br></td><td>std01</td></tr>
		 * 	<tr><td><br></td><td>qty02</td></tr>
		 * 	<tr><td><br></td><td>amt02</td></tr>
		 * 	<tr><td><br></td><td>std02</td></tr>
		 * 	<tr><td><br></td><td>qty03</td></tr>
		 * 	<tr><td><br></td><td>amt03</td></tr>
		 * 	<tr><td><br></td><td>std03</td></tr>
		 * 	<tr><td><br></td><td>qty04</td></tr>
		 * 	<tr><td><br></td><td>amt04</td></tr>
		 * 	<tr><td><br></td><td>std04</td></tr>
		 * 	<tr><td><br></td><td>qty05</td></tr>
		 * 	<tr><td><br></td><td>amt05</td></tr>
		 * 	<tr><td><br></td><td>std05</td></tr>
		 * 	<tr><td><br></td><td>qty06</td></tr>
		 * 	<tr><td><br></td><td>amt06</td></tr>
		 * 	<tr><td><br></td><td>std06</td></tr>
		 * 	<tr><td><br></td><td>qty07</td></tr>
		 * 	<tr><td><br></td><td>amt07</td></tr>
		 * 	<tr><td><br></td><td>std07</td></tr>
		 * 	<tr><td><br></td><td>qty08</td></tr>
		 * 	<tr><td><br></td><td>amt08</td></tr>
		 * 	<tr><td><br></td><td>std08</td></tr>
		 * 	<tr><td><br></td><td>qty09</td></tr>
		 * 	<tr><td><br></td><td>amt09</td></tr>
		 * 	<tr><td><br></td><td>std09</td></tr>
		 * 	<tr><td><br></td><td>qty10</td></tr>
		 * 	<tr><td><br></td><td>amt10</td></tr>
		 * 	<tr><td><br></td><td>std10</td></tr>
		 * 	<tr><td><br></td><td>qty11</td></tr>
		 * 	<tr><td><br></td><td>amt11</td></tr>
		 * 	<tr><td><br></td><td>std11</td></tr>
		 * 	<tr><td><br></td><td>qty12</td></tr>
		 * 	<tr><td><br></td><td>amt12</td></tr>
		 * 	<tr><td><br></td><td>std12</td></tr>
		 * 	<tr><td><br></td><td>qty13</td></tr>
		 * 	<tr><td><br></td><td>amt13</td></tr>
		 * 	<tr><td><br></td><td>std13</td></tr>
		 * 	<tr><td><br></td><td>qty14</td></tr>
		 * 	<tr><td><br></td><td>amt14</td></tr>
		 * 	<tr><td><br></td><td>std14</td></tr>
		 * 	<tr><td><br></td><td>qty15</td></tr>
		 * 	<tr><td><br></td><td>amt15</td></tr>
		 * 	<tr><td><br></td><td>std15</td></tr>
		 * 	<tr><td><br></td><td>qty16</td></tr>
		 * 	<tr><td><br></td><td>amt16</td></tr>
		 * 	<tr><td><br></td><td>std16</td></tr>
		 * 	<tr><td><br></td><td>qty17</td></tr>
		 * 	<tr><td><br></td><td>amt17</td></tr>
		 * 	<tr><td><br></td><td>std17</td></tr>
		 * 	<tr><td><br></td><td>qty18</td></tr>
		 * 	<tr><td><br></td><td>amt18</td></tr>
		 * 	<tr><td><br></td><td>std18</td></tr>
		 * 	<tr><td><br></td><td>qty19</td></tr>
		 * 	<tr><td><br></td><td>amt19</td></tr>
		 * 	<tr><td><br></td><td>std19</td></tr>
		 * 	<tr><td><br></td><td>qty20</td></tr>
		 * 	<tr><td><br></td><td>amt20</td></tr>
		 * 	<tr><td><br></td><td>std20</td></tr>
		 * 	<tr><td><br></td><td>qty21</td></tr>
		 * 	<tr><td><br></td><td>amt21</td></tr>
		 * 	<tr><td><br></td><td>std21</td></tr>
		 * 	<tr><td><br></td><td>qty22</td></tr>
		 * 	<tr><td><br></td><td>amt22</td></tr>
		 * 	<tr><td><br></td><td>std22</td></tr>
		 * 	<tr><td><br></td><td>qty23</td></tr>
		 * 	<tr><td><br></td><td>amt23</td></tr>
		 * 	<tr><td><br></td><td>std23</td></tr>
		 * 	<tr><td><br></td><td>qty24</td></tr>
		 * 	<tr><td><br></td><td>amt24</td></tr>
		 * 	<tr><td><br></td><td>std24</td></tr>
		 * 	<tr><td><br></td><td>qty25</td></tr>
		 * 	<tr><td><br></td><td>amt25</td></tr>
		 * 	<tr><td><br></td><td>std25</td></tr>
		 * 	<tr><td><br></td><td>qty26</td></tr>
		 * 	<tr><td><br></td><td>amt26</td></tr>
		 * 	<tr><td><br></td><td>std26</td></tr>
		 * 	<tr><td><br></td><td>qty27</td></tr>
		 * 	<tr><td><br></td><td>amt27</td></tr>
		 * 	<tr><td><br></td><td>std27</td></tr>
		 * 	<tr><td><br></td><td>qty28</td></tr>
		 * 	<tr><td><br></td><td>amt28</td></tr>
		 * 	<tr><td><br></td><td>std28</td></tr>
		 * 	<tr><td><br></td><td>qty29</td></tr>
		 * 	<tr><td><br></td><td>amt29</td></tr>
		 * 	<tr><td><br></td><td>std29</td></tr>
		 * 	<tr><td><br></td><td>qty30</td></tr>
		 * 	<tr><td><br></td><td>amt30</td></tr>
		 * 	<tr><td><br></td><td>std30</td></tr>
		 * 	<tr><td><br></td><td>diff_qty</td></tr>
		 * 	<tr><td><br></td><td>diff_amt</td></tr>
		 * 	<tr><td><br></td><td>diff_std</td></tr>
		 * 	<tr><td><br></td><td>ave_tgt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0260.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>io_col_cd</td></tr>
		 * 	<tr><td><br></td><td>io_col_nm</td></tr>
		 * 	<tr><td><br></td><td>io_seq</td></tr>
		 * 	<tr><td><br></td><td>io_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_flg</td></tr>
		 * 	<tr><td><br></td><td>qty_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_flg</td></tr>
		 * 	<tr><td><br></td><td>std_flg</td></tr>
		 * 	<tr><td><br></td><td>diff_flg</td></tr>
		 * 	<tr><td><br></td><td>fg_r</td></tr>
		 * 	<tr><td><br></td><td>fg_g</td></tr>
		 * 	<tr><td><br></td><td>fg_b</td></tr>
		 * 	<tr><td><br></td><td>bg_r</td></tr>
		 * 	<tr><td><br></td><td>bg_g</td></tr>
		 * 	<tr><td><br></td><td>bg_b</td></tr>
		 * 	<tr><td><br></td><td>ac_slip_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBF.MGBFL0260.Srch01_MstrR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBFL_CostIoSrch)MGBFL_CostIoSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}