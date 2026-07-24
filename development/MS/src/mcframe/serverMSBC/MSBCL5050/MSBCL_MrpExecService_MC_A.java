package mcframe.serverMSBC.MSBCL5050;

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
 * "MSBCL_MrpExecService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MrpExecService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MrpExecService.MRP_Upd01 aMRP_Upd01;

	protected void initMRP_Upd01() {
		this.info = PDef.MS_MSBCL5050_MRP_Upd01_INFO;
		this.aMRP_Upd01 = ((MSBCL_MrpExecService)this).new MRP_Upd01();
	}

	public static MSBCL_MrpExecService.MRP_Upd01 crtMRP_Upd01() {
		MSBCL_MrpExecService lgc = new MSBCL_MrpExecService();
		lgc.initMRP_Upd01();
		return lgc.aMRP_Upd01;
	}

	protected void paramMRP_Upd01(MCParam p) {
		if (this.aMRP_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMRP_Upd01.up0());
		p.addDownBlock(aMRP_Upd01.down0());
	}

	protected void doMRP_Upd01() {
		aMRP_Upd01.call();
	};

	/**
	 * Mrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR createMrp_Upd01_DtlR(){
		return mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.create();
	}

	/**
	 * Mrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR> createMrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.class);
	}
	protected MSBCL_MrpExecService.MRP_Upd02 aMRP_Upd02;

	protected void initMRP_Upd02() {
		this.info = PDef.MS_MSBCL5050_MRP_Upd02_INFO;
		this.aMRP_Upd02 = ((MSBCL_MrpExecService)this).new MRP_Upd02();
	}

	public static MSBCL_MrpExecService.MRP_Upd02 crtMRP_Upd02() {
		MSBCL_MrpExecService lgc = new MSBCL_MrpExecService();
		lgc.initMRP_Upd02();
		return lgc.aMRP_Upd02;
	}

	protected void paramMRP_Upd02(MCParam p) {
		if (this.aMRP_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMRP_Upd02.up0());
		p.addDownBlock(aMRP_Upd02.down0());
	}

	protected void doMRP_Upd02() {
		aMRP_Upd02.call();
	};

	/**
	 * Mrp_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR createMrp_Upd02_DtlR(){
		return mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.create();
	}
	protected MSBCL_MrpExecService.MRP_Upd03 aMRP_Upd03;

	protected void initMRP_Upd03() {
		this.info = PDef.MS_MSBCL5050_MRP_Upd03_INFO;
		this.aMRP_Upd03 = ((MSBCL_MrpExecService)this).new MRP_Upd03();
	}

	public static MSBCL_MrpExecService.MRP_Upd03 crtMRP_Upd03() {
		MSBCL_MrpExecService lgc = new MSBCL_MrpExecService();
		lgc.initMRP_Upd03();
		return lgc.aMRP_Upd03;
	}

	protected void paramMRP_Upd03(MCParam p) {
		if (this.aMRP_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMRP_Upd03.up0());
	}

	protected void doMRP_Upd03() {
		aMRP_Upd03.call();
	};

	/**
	 * Mrp_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR createMrp_Upd03_DtlR(){
		return mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR.create();
	}

	/**
	 * Mrp_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR> createMrp_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR.class);
	}

	/**
	 * Mrp_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR createMrp_Upd03_RsltR(){
		return mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR.create();
	}

	/**
	 * Mrp_Upd03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR> createMrp_Upd03_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MRP_Upd01オペレーション.<p>
	 *
	 * 所要量計算を実行する処理です。<br>
	 */
	abstract public class MRP_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MRP_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR> down0;
		
		
		// コンストラクタ
		protected MRP_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.class);

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
			invoke((MSBCL_MrpExecService)MSBCL_MrpExecService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Mrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR createMrp_Upd01_DtlR(){
			return mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.create();
		}

		/**
		 * Mrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR> createMrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_fr</td></tr>
		 * 	<tr><td><br></td><td>irqmt_fr</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>sch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_calc_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MrpExecService)MSBCL_MrpExecService_MC_A.this).info;
		}


	}
	/**
	 * MRP_Upd02オペレーション.<p>
	 *
	 * 納期回答用シミュレーションＭＲＰ後処理です。<br>
	 */
	abstract public class MRP_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MRP_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR down0;
		
		
		// コンストラクタ
		protected MRP_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.create();
			down0 = mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.create();

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
			invoke((MSBCL_MrpExecService)MSBCL_MrpExecService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Mrp_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR createMrp_Upd02_DtlR(){
			return mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>tree_lvl</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR
		 */
		public mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR
		 */
		public mcframe.serverMSBC.MSBCL5050.Mrp_Upd01_DtlR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MrpExecService)MSBCL_MrpExecService_MC_A.this).info;
		}


	}
	/**
	 * MRP_Upd03オペレーション.<p>
	 *
	 * 納期回答用シミュレーション結果登録<br>
	 */
	abstract public class MRP_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MRP_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR> up0;
		/** [Mrp_Upd03_Rslt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR> aMrp_Upd03_Rslt;
		
		
		// コンストラクタ
		protected MRP_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR.class);
			aMrp_Upd03_Rslt = MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MrpExecService)MSBCL_MrpExecService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Mrp_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR createMrp_Upd03_DtlR(){
			return mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR.create();
		}

		/**
		 * Mrp_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR> createMrp_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR.class);
		}

		/**
		 * Mrp_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR createMrp_Upd03_RsltR(){
			return mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR.create();
		}

		/**
		 * Mrp_Upd03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR> createMrp_Upd03_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>tree_lvl</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_DtlR> up0() {
			return up0;
		}



		/**
		 * [Mrp_Upd03_Rslt]ブロックのコンテナaMrp_Upd03_RsltLを返します。
		 *
		 * @return Mrp_Upd03_RsltL
		 */
		public MCList<mcframe.serverMSBC.MSBCL5050.Mrp_Upd03_RsltR> Mrp_Upd03_Rslt() {
			return aMrp_Upd03_Rslt;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MrpExecService)MSBCL_MrpExecService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}