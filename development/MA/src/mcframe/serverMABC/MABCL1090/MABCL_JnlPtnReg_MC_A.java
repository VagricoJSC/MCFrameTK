package mcframe.serverMABC.MABCL1090;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_JnlPtnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_JnlPtnReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL1090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_JnlPtnReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL1090_Srch01_INFO;
		this.aSrch01 = ((MABCL_JnlPtnReg)this).new Srch01();
	}

	public static MABCL_JnlPtnReg.Srch01 crtSrch01() {
		MABCL_JnlPtnReg lgc = new MABCL_JnlPtnReg();
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
	public mcframe.serverMABC.MABCL1090.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL1090.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL1090.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL1090.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL1090.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL1090.Srch01_Rslt1R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL1090.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL1090.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_JNL_PTN_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_JNL_PTN_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_JNL_PTN_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_JNL_PTN_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_JNL_PTN_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL1090.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL1090.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_JNL_PTN_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_JNL_PTN_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_JNL_PTN_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
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
			invoke((MABCL_JnlPtnReg)MABCL_JnlPtnReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1090.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL1090.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL1090.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL1090.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL1090.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL1090.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>jnl_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL1090.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL1090.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>jnl_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>jnl_seq</td></tr>
		 * 	<tr><td><br></td><td>dr_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>dr_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>dr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dr_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cr_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>cr_ptn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>cr_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dr_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_sub_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>dr_sub_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>cr_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_sub_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>cr_sub_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_ac_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>dr_ac_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_ac_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>cr_ac_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_bp_typ</td></tr>
		 * 	<tr><td><br></td><td>dr_bp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>dr_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_bp_typ</td></tr>
		 * 	<tr><td><br></td><td>cr_bp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>cr_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>dr_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>cr_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_trd_sml_flg</td></tr>
		 * 	<tr><td><br></td><td>cr_trd_sml_flg</td></tr>
		 * 	<tr><td><br></td><td>minus_flg</td></tr>
		 * 	<tr><td><br></td><td>dr_amt_typ</td></tr>
		 * 	<tr><td><br></td><td>dr_amt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_amt_typ</td></tr>
		 * 	<tr><td><br></td><td>cr_amt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>un_fix_typ</td></tr>
		 * 	<tr><td><br></td><td>un_fix_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>foreign_typ</td></tr>
		 * 	<tr><td><br></td><td>foreign_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>cur_nm</td></tr>
		 * 	<tr><td><br></td><td>asst_typ</td></tr>
		 * 	<tr><td><br></td><td>asst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>inv_loc_typ</td></tr>
		 * 	<tr><td><br></td><td>inv_loc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>amt_sign_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_sign_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>jnl_key1</td></tr>
		 * 	<tr><td><br></td><td>jnl_key2</td></tr>
		 * 	<tr><td><br></td><td>jnl_key3</td></tr>
		 * 	<tr><td><br></td><td>jnl_key4</td></tr>
		 * 	<tr><td><br></td><td>jnl_key5</td></tr>
		 * 	<tr><td><br></td><td>jnl_key6</td></tr>
		 * 	<tr><td><br></td><td>jnl_key7</td></tr>
		 * 	<tr><td><br></td><td>jnl_key8</td></tr>
		 * 	<tr><td><br></td><td>jnl_key9</td></tr>
		 * 	<tr><td><br></td><td>jnl_key10</td></tr>
		 * 	<tr><td><br></td><td>carry_flg</td></tr>
		 * 	<tr><td><br></td><td>dr_abs_typ</td></tr>
		 * 	<tr><td><br></td><td>dr_abs_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dr_abstract</td></tr>
		 * 	<tr><td><br></td><td>cr_abs_typ</td></tr>
		 * 	<tr><td><br></td><td>cr_abs_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cr_abstract</td></tr>
		 * 	<tr><td><br></td><td>mon01_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon02_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon03_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon04_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon05_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon06_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon07_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon08_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon09_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon10_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon11_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>mon12_invalid_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL1090.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_JnlPtnReg)MABCL_JnlPtnReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL1090.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_JNL_PTN_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("jnl_ptn_cd", "jnl_ptn_cd");
				addColumnPathMap("jnl_ptn_nm", "jnl_ptn_nm");
				addColumnPathMap("jnl_seq", "jnl_seq");
				addColumnPathMap("dr_dpt_typ", "dr_dpt_typ");
				addColumnPathMap("dr_dpt_cd", "dr_dpt_cd");
				addColumnPathMap("dr_ptn_typ", "dr_ptn_typ");
				addColumnPathMap("dr_grp_cd", "dr_grp_cd");
				addColumnPathMap("dr_grp_nm", "dr_grp_nm");
				addColumnPathMap("cr_dpt_typ", "cr_dpt_typ");
				addColumnPathMap("cr_dpt_cd", "cr_dpt_cd");
				addColumnPathMap("cr_ptn_typ", "cr_ptn_typ");
				addColumnPathMap("cr_grp_cd", "cr_grp_cd");
				addColumnPathMap("cr_grp_nm", "cr_grp_nm");
				addColumnPathMap("dr_ac_cd", "dr_ac_cd");
				addColumnPathMap("dr_ac_nm", "dr_ac_nm");
				addColumnPathMap("dr_sub_ac_cd", "dr_sub_ac_cd");
				addColumnPathMap("dr_sub_ac_nm", "dr_sub_ac_nm");
				addColumnPathMap("cr_ac_cd", "cr_ac_cd");
				addColumnPathMap("cr_ac_nm", "cr_ac_nm");
				addColumnPathMap("cr_sub_ac_cd", "cr_sub_ac_cd");
				addColumnPathMap("cr_sub_ac_nm", "cr_sub_ac_nm");
				addColumnPathMap("dr_ac_tax_cd", "dr_ac_tax_cd");
				addColumnPathMap("dr_ac_tax_nm", "dr_ac_tax_nm");
				addColumnPathMap("cr_ac_tax_cd", "cr_ac_tax_cd");
				addColumnPathMap("cr_ac_tax_nm", "cr_ac_tax_nm");
				addColumnPathMap("dr_bp_typ", "dr_bp_typ");
				addColumnPathMap("dr_bp_cd", "dr_bp_cd");
				addColumnPathMap("dr_bp_nm", "dr_bp_nm");
				addColumnPathMap("cr_bp_typ", "cr_bp_typ");
				addColumnPathMap("cr_bp_cd", "cr_bp_cd");
				addColumnPathMap("cr_bp_nm", "cr_bp_nm");
				addColumnPathMap("dr_itm_typ", "dr_itm_typ");
				addColumnPathMap("cr_itm_typ", "cr_itm_typ");
				addColumnPathMap("dr_trd_sml_flg", "dr_trd_sml_flg");
				addColumnPathMap("cr_trd_sml_flg", "cr_trd_sml_flg");
				addColumnPathMap("minus_flg", "minus_flg");
				addColumnPathMap("dr_amt_typ", "dr_amt_typ");
				addColumnPathMap("cr_amt_typ", "cr_amt_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("itm_jnl_nm", "itm_jnl_nm");
				addColumnPathMap("ac_rsn_cd", "ac_rsn_cd");
				addColumnPathMap("ac_rsn_nm", "ac_rsn_nm");
				addColumnPathMap("purc_typ", "purc_typ");
				addColumnPathMap("un_fix_typ", "un_fix_typ");
				addColumnPathMap("foreign_typ", "foreign_typ");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("cur_nm", "cur_nm");
				addColumnPathMap("asst_typ", "asst_typ");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("inv_loc_typ", "inv_loc_typ");
				addColumnPathMap("amt_sign_typ", "amt_sign_typ");
				addColumnPathMap("jnl_key1", "jnl_key1");
				addColumnPathMap("jnl_key2", "jnl_key2");
				addColumnPathMap("jnl_key3", "jnl_key3");
				addColumnPathMap("jnl_key4", "jnl_key4");
				addColumnPathMap("jnl_key5", "jnl_key5");
				addColumnPathMap("jnl_key6", "jnl_key6");
				addColumnPathMap("jnl_key7", "jnl_key7");
				addColumnPathMap("jnl_key8", "jnl_key8");
				addColumnPathMap("jnl_key9", "jnl_key9");
				addColumnPathMap("jnl_key10", "jnl_key10");
				addColumnPathMap("carry_flg", "carry_flg");
				addColumnPathMap("dr_abs_typ", "dr_abs_typ");
				addColumnPathMap("dr_abstract", "dr_abstract");
				addColumnPathMap("cr_abs_typ", "cr_abs_typ");
				addColumnPathMap("cr_abstract", "cr_abstract");
				addColumnPathMap("mon01_invalid_flg", "mon01_invalid_flg");
				addColumnPathMap("mon02_invalid_flg", "mon02_invalid_flg");
				addColumnPathMap("mon03_invalid_flg", "mon03_invalid_flg");
				addColumnPathMap("mon04_invalid_flg", "mon04_invalid_flg");
				addColumnPathMap("mon05_invalid_flg", "mon05_invalid_flg");
				addColumnPathMap("mon06_invalid_flg", "mon06_invalid_flg");
				addColumnPathMap("mon07_invalid_flg", "mon07_invalid_flg");
				addColumnPathMap("mon08_invalid_flg", "mon08_invalid_flg");
				addColumnPathMap("mon09_invalid_flg", "mon09_invalid_flg");
				addColumnPathMap("mon10_invalid_flg", "mon10_invalid_flg");
				addColumnPathMap("mon11_invalid_flg", "mon11_invalid_flg");
				addColumnPathMap("mon12_invalid_flg", "mon12_invalid_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL1090.Srch01_Rslt1R r_dest, MAM_JNL_PTN_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL1090.Srch01_Rslt1R> dest, MCList<MAM_JNL_PTN_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_JNL_PTN_R r_src : src){
				mcframe.serverMABC.MABCL1090.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}