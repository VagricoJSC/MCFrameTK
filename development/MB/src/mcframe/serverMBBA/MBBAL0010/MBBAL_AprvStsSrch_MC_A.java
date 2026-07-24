package mcframe.serverMBBA.MBBAL0010;

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
 * "MBBAL_AprvStsSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBAL_AprvStsSrch_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBA";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBAL0010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBAL_AprvStsSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBAL0010_Srch01_INFO;
		this.aSrch01 = ((MBBAL_AprvStsSrch)this).new Srch01();
	}

	public static MBBAL_AprvStsSrch.Srch01 crtSrch01() {
		MBBAL_AprvStsSrch lgc = new MBBAL_AprvStsSrch();
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
	 * Srch01_Cnd1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R createSrch01_Cnd1R(){
		return mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R.create();
	}

	/**
	 * Srch01_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R createSrch01_Hdr1R(){
		return mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R.create();
	}

	/**
	 * Srch01_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> createSrch01_Hdr1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R.class);
	}

	/**
	 * Srch01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R createSrch01_Dtl1R(){
		return mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R.create();
	}

	/**
	 * Srch01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> createSrch01_Dtl1L(){
		return MCList.create(mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 承認状況を確認する。<br>
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
		private final mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R.create();
			down0 = MCList.create(mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R.class);

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
			invoke((MBBAL_AprvStsSrch)MBBAL_AprvStsSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_Cnd1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R createSrch01_Cnd1R(){
			return mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R.create();
		}

		/**
		 * Srch01_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R createSrch01_Hdr1R(){
			return mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R.create();
		}

		/**
		 * Srch01_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> createSrch01_Hdr1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R.class);
		}

		/**
		 * Srch01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R createSrch01_Dtl1R(){
			return mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R.create();
		}

		/**
		 * Srch01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> createSrch01_Dtl1L(){
			return MCList.create(mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ins_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ins_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ins_biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ins_biz_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_dtl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R
		 */
		public mcframe.serverMBBA.MBBAL0010.Srch01_Cnd1R up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>ins_dt</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>biz_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>src_ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_func_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>src_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>src_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>src_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>src_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>src_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>src_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm1</td></tr>
		 * 	<tr><td><br></td><td>src_amt1</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm2</td></tr>
		 * 	<tr><td><br></td><td>src_amt2</td></tr>
		 * 	<tr><td><br></td><td>src_cur_cd3</td></tr>
		 * 	<tr><td><br></td><td>src_cur_nm3</td></tr>
		 * 	<tr><td><br></td><td>src_amt3</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key1</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key2</td></tr>
		 * 	<tr><td><br></td><td>src_ext_key3</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no1</td></tr>
		 * 	<tr><td><br></td><td>aprv_src_no2</td></tr>
		 * 	<tr><td><br></td><td>next_opr_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_can_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
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
		public MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Hdr1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>hdr.aprv_no_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_seq</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_tm</td></tr>
		 * 	<tr><td><br></td><td>deputy_flg</td></tr>
		 * 	<tr><td><br></td><td>deputy_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>deputy_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>email1</td></tr>
		 * 	<tr><td><br></td><td>email2</td></tr>
		 * 	<tr><td><br></td><td>email3</td></tr>
		 * 	<tr><td><br></td><td>tel1</td></tr>
		 * 	<tr><td><br></td><td>tel2</td></tr>
		 * 	<tr><td><br></td><td>tel3</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBA.MBBAL0010.Srch01_Dtl1R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBAL_AprvStsSrch)MBBAL_AprvStsSrch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}