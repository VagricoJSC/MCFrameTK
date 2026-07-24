package mcframe.serverMSBC.MSBCL0040;

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
 * "MSBCL_OrdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_OrdReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_OrdReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL0040_Srch01_INFO;
		this.aSrch01 = ((MSBCL_OrdReg)this).new Srch01();
	}

	public static MSBCL_OrdReg.Srch01 crtSrch01() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
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
	public mcframe.serverMSBC.MSBCL0040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBC.MSBCL0040.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBC.MSBCL0040.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0040.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0040.Srch01_DtlR.class);
	}
	protected MSBCL_OrdReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBCL0040_Sprt01_INFO;
		this.aSprt01 = ((MSBCL_OrdReg)this).new Sprt01();
	}

	public static MSBCL_OrdReg.Sprt01 crtSprt01() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
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
	 * Sprt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Sprt01_CndR createSprt01_CndR(){
		return mcframe.serverMSBC.MSBCL0040.Sprt01_CndR.create();
	}
	protected MSBCL_OrdReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBCL0040_Sprt02_INFO;
		this.aSprt02 = ((MSBCL_OrdReg)this).new Sprt02();
	}

	public static MSBCL_OrdReg.Sprt02 crtSprt02() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
		lgc.initSprt02();
		return lgc.aSprt02;
	}

	protected void paramSprt02(MCParam p) {
		if (this.aSprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt02.up0());
		p.addDownBlock(aSprt02.down0());
	}

	protected void doSprt02() {
		aSprt02.call();
	};

	/**
	 * Sprt02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Sprt02_CndR createSprt02_CndR(){
		return mcframe.serverMSBC.MSBCL0040.Sprt02_CndR.create();
	}

	/**
	 * Sprt02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR createSprt02_RsltR(){
		return mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR.create();
	}

	/**
	 * Sprt02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR> createSprt02_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR.class);
	}
	protected MSBCL_OrdReg.Sprt03 aSprt03;

	protected void initSprt03() {
		this.info = PDef.MS_MSBCL0040_Sprt03_INFO;
		this.aSprt03 = ((MSBCL_OrdReg)this).new Sprt03();
	}

	public static MSBCL_OrdReg.Sprt03 crtSprt03() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
		lgc.initSprt03();
		return lgc.aSprt03;
	}

	protected void paramSprt03(MCParam p) {
		if (this.aSprt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt03.up0());
		p.addDownBlock(aSprt03.down0());
	}

	protected void doSprt03() {
		aSprt03.call();
	};

	/**
	 * Sprt03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Sprt03_CndR createSprt03_CndR(){
		return mcframe.serverMSBC.MSBCL0040.Sprt03_CndR.create();
	}
	protected MSBCL_OrdReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBCL0040_Chk01_INFO;
		this.aChk01 = ((MSBCL_OrdReg)this).new Chk01();
	}

	public static MSBCL_OrdReg.Chk01 crtChk01() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
	}
	protected MSBCL_OrdReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBCL0040_Chk02_INFO;
		this.aChk02 = ((MSBCL_OrdReg)this).new Chk02();
	}

	public static MSBCL_OrdReg.Chk02 crtChk02() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addDownBlock(aChk02.down0());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();
	}
	protected MSBCL_OrdReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBCL0040_Chk03_INFO;
		this.aChk03 = ((MSBCL_OrdReg)this).new Chk03();
	}

	public static MSBCL_OrdReg.Chk03 crtChk03() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addDownBlock(aChk03.down0());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR createChk03_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();
	}
	protected MSBCL_OrdReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBCL0040_Ins01_INFO;
		this.aIns01 = ((MSBCL_OrdReg)this).new Ins01();
	}

	public static MSBCL_OrdReg.Ins01 crtIns01() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
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
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
	}
	protected MSBCL_OrdReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBCL0040_Upd01_INFO;
		this.aUpd01 = ((MSBCL_OrdReg)this).new Upd01();
	}

	public static MSBCL_OrdReg.Upd01 crtUpd01() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
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
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
	}
	protected MSBCL_OrdReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBCL0040_Upd02_INFO;
		this.aUpd02 = ((MSBCL_OrdReg)this).new Upd02();
	}

	public static MSBCL_OrdReg.Upd02 crtUpd02() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addDownBlock(aUpd02.down0());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR createUpd02_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();
	}
	protected MSBCL_OrdReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBCL0040_Del01_INFO;
		this.aDel01 = ((MSBCL_OrdReg)this).new Del01();
	}

	public static MSBCL_OrdReg.Del01 crtDel01() {
		MSBCL_OrdReg lgc = new MSBCL_OrdReg();
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
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR createDel01_HdrR(){
		return mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 品目オーダを検索する。<br>
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
		private final mcframe.serverMSBC.MSBCL0040.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Srch01_DtlR> down1;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Srch01_CndR.create();
			down0 = mcframe.serverMSBC.MSBCL0040.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Srch01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
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
		public mcframe.serverMSBC.MSBCL0040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBC.MSBCL0040.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBC.MSBCL0040.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0040.Srch01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Srch01_CndR
		 */
		public mcframe.serverMSBC.MSBCL0040.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_site_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>unit_nm</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_schd_yield</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>itm_order_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Srch01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Srch01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 日付計算を行う。<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		private final mcframe.serverMSBC.MSBCL0040.Sprt01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Sprt01_CndR down0;
		
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Sprt01_CndR.create();
			down0 = mcframe.serverMSBC.MSBCL0040.Sprt01_CndR.create();

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt01_CndR createSprt01_CndR(){
			return mcframe.serverMSBC.MSBCL0040.Sprt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Sprt01_CndR
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Sprt01_CndR
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt01_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 工程オーダ展開を行う。<br>
	 */
	abstract public class Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Sprt02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR> down0;
		
		
		// コンストラクタ
		protected Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Sprt02_CndR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR.class);

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt02_CndR createSprt02_CndR(){
			return mcframe.serverMSBC.MSBCL0040.Sprt02_CndR.create();
		}

		/**
		 * Sprt02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR createSprt02_RsltR(){
			return mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR.create();
		}

		/**
		 * Sprt02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR> createSprt02_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Sprt02_CndR
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Sprt02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 検査対象であるかを取得する。<br>
	 */
	abstract public class Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Sprt03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Sprt03_CndR down0;
		
		
		// コンストラクタ
		protected Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Sprt03_CndR.create();
			down0 = mcframe.serverMSBC.MSBCL0040.Sprt03_CndR.create();

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt03_CndR createSprt03_CndR(){
			return mcframe.serverMSBC.MSBCL0040.Sprt03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_schd_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Sprt03_CndR
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt03_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_lt</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Sprt03_CndR
		 */
		public mcframe.serverMSBC.MSBCL0040.Sprt03_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 品目オーダを登録・訂正するために、チェックを行う。<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
			down0 = mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
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
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> up1() {
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
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 品目オーダを取り消すために、チェックを行う。<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk02_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk02_HdrR down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();
			down0 = mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk02_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk02_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 品目オーダを確定解除するために、チェックを行う。<br>
	 */
	abstract public class Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk03_HdrR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();
			down0 = mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR createChk03_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>a_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mrp_typ</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>a_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>b_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_gnrt_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.nmr_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.dnm_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.fxd_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.purc_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.xfr_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_lt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_offst</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.not_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_maker_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 品目オーダを登録する。<br>
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
		private final mcframe.serverMSBC.MSBCL0040.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
			down0 = mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 品目オーダを更新する。<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
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
		private final mcframe.serverMSBC.MSBCL0040.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
			down0 = mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0040.Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ord.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.mst_mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.maker_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.po_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.gi_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.strg_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.insp_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.avl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.master_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.sno1</td></tr>
		 * 	<tr><td><br></td><td>ord.sno2</td></tr>
		 * 	<tr><td><br></td><td>ord.sno3</td></tr>
		 * 	<tr><td><br></td><td>ord.sno4</td></tr>
		 * 	<tr><td><br></td><td>ord.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_rcv_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ord_snd_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ord.ext_itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.for_scheduler_frozen_flg</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oord.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>oord.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oord.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oord.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oord.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oord.ext_oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.scheduler_frozen_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oord.oper_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0040.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 品目オーダを確定解除する。<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0040.Chk03_HdrR down0;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();
			down0 = mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR createUpd02_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>a_itm_ord_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk03_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 品目オーダを取り消す。<br>
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
		private final mcframe.serverMSBC.MSBCL0040.Chk02_HdrR up0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();

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
			invoke((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR createDel01_HdrR(){
			return mcframe.serverMSBC.MSBCL0040.Chk02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ord.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>ord.rqmt_no</td></tr>
		 * 	<tr><td><br></td><td>ord.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0040.Chk02_HdrR
		 */
		public mcframe.serverMSBC.MSBCL0040.Chk02_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_OrdReg)MSBCL_OrdReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}