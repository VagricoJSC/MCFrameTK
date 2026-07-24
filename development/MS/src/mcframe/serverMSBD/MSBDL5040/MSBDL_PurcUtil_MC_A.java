package mcframe.serverMSBD.MSBDL5040;

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
 * "MSBDL_PurcUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcUtil_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcUtil.PurcUtil_Srch01 aPurcUtil_Srch01;

	protected void initPurcUtil_Srch01() {
		this.info = PDef.MS_MSBDL5040_PurcUtil_Srch01_INFO;
		this.aPurcUtil_Srch01 = ((MSBDL_PurcUtil)this).new PurcUtil_Srch01();
	}

	public static MSBDL_PurcUtil.PurcUtil_Srch01 crtPurcUtil_Srch01() {
		MSBDL_PurcUtil lgc = new MSBDL_PurcUtil();
		lgc.initPurcUtil_Srch01();
		return lgc.aPurcUtil_Srch01;
	}

	protected void paramPurcUtil_Srch01(MCParam p) {
		if (this.aPurcUtil_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcUtil_Srch01.up0());
		p.addDownBlock(aPurcUtil_Srch01.down0());
	}

	protected void doPurcUtil_Srch01() {
		aPurcUtil_Srch01.call();
	};

	/**
	 * PurcUtil_Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR createPurcUtil_Srch01_DtlR(){
		return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR.create();
	}

	/**
	 * PurcUtil_Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR> createPurcUtil_Srch01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR.class);
	}
	protected MSBDL_PurcUtil.PurcUtil_Srch02 aPurcUtil_Srch02;

	protected void initPurcUtil_Srch02() {
		this.info = PDef.MS_MSBDL5040_PurcUtil_Srch02_INFO;
		this.aPurcUtil_Srch02 = ((MSBDL_PurcUtil)this).new PurcUtil_Srch02();
	}

	public static MSBDL_PurcUtil.PurcUtil_Srch02 crtPurcUtil_Srch02() {
		MSBDL_PurcUtil lgc = new MSBDL_PurcUtil();
		lgc.initPurcUtil_Srch02();
		return lgc.aPurcUtil_Srch02;
	}

	protected void paramPurcUtil_Srch02(MCParam p) {
		if (this.aPurcUtil_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcUtil_Srch02.up0());
		p.addDownBlock(aPurcUtil_Srch02.down0());
	}

	protected void doPurcUtil_Srch02() {
		aPurcUtil_Srch02.call();
	};

	/**
	 * PurcUtil_Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR createPurcUtil_Srch02_DtlR(){
		return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR.create();
	}

	/**
	 * PurcUtil_Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR> createPurcUtil_Srch02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR.class);
	}
	protected MSBDL_PurcUtil.PurcUtil_Srch03 aPurcUtil_Srch03;

	protected void initPurcUtil_Srch03() {
		this.info = PDef.MS_MSBDL5040_PurcUtil_Srch03_INFO;
		this.aPurcUtil_Srch03 = ((MSBDL_PurcUtil)this).new PurcUtil_Srch03();
	}

	public static MSBDL_PurcUtil.PurcUtil_Srch03 crtPurcUtil_Srch03() {
		MSBDL_PurcUtil lgc = new MSBDL_PurcUtil();
		lgc.initPurcUtil_Srch03();
		return lgc.aPurcUtil_Srch03;
	}

	protected void paramPurcUtil_Srch03(MCParam p) {
		if (this.aPurcUtil_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcUtil_Srch03.up0());
		p.addDownBlock(aPurcUtil_Srch03.down0());
	}

	protected void doPurcUtil_Srch03() {
		aPurcUtil_Srch03.call();
	};

	/**
	 * PurcUtil_Srch03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR createPurcUtil_Srch03_DtlR(){
		return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR.create();
	}

	/**
	 * PurcUtil_Srch03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR> createPurcUtil_Srch03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR.class);
	}
	protected MSBDL_PurcUtil.PurcUtil_Srch04 aPurcUtil_Srch04;

	protected void initPurcUtil_Srch04() {
		this.info = PDef.MS_MSBDL5040_PurcUtil_Srch04_INFO;
		this.aPurcUtil_Srch04 = ((MSBDL_PurcUtil)this).new PurcUtil_Srch04();
	}

	public static MSBDL_PurcUtil.PurcUtil_Srch04 crtPurcUtil_Srch04() {
		MSBDL_PurcUtil lgc = new MSBDL_PurcUtil();
		lgc.initPurcUtil_Srch04();
		return lgc.aPurcUtil_Srch04;
	}

	protected void paramPurcUtil_Srch04(MCParam p) {
		if (this.aPurcUtil_Srch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcUtil_Srch04.up0());
		p.addDownBlock(aPurcUtil_Srch04.down0());
	}

	protected void doPurcUtil_Srch04() {
		aPurcUtil_Srch04.call();
	};

	/**
	 * PurcUtil_Srch04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR createPurcUtil_Srch04_DtlR(){
		return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR.create();
	}

	/**
	 * PurcUtil_Srch04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR> createPurcUtil_Srch04_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcUtil_Srch01オペレーション.<p>
	 *
	 * 各予定日を取得する<br>
	 */
	abstract public class PurcUtil_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcUtil_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcUtil_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR.class);

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
			invoke((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcUtil_Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR createPurcUtil_Srch01_DtlR(){
			return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR.create();
		}

		/**
		 * PurcUtil_Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR> createPurcUtil_Srch01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this).info;
		}


	}
	/**
	 * PurcUtil_Srch02オペレーション.<p>
	 *
	 * 購買単価、加工単価、有償支給単価を取得する。<br>
	 */
	abstract public class PurcUtil_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcUtil_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcUtil_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR.class);

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
			invoke((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcUtil_Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR createPurcUtil_Srch02_DtlR(){
			return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR.create();
		}

		/**
		 * PurcUtil_Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR> createPurcUtil_Srch02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>grp_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>outsrc_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>itmdtl_base_dt</td></tr>
		 * 	<tr><td><br></td><td>not_add_up_qty_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this).info;
		}


	}
	/**
	 * PurcUtil_Srch03オペレーション.<p>
	 *
	 * 納品先情報を取得します<br>
	 */
	abstract public class PurcUtil_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcUtil_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcUtil_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR.class);

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
			invoke((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcUtil_Srch03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR createPurcUtil_Srch03_DtlR(){
			return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR.create();
		}

		/**
		 * PurcUtil_Srch03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR> createPurcUtil_Srch03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>in_to_loc_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch03_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this).info;
		}


	}
	/**
	 * PurcUtil_Srch04オペレーション.<p>
	 *
	 * 購買状況区分を取得する。<br>
	 */
	abstract public class PurcUtil_Srch04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcUtil_Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR> down0;
		
		
		// コンストラクタ
		protected PurcUtil_Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR.class);

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
			invoke((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcUtil_Srch04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR createPurcUtil_Srch04_DtlR(){
			return mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR.create();
		}

		/**
		 * PurcUtil_Srch04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR> createPurcUtil_Srch04_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5040.PurcUtil_Srch04_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcUtil)MSBDL_PurcUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}