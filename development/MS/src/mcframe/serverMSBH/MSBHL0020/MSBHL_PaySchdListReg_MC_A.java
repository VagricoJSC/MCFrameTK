package mcframe.serverMSBH.MSBHL0020;

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
 * "MSBHL_PaySchdListReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PaySchdListReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL0020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PaySchdListReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0020_Srch01_INFO;
		this.aSrch01 = ((MSBHL_PaySchdListReg)this).new Srch01();
	}

	public static MSBHL_PaySchdListReg.Srch01 crtSrch01() {
		MSBHL_PaySchdListReg lgc = new MSBHL_PaySchdListReg();
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
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0020.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.class);
	}

	/**
	 * Srch01_ApdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Srch01_RsltR createSrch01_ApdR(){
		return mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.create();
	}

	/**
	 * Srch01_ApdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> createSrch01_ApdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.class);
	}

	/**
	 * Srch01_PayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Srch01_PayActR createSrch01_PayActR(){
		return mcframe.serverMSBH.MSBHL0020.Srch01_PayActR.create();
	}

	/**
	 * Srch01_PayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_PayActR> createSrch01_PayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_PayActR.class);
	}

	/**
	 * Srch01_AdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR createSrch01_AdvPayActR(){
		return mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR.create();
	}

	/**
	 * Srch01_AdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR> createSrch01_AdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR.class);
	}
	protected MSBHL_PaySchdListReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBHL0020_Chk01_INFO;
		this.aChk01 = ((MSBHL_PaySchdListReg)this).new Chk01();
	}

	public static MSBHL_PaySchdListReg.Chk01 crtChk01() {
		MSBHL_PaySchdListReg lgc = new MSBHL_PaySchdListReg();
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
		p.addUpBlock(aChk01.up2());
		p.addUpBlock(aChk01.up3());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
		p.addDownBlock(aChk01.down3());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_RsltR createChk01_RsltR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.create();
	}

	/**
	 * Chk01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> createChk01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
	}

	/**
	 * Chk01_ApdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_ApdR createChk01_ApdR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.create();
	}

	/**
	 * Chk01_ApdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> createChk01_ApdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
	}

	/**
	 * Chk01_PayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_PayActR createChk01_PayActR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.create();
	}

	/**
	 * Chk01_PayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> createChk01_PayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
	}

	/**
	 * Chk01_AdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR createChk01_AdvPayActR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.create();
	}

	/**
	 * Chk01_AdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> createChk01_AdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);
	}
	protected MSBHL_PaySchdListReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBHL0020_Chk02_INFO;
		this.aChk02 = ((MSBHL_PaySchdListReg)this).new Chk02();
	}

	public static MSBHL_PaySchdListReg.Chk02 crtChk02() {
		MSBHL_PaySchdListReg lgc = new MSBHL_PaySchdListReg();
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
	 * Chk02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk02_RsltR createChk02_RsltR(){
		return mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.create();
	}

	/**
	 * Chk02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> createChk02_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);
	}
	protected MSBHL_PaySchdListReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBHL0020_Ins01_INFO;
		this.aIns01 = ((MSBHL_PaySchdListReg)this).new Ins01();
	}

	public static MSBHL_PaySchdListReg.Ins01 crtIns01() {
		MSBHL_PaySchdListReg lgc = new MSBHL_PaySchdListReg();
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
		p.addUpBlock(aIns01.up2());
		p.addUpBlock(aIns01.up3());
		p.addUpBlock(aIns01.up4());
		p.addDownBlock(aIns01.down0());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_RsltR createIns01_RsltR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.create();
	}

	/**
	 * Ins01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> createIns01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
	}

	/**
	 * Ins01_ApdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_ApdR createIns01_ApdR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.create();
	}

	/**
	 * Ins01_ApdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> createIns01_ApdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
	}

	/**
	 * Ins01_PayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_PayActR createIns01_PayActR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.create();
	}

	/**
	 * Ins01_PayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> createIns01_PayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
	}

	/**
	 * Ins01_AdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR createIns01_AdvPayActR(){
		return mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.create();
	}

	/**
	 * Ins01_AdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> createIns01_AdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);
	}

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Ins01_CndR createIns01_CndR(){
		return mcframe.serverMSBH.MSBHL0020.Ins01_CndR.create();
	}
	protected MSBHL_PaySchdListReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBHL0020_Del01_INFO;
		this.aDel01 = ((MSBHL_PaySchdListReg)this).new Del01();
	}

	public static MSBHL_PaySchdListReg.Del01 crtDel01() {
		MSBHL_PaySchdListReg lgc = new MSBHL_PaySchdListReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Chk02_RsltR createDel01_RsltR(){
		return mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.create();
	}

	/**
	 * Del01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> createDel01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);
	}
	protected MSBHL_PaySchdListReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBHL0020_Prnt01_INFO;
		this.aPrnt01 = ((MSBHL_PaySchdListReg)this).new Prnt01();
	}

	public static MSBHL_PaySchdListReg.Prnt01 crtPrnt01() {
		MSBHL_PaySchdListReg lgc = new MSBHL_PaySchdListReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
		p.addDownBlock(aPrnt01.down0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR createPrnt01_RsltR(){
		return mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR.create();
	}

	/**
	 * Prnt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR> createPrnt01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR.class);
	}

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0020.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBH.MSBHL0020.Prnt01_CndR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 未照合の買掛明細情報を検索し、支払照合ヘッダ単位にまとめます。支払照合ヘッダも検索します。<br>
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
		private final mcframe.serverMSBH.MSBHL0020.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Srch01_PayActR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR> down3;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0020.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_PayActR.class);
			down3 = MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR.class);

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
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0020.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.class);
		}

		/**
		 * Srch01_ApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Srch01_RsltR createSrch01_ApdR(){
			return mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.create();
		}

		/**
		 * Srch01_ApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> createSrch01_ApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_RsltR.class);
		}

		/**
		 * Srch01_PayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Srch01_PayActR createSrch01_PayActR(){
			return mcframe.serverMSBH.MSBHL0020.Srch01_PayActR.create();
		}

		/**
		 * Srch01_PayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_PayActR> createSrch01_PayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_PayActR.class);
		}

		/**
		 * Srch01_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR createSrch01_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR.create();
		}

		/**
		 * Srch01_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR> createSrch01_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>reg_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>reg_dt_to</td></tr>
		 * 	<tr><td><br></td><td>unchk_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_opn_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_acpt_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_last_rjct_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_none_flg</td></tr>
		 * 	<tr><td><br></td><td>not_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>inc_no_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>manual_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>new_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0020.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0020.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ap_d.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid</td></tr>
		 * 	<tr><td><br></td><td>com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>last_pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>account_amt</td></tr>
		 * 	<tr><td><br></td><td>cash_amt</td></tr>
		 * 	<tr><td><br></td><td>note_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_pay_amt</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_bal</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_rev</td></tr>
		 * 	<tr><td><br></td><td>unchk_flg</td></tr>
		 * 	<tr><td><br></td><td>schd_flg</td></tr>
		 * 	<tr><td><br></td><td>act_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_can_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_on_pay_flg</td></tr>
		 * 	<tr><td><br></td><td>manual_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>min_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>max_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>bsppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>psppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_RsltR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_PayActR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Srch01_AdvPayActR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> down3;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
			down3 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Chk01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_RsltR createChk01_RsltR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.create();
		}

		/**
		 * Chk01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> createChk01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
		}

		/**
		 * Chk01_ApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_ApdR createChk01_ApdR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.create();
		}

		/**
		 * Chk01_ApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> createChk01_ApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
		}

		/**
		 * Chk01_PayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_PayActR createChk01_PayActR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.create();
		}

		/**
		 * Chk01_PayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> createChk01_PayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
		}

		/**
		 * Chk01_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR createChk01_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.create();
		}

		/**
		 * Chk01_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> createChk01_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_act_not_ref_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_act_not_ref_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);

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
			invoke((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk02_RsltR createChk02_RsltR(){
			return mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.create();
		}

		/**
		 * Chk02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> createChk02_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0020.Ins01_CndR up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> down0;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);
			up4 = mcframe.serverMSBH.MSBHL0020.Ins01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);

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
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Ins01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_RsltR createIns01_RsltR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.create();
		}

		/**
		 * Ins01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> createIns01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_RsltR.class);
		}

		/**
		 * Ins01_ApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_ApdR createIns01_ApdR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.create();
		}

		/**
		 * Ins01_ApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> createIns01_ApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_ApdR.class);
		}

		/**
		 * Ins01_PayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_PayActR createIns01_PayActR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.create();
		}

		/**
		 * Ins01_PayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> createIns01_PayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_PayActR.class);
		}

		/**
		 * Ins01_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR createIns01_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.create();
		}

		/**
		 * Ins01_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> createIns01_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR.class);
		}

		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Ins01_CndR createIns01_CndR(){
			return mcframe.serverMSBH.MSBHL0020.Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_act_not_ref_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_ApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_PayActR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_AdvPayActR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0020.Ins01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0020.Ins01_CndR up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
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
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);

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
			invoke((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Chk02_RsltR createDel01_RsltR(){
			return mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.create();
		}

		/**
		 * Del01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> createDel01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Chk02_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Chk02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 支払通知書を発行する。<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0020.Prnt01_CndR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR> down0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR.class);
			up1 = mcframe.serverMSBH.MSBHL0020.Prnt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR.class);

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
			invoke((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prnt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR createPrnt01_RsltR(){
			return mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR.create();
		}

		/**
		 * Prnt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR> createPrnt01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR.class);
		}

		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0020.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBH.MSBHL0020.Prnt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0020.Prnt01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0020.Prnt01_CndR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0020.Prnt01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdListReg)MSBHL_PaySchdListReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}