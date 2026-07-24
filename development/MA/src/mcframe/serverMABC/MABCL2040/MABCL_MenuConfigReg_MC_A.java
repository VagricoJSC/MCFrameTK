package mcframe.serverMABC.MABCL2040;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_MenuConfigReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_MenuConfigReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL2040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_MenuConfigReg.MenuConfig_UpdChk01 aMenuConfig_UpdChk01;

	protected void initMenuConfig_UpdChk01() {
		this.info = PDef.MA_MABCL2040_MenuConfig_UpdChk01_INFO;
		this.aMenuConfig_UpdChk01 = ((MABCL_MenuConfigReg)this).new MenuConfig_UpdChk01();
	}

	public static MABCL_MenuConfigReg.MenuConfig_UpdChk01 crtMenuConfig_UpdChk01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
		lgc.initMenuConfig_UpdChk01();
		return lgc.aMenuConfig_UpdChk01;
	}

	protected void paramMenuConfig_UpdChk01(MCParam p) {
		if (this.aMenuConfig_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMenuConfig_UpdChk01.up0());
		p.addUpBlock(aMenuConfig_UpdChk01.up1());
	}

	protected void doMenuConfig_UpdChk01() {
		aMenuConfig_UpdChk01.call();
	};

	/**
	 * MenuConfig_UpdChk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_UpdChk01_HdrR(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
	}

	/**
	 * MenuConfig_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR createMenuConfig_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.create();
	}

	/**
	 * MenuConfig_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> createMenuConfig_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);
	}
	protected MABCL_MenuConfigReg.MenuConfig_Upd01 aMenuConfig_Upd01;

	protected void initMenuConfig_Upd01() {
		this.info = PDef.MA_MABCL2040_MenuConfig_Upd01_INFO;
		this.aMenuConfig_Upd01 = ((MABCL_MenuConfigReg)this).new MenuConfig_Upd01();
	}

	public static MABCL_MenuConfigReg.MenuConfig_Upd01 crtMenuConfig_Upd01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
		lgc.initMenuConfig_Upd01();
		return lgc.aMenuConfig_Upd01;
	}

	protected void paramMenuConfig_Upd01(MCParam p) {
		if (this.aMenuConfig_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMenuConfig_Upd01.up0());
		p.addUpBlock(aMenuConfig_Upd01.up1());
	}

	protected void doMenuConfig_Upd01() {
		aMenuConfig_Upd01.call();
	};

	/**
	 * MenuConfig_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_Upd01_HdrR(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
	}

	/**
	 * MenuConfig_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR createMenuConfig_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.create();
	}

	/**
	 * MenuConfig_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> createMenuConfig_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);
	}
	protected MABCL_MenuConfigReg.MenuConfig_DelChk01 aMenuConfig_DelChk01;

	protected void initMenuConfig_DelChk01() {
		this.info = PDef.MA_MABCL2040_MenuConfig_DelChk01_INFO;
		this.aMenuConfig_DelChk01 = ((MABCL_MenuConfigReg)this).new MenuConfig_DelChk01();
	}

	public static MABCL_MenuConfigReg.MenuConfig_DelChk01 crtMenuConfig_DelChk01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
		lgc.initMenuConfig_DelChk01();
		return lgc.aMenuConfig_DelChk01;
	}

	protected void paramMenuConfig_DelChk01(MCParam p) {
		if (this.aMenuConfig_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMenuConfig_DelChk01.up0());
	}

	protected void doMenuConfig_DelChk01() {
		aMenuConfig_DelChk01.call();
	};

	/**
	 * MenuConfig_DelChk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_DelChk01_HdrR(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
	}
	protected MABCL_MenuConfigReg.MenuConfig_Del01 aMenuConfig_Del01;

	protected void initMenuConfig_Del01() {
		this.info = PDef.MA_MABCL2040_MenuConfig_Del01_INFO;
		this.aMenuConfig_Del01 = ((MABCL_MenuConfigReg)this).new MenuConfig_Del01();
	}

	public static MABCL_MenuConfigReg.MenuConfig_Del01 crtMenuConfig_Del01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
		lgc.initMenuConfig_Del01();
		return lgc.aMenuConfig_Del01;
	}

	protected void paramMenuConfig_Del01(MCParam p) {
		if (this.aMenuConfig_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMenuConfig_Del01.up0());
	}

	protected void doMenuConfig_Del01() {
		aMenuConfig_Del01.call();
	};

	/**
	 * MenuConfig_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_Del01_HdrR(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
	}
	protected MABCL_MenuConfigReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL2040_Srch01_INFO;
		this.aSrch01 = ((MABCL_MenuConfigReg)this).new Srch01();
	}

	public static MABCL_MenuConfigReg.Srch01 crtSrch01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
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
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL2040.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL2040.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2040.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL2040.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.Srch01_Hdr1R createSrch01_Hdr1R(){
		return mcframe.serverMABC.MABCL2040.Srch01_Hdr1R.create();
	}
	protected MABCL_MenuConfigReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL2040_Del01_INFO;
		this.aDel01 = ((MABCL_MenuConfigReg)this).new Del01();
	}

	public static MABCL_MenuConfigReg.Del01 crtDel01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createDel01_Hdr1R(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
	}
	protected MABCL_MenuConfigReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL2040_Upd01_INFO;
		this.aUpd01 = ((MABCL_MenuConfigReg)this).new Upd01();
	}

	public static MABCL_MenuConfigReg.Upd01 crtUpd01() {
		MABCL_MenuConfigReg lgc = new MABCL_MenuConfigReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createUpd01_Hdr1R(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MenuConfig_UpdChk01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタを登録する前のチェックを行う<br>
	 */
	abstract public class MenuConfig_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MenuConfig_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> up1;
		
		
		// コンストラクタ
		protected MenuConfig_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);

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
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MenuConfig_UpdChk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_UpdChk01_HdrR(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
		}

		/**
		 * MenuConfig_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR createMenuConfig_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.create();
		}

		/**
		 * MenuConfig_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> createMenuConfig_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_no</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>scrn_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}


	}
	/**
	 * MenuConfig_Upd01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタを登録する<br>
	 */
	abstract public class MenuConfig_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MenuConfig_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> up1;
		
		
		// コンストラクタ
		protected MenuConfig_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);

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
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MenuConfig_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_Upd01_HdrR(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
		}

		/**
		 * MenuConfig_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR createMenuConfig_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.create();
		}

		/**
		 * MenuConfig_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> createMenuConfig_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_no</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>scrn_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}


	}
	/**
	 * MenuConfig_DelChk01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタを削除する前のチェックを行う<br>
	 */
	abstract public class MenuConfig_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MenuConfig_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0;
		
		
		// コンストラクタ
		protected MenuConfig_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();

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
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MenuConfig_DelChk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_DelChk01_HdrR(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}


	}
	/**
	 * MenuConfig_Del01オペレーション.<p>
	 *
	 * 原価メニュー構成マスタを削除する<br>
	 */
	abstract public class MenuConfig_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MenuConfig_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0;
		
		
		// コンストラクタ
		protected MenuConfig_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();

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
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MenuConfig_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createMenuConfig_Del01_HdrR(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}


	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL2040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2040.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2040.Srch01_Hdr1R down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MENU_CONFIG_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MENU_CONFIG_R&gt;<br>
		 * 第1 上りブロッククラス MAM_MENU_CONFIG_R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_MENU_CONFIG_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_MENU_CONFIG_R> c0;
		// 連携ロジック上り
		public final MAM_MENU_CONFIG_R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_MENU_CONFIG_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL2040.Srch01_Rslt1R.class);
			down1 = mcframe.serverMABC.MABCL2040.Srch01_Hdr1R.create();

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_MENU_CONFIG_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_MENU_CONFIG_R)c0.up(0);
			c0_down0 = (MCList<MAM_MENU_CONFIG_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_MENU_CONFIG_R （{@link #c0_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_MENU_CONFIG_R&gt;（{@link #c0_down0}）=> down0()<br>
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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL2040.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL2040.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2040.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL2040.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.Srch01_Hdr1R createSrch01_Hdr1R(){
			return mcframe.serverMABC.MABCL2040.Srch01_Hdr1R.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL2040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_no</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>scrn_id</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL2040.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>menu_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.Srch01_Hdr1R
		 */
		public mcframe.serverMABC.MABCL2040.Srch01_Hdr1R down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_MENU_CONFIG_R dest0_0, mcframe.serverMABC.MABCL2040.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_cd", "menu_cd");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_MENU_CONFIG_R dest, mcframe.serverMABC.MABCL2040.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL2040.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_MENU_CONFIG_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
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
				addColumnPathMap("menu_no", "menu_no");
				addColumnPathMap("module_id", "module_id");
				addColumnPathMap("scrn_id", "scrn_id");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL2040.Srch01_Rslt1R r_dest, MAM_MENU_CONFIG_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL2040.Srch01_Rslt1R> dest, MCList<MAM_MENU_CONFIG_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_MENU_CONFIG_R r_src : src){
				mcframe.serverMABC.MABCL2040.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
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
		private final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_DelChk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_Del01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_Del01 del01;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR chk01_up0;
		public final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.crtMenuConfig_DelChk01();
			del01 = mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.crtMenuConfig_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR)chk01.up(0);
			del01_up0 = (mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #chk01_up0}）<br>
		 * up0() => mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createDel01_Hdr1R(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest0_0, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest1_0, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR src_Del01_Hdr1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Hdr1);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Hdr1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR src) {
			createMap_up_CALL_OPE01_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR src) {
			createMap_up_CALL_OPE01_del01_0().copy(dest, src);
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_UpdChk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_Upd01}<br>
		 * 第1 上りブロッククラス mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #upd01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR&gt; （{@link #upd01_up1}）<br>
		 */
		public final mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.MenuConfig_Upd01 upd01;
		// 連携ロジック上り
		public final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> chk01_up1;
		public final mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR upd01_up0;
		public final MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> upd01_up1;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.crtMenuConfig_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL2040.MABCL_MenuConfigReg.crtMenuConfig_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR>)chk01.up(1);
			upd01_up0 = (mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR)upd01.up(0);
			upd01_up1 = (MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR>)upd01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * up0() => mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR （{@link #upd01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR&gt; （{@link #upd01_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, chk01_up1, upd01_up0, upd01_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
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
			invoke((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR createUpd01_Hdr1R(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR
		 */
		public mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>menu_no</td></tr>
		 * 	<tr><td><br></td><td>module_id</td></tr>
		 * 	<tr><td><br></td><td>scrn_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_MenuConfigReg)MABCL_MenuConfigReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest0_0, MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> dest0_1, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest1_0, MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> dest1_1, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR src_Upd01_Hdr1, MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Hdr1);
			up_CALL_OPE01_chk01_1(dest0_1, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Hdr1);
			up_CALL_OPE01_upd01_1(dest1_1, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR src) {
			createMap_up_CALL_OPE01_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_no", "menu_no");
				addColumnPathMap("module_id", "module_id");
				addColumnPathMap("scrn_id", "scrn_id");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_1(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_1(MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_1();
			for(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_cd", "menu_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR dest, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_HdrR src) {
			createMap_up_CALL_OPE01_upd01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_1() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("menu_no", "menu_no");
				addColumnPathMap("module_id", "module_id");
				addColumnPathMap("scrn_id", "scrn_id");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_1(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_1(MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_1();
			for(mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL2040.MenuConfig_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}