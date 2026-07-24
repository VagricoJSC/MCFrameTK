package mcframe.serverMAUC.MAUCL1060;

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
 * "MAUCL_TrdUtil"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MAUCL_TrdUtil_MC_A extends mcframe.serverCore.logic.MCLogicBase {
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
	public static final String SUBMODULE_ID = "MAUC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MAUCL1060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MAUCL_TrdUtil.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MAUCL1060_Srch01_INFO;
		this.aSrch01 = ((MAUCL_TrdUtil)this).new Srch01();
	}

	public static MAUCL_TrdUtil.Srch01 crtSrch01() {
		MAUCL_TrdUtil lgc = new MAUCL_TrdUtil();
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
	 * DeftrdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL1060.DeftrdR createDeftrdR(){
		return mcframe.serverMAUC.MAUCL1060.DeftrdR.create();
	}
	protected MAUCL_TrdUtil.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MA_MAUCL1060_Srch02_INFO;
		this.aSrch02 = ((MAUCL_TrdUtil)this).new Srch02();
	}

	public static MAUCL_TrdUtil.Srch02 crtSrch02() {
		MAUCL_TrdUtil lgc = new MAUCL_TrdUtil();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * TrdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL1060.TrdR createTrdR(){
		return mcframe.serverMAUC.MAUCL1060.TrdR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * デフォルト取引ＣＤを取得します。<br>
	 */
	abstract public class Srch01 extends MCOperation {
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
		private final mcframe.serverMAUC.MAUCL1060.DeftrdR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL1060.DeftrdR down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL1060.DeftrdR.create();
			down0 = mcframe.serverMAUC.MAUCL1060.DeftrdR.create();

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
			invoke((MAUCL_TrdUtil)MAUCL_TrdUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * DeftrdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL1060.DeftrdR createDeftrdR(){
			return mcframe.serverMAUC.MAUCL1060.DeftrdR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL1060.DeftrdR
		 */
		public mcframe.serverMAUC.MAUCL1060.DeftrdR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL1060.DeftrdR
		 */
		public mcframe.serverMAUC.MAUCL1060.DeftrdR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_TrdUtil)MAUCL_TrdUtil_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 取引情報を取得します。<br>
	 */
	abstract public class Srch02 extends MCOperation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL1060.TrdR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMAUC.MAUCL1060.TrdR down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMAUC.MAUCL1060.TrdR.create();
			down0 = mcframe.serverMAUC.MAUCL1060.TrdR.create();

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
			invoke((MAUCL_TrdUtil)MAUCL_TrdUtil_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * TrdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL1060.TrdR createTrdR(){
			return mcframe.serverMAUC.MAUCL1060.TrdR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd.trd_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL1060.TrdR
		 */
		public mcframe.serverMAUC.MAUCL1060.TrdR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd.trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>trd.ac_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd.slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>trd.slip_form_cd</td></tr>
		 * 	<tr><td><br></td><td>trd.auto_adopt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd.memo1</td></tr>
		 * 	<tr><td><br></td><td>trd.memo2</td></tr>
		 * 	<tr><td><br></td><td>trd.memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMAUC.MAUCL1060.TrdR
		 */
		public mcframe.serverMAUC.MAUCL1060.TrdR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MAUCL_TrdUtil)MAUCL_TrdUtil_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}