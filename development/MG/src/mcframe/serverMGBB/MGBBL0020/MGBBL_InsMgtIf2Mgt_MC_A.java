package mcframe.serverMGBB.MGBBL0020;

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
 * "MGBBL_InsMgtIf2Mgt"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBBL_InsMgtIf2Mgt_MC_A extends mcframe.serverMGUD.MGUDL5010.MGUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MGBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MGBBL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MGBBL_InsMgtIf2Mgt.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MG_MGBBL0020_Srch01_INFO;
		this.aSrch01 = ((MGBBL_InsMgtIf2Mgt)this).new Srch01();
	}

	public static MGBBL_InsMgtIf2Mgt.Srch01 crtSrch01() {
		MGBBL_InsMgtIf2Mgt lgc = new MGBBL_InsMgtIf2Mgt();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addUpBlock(aSrch01.up1());
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
	public mcframe.serverMGBB.MGBBL0020.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMGBB.MGBBL0020.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMGBB.MGBBL0020.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0020.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0020.Srch01_RsltR.class);
	}
	protected MGBBL_InsMgtIf2Mgt.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MG_MGBBL0020_Srch02_INFO;
		this.aSrch02 = ((MGBBL_InsMgtIf2Mgt)this).new Srch02();
	}

	public static MGBBL_InsMgtIf2Mgt.Srch02 crtSrch02() {
		MGBBL_InsMgtIf2Mgt lgc = new MGBBL_InsMgtIf2Mgt();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addDownBlock(aSrch02.down0());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Srch01_CndR createSrch02_RsltR(){
		return mcframe.serverMGBB.MGBBL0020.Srch01_CndR.create();
	}
	protected MGBBL_InsMgtIf2Mgt.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MG_MGBBL0020_Ins01_INFO;
		this.aIns01 = ((MGBBL_InsMgtIf2Mgt)this).new Ins01();
	}

	public static MGBBL_InsMgtIf2Mgt.Ins01 crtIns01() {
		MGBBL_InsMgtIf2Mgt lgc = new MGBBL_InsMgtIf2Mgt();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createIns01_CndR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
	}

	/**
	 * Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createIns01_RsltR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
	}
	protected MGBBL_InsMgtIf2Mgt.Ins02 aIns02;

	protected void initIns02() {
		this.info = PDef.MG_MGBBL0020_Ins02_INFO;
		this.aIns02 = ((MGBBL_InsMgtIf2Mgt)this).new Ins02();
	}

	public static MGBBL_InsMgtIf2Mgt.Ins02 crtIns02() {
		MGBBL_InsMgtIf2Mgt lgc = new MGBBL_InsMgtIf2Mgt();
		lgc.initIns02();
		return lgc.aIns02;
	}

	protected void paramIns02(MCParam p) {
		if (this.aIns02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns02.up0());
		p.addUpBlock(aIns02.up1());
	}

	protected void doIns02() {
		aIns02.call();
	};

	/**
	 * Ins02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createIns02_CndR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
	}

	/**
	 * Ins02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createIns02_RsltR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
	}

	/**
	 * Ins02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createIns02_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
	}
	protected MGBBL_InsMgtIf2Mgt.Ins03 aIns03;

	protected void initIns03() {
		this.info = PDef.MG_MGBBL0020_Ins03_INFO;
		this.aIns03 = ((MGBBL_InsMgtIf2Mgt)this).new Ins03();
	}

	public static MGBBL_InsMgtIf2Mgt.Ins03 crtIns03() {
		MGBBL_InsMgtIf2Mgt lgc = new MGBBL_InsMgtIf2Mgt();
		lgc.initIns03();
		return lgc.aIns03;
	}

	protected void paramIns03(MCParam p) {
		if (this.aIns03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns03.up0());
		p.addUpBlock(aIns03.up1());
	}

	protected void doIns03() {
		aIns03.call();
	};

	/**
	 * Ins03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createIns03_CndR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
	}

	/**
	 * Ins03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createIns03_RsltR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
	}

	/**
	 * Ins03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createIns03_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
	}
	protected MGBBL_InsMgtIf2Mgt.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MG_MGBBL0020_Del01_INFO;
		this.aDel01 = ((MGBBL_InsMgtIf2Mgt)this).new Del01();
	}

	public static MGBBL_InsMgtIf2Mgt.Del01 crtDel01() {
		MGBBL_InsMgtIf2Mgt lgc = new MGBBL_InsMgtIf2Mgt();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createDel01_CndR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
	}

	/**
	 * Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createDel01_RsltR(){
		return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
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
		private final mcframe.serverMGBB.MGBBL0020.Srch01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0020.Srch01_RsltR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0020.Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0020.Srch01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBB.MGBBL0020.Srch01_RsltR.class);
			down0 = MCList.create(mcframe.serverMGBB.MGBBL0020.Srch01_RsltR.class);

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
			invoke((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMGBB.MGBBL0020.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMGBB.MGBBL0020.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0020.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0020.Srch01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0020.Srch01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_act_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Srch01_RsltR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_last_upd_dt</td></tr>
		 * 	<tr><td><br></td><td>last_upd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 確定情報検索処理をする<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0020.Srch01_CndR down0;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			down0 = mcframe.serverMGBB.MGBBL0020.Srch01_CndR.create();

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Srch01_CndR createSrch02_RsltR(){
			return mcframe.serverMGBB.MGBBL0020.Srch01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------

		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0020.Srch01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0020.Srch01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 作成処理をする<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createIns01_CndR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
		}

		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createIns01_RsltR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0020.Ins01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_data_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this).info;
		}


	}
	/**
	 * Ins02オペレーション.<p>
	 *
	 * 一括作成処理をする<br>
	 */
	abstract public class Ins02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1;
		
		
		// コンストラクタ
		protected Ins02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createIns02_CndR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
		}

		/**
		 * Ins02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createIns02_RsltR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
		}

		/**
		 * Ins02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createIns02_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>non_mov_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0020.Ins01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_data_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this).info;
		}


	}
	/**
	 * Ins03オペレーション.<p>
	 *
	 * 一括作成（再取込）処理をする<br>
	 */
	abstract public class Ins03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1;
		
		
		// コンストラクタ
		protected Ins03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Ins03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createIns03_CndR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
		}

		/**
		 * Ins03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createIns03_RsltR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
		}

		/**
		 * Ins03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createIns03_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>non_mov_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0020.Ins01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_data_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理をする<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
			up1 = MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR createDel01_CndR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_CndR.create();
		}

		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_RsltR createDel01_RsltR(){
			return mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMGBB.MGBBL0020.Ins01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>calc_ctg_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMGBB.MGBBL0020.Ins01_CndR
		 */
		public mcframe.serverMGBB.MGBBL0020.Ins01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>if_data_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMGBB.MGBBL0020.Ins01_RsltR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MGBBL_InsMgtIf2Mgt)MGBBL_InsMgtIf2Mgt_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}