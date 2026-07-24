package mcframe.serverMSBC.MSBCL5070;

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
 * "MSBCL_MlyRqmtRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MlyRqmtRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL5070";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MlyRqmtRegService.MlyRqmtReg_Chk01 aMlyRqmtReg_Chk01;

	protected void initMlyRqmtReg_Chk01() {
		this.info = PDef.MS_MSBCL5070_MlyRqmtReg_Chk01_INFO;
		this.aMlyRqmtReg_Chk01 = ((MSBCL_MlyRqmtRegService)this).new MlyRqmtReg_Chk01();
	}

	public static MSBCL_MlyRqmtRegService.MlyRqmtReg_Chk01 crtMlyRqmtReg_Chk01() {
		MSBCL_MlyRqmtRegService lgc = new MSBCL_MlyRqmtRegService();
		lgc.initMlyRqmtReg_Chk01();
		return lgc.aMlyRqmtReg_Chk01;
	}

	protected void paramMlyRqmtReg_Chk01(MCParam p) {
		if (this.aMlyRqmtReg_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMlyRqmtReg_Chk01.up0());
		p.addUpBlock(aMlyRqmtReg_Chk01.up1());
		p.addDownBlock(aMlyRqmtReg_Chk01.down0());
	}

	protected void doMlyRqmtReg_Chk01() {
		aMlyRqmtReg_Chk01.call();
	};

	/**
	 * MlyRqmtReg_Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR createMlyRqmtReg_Chk01_RsltR(){
		return mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.create();
	}

	/**
	 * MlyRqmtReg_Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> createMlyRqmtReg_Chk01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);
	}

	/**
	 * Rqmt_Chk01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR createRqmt_Chk01_CtrlR(){
		return mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR.create();
	}
	protected MSBCL_MlyRqmtRegService.MlyRqmtReg_Upd01 aMlyRqmtReg_Upd01;

	protected void initMlyRqmtReg_Upd01() {
		this.info = PDef.MS_MSBCL5070_MlyRqmtReg_Upd01_INFO;
		this.aMlyRqmtReg_Upd01 = ((MSBCL_MlyRqmtRegService)this).new MlyRqmtReg_Upd01();
	}

	public static MSBCL_MlyRqmtRegService.MlyRqmtReg_Upd01 crtMlyRqmtReg_Upd01() {
		MSBCL_MlyRqmtRegService lgc = new MSBCL_MlyRqmtRegService();
		lgc.initMlyRqmtReg_Upd01();
		return lgc.aMlyRqmtReg_Upd01;
	}

	protected void paramMlyRqmtReg_Upd01(MCParam p) {
		if (this.aMlyRqmtReg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMlyRqmtReg_Upd01.up0());
		p.addDownBlock(aMlyRqmtReg_Upd01.down0());
	}

	protected void doMlyRqmtReg_Upd01() {
		aMlyRqmtReg_Upd01.call();
	};

	/**
	 * MlyRqmtReg_Upd01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR createMlyRqmtReg_Upd01_RsltR(){
		return mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.create();
	}

	/**
	 * MlyRqmtReg_Upd01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> createMlyRqmtReg_Upd01_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MlyRqmtReg_Chk01オペレーション.<p>
	 *
	 */
	abstract public class MlyRqmtReg_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MlyRqmtReg_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected MlyRqmtReg_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);

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
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MlyRqmtRegService)MSBCL_MlyRqmtRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MlyRqmtReg_Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR createMlyRqmtReg_Chk01_RsltR(){
			return mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.create();
		}

		/**
		 * MlyRqmtReg_Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> createMlyRqmtReg_Chk01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);
		}

		/**
		 * Rqmt_Chk01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR createRqmt_Chk01_CtrlR(){
			return mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ym_key</td></tr>
		 * 	<tr><td><br></td><td>prod_ym</td></tr>
		 * 	<tr><td><br></td><td>prod_ym_key</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_key</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>no_dac_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL5070.Rqmt_Chk01_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ym_key</td></tr>
		 * 	<tr><td><br></td><td>prod_ym</td></tr>
		 * 	<tr><td><br></td><td>prod_ym_key</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd_key</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_key</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MlyRqmtRegService)MSBCL_MlyRqmtRegService_MC_A.this).info;
		}


	}
	/**
	 * MlyRqmtReg_Upd01オペレーション.<p>
	 *
	 */
	abstract public class MlyRqmtReg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MlyRqmtReg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected MlyRqmtReg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);

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
			invoke((MSBCL_MlyRqmtRegService)MSBCL_MlyRqmtRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MlyRqmtReg_Upd01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR createMlyRqmtReg_Upd01_RsltR(){
			return mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.create();
		}

		/**
		 * MlyRqmtReg_Upd01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> createMlyRqmtReg_Upd01_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ym_key</td></tr>
		 * 	<tr><td><br></td><td>prod_ym</td></tr>
		 * 	<tr><td><br></td><td>prod_ym_key</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_key</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>ym_key</td></tr>
		 * 	<tr><td><br></td><td>prod_ym</td></tr>
		 * 	<tr><td><br></td><td>prod_ym_key</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2_key</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3_key</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5070.MlyRqmtReg_Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MlyRqmtRegService)MSBCL_MlyRqmtRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}