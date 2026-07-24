package mcframe.serverMBBE.MBBEL0030;

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
 * "MBBEL_BizDatDL"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBEL_BizDatDL_MC_A extends mcframe.serverMBUD.MBUDL5010.MBUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MBBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MBBEL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MBBEL_BizDatDL.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MB_MBBEL0030_Srch01_INFO;
		this.aSrch01 = ((MBBEL_BizDatDL)this).new Srch01();
	}

	public static MBBEL_BizDatDL.Srch01 crtSrch01() {
		MBBEL_BizDatDL lgc = new MBBEL_BizDatDL();
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
	public mcframe.serverMBBE.MBBEL0030.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMBBE.MBBEL0030.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMBBE.MBBEL0030.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMBBE.MBBEL0030.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMBBE.MBBEL0030.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMBBE.MBBEL0030.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務データを検索する<br>
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
		private final mcframe.serverMBBE.MBBEL0030.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMBBE.MBBEL0030.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMBBE.MBBEL0030.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMBBE.MBBEL0030.Srch01_RsltR.class);

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
			invoke((MBBEL_BizDatDL)MBBEL_BizDatDL_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0030.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMBBE.MBBEL0030.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMBBE.MBBEL0030.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMBBE.MBBEL0030.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMBBE.MBBEL0030.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMBBE.MBBEL0030.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>res_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMBBE.MBBEL0030.Srch01_CndR
		 */
		public mcframe.serverMBBE.MBBEL0030.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>biz_dat_id</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_nm</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_get_typ</td></tr>
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
		 * 	<tr><td><br></td><td>str_cnd_list</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>biz_dat_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>form_file_nm</td></tr>
		 * 	<tr><td><br></td><td>cartridge</td></tr>
		 * 	<tr><td><br></td><td>print_flg</td></tr>
		 * 	<tr><td><br></td><td>dwnld_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col1</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col2</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col3</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col4</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col5</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col6</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col7</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col8</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col9</td></tr>
		 * 	<tr><td><br></td><td>dt_cond_col10</td></tr>
		 * 	<tr><td><br></td><td>str_cond_col1</td></tr>
		 * 	<tr><td><br></td><td>str_cond_col2</td></tr>
		 * 	<tr><td><br></td><td>str_cond_col3</td></tr>
		 * 	<tr><td><br></td><td>str_cond_col4</td></tr>
		 * 	<tr><td><br></td><td>str_cond_col5</td></tr>
		 * 	<tr><td><br></td><td>num_cond_col1</td></tr>
		 * 	<tr><td><br></td><td>num_cond_col2</td></tr>
		 * 	<tr><td><br></td><td>num_cond_col3</td></tr>
		 * 	<tr><td><br></td><td>num_cond_col4</td></tr>
		 * 	<tr><td><br></td><td>num_cond_col5</td></tr>
		 * 	<tr><td><br></td><td>flg_cond_col1</td></tr>
		 * 	<tr><td><br></td><td>flg_cond_col2</td></tr>
		 * 	<tr><td><br></td><td>flg_cond_col3</td></tr>
		 * 	<tr><td><br></td><td>flg_cond_col4</td></tr>
		 * 	<tr><td><br></td><td>flg_cond_col5</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl1</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl2</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl3</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl4</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl5</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl6</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl7</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl8</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl9</td></tr>
		 * 	<tr><td><br></td><td>dt_lbl10</td></tr>
		 * 	<tr><td><br></td><td>str_lbl1</td></tr>
		 * 	<tr><td><br></td><td>str_lbl2</td></tr>
		 * 	<tr><td><br></td><td>str_lbl3</td></tr>
		 * 	<tr><td><br></td><td>str_lbl4</td></tr>
		 * 	<tr><td><br></td><td>str_lbl5</td></tr>
		 * 	<tr><td><br></td><td>num_lbl1</td></tr>
		 * 	<tr><td><br></td><td>num_lbl2</td></tr>
		 * 	<tr><td><br></td><td>num_lbl3</td></tr>
		 * 	<tr><td><br></td><td>num_lbl4</td></tr>
		 * 	<tr><td><br></td><td>num_lbl5</td></tr>
		 * 	<tr><td><br></td><td>flg_lbl1</td></tr>
		 * 	<tr><td><br></td><td>flg_lbl2</td></tr>
		 * 	<tr><td><br></td><td>flg_lbl3</td></tr>
		 * 	<tr><td><br></td><td>flg_lbl4</td></tr>
		 * 	<tr><td><br></td><td>flg_lbl5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMBBE.MBBEL0030.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MBBEL_BizDatDL)MBBEL_BizDatDL_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}