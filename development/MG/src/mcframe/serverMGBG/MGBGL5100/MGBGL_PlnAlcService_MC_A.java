package mcframe.serverMGBG.MGBGL5100;

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
 * "MGBGL_PlnAlcService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGL_PlnAlcService_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBGL5100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBGL_PlnAlcService.PlnAlc_Chk01 aPlnAlc_Chk01;

	protected void initPlnAlc_Chk01() {
		this.info = PDef.MG_MGBGL5100_PlnAlc_Chk01_INFO;
		this.aPlnAlc_Chk01 = ((MGBGL_PlnAlcService)this).new PlnAlc_Chk01();
	}

	public static MGBGL_PlnAlcService.PlnAlc_Chk01 crtPlnAlc_Chk01() {
		MGBGL_PlnAlcService lgc = new MGBGL_PlnAlcService();
		lgc.initPlnAlc_Chk01();
		return lgc.aPlnAlc_Chk01;
	}

	protected void paramPlnAlc_Chk01(MCParam p) {
		if (this.aPlnAlc_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnAlc_Chk01.up0());
		p.addDownBlock(aPlnAlc_Chk01.down0());
	}

	protected void doPlnAlc_Chk01() {
		aPlnAlc_Chk01.call();
	};

	/**
	 * PlnAlc_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR createPlnAlc_Chk01_CndR(){
		return mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
	}
	protected MGBGL_PlnAlcService.PlnAlc_Upd01 aPlnAlc_Upd01;

	protected void initPlnAlc_Upd01() {
		this.info = PDef.MG_MGBGL5100_PlnAlc_Upd01_INFO;
		this.aPlnAlc_Upd01 = ((MGBGL_PlnAlcService)this).new PlnAlc_Upd01();
	}

	public static MGBGL_PlnAlcService.PlnAlc_Upd01 crtPlnAlc_Upd01() {
		MGBGL_PlnAlcService lgc = new MGBGL_PlnAlcService();
		lgc.initPlnAlc_Upd01();
		return lgc.aPlnAlc_Upd01;
	}

	protected void paramPlnAlc_Upd01(MCParam p) {
		if (this.aPlnAlc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPlnAlc_Upd01.up0());
		p.addDownBlock(aPlnAlc_Upd01.down0());
	}

	protected void doPlnAlc_Upd01() {
		aPlnAlc_Upd01.call();
	};

	/**
	 * PlnAlc_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR createPlnAlc_Upd01_CndR(){
		return mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
	}

	/**
	 * PlnAlc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR createPlnAlc_Upd01_DtlR(){
		return mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PlnAlc_Chk01オペレーション.<p>
	 *
	 * 配賦費用計画作成前チェック<br>
	 */
	abstract public class PlnAlc_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnAlc_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR down0;
		
		
		// コンストラクタ
		protected PlnAlc_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
			down0 = mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();

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
			invoke((MGBGL_PlnAlcService)MGBGL_PlnAlcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PlnAlc_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR createPlnAlc_Chk01_CndR(){
			return mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PlnAlcService)MGBGL_PlnAlcService_MC_A.this).info;
		}


	}
	/**
	 * PlnAlc_Upd01オペレーション.<p>
	 *
	 * 配賦費用計画を作成する。<br>
	 */
	abstract public class PlnAlc_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PlnAlc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR down0;
		/** [PlnAlc_Upd01_Dtl]ブロックのコンテナField定義 */
		private final mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR aPlnAlc_Upd01_Dtl;
		
		
		// コンストラクタ
		protected PlnAlc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
			down0 = mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
			aPlnAlc_Upd01_Dtl = mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR.create();

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
			invoke((MGBGL_PlnAlcService)MGBGL_PlnAlcService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PlnAlc_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR createPlnAlc_Upd01_CndR(){
			return mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR.create();
		}

		/**
		 * PlnAlc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR createPlnAlc_Upd01_DtlR(){
			return mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_fr</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Chk01_CndR down0() {
			return down0;
		}


		/**
		 * [PlnAlc_Upd01_Dtl]ブロックのコンテナaPlnAlc_Upd01_DtlRを返します。
		 *
		 * @return PlnAlc_Upd01_DtlR
		 */
		public mcframe.serverMGBG.MGBGL5100.PlnAlc_Upd01_DtlR PlnAlc_Upd01_Dtl() {
			return aPlnAlc_Upd01_Dtl;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBGL_PlnAlcService)MGBGL_PlnAlcService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}