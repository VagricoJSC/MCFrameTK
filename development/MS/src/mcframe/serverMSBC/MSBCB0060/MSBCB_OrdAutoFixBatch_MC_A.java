package mcframe.serverMSBC.MSBCB0060;

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
 * "MSBCB_OrdAutoFixBatch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCB_OrdAutoFixBatch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCB0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd01 aOrdAutoFix_Upd01;

	protected void initOrdAutoFix_Upd01() {
		this.info = PDef.MS_MSBCB0060_OrdAutoFix_Upd01_INFO;
		this.aOrdAutoFix_Upd01 = ((MSBCB_OrdAutoFixBatch)this).new OrdAutoFix_Upd01();
	}

	public static MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd01 crtOrdAutoFix_Upd01() {
		MSBCB_OrdAutoFixBatch lgc = new MSBCB_OrdAutoFixBatch();
		lgc.initOrdAutoFix_Upd01();
		return lgc.aOrdAutoFix_Upd01;
	}

	protected void paramOrdAutoFix_Upd01(MCParam p) {
		if (this.aOrdAutoFix_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdAutoFix_Upd01.up0());
	}

	protected void doOrdAutoFix_Upd01() {
		aOrdAutoFix_Upd01.call();
	};

	/**
	 * OrdAutoFix_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR createOrdAutoFix_Upd01_CndR(){
		return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR.create();
	}
	protected MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd02 aOrdAutoFix_Upd02;

	protected void initOrdAutoFix_Upd02() {
		this.info = PDef.MS_MSBCB0060_OrdAutoFix_Upd02_INFO;
		this.aOrdAutoFix_Upd02 = ((MSBCB_OrdAutoFixBatch)this).new OrdAutoFix_Upd02();
	}

	public static MSBCB_OrdAutoFixBatch.OrdAutoFix_Upd02 crtOrdAutoFix_Upd02() {
		MSBCB_OrdAutoFixBatch lgc = new MSBCB_OrdAutoFixBatch();
		lgc.initOrdAutoFix_Upd02();
		return lgc.aOrdAutoFix_Upd02;
	}

	protected void paramOrdAutoFix_Upd02(MCParam p) {
		if (this.aOrdAutoFix_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aOrdAutoFix_Upd02.up0());
		p.addUpBlock(aOrdAutoFix_Upd02.up1());
		p.addDownBlock(aOrdAutoFix_Upd02.down0());
	}

	protected void doOrdAutoFix_Upd02() {
		aOrdAutoFix_Upd02.call();
	};

	/**
	 * OrdAutoFix_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR createOrdAutoFix_Upd02_CndR(){
		return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR.create();
	}

	/**
	 * OrdAutoFix_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR createOrdAutoFix_Upd02_DtlR(){
		return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR.create();
	}

	/**
	 * OrdAutoFix_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR> createOrdAutoFix_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR.class);
	}

	/**
	 * OrdAutoFix_Upd02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR createOrdAutoFix_Upd02_RsltR(){
		return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * OrdAutoFix_Upd01オペレーション.<p>
	 *
	 * 品目オーダを自動確定する<br>
	 */
	abstract public class OrdAutoFix_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdAutoFix_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR up0;
		
		
		// コンストラクタ
		protected OrdAutoFix_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR.create();

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
			invoke((MSBCB_OrdAutoFixBatch)MSBCB_OrdAutoFixBatch_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * OrdAutoFix_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR createOrdAutoFix_Upd01_CndR(){
			return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_xfr_flg</td></tr>
		 * 	<tr><td><br></td><td>consider_holiday_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCB_OrdAutoFixBatch)MSBCB_OrdAutoFixBatch_MC_A.this).info;
		}


	}
	/**
	 * OrdAutoFix_Upd02オペレーション.<p>
	 *
	 */
	abstract public class OrdAutoFix_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "OrdAutoFix_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR down0;
		
		
		// コンストラクタ
		protected OrdAutoFix_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR.class);
			down0 = mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR.create();

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
			invoke((MSBCB_OrdAutoFixBatch)MSBCB_OrdAutoFixBatch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * OrdAutoFix_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR createOrdAutoFix_Upd02_CndR(){
			return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR.create();
		}

		/**
		 * OrdAutoFix_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR createOrdAutoFix_Upd02_DtlR(){
			return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR.create();
		}

		/**
		 * OrdAutoFix_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR> createOrdAutoFix_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR.class);
		}

		/**
		 * OrdAutoFix_Upd02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR createOrdAutoFix_Upd02_RsltR(){
			return mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>total_cnt</td></tr>
		 * 	<tr><td><br></td><td>success_cnt</td></tr>
		 * 	<tr><td><br></td><td>error_cnt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR
		 */
		public mcframe.serverMSBC.MSBCB0060.OrdAutoFix_Upd02_RsltR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCB_OrdAutoFixBatch)MSBCB_OrdAutoFixBatch_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}