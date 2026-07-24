package mcframe.serverMABS.MABSL0200;

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
 * "MABSL_LotInhLst"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_LotInhLst_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABSL0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_LotInhLst.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0200_Srch01_INFO;
		this.aSrch01 = ((MABSL_LotInhLst)this).new Srch01();
	}

	public static MABSL_LotInhLst.Srch01 crtSrch01() {
		MABSL_LotInhLst lgc = new MABSL_LotInhLst();
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
	public mcframe.serverMABS.MABSL0200.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0200.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0200.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABS.MABSL0200.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0200.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL0200.Srch01_Rslt1R.class);
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
		private final mcframe.serverMABS.MABSL0200.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0200.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_DEST_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_DEST_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_LOT_INH_DEST_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_DEST_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_LOT_INH_DEST_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0200.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0200.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_LOT_INH_DEST_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_LOT_INH_DEST_R>)c0.down(0);

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
		 * MCList&lt;MAM_LOT_INH_DEST_R&gt;（{@link #c0_down0}）=> down0()<br>
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
			invoke((MABSL_LotInhLst)MABSL_LotInhLst_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0200.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0200.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0200.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABS.MABSL0200.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0200.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL0200.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_memo1</td></tr>
		 * 	<tr><td><br></td><td>dest_memo2</td></tr>
		 * 	<tr><td><br></td><td>dest_memo3</td></tr>
		 * 	<tr><td><br></td><td>src_memo1</td></tr>
		 * 	<tr><td><br></td><td>src_memo2</td></tr>
		 * 	<tr><td><br></td><td>src_memo3</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0200.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0200.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col_nm</td></tr>
		 * 	<tr><td><br></td><td>overflow_err_flg</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>dest_memo1</td></tr>
		 * 	<tr><td><br></td><td>dest_memo2</td></tr>
		 * 	<tr><td><br></td><td>dest_memo3</td></tr>
		 * 	<tr><td><br></td><td>src_memo1</td></tr>
		 * 	<tr><td><br></td><td>src_memo2</td></tr>
		 * 	<tr><td><br></td><td>src_memo3</td></tr>
		 * 	<tr><td><br></td><td>dest_ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>dest_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_ins_ts</td></tr>
		 * 	<tr><td><br></td><td>dest_ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>dest_ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_ts</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>dest_del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>dest_del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_del_ts</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>src_ins_ts</td></tr>
		 * 	<tr><td><br></td><td>src_ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>src_ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>src_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>src_upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>src_upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>src_upd_ts</td></tr>
		 * 	<tr><td><br></td><td>src_upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>src_upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>src_upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>src_del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>src_del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>src_del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0200.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhLst)MABSL_LotInhLst_MC_A.this).info;
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
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0200.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_LOT_INH_DEST_R> src0_0){
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("par_itm_nm", "par_itm_nm");
				addColumnPathMap("par_itm_typ", "par_itm_typ");
				addColumnPathMap("par_itm_typ_d_cd", "par_itm_typ_d_cd");
				addColumnPathMap("par_itm_typ_d_nm", "par_itm_typ_d_nm");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("lot_inh_typ", "lot_inh_typ");
				addColumnPathMap("add_concat_col", "add_concat_col");
				addColumnPathMap("overflow_err_flg", "overflow_err_flg");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("chd_itm_nm", "chd_itm_nm");
				addColumnPathMap("chd_itm_typ", "chd_itm_typ");
				addColumnPathMap("chd_itm_typ_d_cd", "chd_itm_typ_d_cd");
				addColumnPathMap("chd_itm_typ_d_nm", "chd_itm_typ_d_nm");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("dest_memo1", "dest_memo1");
				addColumnPathMap("dest_memo2", "dest_memo2");
				addColumnPathMap("dest_memo3", "dest_memo3");
				addColumnPathMap("src_memo1", "src_memo1");
				addColumnPathMap("src_memo2", "src_memo2");
				addColumnPathMap("src_memo3", "src_memo3");
				addColumnPathMap("dest_ins_usr_id", "dest_ins_usr_id");
				addColumnPathMap("dest_ins_usr_nm", "dest_ins_usr_nm");
				addColumnPathMap("dest_ins_ts", "dest_ins_ts");
				addColumnPathMap("dest_ins_func_id", "dest_ins_func_id");
				addColumnPathMap("dest_upd_cntr", "dest_upd_cntr");
				addColumnPathMap("dest_upd_usr_id", "dest_upd_usr_id");
				addColumnPathMap("dest_upd_usr_nm", "dest_upd_usr_nm");
				addColumnPathMap("dest_upd_ts", "dest_upd_ts");
				addColumnPathMap("dest_upd_func_id", "dest_upd_func_id");
				addColumnPathMap("dest_upd_srv_req_no", "dest_upd_srv_req_no");
				addColumnPathMap("dest_del_usr_id", "dest_del_usr_id");
				addColumnPathMap("dest_del_usr_nm", "dest_del_usr_nm");
				addColumnPathMap("dest_del_ts", "dest_del_ts");
				addColumnPathMap("src_ins_usr_id", "src_ins_usr_id");
				addColumnPathMap("src_ins_usr_nm", "src_ins_usr_nm");
				addColumnPathMap("src_ins_ts", "src_ins_ts");
				addColumnPathMap("src_ins_func_id", "src_ins_func_id");
				addColumnPathMap("src_upd_cntr", "src_upd_cntr");
				addColumnPathMap("src_upd_usr_id", "src_upd_usr_id");
				addColumnPathMap("src_upd_usr_nm", "src_upd_usr_nm");
				addColumnPathMap("src_upd_ts", "src_upd_ts");
				addColumnPathMap("src_upd_func_id", "src_upd_func_id");
				addColumnPathMap("src_upd_srv_req_no", "src_upd_srv_req_no");
				addColumnPathMap("src_del_usr_id", "src_del_usr_id");
				addColumnPathMap("src_del_usr_nm", "src_del_usr_nm");
				addColumnPathMap("src_del_ts", "src_del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0200.Srch01_Rslt1R r_dest, MAM_LOT_INH_DEST_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0200.Srch01_Rslt1R> dest, MCList<MAM_LOT_INH_DEST_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_LOT_INH_DEST_R r_src : src){
				mcframe.serverMABS.MABSL0200.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}