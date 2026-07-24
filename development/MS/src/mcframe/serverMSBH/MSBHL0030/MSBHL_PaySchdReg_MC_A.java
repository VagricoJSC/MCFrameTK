package mcframe.serverMSBH.MSBHL0030;

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
 * "MSBHL_PaySchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PaySchdReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL0030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PaySchdReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0030_Srch01_INFO;
		this.aSrch01 = ((MSBHL_PaySchdReg)this).new Srch01();
	}

	public static MSBHL_PaySchdReg.Srch01 crtSrch01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
		p.addDownBlock(aSrch01.down4());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_CndR.create();
	}

	/**
	 * Srch01_RsltChkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR createSrch01_RsltChkR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR.create();
	}

	/**
	 * Srch01_RsltApdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR createSrch01_RsltApdR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR.create();
	}

	/**
	 * Srch01_RsltApdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR> createSrch01_RsltApdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR.class);
	}

	/**
	 * Srch01_RsltSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR createSrch01_RsltSchdR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR.create();
	}

	/**
	 * Srch01_RsltSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR> createSrch01_RsltSchdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR.class);
	}

	/**
	 * Srch01_RsltActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR createSrch01_RsltActR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.create();
	}

	/**
	 * Srch01_RsltActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> createSrch01_RsltActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
	}

	/**
	 * Srch01_RsltAdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR createSrch01_RsltAdvPayActR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.create();
	}

	/**
	 * Srch01_RsltAdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> createSrch01_RsltAdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);
	}
	protected MSBHL_PaySchdReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBHL0030_Srch02_INFO;
		this.aSrch02 = ((MSBHL_PaySchdReg)this).new Srch02();
	}

	public static MSBHL_PaySchdReg.Srch02 crtSrch02() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
		p.addDownBlock(aSrch02.down1());
		p.addDownBlock(aSrch02.down2());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Srch02_CndR.create();
	}

	/**
	 * Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch02_RsltR createSrch02_RsltR(){
		return mcframe.serverMSBH.MSBHL0030.Srch02_RsltR.create();
	}

	/**
	 * Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch02_RsltR> createSrch02_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch02_RsltR.class);
	}

	/**
	 * Srch02_RsltActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR createSrch02_RsltActR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.create();
	}

	/**
	 * Srch02_RsltActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> createSrch02_RsltActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
	}

	/**
	 * Srch02_RsltAdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR createSrch02_RsltAdvPayActR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.create();
	}

	/**
	 * Srch02_RsltAdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> createSrch02_RsltAdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);
	}
	protected MSBHL_PaySchdReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBHL0030_Sprt01_INFO;
		this.aSprt01 = ((MSBHL_PaySchdReg)this).new Sprt01();
	}

	public static MSBHL_PaySchdReg.Sprt01 crtSprt01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
	public mcframe.serverMSBH.MSBHL0030.Sprt01_CndR createSprt01_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt01_CndR.create();
	}

	/**
	 * Sprt01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> createSprt01_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_CndR.class);
	}

	/**
	 * Sprt01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR createSprt01_RsltR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR.create();
	}

	/**
	 * Sprt01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR> createSprt01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR.class);
	}
	protected MSBHL_PaySchdReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBHL0030_Sprt02_INFO;
		this.aSprt02 = ((MSBHL_PaySchdReg)this).new Sprt02();
	}

	public static MSBHL_PaySchdReg.Sprt02 crtSprt02() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initSprt02();
		return lgc.aSprt02;
	}

	protected void paramSprt02(MCParam p) {
		if (this.aSprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt02.up0());
		p.addUpBlock(aSprt02.up1());
		p.addUpBlock(aSprt02.up2());
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
	public mcframe.serverMSBH.MSBHL0030.Sprt02_CndR createSprt02_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt02_CndR.create();
	}

	/**
	 * Sprt02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndR> createSprt02_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndR.class);
	}

	/**
	 * Sprt02_CndPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR createSprt02_CndPayActR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR.create();
	}

	/**
	 * Sprt02_CndPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR> createSprt02_CndPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR.class);
	}

	/**
	 * Sprt02_CndAdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR createSprt02_CndAdvPayActR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR.create();
	}

	/**
	 * Sprt02_CndAdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR> createSprt02_CndAdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR.class);
	}

	/**
	 * Sprt02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR createSprt02_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.create();
	}

	/**
	 * Sprt02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> createSprt02_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.class);
	}
	protected MSBHL_PaySchdReg.Sprt03 aSprt03;

	protected void initSprt03() {
		this.info = PDef.MS_MSBHL0030_Sprt03_INFO;
		this.aSprt03 = ((MSBHL_PaySchdReg)this).new Sprt03();
	}

	public static MSBHL_PaySchdReg.Sprt03 crtSprt03() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
	public mcframe.serverMSBH.MSBHL0030.Sprt03_CndR createSprt03_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt03_CndR.create();
	}
	protected MSBHL_PaySchdReg.Sprt04 aSprt04;

	protected void initSprt04() {
		this.info = PDef.MS_MSBHL0030_Sprt04_INFO;
		this.aSprt04 = ((MSBHL_PaySchdReg)this).new Sprt04();
	}

	public static MSBHL_PaySchdReg.Sprt04 crtSprt04() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initSprt04();
		return lgc.aSprt04;
	}

	protected void paramSprt04(MCParam p) {
		if (this.aSprt04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt04.up0());
		p.addDownBlock(aSprt04.down0());
	}

	protected void doSprt04() {
		aSprt04.call();
	};

	/**
	 * Sprt04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt04_CndR createSprt04_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt04_CndR.create();
	}

	/**
	 * Sprt04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> createSprt04_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt04_CndR.class);
	}
	protected MSBHL_PaySchdReg.Sprt05 aSprt05;

	protected void initSprt05() {
		this.info = PDef.MS_MSBHL0030_Sprt05_INFO;
		this.aSprt05 = ((MSBHL_PaySchdReg)this).new Sprt05();
	}

	public static MSBHL_PaySchdReg.Sprt05 crtSprt05() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initSprt05();
		return lgc.aSprt05;
	}

	protected void paramSprt05(MCParam p) {
		if (this.aSprt05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt05.up0());
		p.addDownBlock(aSprt05.down0());
	}

	protected void doSprt05() {
		aSprt05.call();
	};

	/**
	 * Sprt05_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt05_CndR createSprt05_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt05_CndR.create();
	}

	/**
	 * Sprt05_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR createSprt05_RsltR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.create();
	}

	/**
	 * Sprt05_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> createSprt05_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
	}
	protected MSBHL_PaySchdReg.Sprt06 aSprt06;

	protected void initSprt06() {
		this.info = PDef.MS_MSBHL0030_Sprt06_INFO;
		this.aSprt06 = ((MSBHL_PaySchdReg)this).new Sprt06();
	}

	public static MSBHL_PaySchdReg.Sprt06 crtSprt06() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initSprt06();
		return lgc.aSprt06;
	}

	protected void paramSprt06(MCParam p) {
		if (this.aSprt06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt06.up0());
		p.addDownBlock(aSprt06.down0());
	}

	protected void doSprt06() {
		aSprt06.call();
	};

	/**
	 * Sprt06_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt05_CndR createSprt06_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt05_CndR.create();
	}

	/**
	 * Sprt06_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR createSprt06_RsltR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.create();
	}

	/**
	 * Sprt06_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> createSprt06_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);
	}
	protected MSBHL_PaySchdReg.Sprt07 aSprt07;

	protected void initSprt07() {
		this.info = PDef.MS_MSBHL0030_Sprt07_INFO;
		this.aSprt07 = ((MSBHL_PaySchdReg)this).new Sprt07();
	}

	public static MSBHL_PaySchdReg.Sprt07 crtSprt07() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initSprt07();
		return lgc.aSprt07;
	}

	protected void paramSprt07(MCParam p) {
		if (this.aSprt07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt07.up0());
		p.addDownBlock(aSprt07.down0());
	}

	protected void doSprt07() {
		aSprt07.call();
	};

	/**
	 * Sprt07_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Sprt07_CndR createSprt07_CndR(){
		return mcframe.serverMSBH.MSBHL0030.Sprt07_CndR.create();
	}

	/**
	 * Sprt07_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR createSprt07_RsltR(){
		return mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR.create();
	}
	protected MSBHL_PaySchdReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBHL0030_Chk01_INFO;
		this.aChk01 = ((MSBHL_PaySchdReg)this).new Chk01();
	}

	public static MSBHL_PaySchdReg.Chk01 crtChk01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
		p.addUpBlock(aChk01.up4());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
		p.addDownBlock(aChk01.down3());
		p.addDownBlock(aChk01.down4());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
		return mcframe.serverMSBH.MSBHL0030.HdrR.create();
	}

	/**
	 * DtlApdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.DtlApdR createDtlApdR(){
		return mcframe.serverMSBH.MSBHL0030.DtlApdR.create();
	}

	/**
	 * DtlApdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> createDtlApdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
	}

	/**
	 * DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.DtlSchdR createDtlSchdR(){
		return mcframe.serverMSBH.MSBHL0030.DtlSchdR.create();
	}

	/**
	 * DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> createDtlSchdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
	}

	/**
	 * DtlPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.DtlPayActR createDtlPayActR(){
		return mcframe.serverMSBH.MSBHL0030.DtlPayActR.create();
	}

	/**
	 * DtlPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> createDtlPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
	}

	/**
	 * DtlAdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR createDtlAdvPayActR(){
		return mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.create();
	}

	/**
	 * DtlAdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> createDtlAdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
	}
	protected MSBHL_PaySchdReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBHL0030_Chk02_INFO;
		this.aChk02 = ((MSBHL_PaySchdReg)this).new Chk02();
	}

	public static MSBHL_PaySchdReg.Chk02 crtChk02() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
		p.addUpBlock(aChk02.up2());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
		p.addDownBlock(aChk02.down2());
	}

	protected void doChk02() {
		aChk02.call();
	};
	protected MSBHL_PaySchdReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBHL0030_Chk03_INFO;
		this.aChk03 = ((MSBHL_PaySchdReg)this).new Chk03();
	}

	public static MSBHL_PaySchdReg.Chk03 crtChk03() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
	protected MSBHL_PaySchdReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBHL0030_Ins01_INFO;
		this.aIns01 = ((MSBHL_PaySchdReg)this).new Ins01();
	}

	public static MSBHL_PaySchdReg.Ins01 crtIns01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
		p.addDownBlock(aIns01.down1());
		p.addDownBlock(aIns01.down2());
	}

	protected void doIns01() {
		aIns01.call();
	};
	protected MSBHL_PaySchdReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBHL0030_Upd01_INFO;
		this.aUpd01 = ((MSBHL_PaySchdReg)this).new Upd01();
	}

	public static MSBHL_PaySchdReg.Upd01 crtUpd01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
		p.addUpBlock(aUpd01.up2());
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
		p.addDownBlock(aUpd01.down0());
		p.addDownBlock(aUpd01.down1());
		p.addDownBlock(aUpd01.down2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};
	protected MSBHL_PaySchdReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBHL0030_Del01_INFO;
		this.aDel01 = ((MSBHL_PaySchdReg)this).new Del01();
	}

	public static MSBHL_PaySchdReg.Del01 crtDel01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
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
		p.addUpBlock(aDel01.up2());
	}

	protected void doDel01() {
		aDel01.call();
	};
	protected MSBHL_PaySchdReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBHL0030_Prnt01_INFO;
		this.aPrnt01 = ((MSBHL_PaySchdReg)this).new Prnt01();
	}

	public static MSBHL_PaySchdReg.Prnt01 crtPrnt01() {
		MSBHL_PaySchdReg lgc = new MSBHL_PaySchdReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を検索する。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> down4;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.Srch01_CndR.create();
			down0 = mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR.class);
			down3 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
			down4 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);

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
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_CndR.create();
		}

		/**
		 * Srch01_RsltChkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR createSrch01_RsltChkR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR.create();
		}

		/**
		 * Srch01_RsltApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR createSrch01_RsltApdR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR.create();
		}

		/**
		 * Srch01_RsltApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR> createSrch01_RsltApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR.class);
		}

		/**
		 * Srch01_RsltSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR createSrch01_RsltSchdR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR.create();
		}

		/**
		 * Srch01_RsltSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR> createSrch01_RsltSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR.class);
		}

		/**
		 * Srch01_RsltActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR createSrch01_RsltActR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.create();
		}

		/**
		 * Srch01_RsltActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> createSrch01_RsltActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
		}

		/**
		 * Srch01_RsltAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR createSrch01_RsltAdvPayActR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.create();
		}

		/**
		 * Srch01_RsltAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> createSrch01_RsltAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_can_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>psppl_cd</td></tr>
		 * 	<tr><td><br></td><td>psppl_nm</td></tr>
		 * 	<tr><td><br></td><td>psppl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ap_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_rev</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>last_pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_amt</td></tr>
		 * 	<tr><td><br></td><td>bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_amt</td></tr>
		 * 	<tr><td><br></td><td>sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_pay_amt</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_ym</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>crryovr_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>org_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>co_src_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>co_src_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>co_src_trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>co_src_trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltApdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>setoff_act_amt</td></tr>
		 * 	<tr><td><br></td><td>not_proc_bal</td></tr>
		 * 	<tr><td><br></td><td>note_no</td></tr>
		 * 	<tr><td><br></td><td>note_typ</td></tr>
		 * 	<tr><td><br></td><td>note_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>note_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_dt</td></tr>
		 * 	<tr><td><br></td><td>due_dt</td></tr>
		 * 	<tr><td><br></td><td>note_days</td></tr>
		 * 	<tr><td><br></td><td>drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_bank_nm</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>draw_branch_nm</td></tr>
		 * 	<tr><td><br></td><td>endrsr</td></tr>
		 * 	<tr><td><br></td><td>accptr</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sw_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_appl_amt</td></tr>
		 * 	<tr><td><br></td><td>last_setoff_act_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltSchdR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 支払対象の買掛明細を検索する（画面遷移専用検索ロジック）。<br>
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
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Srch02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch02_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> down2;
		
		/**
		 * 連携情報 MSBHL5030<p>
		 *
		 * 連携先 mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03 （{@link #Srch03}）<br>
		 */
		public final String MSBHL5030 = "MSBHL5030";

		/**
		 * 連携オペレーション Srch03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR （{@link #Srch03_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR&gt; （{@link #Srch03_down0}）<br>
		 */
		public final mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03 Srch03;
		// 連携ロジック上り
		public final mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR Srch03_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> Srch03_down0;
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.Srch02_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch02_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);

			// 連携オペレーションの初期化
			Srch03 = mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.crtPaySchd_Srch03();
			
			// 連携オペレーションのコンテナ取得
			Srch03_up0 = (mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR)Srch03.up(0);
			Srch03_down0 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR>)Srch03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MSBHL5030, Srch03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MSBHL5030<br>
		 * up0() => mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR （{@link #Srch03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MSBHL5030)) {
				up_MSBHL5030(Srch03_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MSBHL5030<br>
		 * MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR&gt;（{@link #Srch03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MSBHL5030)) {
				down_MSBHL5030(down0(), Srch03_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Srch02_CndR.create();
		}

		/**
		 * Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch02_RsltR createSrch02_RsltR(){
			return mcframe.serverMSBH.MSBHL0030.Srch02_RsltR.create();
		}

		/**
		 * Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch02_RsltR> createSrch02_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch02_RsltR.class);
		}

		/**
		 * Srch02_RsltActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR createSrch02_RsltActR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.create();
		}

		/**
		 * Srch02_RsltActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> createSrch02_RsltActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
		}

		/**
		 * Srch02_RsltAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR createSrch02_RsltAdvPayActR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.create();
		}

		/**
		 * Srch02_RsltAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> createSrch02_RsltAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Srch02_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>crryovr_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>org_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch02_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}

		//-----------------------MSBHL5030専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMSBHL5030の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MSBHL5030(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR dest0_0, mcframe.serverMSBH.MSBHL0030.Srch02_CndR src_Srch02_Cnd){
			up_MSBHL5030_Srch03_0(dest0_0, src_Srch02_Cnd);
		}
		
		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch03_0() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch03_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_mode_flg", "upd_mode_flg");
				addColumnPathMap("srch_tax_diff_flg", "srch_tax_diff_flg");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("pay_spot_flg", "pay_spot_flg");
				addColumnPathMap("bsppl_cl_dt_fr", "bsppl_cl_dt_fr");
				addColumnPathMap("bsppl_cl_dt_to", "bsppl_cl_dt_to");
				addColumnPathMap("pay_xrate", "pay_xrate");
				addColumnPathMap("reg_dt", "reg_dt");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch03_0(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR dest, mcframe.serverMSBH.MSBHL0030.Srch02_CndR src) {
			createMap_up_MSBHL5030_Srch03_0().copy(dest, src);
		}

		//-----------------------MSBHL5030専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMSBHL5030の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MSBHL5030(MCList<mcframe.serverMSBH.MSBHL0030.Srch02_RsltR> dest_Srch02_Rslt, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> src0_0){
			down_MSBHL5030_Srch03_0(dest_Srch02_Rslt, src0_0);
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MSBHL5030_Srch03_0() {
			MCRowMapper map = new Map_down_MSBHL5030_Srch03_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MSBHL5030_Srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("pay_mtd_typ", "pay_mtd_typ");
				addColumnPathMap("pay_mtd_typ_nm", "pay_mtd_typ_nm");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("trd_cur_nm", "trd_cur_nm");
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("trd_cur_upri_dec_place", "trd_cur_upri_dec_place");
				addColumnPathMap("crryovr_times", "crryovr_times");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_nm", "tax_nm");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("base_purc_ac_dt", "base_purc_ac_dt");
				addColumnPathMap("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks");
				addColumnPathMap("pay_xrate", "pay_xrate");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("base_cur_nm", "base_cur_nm");
				addColumnPathMap("base_cur_amt_dec_place", "base_cur_amt_dec_place");
				addColumnPathMap("base_cur_upri_dec_place", "base_cur_upri_dec_place");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("base_cur_inc_tax_amt", "base_cur_inc_tax_amt");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("bsppl_cl_dt", "bsppl_cl_dt");
				addColumnPathMap("bsppl_cl_day", "bsppl_cl_day");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("pay_basis_dt", "pay_basis_dt");
				addColumnPathMap("pay_schd_dt", "pay_schd_dt");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sppl_nm", "sppl_nm");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sppl_itm_cd", "sppl_itm_cd");
				addColumnPathMap("sppl_itm_nm", "sppl_itm_nm");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("act_dt", "act_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("crryovr_flg", "crryovr_flg");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ap_typ_nm", "ap_typ_nm");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_nm", "trd_nm");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("slip_sts_typ", "slip_sts_typ");
				addColumnPathMap("slip_sts_typ_nm", "slip_sts_typ_nm");
				addColumnPathMap("ap_d_no", "ap_d_no");
				addColumnPathMap("po_no", "po_no");
				addColumnPathMap("po_d_no", "po_d_no");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("purc_act_d_no", "purc_act_d_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("org_ap_d_no", "org_ap_d_no");
				addColumnPathMap("crryovr_ap_d_no", "crryovr_ap_d_no");
				addColumnPathMap("crryovr_src_ap_d_no", "crryovr_src_ap_d_no");
				addColumnPathMap("sw_src_pay_schd_no", "sw_src_pay_schd_no");
				addColumnPathMap("sw_src_rcv_bill_no", "sw_src_rcv_bill_no");
				addColumnPathMap("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("trd_cur_proc_upri", "trd_cur_proc_upri");
				addColumnPathMap("trd_cur_proc_amt", "trd_cur_proc_amt");
				addColumnPathMap("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri");
				addColumnPathMap("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt");
				addColumnPathMap("base_cur_proc_upri", "base_cur_proc_upri");
				addColumnPathMap("base_cur_proc_amt", "base_cur_proc_amt");
				addColumnPathMap("base_cur_onr_prov_upri", "base_cur_onr_prov_upri");
				addColumnPathMap("base_cur_onr_prov_amt", "base_cur_onr_prov_amt");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_flg", "outsrc_flg");
				addColumnPathMap("ap_d_upd_cntr", "ap_d_upd_cntr");
				addColumnPathMap("ref_ap_d_no", "ref_ap_d_no");
				addColumnPathMap("amt_disp_pm", "amt_disp_pm");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MSBHL5030_Srch03_0(mcframe.serverMSBH.MSBHL0030.Srch02_RsltR r_dest, mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MSBHL5030_Srch03_0(MCList<mcframe.serverMSBH.MSBHL0030.Srch02_RsltR> dest, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> src) {
			MCRowMapper _rm = createMap_down_MSBHL5030_Srch03_0();
			for(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR r_src : src){
				mcframe.serverMSBH.MSBHL0030.Srch02_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MSBHL5030_Srch03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 支払予定制御マスタに従い支払予定を自動設定する。<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR> down0;
		/** [Sprt01_Cnd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> aSprt01_Cnd;
		
		/**
		 * 連携情報 MSBHL5030<p>
		 *
		 * 連携先 mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch01 （{@link #Srch01}）<br>
		 */
		public final String MSBHL5030 = "MSBHL5030";

		/**
		 * 連携オペレーション Srch01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR&gt; （{@link #Srch01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR&gt; （{@link #Srch01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR&gt; （{@link #Srch01_down1}）<br>
		 */
		public final mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch01 Srch01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> Srch01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> Srch01_down0;
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> Srch01_down1;
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR.class);
			aSprt01_Cnd = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_CndR.class);

			// 連携オペレーションの初期化
			Srch01 = mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.crtPaySchd_Srch01();
			
			// 連携オペレーションのコンテナ取得
			Srch01_up0 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR>)Srch01.up(0);
			Srch01_down0 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR>)Srch01.down(0);
			Srch01_down1 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR>)Srch01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(MSBHL5030, Srch01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MSBHL5030<br>
		 * up0() => MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR&gt; （{@link #Srch01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MSBHL5030)) {
				up_MSBHL5030(Srch01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MSBHL5030<br>
		 * MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR&gt;（{@link #Srch01_down0}）=> aSprt01_Cnd<br>
		 * MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR&gt;（{@link #Srch01_down1}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MSBHL5030)) {
				down_MSBHL5030(aSprt01_Cnd, down0(), Srch01_down0, Srch01_down1);
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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt01_CndR createSprt01_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt01_CndR.create();
		}

		/**
		 * Sprt01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> createSprt01_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_CndR.class);
		}

		/**
		 * Sprt01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR createSprt01_RsltR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR.create();
		}

		/**
		 * Sprt01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR> createSprt01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_act_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR> down0() {
			return down0;
		}


		/**
		 * [Sprt01_Cnd]ブロックのコンテナaSprt01_CndLを返します。
		 *
		 * @return Sprt01_CndL
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> Sprt01_Cnd() {
			return aSprt01_Cnd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}

		//-----------------------MSBHL5030専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMSBHL5030の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MSBHL5030(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> dest0_0, MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> src_Sprt01_Cnd){
			up_MSBHL5030_Srch01_0(dest0_0, src_Sprt01_Cnd);
		}
		
		/**
		 * 連携処理MSBHL5030_Srch01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch01_0() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch01_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("ap_d_no", "ap_d_no");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("pay_basis_dt", "pay_basis_dt");
				addColumnPathMap("pay_schd_dt", "pay_schd_dt");
				addColumnPathMap("bsppl_cl_dt", "bsppl_cl_dt");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("is_ref_xrate", "is_ref_xrate");
				addColumnPathMap("base_dt", "base_dt");
				addColumnPathMap("zero_flg", "zero_flg");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch01_0(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR r_dest, mcframe.serverMSBH.MSBHL0030.Sprt01_CndR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MSBHL5030_Srch01_0(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> dest, MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> src) {
			MCRowMapper _rm = createMap_up_MSBHL5030_Srch01_0();
			for(mcframe.serverMSBH.MSBHL0030.Sprt01_CndR r_src : src){
				mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MSBHL5030_Srch01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MSBHL5030専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMSBHL5030の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MSBHL5030(MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> dest_Sprt01_Cnd, MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR> dest_Sprt01_Rslt, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> src0_0, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> src0_1){
			down_MSBHL5030_Srch01_0(dest_Sprt01_Cnd, src0_0);
			down_MSBHL5030_Srch01_1(dest_Sprt01_Rslt, src0_1);
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MSBHL5030_Srch01_0() {
			MCRowMapper map = new Map_down_MSBHL5030_Srch01_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MSBHL5030_Srch01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("err_flg", "err_flg");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MSBHL5030_Srch01_0(mcframe.serverMSBH.MSBHL0030.Sprt01_CndR r_dest, mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MSBHL5030_Srch01_0(MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_CndR> dest, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> src) {
			MCRowMapper _rm = createMap_down_MSBHL5030_Srch01_0();
			for(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR r_src : src){
				mcframe.serverMSBH.MSBHL0030.Sprt01_CndR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MSBHL5030_Srch01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MSBHL5030_Srch01_1() {
			MCRowMapper map = new Map_down_MSBHL5030_Srch01_1();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MSBHL5030_Srch01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ap_sttl_cd", "ap_sttl_cd");
				addColumnPathMap("ap_sttl_nm", "ap_sttl_nm");
				addColumnPathMap("ap_sttl_typ", "ap_sttl_typ");
				addColumnPathMap("ap_sttl_typ_nm", "ap_sttl_typ_nm");
				addColumnPathMap("ap_setoff_act_flg", "ap_setoff_act_flg");
				addColumnPathMap("pay_schd_dt", "pay_schd_dt");
				addColumnPathMap("pay_bank_ac_cd", "pay_bank_ac_cd");
				addColumnPathMap("pay_bank_ac_nm", "pay_bank_ac_nm");
				addColumnPathMap("bank_ac_cd", "bank_ac_cd");
				addColumnPathMap("bank_ac_nm", "bank_ac_nm");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_com_paid_tax_cd", "trd_cur_com_paid_tax_cd");
				addColumnPathMap("trd_cur_com_paid_tax_nm", "trd_cur_com_paid_tax_nm");
				addColumnPathMap("trd_cur_com_paid_tax_rate", "trd_cur_com_paid_tax_rate");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ap_setoff_typ", "ap_setoff_typ");
				addColumnPathMap("ap_setoff_typ_nm", "ap_setoff_typ_nm");
				addColumnPathMap("setoff_cd", "setoff_cd");
				addColumnPathMap("setoff_nm", "setoff_nm");
				addColumnPathMap("so_dpt_cd", "so_dpt_cd");
				addColumnPathMap("so_dpt_nm", "so_dpt_nm");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("pay_dpt_cd", "pay_dpt_cd");
				addColumnPathMap("pay_dpt_nm", "pay_dpt_nm");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ap_typ_nm", "ap_typ_nm");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MSBHL5030_Srch01_1(mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR r_dest, mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MSBHL5030_Srch01_1(MCList<mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR> dest, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> src) {
			MCRowMapper _rm = createMap_down_MSBHL5030_Srch01_1();
			for(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR r_src : src){
				mcframe.serverMSBH.MSBHL0030.Sprt01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MSBHL5030_Srch01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 支払対象の買掛明細に対する税差額分の買掛明細を取得する。<br>
	 */
	abstract public class Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> down0;
		
		/**
		 * 連携情報 MSBHL5030<p>
		 *
		 * 連携先 mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch05 （{@link #Srch05}）<br>
		 */
		public final String MSBHL5030 = "MSBHL5030";

		/**
		 * 連携オペレーション Srch05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch05}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR&gt; （{@link #Srch05_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR&gt; （{@link #Srch05_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR&gt; （{@link #Srch05_up2}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR&gt; （{@link #Srch05_down0}）<br>
		 */
		public final mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch05 Srch05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> Srch05_up0;
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> Srch05_up1;
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> Srch05_up2;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> Srch05_down0;
		
		// コンストラクタ
		protected Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.class);

			// 連携オペレーションの初期化
			Srch05 = mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.crtPaySchd_Srch05();
			
			// 連携オペレーションのコンテナ取得
			Srch05_up0 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR>)Srch05.up(0);
			Srch05_up1 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR>)Srch05.up(1);
			Srch05_up2 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR>)Srch05.up(2);
			Srch05_down0 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR>)Srch05.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MSBHL5030, Srch05);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MSBHL5030<br>
		 * up0() => MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR&gt; （{@link #Srch05_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR&gt; （{@link #Srch05_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR&gt; （{@link #Srch05_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MSBHL5030)) {
				up_MSBHL5030(Srch05_up0, Srch05_up1, Srch05_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MSBHL5030<br>
		 * MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR&gt;（{@link #Srch05_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MSBHL5030)) {
				down_MSBHL5030(down0(), Srch05_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt02_CndR createSprt02_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt02_CndR.create();
		}

		/**
		 * Sprt02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndR> createSprt02_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndR.class);
		}

		/**
		 * Sprt02_CndPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR createSprt02_CndPayActR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR.create();
		}

		/**
		 * Sprt02_CndPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR> createSprt02_CndPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR.class);
		}

		/**
		 * Sprt02_CndAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR createSprt02_CndAdvPayActR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR.create();
		}

		/**
		 * Sprt02_CndAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR> createSprt02_CndAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR.class);
		}

		/**
		 * Sprt02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR createSprt02_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.create();
		}

		/**
		 * Sprt02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> createSprt02_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>crryovr_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>org_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}

		//-----------------------MSBHL5030専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMSBHL5030の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MSBHL5030(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> dest0_0, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> dest0_1, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> dest0_2, MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndR> src_Sprt02_Cnd, MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR> src_Sprt02_CndPayAct, MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR> src_Sprt02_CndAdvPayAct){
			up_MSBHL5030_Srch05_0(dest0_0, src_Sprt02_Cnd);
			up_MSBHL5030_Srch05_1(dest0_1, src_Sprt02_CndPayAct);
			up_MSBHL5030_Srch05_2(dest0_2, src_Sprt02_CndAdvPayAct);
		}
		
		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch05_0() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch05_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("ap_d_no", "ap_d_no");
				addColumnPathMap("ref_ap_d_no", "ref_ap_d_no");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("pay_xrate", "pay_xrate");
				addColumnPathMap("xrate_base_dt", "xrate_base_dt");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch05_0(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR r_dest, mcframe.serverMSBH.MSBHL0030.Sprt02_CndR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MSBHL5030_Srch05_0(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> dest, MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndR> src) {
			MCRowMapper _rm = createMap_up_MSBHL5030_Srch05_0();
			for(mcframe.serverMSBH.MSBHL0030.Sprt02_CndR r_src : src){
				mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MSBHL5030_Srch05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch05_1() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch05_1();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch05_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("pay_act_d_no", "pay_act_d_no");
				addColumnPathMap("pay_act_d_seq", "pay_act_d_seq");
				addColumnPathMap("pay_xrate", "pay_xrate");
				addColumnPathMap("xrate_base_dt", "xrate_base_dt");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch05_1(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR r_dest, mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MSBHL5030_Srch05_1(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> dest, MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR> src) {
			MCRowMapper _rm = createMap_up_MSBHL5030_Srch05_1();
			for(mcframe.serverMSBH.MSBHL0030.Sprt02_CndPayActR r_src : src){
				mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MSBHL5030_Srch05_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch05_2() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch05_2();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch05_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("adv_pay_act_no", "adv_pay_act_no");
				addColumnPathMap("adv_pay_act_seq", "adv_pay_act_seq");
				addColumnPathMap("pay_xrate", "pay_xrate");
				addColumnPathMap("xrate_base_dt", "xrate_base_dt");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch05_2(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR r_dest, mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch05の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MSBHL5030_Srch05_2(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> dest, MCList<mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR> src) {
			MCRowMapper _rm = createMap_up_MSBHL5030_Srch05_2();
			for(mcframe.serverMSBH.MSBHL0030.Sprt02_CndAdvPayActR r_src : src){
				mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MSBHL5030_Srch05_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MSBHL5030専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMSBHL5030の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MSBHL5030(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> dest_Sprt02_Rslt, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> src0_0){
			down_MSBHL5030_Srch05_0(dest_Sprt02_Rslt, src0_0);
		}

		/**
		 * 連携処理MSBHL5030_Srch05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MSBHL5030_Srch05_0() {
			MCRowMapper map = new Map_down_MSBHL5030_Srch05_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MSBHL5030_Srch05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("pay_mtd_typ", "pay_mtd_typ");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("bsppl_cl_dt", "bsppl_cl_dt");
				addColumnPathMap("bsppl_cl_day", "bsppl_cl_day");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("pay_basis_dt", "pay_basis_dt");
				addColumnPathMap("pay_schd_dt", "pay_schd_dt");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sppl_itm_cd", "sppl_itm_cd");
				addColumnPathMap("sppl_itm_nm", "sppl_itm_nm");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("act_dt", "act_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("crryovr_flg", "crryovr_flg");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("slip_sts_typ", "slip_sts_typ");
				addColumnPathMap("ap_d_no", "ap_d_no");
				addColumnPathMap("po_no", "po_no");
				addColumnPathMap("po_d_no", "po_d_no");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("purc_act_d_no", "purc_act_d_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("org_ap_d_no", "org_ap_d_no");
				addColumnPathMap("crryovr_ap_d_no", "crryovr_ap_d_no");
				addColumnPathMap("crryovr_src_ap_d_no", "crryovr_src_ap_d_no");
				addColumnPathMap("sw_src_pay_schd_no", "sw_src_pay_schd_no");
				addColumnPathMap("sw_src_rcv_bill_no", "sw_src_rcv_bill_no");
				addColumnPathMap("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks");
				addColumnPathMap("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("trd_cur_proc_upri", "trd_cur_proc_upri");
				addColumnPathMap("trd_cur_proc_amt", "trd_cur_proc_amt");
				addColumnPathMap("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri");
				addColumnPathMap("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt");
				addColumnPathMap("base_cur_proc_upri", "base_cur_proc_upri");
				addColumnPathMap("base_cur_proc_amt", "base_cur_proc_amt");
				addColumnPathMap("base_cur_onr_prov_upri", "base_cur_onr_prov_upri");
				addColumnPathMap("base_cur_onr_prov_amt", "base_cur_onr_prov_amt");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_flg", "outsrc_flg");
				addColumnPathMap("ref_ap_d_no", "ref_ap_d_no");
				addColumnPathMap("amt_disp_pm", "amt_disp_pm");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch05の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MSBHL5030_Srch05_0(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR r_dest, mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch05の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MSBHL5030_Srch05_0(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> dest, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> src) {
			MCRowMapper _rm = createMap_down_MSBHL5030_Srch05_0();
			for(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR r_src : src){
				mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MSBHL5030_Srch05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt03オペレーション.<p>
	 *
	 * 売掛金相殺、および有償支給相殺の相殺対象残高を取得する。<br>
	 */
	abstract public class Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final mcframe.serverMSBH.MSBHL0030.Sprt03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Sprt03_CndR down0;
		
		
		// コンストラクタ
		protected Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.Sprt03_CndR.create();
			down0 = mcframe.serverMSBH.MSBHL0030.Sprt03_CndR.create();

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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt03_CndR createSprt03_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt03_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Sprt03_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt03_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>setoff_limit_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Sprt03_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt03_CndR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt04オペレーション.<p>
	 *
	 * 今回有償支給額を取得する。<br>
	 */
	abstract public class Sprt04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> down0;
		
		/**
		 * 連携情報 MSBHL5080<p>
		 *
		 * 連携先 mcframe.serverMSBH.MSBHL5080.MSBHL_ApSetoffService.ApSetoff_Srch03 （{@link #Srch03}）<br>
		 */
		public final String MSBHL5080 = "MSBHL5080";

		/**
		 * 連携オペレーション Srch03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBH.MSBHL5080.MSBHL_ApSetoffService.ApSetoff_Srch03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR&gt; （{@link #Srch03_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR&gt; （{@link #Srch03_down0}）<br>
		 */
		public final mcframe.serverMSBH.MSBHL5080.MSBHL_ApSetoffService.ApSetoff_Srch03 Srch03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> Srch03_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> Srch03_down0;
		
		// コンストラクタ
		protected Sprt04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt04_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt04_CndR.class);

			// 連携オペレーションの初期化
			Srch03 = mcframe.serverMSBH.MSBHL5080.MSBHL_ApSetoffService.crtApSetoff_Srch03();
			
			// 連携オペレーションのコンテナ取得
			Srch03_up0 = (MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR>)Srch03.up(0);
			Srch03_down0 = (MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR>)Srch03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MSBHL5080, Srch03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MSBHL5080<br>
		 * up0() => MCList&lt;mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR&gt; （{@link #Srch03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MSBHL5080)) {
				up_MSBHL5080(Srch03_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MSBHL5080<br>
		 * MCList&lt;mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR&gt;（{@link #Srch03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MSBHL5080)) {
				down_MSBHL5080(down0(), Srch03_down0);
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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt04_CndR createSprt04_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt04_CndR.create();
		}

		/**
		 * Sprt04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> createSprt04_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Sprt04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>onr_prov_bal</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}

		//-----------------------MSBHL5080専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMSBHL5080の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MSBHL5080(MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> dest0_0, MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> src_Sprt04_Cnd){
			up_MSBHL5080_Srch03_0(dest0_0, src_Sprt04_Cnd);
		}
		
		/**
		 * 連携処理MSBHL5080_Srch03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5080_Srch03_0() {
			MCRowMapper map = new Map_up_MSBHL5080_Srch03_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5080_Srch03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5080_Srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ap_d_no", "ap_d_no");
			}
		}

		/**
		 * 連携処理MSBHL5080_Srch03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MSBHL5080_Srch03_0(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR r_dest, mcframe.serverMSBH.MSBHL0030.Sprt04_CndR r_src) {
		}

		/**
		 * 連携処理MSBHL5080_Srch03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MSBHL5080_Srch03_0(MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> dest, MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> src) {
			MCRowMapper _rm = createMap_up_MSBHL5080_Srch03_0();
			for(mcframe.serverMSBH.MSBHL0030.Sprt04_CndR r_src : src){
				mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MSBHL5080_Srch03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MSBHL5080専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMSBHL5080の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MSBHL5080(MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> dest_Sprt04_Cnd, MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> src0_0){
			down_MSBHL5080_Srch03_0(dest_Sprt04_Cnd, src0_0);
		}

		/**
		 * 連携処理MSBHL5080_Srch03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MSBHL5080_Srch03_0() {
			MCRowMapper map = new Map_down_MSBHL5080_Srch03_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5080_Srch03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MSBHL5080_Srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ap_d_no", "ap_d_no");
				addColumnPathMap("onr_prov_bal", "onr_prov_bal");
			}
		}

		/**
		 * 連携処理MSBHL5080_Srch03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MSBHL5080_Srch03_0(mcframe.serverMSBH.MSBHL0030.Sprt04_CndR r_dest, mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR r_src) {
		}

		/**
		 * 連携処理MSBHL5080_Srch03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MSBHL5080_Srch03_0(MCList<mcframe.serverMSBH.MSBHL0030.Sprt04_CndR> dest, MCList<mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR> src) {
			MCRowMapper _rm = createMap_down_MSBHL5080_Srch03_0();
			for(mcframe.serverMSBH.MSBHL5080.ApSetoff_Srch03_DtlR r_src : src){
				mcframe.serverMSBH.MSBHL0030.Sprt04_CndR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MSBHL5080_Srch03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Sprt05オペレーション.<p>
	 *
	 * 支払実績を検索する。<br>
	 */
	abstract public class Sprt05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Sprt05_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> down0;
		
		
		// コンストラクタ
		protected Sprt05() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.Sprt05_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);

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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt05_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt05_CndR createSprt05_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt05_CndR.create();
		}

		/**
		 * Sprt05_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR createSprt05_RsltR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.create();
		}

		/**
		 * Sprt05_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> createSprt05_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Sprt05_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt05_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltActR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt06オペレーション.<p>
	 *
	 * 前渡金実績を検索する。<br>
	 */
	abstract public class Sprt06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Sprt05_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> down0;
		
		
		// コンストラクタ
		protected Sprt06() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.Sprt05_CndR.create();
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);

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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt06_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt05_CndR createSprt06_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt05_CndR.create();
		}

		/**
		 * Sprt06_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR createSprt06_RsltR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.create();
		}

		/**
		 * Sprt06_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> createSprt06_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Sprt05_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt05_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid</td></tr>
		 * 	<tr><td><br></td><td>base_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.Srch01_RsltAdvPayActR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt07オペレーション.<p>
	 *
	 * 前回支払予定を取得する。<br>
	 */
	abstract public class Sprt07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Sprt07_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR down0;
		
		
		// コンストラクタ
		protected Sprt07() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.Sprt07_CndR.create();
			down0 = mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR.create();

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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt07_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt07_CndR createSprt07_CndR(){
			return mcframe.serverMSBH.MSBHL0030.Sprt07_CndR.create();
		}

		/**
		 * Sprt07_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR createSprt07_RsltR(){
			return mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Sprt07_CndR
		 */
		public mcframe.serverMSBH.MSBHL0030.Sprt07_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>last_pay_schd_amt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR
		 */
		public mcframe.serverMSBH.MSBHL0030.Srch01_RsltChkR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報の新規登録・更新が可能かチェックする。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> down4;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
			up4 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
			down0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
			down3 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
			down4 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
		}

		/**
		 * DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlApdR createDtlApdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlApdR.create();
		}

		/**
		 * DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> createDtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
		}

		/**
		 * DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlSchdR createDtlSchdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlSchdR.create();
		}

		/**
		 * DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> createDtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
		}

		/**
		 * DtlPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlPayActR createDtlPayActR(){
			return mcframe.serverMSBH.MSBHL0030.DtlPayActR.create();
		}

		/**
		 * DtlPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> createDtlPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
		}

		/**
		 * DtlAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR createDtlAdvPayActR(){
			return mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.create();
		}

		/**
		 * DtlAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> createDtlAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.reg_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.accptr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> up4() {
			return up4;
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
		 * 	<tr><td><br></td><td>pay_chk.reg_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.man_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>co_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>co_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_com_paid_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_exc_com_paid</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.accptr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 支払照合、支払予定情報の取り消しが可能かチェックする。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
			down0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
		}

		/**
		 * DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlApdR createDtlApdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlApdR.create();
		}

		/**
		 * DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> createDtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
		}

		/**
		 * DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlSchdR createDtlSchdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlSchdR.create();
		}

		/**
		 * DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> createDtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>co_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>co_src_ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 支払予定明細が発行可能かチェックする。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.HdrR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			down0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();

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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
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
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
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
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を新規登録する。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
			up4 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
			down0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
		}

		/**
		 * DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlApdR createDtlApdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlApdR.create();
		}

		/**
		 * DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> createDtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
		}

		/**
		 * DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlSchdR createDtlSchdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlSchdR.create();
		}

		/**
		 * DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> createDtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
		}

		/**
		 * DtlPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlPayActR createDtlPayActR(){
			return mcframe.serverMSBH.MSBHL0030.DtlPayActR.create();
		}

		/**
		 * DtlPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> createDtlPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
		}

		/**
		 * DtlAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR createDtlAdvPayActR(){
			return mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.create();
		}

		/**
		 * DtlAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> createDtlAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.reg_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.accptr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_ntc_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を更新する。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL0030.HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
			up4 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
			down0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			down1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);

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
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
		}

		/**
		 * DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlApdR createDtlApdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlApdR.create();
		}

		/**
		 * DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> createDtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
		}

		/**
		 * DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlSchdR createDtlSchdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlSchdR.create();
		}

		/**
		 * DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> createDtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
		}

		/**
		 * DtlPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlPayActR createDtlPayActR(){
			return mcframe.serverMSBH.MSBHL0030.DtlPayActR.create();
		}

		/**
		 * DtlPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> createDtlPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlPayActR.class);
		}

		/**
		 * DtlAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR createDtlAdvPayActR(){
			return mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.create();
		}

		/**
		 * DtlAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> createDtlAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.reg_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * 	<tr><td><br></td><td>prnt_out_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.ap_setoff_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.due_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.note_days</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.drawer_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_bank_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.draw_branch_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.endrsr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.accptr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlPayActR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlAdvPayActR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_ntc_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 支払照合、支払予定情報を取り消す。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
		}

		/**
		 * DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlApdR createDtlApdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlApdR.create();
		}

		/**
		 * DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> createDtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlApdR.class);
		}

		/**
		 * DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.DtlSchdR createDtlSchdR(){
			return mcframe.serverMSBH.MSBHL0030.DtlSchdR.create();
		}

		/**
		 * DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> createDtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0030.DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlApdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0030.DtlSchdR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 支払予定明細、支払通知書を発行する。<br>
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
		private final mcframe.serverMSBH.MSBHL0030.HdrR up0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0030.HdrR.create();

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
			invoke((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR createHdrR(){
			return mcframe.serverMSBH.MSBHL0030.HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dtl_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0030.HdrR
		 */
		public mcframe.serverMSBH.MSBHL0030.HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdReg)MSBHL_PaySchdReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}