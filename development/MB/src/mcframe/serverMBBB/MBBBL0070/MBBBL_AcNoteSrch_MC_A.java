package mcframe.serverMBBB.MBBBL0070;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMB.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MBBBL_AcNoteSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBL_AcNoteSrch_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBBL0070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBBL_AcNoteSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBBL0070_Srch01_INFO;
		this.aSrch01 = ((MBBBL_AcNoteSrch)this).new Srch01();
	}

	public static MBBBL_AcNoteSrch.Srch01 crtSrch01() {
		MBBBL_AcNoteSrch lgc = new MBBBL_AcNoteSrch();
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
	public mcframe.serverMBBB.MBBBL0070.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBB.MBBBL0070.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBB.MBBBL0070.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBB.MBBBL0070.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBB.MBBBL0070.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBB.MBBBL0070.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5030.MAUDL_RLSearcher {
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
		private final mcframe.serverMBBB.MBBBL0070.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBB.MBBBL0070.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MBT_AC_NOTE_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MBT_AC_NOTE_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MBT_AC_NOTE_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MBT_AC_NOTE_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MBT_AC_NOTE_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBB.MBBBL0070.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBB.MBBBL0070.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MBT_AC_NOTE_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MBT_AC_NOTE_R>)c0.down(0);

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
		 * MCList&lt;MBT_AC_NOTE_R&gt;（{@link #c0_down0}）=> down0()<br>
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
			invoke((MBBBL_AcNoteSrch)MBBBL_AcNoteSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL0070.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBB.MBBBL0070.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBB.MBBBL0070.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBB.MBBBL0070.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBB.MBBBL0070.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBB.MBBBL0070.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_ym_to</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBB.MBBBL0070.Srch01_CndR
		 */
		public mcframe.serverMBBB.MBBBL0070.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rcst_cd</td></tr>
		 * 	<tr><td><br></td><td>rcst_nm</td></tr>
		 * 	<tr><td><br></td><td>foreign_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_nm</td></tr>
		 * 	<tr><td><br></td><td>branch_cd</td></tr>
		 * 	<tr><td><br></td><td>branch_nm</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr1</td></tr>
		 * 	<tr><td><br></td><td>endrsr2</td></tr>
		 * 	<tr><td><br></td><td>endrsr3</td></tr>
		 * 	<tr><td><br></td><td>endrsr4</td></tr>
		 * 	<tr><td><br></td><td>endrsr5</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sub_char4</td></tr>
		 * 	<tr><td><br></td><td>sub_char5</td></tr>
		 * 	<tr><td><br></td><td>sub_char6</td></tr>
		 * 	<tr><td><br></td><td>sub_char7</td></tr>
		 * 	<tr><td><br></td><td>sub_char8</td></tr>
		 * 	<tr><td><br></td><td>sub_char9</td></tr>
		 * 	<tr><td><br></td><td>sub_char10</td></tr>
		 * 	<tr><td><br></td><td>sub_num1</td></tr>
		 * 	<tr><td><br></td><td>sub_num2</td></tr>
		 * 	<tr><td><br></td><td>sub_num3</td></tr>
		 * 	<tr><td><br></td><td>sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>fin_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_no</td></tr>
		 * 	<tr><td><br></td><td>slip_cnt_id</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBB.MBBBL0070.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBBL_AcNoteSrch)MBBBL_AcNoteSrch_MC_A.this).info;
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
		protected void down_SELECT(MCList<mcframe.serverMBBB.MBBBL0070.Srch01_RsltR> dest_Srch01_Rslt, MCList<MBT_AC_NOTE_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt, src0_0);
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
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("ac_ym", "ac_ym");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("note_rsn_cd", "note_rsn_cd");
				addColumnPathMap("note_rsn_nm", "note_rsn_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("rcst_cd", "rcst_cd");
				addColumnPathMap("rcst_nm", "rcst_nm");
				addColumnPathMap("foreign_flg", "foreign_flg");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("base_cur_nm", "base_cur_nm");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("trd_cur_nm", "trd_cur_nm");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("xrate_nm", "xrate_nm");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("note_no", "note_no");
				addColumnPathMap("note_typ", "note_typ");
				addColumnPathMap("draw_dt", "draw_dt");
				addColumnPathMap("due_dt", "due_dt");
				addColumnPathMap("bank_cd", "bank_cd");
				addColumnPathMap("bank_nm", "bank_nm");
				addColumnPathMap("branch_cd", "branch_cd");
				addColumnPathMap("branch_nm", "branch_nm");
				addColumnPathMap("drawer_nm", "drawer_nm");
				addColumnPathMap("endrsr1", "endrsr1");
				addColumnPathMap("endrsr2", "endrsr2");
				addColumnPathMap("endrsr3", "endrsr3");
				addColumnPathMap("endrsr4", "endrsr4");
				addColumnPathMap("endrsr5", "endrsr5");
				addColumnPathMap("accptr", "accptr");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sub_char4", "sub_char4");
				addColumnPathMap("sub_char5", "sub_char5");
				addColumnPathMap("sub_char6", "sub_char6");
				addColumnPathMap("sub_char7", "sub_char7");
				addColumnPathMap("sub_char8", "sub_char8");
				addColumnPathMap("sub_char9", "sub_char9");
				addColumnPathMap("sub_char10", "sub_char10");
				addColumnPathMap("sub_num1", "sub_num1");
				addColumnPathMap("sub_num2", "sub_num2");
				addColumnPathMap("sub_num3", "sub_num3");
				addColumnPathMap("sub_dt1", "sub_dt1");
				addColumnPathMap("sub_dt2", "sub_dt2");
				addColumnPathMap("sub_dt3", "sub_dt3");
				addColumnPathMap("fin_flg", "fin_flg");
				addColumnPathMap("proc_no", "proc_no");
				addColumnPathMap("slip_cnt_id", "slip_cnt_id");
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
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMBBB.MBBBL0070.Srch01_RsltR r_dest, MBT_AC_NOTE_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMBBB.MBBBL0070.Srch01_RsltR> dest, MCList<MBT_AC_NOTE_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MBT_AC_NOTE_R r_src : src){
				mcframe.serverMBBB.MBBBL0070.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}