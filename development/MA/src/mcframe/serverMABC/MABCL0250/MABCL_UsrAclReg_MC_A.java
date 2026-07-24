package mcframe.serverMABC.MABCL0250;

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
 * "MABCL_UsrAclReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_UsrAclReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0250";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_UsrAclReg.UsrAcl_UpdChk01 aUsrAcl_UpdChk01;

	protected void initUsrAcl_UpdChk01() {
		this.info = PDef.MA_MABCL0250_UsrAcl_UpdChk01_INFO;
		this.aUsrAcl_UpdChk01 = ((MABCL_UsrAclReg)this).new UsrAcl_UpdChk01();
	}

	public static MABCL_UsrAclReg.UsrAcl_UpdChk01 crtUsrAcl_UpdChk01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initUsrAcl_UpdChk01();
		return lgc.aUsrAcl_UpdChk01;
	}

	protected void paramUsrAcl_UpdChk01(MCParam p) {
		if (this.aUsrAcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUsrAcl_UpdChk01.up0());
	}

	protected void doUsrAcl_UpdChk01() {
		aUsrAcl_UpdChk01.call();
	};

	/**
	 * UsrAcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR createUsrAcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.create();
	}

	/**
	 * UsrAcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> createUsrAcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);
	}
	protected MABCL_UsrAclReg.UsrAcl_Upd01 aUsrAcl_Upd01;

	protected void initUsrAcl_Upd01() {
		this.info = PDef.MA_MABCL0250_UsrAcl_Upd01_INFO;
		this.aUsrAcl_Upd01 = ((MABCL_UsrAclReg)this).new UsrAcl_Upd01();
	}

	public static MABCL_UsrAclReg.UsrAcl_Upd01 crtUsrAcl_Upd01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initUsrAcl_Upd01();
		return lgc.aUsrAcl_Upd01;
	}

	protected void paramUsrAcl_Upd01(MCParam p) {
		if (this.aUsrAcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUsrAcl_Upd01.up0());
	}

	protected void doUsrAcl_Upd01() {
		aUsrAcl_Upd01.call();
	};

	/**
	 * UsrAcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR createUsrAcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.create();
	}

	/**
	 * UsrAcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> createUsrAcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);
	}
	protected MABCL_UsrAclReg.UsrAcl_DelChk01 aUsrAcl_DelChk01;

	protected void initUsrAcl_DelChk01() {
		this.info = PDef.MA_MABCL0250_UsrAcl_DelChk01_INFO;
		this.aUsrAcl_DelChk01 = ((MABCL_UsrAclReg)this).new UsrAcl_DelChk01();
	}

	public static MABCL_UsrAclReg.UsrAcl_DelChk01 crtUsrAcl_DelChk01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initUsrAcl_DelChk01();
		return lgc.aUsrAcl_DelChk01;
	}

	protected void paramUsrAcl_DelChk01(MCParam p) {
		if (this.aUsrAcl_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUsrAcl_DelChk01.up0());
	}

	protected void doUsrAcl_DelChk01() {
		aUsrAcl_DelChk01.call();
	};

	/**
	 * UsrAcl_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR createUsrAcl_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.create();
	}

	/**
	 * UsrAcl_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> createUsrAcl_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);
	}
	protected MABCL_UsrAclReg.UsrAcl_Del01 aUsrAcl_Del01;

	protected void initUsrAcl_Del01() {
		this.info = PDef.MA_MABCL0250_UsrAcl_Del01_INFO;
		this.aUsrAcl_Del01 = ((MABCL_UsrAclReg)this).new UsrAcl_Del01();
	}

	public static MABCL_UsrAclReg.UsrAcl_Del01 crtUsrAcl_Del01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initUsrAcl_Del01();
		return lgc.aUsrAcl_Del01;
	}

	protected void paramUsrAcl_Del01(MCParam p) {
		if (this.aUsrAcl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUsrAcl_Del01.up0());
	}

	protected void doUsrAcl_Del01() {
		aUsrAcl_Del01.call();
	};

	/**
	 * UsrAcl_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR createUsrAcl_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.create();
	}

	/**
	 * UsrAcl_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> createUsrAcl_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);
	}
	protected MABCL_UsrAclReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0250_Srch01_INFO;
		this.aSrch01 = ((MABCL_UsrAclReg)this).new Srch01();
	}

	public static MABCL_UsrAclReg.Srch01 crtSrch01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
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
	public mcframe.serverMABC.MABCL0250.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);
	}
	protected MABCL_UsrAclReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MA_MABCL0250_Srch02_INFO;
		this.aSrch02 = ((MABCL_UsrAclReg)this).new Srch02();
	}

	public static MABCL_UsrAclReg.Srch02 crtSrch02() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
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
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.Srch01_Rslt1R createSrch02_RsltR(){
		return mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);
	}
	protected MABCL_UsrAclReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MA_MABCL0250_Srch03_INFO;
		this.aSrch03 = ((MABCL_UsrAclReg)this).new Srch03();
	}

	public static MABCL_UsrAclReg.Srch03 crtSrch03() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch03.up0());
		p.addDownBlock(aSrch03.down0());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.Srch01_CndR createSrch03_CndR(){
		return mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
	}

	/**
	 * Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.Srch01_Rslt1R createSrch03_RsltR(){
		return mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.create();
	}

	/**
	 * Srch03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> createSrch03_RsltL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);
	}
	protected MABCL_UsrAclReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MA_MABCL0250_Sprt01_INFO;
		this.aSprt01 = ((MABCL_UsrAclReg)this).new Sprt01();
	}

	public static MABCL_UsrAclReg.Sprt01 crtSprt01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMABC.MABCL0250.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0250.Sprt01_DtlR.class);
	}
	protected MABCL_UsrAclReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0250_Upd01_INFO;
		this.aUpd01 = ((MABCL_UsrAclReg)this).new Upd01();
	}

	public static MABCL_UsrAclReg.Upd01 crtUpd01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);
	}
	protected MABCL_UsrAclReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0250_Del01_INFO;
		this.aDel01 = ((MABCL_UsrAclReg)this).new Del01();
	}

	public static MABCL_UsrAclReg.Del01 crtDel01() {
		MABCL_UsrAclReg lgc = new MABCL_UsrAclReg();
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
	 * Del01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * UsrAcl_UpdChk01オペレーション.<p>
	 *
	 * 担当者権限マスタを登録する前のチェックを行う<br>
	 */
	abstract public class UsrAcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UsrAcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected UsrAcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);

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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * UsrAcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR createUsrAcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.create();
		}

		/**
		 * UsrAcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> createUsrAcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}


	}
	/**
	 * UsrAcl_Upd01オペレーション.<p>
	 *
	 * 担当者権限マスタを登録する<br>
	 */
	abstract public class UsrAcl_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UsrAcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_USR_ACL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_USR_ACL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_USR_ACL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_USR_ACL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_USR_ACL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_USR_ACL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_USR_ACL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_USR_ACL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_USR_ACL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_USR_ACL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected UsrAcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_USR_ACL_R.create("T1"));
			chkMaster = MCController.create(MAM_USR_ACL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_USR_ACL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_USR_ACL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_USR_ACL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_USR_ACL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * UsrAcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR createUsrAcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.create();
		}

		/**
		 * UsrAcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> createUsrAcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_USR_ACL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src_UsrAcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_UsrAcl_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("pre_cl_usr_flg", "pre_cl_usr_flg");
				addColumnPathMap("cl_usr_flg", "cl_usr_flg");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("add_dpt_cd1", "add_dpt_cd1");
				addColumnPathMap("add_dpt_cd2", "add_dpt_cd2");
				addColumnPathMap("add_dpt_cd3", "add_dpt_cd3");
				addColumnPathMap("add_dpt_cd4", "add_dpt_cd4");
				addColumnPathMap("add_dpt_cd5", "add_dpt_cd5");
				addColumnPathMap("add_dpt_cd6", "add_dpt_cd6");
				addColumnPathMap("add_dpt_cd7", "add_dpt_cd7");
				addColumnPathMap("add_dpt_cd8", "add_dpt_cd8");
				addColumnPathMap("add_dpt_cd9", "add_dpt_cd9");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_cd1", "aprv_role_cd1");
				addColumnPathMap("aprv_role_cd2", "aprv_role_cd2");
				addColumnPathMap("aprv_role_cd3", "aprv_role_cd3");
				addColumnPathMap("aprv_role_cd4", "aprv_role_cd4");
				addColumnPathMap("aprv_role_cd5", "aprv_role_cd5");
				addColumnPathMap("aprv_role_cd6", "aprv_role_cd6");
				addColumnPathMap("aprv_role_cd7", "aprv_role_cd7");
				addColumnPathMap("aprv_role_cd8", "aprv_role_cd8");
				addColumnPathMap("aprv_role_cd9", "aprv_role_cd9");
				addColumnPathMap("sub_aprv_role_cd", "sub_aprv_role_cd");
				addColumnPathMap("sub_aprv_role_cd1", "sub_aprv_role_cd1");
				addColumnPathMap("sub_aprv_role_cd2", "sub_aprv_role_cd2");
				addColumnPathMap("sub_aprv_role_cd3", "sub_aprv_role_cd3");
				addColumnPathMap("sub_aprv_role_cd4", "sub_aprv_role_cd4");
				addColumnPathMap("sub_aprv_role_cd5", "sub_aprv_role_cd5");
				addColumnPathMap("sub_aprv_role_cd6", "sub_aprv_role_cd6");
				addColumnPathMap("sub_aprv_role_cd7", "sub_aprv_role_cd7");
				addColumnPathMap("sub_aprv_role_cd8", "sub_aprv_role_cd8");
				addColumnPathMap("sub_aprv_role_cd9", "sub_aprv_role_cd9");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_USR_ACL_R r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_USR_ACL_R> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src : src){
				MAM_USR_ACL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_USR_ACL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src_UsrAcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_UsrAcl_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_USR_ACL_R r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_USR_ACL_R> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src : src){
				MAM_USR_ACL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * UsrAcl_DelChk01オペレーション.<p>
	 *
	 * 担当者権限マスタを削除する前のチェックを行う<br>
	 */
	abstract public class UsrAcl_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UsrAcl_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected UsrAcl_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);

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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * UsrAcl_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR createUsrAcl_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.create();
		}

		/**
		 * UsrAcl_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> createUsrAcl_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}


	}
	/**
	 * UsrAcl_Del01オペレーション.<p>
	 *
	 * 担当者権限マスタを削除する<br>
	 */
	abstract public class UsrAcl_Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "UsrAcl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_USR_ACL_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_USR_ACL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_USR_ACL_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_USR_ACL_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_USR_ACL_R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected UsrAcl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_USR_ACL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_USR_ACL_R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_USR_ACL_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * UsrAcl_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR createUsrAcl_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.create();
		}

		/**
		 * UsrAcl_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> createUsrAcl_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_USR_ACL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> src_UsrAcl_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_UsrAcl_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_USR_ACL_R r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_USR_ACL_R> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_src : src){
				MAM_USR_ACL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 担当者権限マスタの検索処理を行う<br>
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
		private final mcframe.serverMABC.MABCL0250.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_USR_ACL_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_USR_ACL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_USR_ACL_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_USR_ACL_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_USR_ACL_R> c0_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_USR_ACL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_USR_ACL_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_USR_ACL_R&gt;（{@link #c0_down0}）=> down0()<br>
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>usr_com_typ</td></tr>
		 * 	<tr><td><br></td><td>usr_com</td></tr>
		 * 	<tr><td><br></td><td>usr_info1</td></tr>
		 * 	<tr><td><br></td><td>usr_info2</td></tr>
		 * 	<tr><td><br></td><td>usr_info3</td></tr>
		 * 	<tr><td><br></td><td>usr_info4</td></tr>
		 * 	<tr><td><br></td><td>usr_info5</td></tr>
		 * 	<tr><td><br></td><td>usr_info6</td></tr>
		 * 	<tr><td><br></td><td>usr_info7</td></tr>
		 * 	<tr><td><br></td><td>usr_info8</td></tr>
		 * 	<tr><td><br></td><td>usr_info9</td></tr>
		 * 	<tr><td><br></td><td>usr_info10</td></tr>
		 * 	<tr><td><br></td><td>usr_info11</td></tr>
		 * 	<tr><td><br></td><td>usr_info12</td></tr>
		 * 	<tr><td><br></td><td>usr_info13</td></tr>
		 * 	<tr><td><br></td><td>usr_info14</td></tr>
		 * 	<tr><td><br></td><td>usr_info15</td></tr>
		 * 	<tr><td><br></td><td>usr_info16</td></tr>
		 * 	<tr><td><br></td><td>usr_info17</td></tr>
		 * 	<tr><td><br></td><td>usr_info18</td></tr>
		 * 	<tr><td><br></td><td>usr_info19</td></tr>
		 * 	<tr><td><br></td><td>usr_info20</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0250.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>license_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm9</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_USR_ACL_R> src0_0){
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("usr_nm", "usr_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("da_nm", "da_nm");
				addColumnPathMap("pre_cl_usr_flg", "pre_cl_usr_flg");
				addColumnPathMap("cl_usr_flg", "cl_usr_flg");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("add_dpt_cd1", "add_dpt_cd1");
				addColumnPathMap("add_dpt_nm1", "add_dpt_nm1");
				addColumnPathMap("add_dpt_cd2", "add_dpt_cd2");
				addColumnPathMap("add_dpt_nm2", "add_dpt_nm2");
				addColumnPathMap("add_dpt_cd3", "add_dpt_cd3");
				addColumnPathMap("add_dpt_nm3", "add_dpt_nm3");
				addColumnPathMap("add_dpt_cd4", "add_dpt_cd4");
				addColumnPathMap("add_dpt_nm4", "add_dpt_nm4");
				addColumnPathMap("add_dpt_cd5", "add_dpt_cd5");
				addColumnPathMap("add_dpt_nm5", "add_dpt_nm5");
				addColumnPathMap("add_dpt_cd6", "add_dpt_cd6");
				addColumnPathMap("add_dpt_nm6", "add_dpt_nm6");
				addColumnPathMap("add_dpt_cd7", "add_dpt_cd7");
				addColumnPathMap("add_dpt_nm7", "add_dpt_nm7");
				addColumnPathMap("add_dpt_cd8", "add_dpt_cd8");
				addColumnPathMap("add_dpt_nm8", "add_dpt_nm8");
				addColumnPathMap("add_dpt_cd9", "add_dpt_cd9");
				addColumnPathMap("add_dpt_nm9", "add_dpt_nm9");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
				addColumnPathMap("aprv_role_cd1", "aprv_role_cd1");
				addColumnPathMap("aprv_role_nm1", "aprv_role_nm1");
				addColumnPathMap("aprv_role_cd2", "aprv_role_cd2");
				addColumnPathMap("aprv_role_nm2", "aprv_role_nm2");
				addColumnPathMap("aprv_role_cd3", "aprv_role_cd3");
				addColumnPathMap("aprv_role_nm3", "aprv_role_nm3");
				addColumnPathMap("aprv_role_cd4", "aprv_role_cd4");
				addColumnPathMap("aprv_role_nm4", "aprv_role_nm4");
				addColumnPathMap("aprv_role_cd5", "aprv_role_cd5");
				addColumnPathMap("aprv_role_nm5", "aprv_role_nm5");
				addColumnPathMap("aprv_role_cd6", "aprv_role_cd6");
				addColumnPathMap("aprv_role_nm6", "aprv_role_nm6");
				addColumnPathMap("aprv_role_cd7", "aprv_role_cd7");
				addColumnPathMap("aprv_role_nm7", "aprv_role_nm7");
				addColumnPathMap("aprv_role_cd8", "aprv_role_cd8");
				addColumnPathMap("aprv_role_nm8", "aprv_role_nm8");
				addColumnPathMap("aprv_role_cd9", "aprv_role_cd9");
				addColumnPathMap("aprv_role_nm9", "aprv_role_nm9");
				addColumnPathMap("sub_aprv_role_cd", "sub_aprv_role_cd");
				addColumnPathMap("sub_aprv_role_nm", "sub_aprv_role_nm");
				addColumnPathMap("sub_aprv_role_cd1", "sub_aprv_role_cd1");
				addColumnPathMap("sub_aprv_role_nm1", "sub_aprv_role_nm1");
				addColumnPathMap("sub_aprv_role_cd2", "sub_aprv_role_cd2");
				addColumnPathMap("sub_aprv_role_nm2", "sub_aprv_role_nm2");
				addColumnPathMap("sub_aprv_role_cd3", "sub_aprv_role_cd3");
				addColumnPathMap("sub_aprv_role_nm3", "sub_aprv_role_nm3");
				addColumnPathMap("sub_aprv_role_cd4", "sub_aprv_role_cd4");
				addColumnPathMap("sub_aprv_role_nm4", "sub_aprv_role_nm4");
				addColumnPathMap("sub_aprv_role_cd5", "sub_aprv_role_cd5");
				addColumnPathMap("sub_aprv_role_nm5", "sub_aprv_role_nm5");
				addColumnPathMap("sub_aprv_role_cd6", "sub_aprv_role_cd6");
				addColumnPathMap("sub_aprv_role_nm6", "sub_aprv_role_nm6");
				addColumnPathMap("sub_aprv_role_cd7", "sub_aprv_role_cd7");
				addColumnPathMap("sub_aprv_role_nm7", "sub_aprv_role_nm7");
				addColumnPathMap("sub_aprv_role_cd8", "sub_aprv_role_cd8");
				addColumnPathMap("sub_aprv_role_nm8", "sub_aprv_role_nm8");
				addColumnPathMap("sub_aprv_role_cd9", "sub_aprv_role_cd9");
				addColumnPathMap("sub_aprv_role_nm9", "sub_aprv_role_nm9");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R r_dest, MAM_USR_ACL_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> dest, MCList<MAM_USR_ACL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_USR_ACL_R r_src : src){
				mcframe.serverMABC.MABCL0250.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 承認担当者ビューの検索処理を行う<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0250.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAVM_APRV_USR_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAVM_APRV_USR_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAVM_APRV_USR_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAVM_APRV_USR_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAVM_APRV_USR_R> c0_down0;
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAVM_APRV_USR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAVM_APRV_USR_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAVM_APRV_USR_R&gt;（{@link #c0_down0}）=> down0()<br>
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_Rslt1R createSrch02_RsltR(){
			return mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>usr_com_typ</td></tr>
		 * 	<tr><td><br></td><td>usr_com</td></tr>
		 * 	<tr><td><br></td><td>usr_info1</td></tr>
		 * 	<tr><td><br></td><td>usr_info2</td></tr>
		 * 	<tr><td><br></td><td>usr_info3</td></tr>
		 * 	<tr><td><br></td><td>usr_info4</td></tr>
		 * 	<tr><td><br></td><td>usr_info5</td></tr>
		 * 	<tr><td><br></td><td>usr_info6</td></tr>
		 * 	<tr><td><br></td><td>usr_info7</td></tr>
		 * 	<tr><td><br></td><td>usr_info8</td></tr>
		 * 	<tr><td><br></td><td>usr_info9</td></tr>
		 * 	<tr><td><br></td><td>usr_info10</td></tr>
		 * 	<tr><td><br></td><td>usr_info11</td></tr>
		 * 	<tr><td><br></td><td>usr_info12</td></tr>
		 * 	<tr><td><br></td><td>usr_info13</td></tr>
		 * 	<tr><td><br></td><td>usr_info14</td></tr>
		 * 	<tr><td><br></td><td>usr_info15</td></tr>
		 * 	<tr><td><br></td><td>usr_info16</td></tr>
		 * 	<tr><td><br></td><td>usr_info17</td></tr>
		 * 	<tr><td><br></td><td>usr_info18</td></tr>
		 * 	<tr><td><br></td><td>usr_info19</td></tr>
		 * 	<tr><td><br></td><td>usr_info20</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0250.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>main_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> dest_Srch02_Rslt, MCList<MAVM_APRV_USR_R> src0_0){
			down_SELECT_c0_0(dest_Srch02_Rslt, src0_0);
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("usr_nm", "usr_nm");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("main_flg", "main_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R r_dest, MAVM_APRV_USR_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> dest, MCList<MAVM_APRV_USR_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAVM_APRV_USR_R r_src : src){
				mcframe.serverMABC.MABCL0250.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 担当者・部門ビューの検索処理を行う<br>
	 */
	abstract public class Srch03 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABC.MABCL0250.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAVM_USR_DPT_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAVM_USR_DPT_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAVM_USR_DPT_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAVM_USR_DPT_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAVM_USR_DPT_R> c0_down0;
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAVM_USR_DPT_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAVM_USR_DPT_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAVM_USR_DPT_R&gt;（{@link #c0_down0}）=> down0()<br>
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
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_CndR createSrch03_CndR(){
			return mcframe.serverMABC.MABCL0250.Srch01_CndR.create();
		}

		/**
		 * Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_Rslt1R createSrch03_RsltR(){
			return mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.create();
		}

		/**
		 * Srch03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> createSrch03_RsltL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm1</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm2</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm3</td></tr>
		 * 	<tr><td><br></td><td>usr_alt_nm4</td></tr>
		 * 	<tr><td><br></td><td>usr_com_typ</td></tr>
		 * 	<tr><td><br></td><td>usr_com</td></tr>
		 * 	<tr><td><br></td><td>usr_info1</td></tr>
		 * 	<tr><td><br></td><td>usr_info2</td></tr>
		 * 	<tr><td><br></td><td>usr_info3</td></tr>
		 * 	<tr><td><br></td><td>usr_info4</td></tr>
		 * 	<tr><td><br></td><td>usr_info5</td></tr>
		 * 	<tr><td><br></td><td>usr_info6</td></tr>
		 * 	<tr><td><br></td><td>usr_info7</td></tr>
		 * 	<tr><td><br></td><td>usr_info8</td></tr>
		 * 	<tr><td><br></td><td>usr_info9</td></tr>
		 * 	<tr><td><br></td><td>usr_info10</td></tr>
		 * 	<tr><td><br></td><td>usr_info11</td></tr>
		 * 	<tr><td><br></td><td>usr_info12</td></tr>
		 * 	<tr><td><br></td><td>usr_info13</td></tr>
		 * 	<tr><td><br></td><td>usr_info14</td></tr>
		 * 	<tr><td><br></td><td>usr_info15</td></tr>
		 * 	<tr><td><br></td><td>usr_info16</td></tr>
		 * 	<tr><td><br></td><td>usr_info17</td></tr>
		 * 	<tr><td><br></td><td>usr_info18</td></tr>
		 * 	<tr><td><br></td><td>usr_info19</td></tr>
		 * 	<tr><td><br></td><td>usr_info20</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0250.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0250.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>main_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> dest_Srch03_Rslt, MCList<MAVM_USR_DPT_R> src0_0){
			down_SELECT_c0_0(dest_Srch03_Rslt, src0_0);
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("usr_nm", "usr_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("main_flg", "main_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0250.Srch01_Rslt1R r_dest, MAVM_USR_DPT_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0250.Srch01_Rslt1R> dest, MCList<MAVM_USR_DPT_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAVM_USR_DPT_R r_src : src){
				mcframe.serverMABC.MABCL0250.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 重複期間の補正を行う<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLStEndDupChecker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> down0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_USR_ACL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_USR_ACL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_USR_ACL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_USR_ACL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_USR_ACL_R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMABC.MABCL0250.Sprt01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_USR_ACL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_USR_ACL_R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_USR_ACL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMABC.MABCL0250.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0250.Sprt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm9</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>license_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>da_nm</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_nm9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_nm9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_nm9</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
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
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_USR_ACL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> src_Sprt01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Sprt01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("usr_nm", "usr_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("da_nm", "da_nm");
				addColumnPathMap("pre_cl_usr_flg", "pre_cl_usr_flg");
				addColumnPathMap("cl_usr_flg", "cl_usr_flg");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
				addColumnPathMap("add_dpt_cd1", "add_dpt_cd1");
				addColumnPathMap("add_dpt_nm1", "add_dpt_nm1");
				addColumnPathMap("add_dpt_cd2", "add_dpt_cd2");
				addColumnPathMap("add_dpt_nm2", "add_dpt_nm2");
				addColumnPathMap("add_dpt_cd3", "add_dpt_cd3");
				addColumnPathMap("add_dpt_nm3", "add_dpt_nm3");
				addColumnPathMap("add_dpt_cd4", "add_dpt_cd4");
				addColumnPathMap("add_dpt_nm4", "add_dpt_nm4");
				addColumnPathMap("add_dpt_cd5", "add_dpt_cd5");
				addColumnPathMap("add_dpt_nm5", "add_dpt_nm5");
				addColumnPathMap("add_dpt_cd6", "add_dpt_cd6");
				addColumnPathMap("add_dpt_nm6", "add_dpt_nm6");
				addColumnPathMap("add_dpt_cd7", "add_dpt_cd7");
				addColumnPathMap("add_dpt_nm7", "add_dpt_nm7");
				addColumnPathMap("add_dpt_cd8", "add_dpt_cd8");
				addColumnPathMap("add_dpt_nm8", "add_dpt_nm8");
				addColumnPathMap("add_dpt_cd9", "add_dpt_cd9");
				addColumnPathMap("add_dpt_nm9", "add_dpt_nm9");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_nm", "aprv_role_nm");
				addColumnPathMap("aprv_role_cd1", "aprv_role_cd1");
				addColumnPathMap("aprv_role_nm1", "aprv_role_nm1");
				addColumnPathMap("aprv_role_cd2", "aprv_role_cd2");
				addColumnPathMap("aprv_role_nm2", "aprv_role_nm2");
				addColumnPathMap("aprv_role_cd3", "aprv_role_cd3");
				addColumnPathMap("aprv_role_nm3", "aprv_role_nm3");
				addColumnPathMap("aprv_role_cd4", "aprv_role_cd4");
				addColumnPathMap("aprv_role_nm4", "aprv_role_nm4");
				addColumnPathMap("aprv_role_cd5", "aprv_role_cd5");
				addColumnPathMap("aprv_role_nm5", "aprv_role_nm5");
				addColumnPathMap("aprv_role_cd6", "aprv_role_cd6");
				addColumnPathMap("aprv_role_nm6", "aprv_role_nm6");
				addColumnPathMap("aprv_role_cd7", "aprv_role_cd7");
				addColumnPathMap("aprv_role_nm7", "aprv_role_nm7");
				addColumnPathMap("aprv_role_cd8", "aprv_role_cd8");
				addColumnPathMap("aprv_role_nm8", "aprv_role_nm8");
				addColumnPathMap("aprv_role_cd9", "aprv_role_cd9");
				addColumnPathMap("aprv_role_nm9", "aprv_role_nm9");
				addColumnPathMap("sub_aprv_role_cd", "sub_aprv_role_cd");
				addColumnPathMap("sub_aprv_role_nm", "sub_aprv_role_nm");
				addColumnPathMap("sub_aprv_role_cd1", "sub_aprv_role_cd1");
				addColumnPathMap("sub_aprv_role_nm1", "sub_aprv_role_nm1");
				addColumnPathMap("sub_aprv_role_cd2", "sub_aprv_role_cd2");
				addColumnPathMap("sub_aprv_role_nm2", "sub_aprv_role_nm2");
				addColumnPathMap("sub_aprv_role_cd3", "sub_aprv_role_cd3");
				addColumnPathMap("sub_aprv_role_nm3", "sub_aprv_role_nm3");
				addColumnPathMap("sub_aprv_role_cd4", "sub_aprv_role_cd4");
				addColumnPathMap("sub_aprv_role_nm4", "sub_aprv_role_nm4");
				addColumnPathMap("sub_aprv_role_cd5", "sub_aprv_role_cd5");
				addColumnPathMap("sub_aprv_role_nm5", "sub_aprv_role_nm5");
				addColumnPathMap("sub_aprv_role_cd6", "sub_aprv_role_cd6");
				addColumnPathMap("sub_aprv_role_nm6", "sub_aprv_role_nm6");
				addColumnPathMap("sub_aprv_role_cd7", "sub_aprv_role_cd7");
				addColumnPathMap("sub_aprv_role_nm7", "sub_aprv_role_nm7");
				addColumnPathMap("sub_aprv_role_cd8", "sub_aprv_role_cd8");
				addColumnPathMap("sub_aprv_role_nm8", "sub_aprv_role_nm8");
				addColumnPathMap("sub_aprv_role_cd9", "sub_aprv_role_cd9");
				addColumnPathMap("sub_aprv_role_nm9", "sub_aprv_role_nm9");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_USR_ACL_R r_dest, mcframe.serverMABC.MABCL0250.Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_USR_ACL_R> dest, MCList<mcframe.serverMABC.MABCL0250.Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0250.Sprt01_DtlR r_src : src){
				MAM_USR_ACL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
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
		private final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.crtUsrAcl_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.crtUsrAcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR>)upd01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>da_cd</td></tr>
		 * 	<tr><td><br></td><td>pre_cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>cl_usr_flg</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd1</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd2</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd3</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd4</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd5</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd6</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd7</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd8</td></tr>
		 * 	<tr><td><br></td><td>add_dpt_cd9</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd1</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd2</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd3</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd4</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd5</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd6</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd7</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd8</td></tr>
		 * 	<tr><td><br></td><td>sub_aprv_role_cd9</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
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
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("pre_cl_usr_flg", "pre_cl_usr_flg");
				addColumnPathMap("cl_usr_flg", "cl_usr_flg");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("add_dpt_cd1", "add_dpt_cd1");
				addColumnPathMap("add_dpt_cd2", "add_dpt_cd2");
				addColumnPathMap("add_dpt_cd3", "add_dpt_cd3");
				addColumnPathMap("add_dpt_cd4", "add_dpt_cd4");
				addColumnPathMap("add_dpt_cd5", "add_dpt_cd5");
				addColumnPathMap("add_dpt_cd6", "add_dpt_cd6");
				addColumnPathMap("add_dpt_cd7", "add_dpt_cd7");
				addColumnPathMap("add_dpt_cd8", "add_dpt_cd8");
				addColumnPathMap("add_dpt_cd9", "add_dpt_cd9");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_cd1", "aprv_role_cd1");
				addColumnPathMap("aprv_role_cd2", "aprv_role_cd2");
				addColumnPathMap("aprv_role_cd3", "aprv_role_cd3");
				addColumnPathMap("aprv_role_cd4", "aprv_role_cd4");
				addColumnPathMap("aprv_role_cd5", "aprv_role_cd5");
				addColumnPathMap("aprv_role_cd6", "aprv_role_cd6");
				addColumnPathMap("aprv_role_cd7", "aprv_role_cd7");
				addColumnPathMap("aprv_role_cd8", "aprv_role_cd8");
				addColumnPathMap("aprv_role_cd9", "aprv_role_cd9");
				addColumnPathMap("sub_aprv_role_cd", "sub_aprv_role_cd");
				addColumnPathMap("sub_aprv_role_cd1", "sub_aprv_role_cd1");
				addColumnPathMap("sub_aprv_role_cd2", "sub_aprv_role_cd2");
				addColumnPathMap("sub_aprv_role_cd3", "sub_aprv_role_cd3");
				addColumnPathMap("sub_aprv_role_cd4", "sub_aprv_role_cd4");
				addColumnPathMap("sub_aprv_role_cd5", "sub_aprv_role_cd5");
				addColumnPathMap("sub_aprv_role_cd6", "sub_aprv_role_cd6");
				addColumnPathMap("sub_aprv_role_cd7", "sub_aprv_role_cd7");
				addColumnPathMap("sub_aprv_role_cd8", "sub_aprv_role_cd8");
				addColumnPathMap("sub_aprv_role_cd9", "sub_aprv_role_cd9");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
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
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("da_cd", "da_cd");
				addColumnPathMap("pre_cl_usr_flg", "pre_cl_usr_flg");
				addColumnPathMap("cl_usr_flg", "cl_usr_flg");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("add_dpt_cd1", "add_dpt_cd1");
				addColumnPathMap("add_dpt_cd2", "add_dpt_cd2");
				addColumnPathMap("add_dpt_cd3", "add_dpt_cd3");
				addColumnPathMap("add_dpt_cd4", "add_dpt_cd4");
				addColumnPathMap("add_dpt_cd5", "add_dpt_cd5");
				addColumnPathMap("add_dpt_cd6", "add_dpt_cd6");
				addColumnPathMap("add_dpt_cd7", "add_dpt_cd7");
				addColumnPathMap("add_dpt_cd8", "add_dpt_cd8");
				addColumnPathMap("add_dpt_cd9", "add_dpt_cd9");
				addColumnPathMap("aprv_role_cd", "aprv_role_cd");
				addColumnPathMap("aprv_role_cd1", "aprv_role_cd1");
				addColumnPathMap("aprv_role_cd2", "aprv_role_cd2");
				addColumnPathMap("aprv_role_cd3", "aprv_role_cd3");
				addColumnPathMap("aprv_role_cd4", "aprv_role_cd4");
				addColumnPathMap("aprv_role_cd5", "aprv_role_cd5");
				addColumnPathMap("aprv_role_cd6", "aprv_role_cd6");
				addColumnPathMap("aprv_role_cd7", "aprv_role_cd7");
				addColumnPathMap("aprv_role_cd8", "aprv_role_cd8");
				addColumnPathMap("aprv_role_cd9", "aprv_role_cd9");
				addColumnPathMap("sub_aprv_role_cd", "sub_aprv_role_cd");
				addColumnPathMap("sub_aprv_role_cd1", "sub_aprv_role_cd1");
				addColumnPathMap("sub_aprv_role_cd2", "sub_aprv_role_cd2");
				addColumnPathMap("sub_aprv_role_cd3", "sub_aprv_role_cd3");
				addColumnPathMap("sub_aprv_role_cd4", "sub_aprv_role_cd4");
				addColumnPathMap("sub_aprv_role_cd5", "sub_aprv_role_cd5");
				addColumnPathMap("sub_aprv_role_cd6", "sub_aprv_role_cd6");
				addColumnPathMap("sub_aprv_role_cd7", "sub_aprv_role_cd7");
				addColumnPathMap("sub_aprv_role_cd8", "sub_aprv_role_cd8");
				addColumnPathMap("sub_aprv_role_cd9", "sub_aprv_role_cd9");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0250.UsrAcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.UsrAcl_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.crtUsrAcl_DelChk01();
			del01 = mcframe.serverMABC.MABCL0250.MABCL_UsrAclReg.crtUsrAcl_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_UsrAclReg)MABCL_UsrAclReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl1);
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
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
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
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0250.UsrAcl_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
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