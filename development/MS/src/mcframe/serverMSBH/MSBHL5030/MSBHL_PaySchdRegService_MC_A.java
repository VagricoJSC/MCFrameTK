package mcframe.serverMSBH.MSBHL5030;

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
 * "MSBHL_PaySchdRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PaySchdRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBHL5030";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PaySchdRegService.PaySchd_Srch01 aPaySchd_Srch01;

	protected void initPaySchd_Srch01() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch01_INFO;
		this.aPaySchd_Srch01 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch01();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch01 crtPaySchd_Srch01() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch01();
		return lgc.aPaySchd_Srch01;
	}

	protected void paramPaySchd_Srch01(MCParam p) {
		if (this.aPaySchd_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch01.up0());
		p.addDownBlock(aPaySchd_Srch01.down0());
		p.addDownBlock(aPaySchd_Srch01.down1());
	}

	protected void doPaySchd_Srch01() {
		aPaySchd_Srch01.call();
	};

	/**
	 * PaySchd_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR createPaySchd_Srch01_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR.create();
	}

	/**
	 * PaySchd_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> createPaySchd_Srch01_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR.class);
	}

	/**
	 * PaySchd_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR createPaySchd_Srch01_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR.create();
	}

	/**
	 * PaySchd_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> createPaySchd_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch02 aPaySchd_Srch02;

	protected void initPaySchd_Srch02() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch02_INFO;
		this.aPaySchd_Srch02 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch02();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch02 crtPaySchd_Srch02() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch02();
		return lgc.aPaySchd_Srch02;
	}

	protected void paramPaySchd_Srch02(MCParam p) {
		if (this.aPaySchd_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch02.up0());
		p.addDownBlock(aPaySchd_Srch02.down0());
		p.addDownBlock(aPaySchd_Srch02.down1());
	}

	protected void doPaySchd_Srch02() {
		aPaySchd_Srch02.call();
	};

	/**
	 * PaySchd_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR createPaySchd_Srch02_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR.create();
	}

	/**
	 * PaySchd_Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR> createPaySchd_Srch02_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR.class);
	}

	/**
	 * PaySchd_Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR createPaySchd_Srch02_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.create();
	}

	/**
	 * PaySchd_Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> createPaySchd_Srch02_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
	}

	/**
	 * PaySchd_Srch02_PayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR createPaySchd_Srch02_PayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.create();
	}

	/**
	 * PaySchd_Srch02_PayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> createPaySchd_Srch02_PayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);
	}

	/**
	 * PaySchd_Srch02_AdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR createPaySchd_Srch02_AdvPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.create();
	}

	/**
	 * PaySchd_Srch02_AdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> createPaySchd_Srch02_AdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch03 aPaySchd_Srch03;

	protected void initPaySchd_Srch03() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch03_INFO;
		this.aPaySchd_Srch03 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch03();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch03 crtPaySchd_Srch03() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch03();
		return lgc.aPaySchd_Srch03;
	}

	protected void paramPaySchd_Srch03(MCParam p) {
		if (this.aPaySchd_Srch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch03.up0());
		p.addUpBlock(aPaySchd_Srch03.up1());
		p.addUpBlock(aPaySchd_Srch03.up2());
		p.addUpBlock(aPaySchd_Srch03.up3());
		p.addDownBlock(aPaySchd_Srch03.down0());
	}

	protected void doPaySchd_Srch03() {
		aPaySchd_Srch03.call();
	};

	/**
	 * PaySchd_Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR createPaySchd_Srch03_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR.create();
	}

	/**
	 * PaySchd_Srch03_RqstNoCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR createPaySchd_Srch03_RqstNoCndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR.create();
	}

	/**
	 * PaySchd_Srch03_RqstNoCndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> createPaySchd_Srch03_RqstNoCndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR.class);
	}

	/**
	 * PaySchd_Srch03_CndPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR createPaySchd_Srch03_CndPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.create();
	}

	/**
	 * PaySchd_Srch03_CndPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> createPaySchd_Srch03_CndPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.class);
	}

	/**
	 * PaySchd_Srch03_CndAdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR createPaySchd_Srch03_CndAdvPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.create();
	}

	/**
	 * PaySchd_Srch03_CndAdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> createPaySchd_Srch03_CndAdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.class);
	}

	/**
	 * PaySchd_Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR createPaySchd_Srch03_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.create();
	}

	/**
	 * PaySchd_Srch03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> createPaySchd_Srch03_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch04 aPaySchd_Srch04;

	protected void initPaySchd_Srch04() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch04_INFO;
		this.aPaySchd_Srch04 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch04();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch04 crtPaySchd_Srch04() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch04();
		return lgc.aPaySchd_Srch04;
	}

	protected void paramPaySchd_Srch04(MCParam p) {
		if (this.aPaySchd_Srch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch04.up0());
		p.addDownBlock(aPaySchd_Srch04.down0());
	}

	protected void doPaySchd_Srch04() {
		aPaySchd_Srch04.call();
	};

	/**
	 * PaySchd_Srch04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR createPaySchd_Srch04_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR.create();
	}

	/**
	 * PaySchd_Srch04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR> createPaySchd_Srch04_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch05 aPaySchd_Srch05;

	protected void initPaySchd_Srch05() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch05_INFO;
		this.aPaySchd_Srch05 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch05();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch05 crtPaySchd_Srch05() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch05();
		return lgc.aPaySchd_Srch05;
	}

	protected void paramPaySchd_Srch05(MCParam p) {
		if (this.aPaySchd_Srch05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch05.up0());
		p.addUpBlock(aPaySchd_Srch05.up1());
		p.addUpBlock(aPaySchd_Srch05.up2());
		p.addDownBlock(aPaySchd_Srch05.down0());
	}

	protected void doPaySchd_Srch05() {
		aPaySchd_Srch05.call();
	};

	/**
	 * PaySchd_Srch05_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR createPaySchd_Srch05_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR.create();
	}

	/**
	 * PaySchd_Srch05_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> createPaySchd_Srch05_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR.class);
	}

	/**
	 * PaySchd_Srch05_CndPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR createPaySchd_Srch05_CndPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.create();
	}

	/**
	 * PaySchd_Srch05_CndPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> createPaySchd_Srch05_CndPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.class);
	}

	/**
	 * PaySchd_Srch05_CndAdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR createPaySchd_Srch05_CndAdvPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.create();
	}

	/**
	 * PaySchd_Srch05_CndAdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> createPaySchd_Srch05_CndAdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.class);
	}

	/**
	 * PaySchd_Srch05_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR createPaySchd_Srch05_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR.create();
	}

	/**
	 * PaySchd_Srch05_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> createPaySchd_Srch05_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch06 aPaySchd_Srch06;

	protected void initPaySchd_Srch06() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch06_INFO;
		this.aPaySchd_Srch06 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch06();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch06 crtPaySchd_Srch06() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch06();
		return lgc.aPaySchd_Srch06;
	}

	protected void paramPaySchd_Srch06(MCParam p) {
		if (this.aPaySchd_Srch06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch06.up0());
		p.addUpBlock(aPaySchd_Srch06.up1());
		p.addUpBlock(aPaySchd_Srch06.up2());
		p.addDownBlock(aPaySchd_Srch06.down0());
		p.addDownBlock(aPaySchd_Srch06.down1());
		p.addDownBlock(aPaySchd_Srch06.down2());
	}

	protected void doPaySchd_Srch06() {
		aPaySchd_Srch06.call();
	};

	/**
	 * PaySchd_Srch06_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR createPaySchd_Srch06_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.create();
	}

	/**
	 * PaySchd_Srch06_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> createPaySchd_Srch06_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
	}

	/**
	 * PaySchd_Srch06_PayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR createPaySchd_Srch06_PayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.create();
	}

	/**
	 * PaySchd_Srch06_PayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> createPaySchd_Srch06_PayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);
	}

	/**
	 * PaySchd_Srch06_AdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR createPaySchd_Srch06_AdvPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.create();
	}

	/**
	 * PaySchd_Srch06_AdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> createPaySchd_Srch06_AdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch07 aPaySchd_Srch07;

	protected void initPaySchd_Srch07() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch07_INFO;
		this.aPaySchd_Srch07 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch07();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch07 crtPaySchd_Srch07() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch07();
		return lgc.aPaySchd_Srch07;
	}

	protected void paramPaySchd_Srch07(MCParam p) {
		if (this.aPaySchd_Srch07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch07.up0());
		p.addDownBlock(aPaySchd_Srch07.down0());
	}

	protected void doPaySchd_Srch07() {
		aPaySchd_Srch07.call();
	};

	/**
	 * PaySchd_Srch07_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR createPaySchd_Srch07_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.create();
	}

	/**
	 * PaySchd_Srch07_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> createPaySchd_Srch07_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.class);
	}

	/**
	 * PaySchd_Srch07_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR createPaySchd_Srch07_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR.create();
	}

	/**
	 * PaySchd_Srch07_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR> createPaySchd_Srch07_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Srch08 aPaySchd_Srch08;

	protected void initPaySchd_Srch08() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Srch08_INFO;
		this.aPaySchd_Srch08 = ((MSBHL_PaySchdRegService)this).new PaySchd_Srch08();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Srch08 crtPaySchd_Srch08() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Srch08();
		return lgc.aPaySchd_Srch08;
	}

	protected void paramPaySchd_Srch08(MCParam p) {
		if (this.aPaySchd_Srch08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Srch08.up0());
		p.addDownBlock(aPaySchd_Srch08.down0());
	}

	protected void doPaySchd_Srch08() {
		aPaySchd_Srch08.call();
	};

	/**
	 * PaySchd_Srch08_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR createPaySchd_Srch08_CndR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.create();
	}

	/**
	 * PaySchd_Srch08_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> createPaySchd_Srch08_CndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.class);
	}

	/**
	 * PaySchd_Srch08_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR createPaySchd_Srch08_RsltR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR.create();
	}

	/**
	 * PaySchd_Srch08_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR> createPaySchd_Srch08_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Chk01 aPaySchd_Chk01;

	protected void initPaySchd_Chk01() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Chk01_INFO;
		this.aPaySchd_Chk01 = ((MSBHL_PaySchdRegService)this).new PaySchd_Chk01();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Chk01 crtPaySchd_Chk01() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Chk01();
		return lgc.aPaySchd_Chk01;
	}

	protected void paramPaySchd_Chk01(MCParam p) {
		if (this.aPaySchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Chk01.up0());
		p.addUpBlock(aPaySchd_Chk01.up1());
		p.addUpBlock(aPaySchd_Chk01.up2());
		p.addUpBlock(aPaySchd_Chk01.up3());
		p.addUpBlock(aPaySchd_Chk01.up4());
		p.addDownBlock(aPaySchd_Chk01.down0());
	}

	protected void doPaySchd_Chk01() {
		aPaySchd_Chk01.call();
	};

	/**
	 * PaySchd_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
	}

	/**
	 * PaySchd_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
	}

	/**
	 * PaySchd_DtlApdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR createPaySchd_DtlApdR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.create();
	}

	/**
	 * PaySchd_DtlApdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> createPaySchd_DtlApdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
	}

	/**
	 * PaySchd_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR createPaySchd_DtlSchdR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.create();
	}

	/**
	 * PaySchd_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> createPaySchd_DtlSchdL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
	}

	/**
	 * PaySchd_DtlActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR createPaySchd_DtlActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.create();
	}

	/**
	 * PaySchd_DtlActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> createPaySchd_DtlActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
	}

	/**
	 * PaySchd_AdvPayActブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR createPaySchd_AdvPayActR(){
		return mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.create();
	}

	/**
	 * PaySchd_AdvPayActブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> createPaySchd_AdvPayActL(){
		return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
	}
	protected MSBHL_PaySchdRegService.PaySchd_Chk02 aPaySchd_Chk02;

	protected void initPaySchd_Chk02() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Chk02_INFO;
		this.aPaySchd_Chk02 = ((MSBHL_PaySchdRegService)this).new PaySchd_Chk02();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Chk02 crtPaySchd_Chk02() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Chk02();
		return lgc.aPaySchd_Chk02;
	}

	protected void paramPaySchd_Chk02(MCParam p) {
		if (this.aPaySchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Chk02.up0());
		p.addUpBlock(aPaySchd_Chk02.up1());
		p.addDownBlock(aPaySchd_Chk02.down0());
	}

	protected void doPaySchd_Chk02() {
		aPaySchd_Chk02.call();
	};
	protected MSBHL_PaySchdRegService.PaySchd_Ins01 aPaySchd_Ins01;

	protected void initPaySchd_Ins01() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Ins01_INFO;
		this.aPaySchd_Ins01 = ((MSBHL_PaySchdRegService)this).new PaySchd_Ins01();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Ins01 crtPaySchd_Ins01() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Ins01();
		return lgc.aPaySchd_Ins01;
	}

	protected void paramPaySchd_Ins01(MCParam p) {
		if (this.aPaySchd_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Ins01.up0());
		p.addUpBlock(aPaySchd_Ins01.up1());
		p.addUpBlock(aPaySchd_Ins01.up2());
		p.addUpBlock(aPaySchd_Ins01.up3());
		p.addUpBlock(aPaySchd_Ins01.up4());
		p.addDownBlock(aPaySchd_Ins01.down0());
		p.addDownBlock(aPaySchd_Ins01.down1());
		p.addDownBlock(aPaySchd_Ins01.down2());
	}

	protected void doPaySchd_Ins01() {
		aPaySchd_Ins01.call();
	};
	protected MSBHL_PaySchdRegService.PaySchd_Upd01 aPaySchd_Upd01;

	protected void initPaySchd_Upd01() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Upd01_INFO;
		this.aPaySchd_Upd01 = ((MSBHL_PaySchdRegService)this).new PaySchd_Upd01();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Upd01 crtPaySchd_Upd01() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Upd01();
		return lgc.aPaySchd_Upd01;
	}

	protected void paramPaySchd_Upd01(MCParam p) {
		if (this.aPaySchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Upd01.up0());
		p.addUpBlock(aPaySchd_Upd01.up1());
		p.addUpBlock(aPaySchd_Upd01.up2());
		p.addUpBlock(aPaySchd_Upd01.up3());
		p.addUpBlock(aPaySchd_Upd01.up4());
		p.addDownBlock(aPaySchd_Upd01.down0());
		p.addDownBlock(aPaySchd_Upd01.down1());
		p.addDownBlock(aPaySchd_Upd01.down2());
	}

	protected void doPaySchd_Upd01() {
		aPaySchd_Upd01.call();
	};
	protected MSBHL_PaySchdRegService.PaySchd_Upd02 aPaySchd_Upd02;

	protected void initPaySchd_Upd02() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Upd02_INFO;
		this.aPaySchd_Upd02 = ((MSBHL_PaySchdRegService)this).new PaySchd_Upd02();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Upd02 crtPaySchd_Upd02() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Upd02();
		return lgc.aPaySchd_Upd02;
	}

	protected void paramPaySchd_Upd02(MCParam p) {
		if (this.aPaySchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Upd02.up0());
	}

	protected void doPaySchd_Upd02() {
		aPaySchd_Upd02.call();
	};
	protected MSBHL_PaySchdRegService.PaySchd_Del01 aPaySchd_Del01;

	protected void initPaySchd_Del01() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Del01_INFO;
		this.aPaySchd_Del01 = ((MSBHL_PaySchdRegService)this).new PaySchd_Del01();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Del01 crtPaySchd_Del01() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Del01();
		return lgc.aPaySchd_Del01;
	}

	protected void paramPaySchd_Del01(MCParam p) {
		if (this.aPaySchd_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Del01.up0());
		p.addUpBlock(aPaySchd_Del01.up1());
		p.addUpBlock(aPaySchd_Del01.up2());
	}

	protected void doPaySchd_Del01() {
		aPaySchd_Del01.call();
	};
	protected MSBHL_PaySchdRegService.PaySchd_Lock_Upd01 aPaySchd_Lock_Upd01;

	protected void initPaySchd_Lock_Upd01() {
		this.info = PDef.MS_MSBHL5030_PaySchd_Lock_Upd01_INFO;
		this.aPaySchd_Lock_Upd01 = ((MSBHL_PaySchdRegService)this).new PaySchd_Lock_Upd01();
	}

	public static MSBHL_PaySchdRegService.PaySchd_Lock_Upd01 crtPaySchd_Lock_Upd01() {
		MSBHL_PaySchdRegService lgc = new MSBHL_PaySchdRegService();
		lgc.initPaySchd_Lock_Upd01();
		return lgc.aPaySchd_Lock_Upd01;
	}

	protected void paramPaySchd_Lock_Upd01(MCParam p) {
		if (this.aPaySchd_Lock_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPaySchd_Lock_Upd01.up0());
	}

	protected void doPaySchd_Lock_Upd01() {
		aPaySchd_Lock_Upd01.call();
	};

	/**
	 * PaySchd_Lock_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R createPaySchd_Lock_Upd01_DtlR(){
		return mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R.create();
	}

	/**
	 * PaySchd_Lock_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R> createPaySchd_Lock_Upd01_DtlL(){
		return MCList.create(mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PaySchd_Srch01オペレーション.<p>
	 *
	 * 支払予定制御マスタに従い金額を案分する。<br>
	 */
	abstract public class PaySchd_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> down1;
		
		
		// コンストラクタ
		protected PaySchd_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PaySchd_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR createPaySchd_Srch01_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR.create();
		}

		/**
		 * PaySchd_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> createPaySchd_Srch01_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR.class);
		}

		/**
		 * PaySchd_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR createPaySchd_Srch01_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR.create();
		}

		/**
		 * PaySchd_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> createPaySchd_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>is_ref_xrate</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>zero_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> up0() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_CndR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		 * 	<tr><td><br></td><td>pay_schd.xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.setoff_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.so_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd.trd_cur_com_paid_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_com_paid_tax_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>so_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_setoff_act_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch01_RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch02オペレーション.<p>
	 *
	 * 同一の支払照合ヘッダとして登録可能な買掛明細をまとめる。<br>
	 */
	abstract public class PaySchd_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> down1;
		/** [PaySchd_Srch02_AdvPayAct]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> aPaySchd_Srch02_AdvPayAct;
		/** [PaySchd_Srch02_PayAct]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> aPaySchd_Srch02_PayAct;
		
		
		// コンストラクタ
		protected PaySchd_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
			aPaySchd_Srch02_AdvPayAct = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);
			aPaySchd_Srch02_PayAct = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PaySchd_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR createPaySchd_Srch02_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR.create();
		}

		/**
		 * PaySchd_Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR> createPaySchd_Srch02_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR.class);
		}

		/**
		 * PaySchd_Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR createPaySchd_Srch02_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.create();
		}

		/**
		 * PaySchd_Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> createPaySchd_Srch02_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
		}

		/**
		 * PaySchd_Srch02_PayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR createPaySchd_Srch02_PayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.create();
		}

		/**
		 * PaySchd_Srch02_PayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> createPaySchd_Srch02_PayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);
		}

		/**
		 * PaySchd_Srch02_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR createPaySchd_Srch02_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.create();
		}

		/**
		 * PaySchd_Srch02_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> createPaySchd_Srch02_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ap_d.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>cl_dt_grp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ap_d.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_CndR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.last_pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> down1() {
			return down1;
		}


		/**
		 * [PaySchd_Srch02_AdvPayAct]ブロックのコンテナaPaySchd_Srch02_AdvPayActLを返します。
		 *
		 * @return PaySchd_Srch02_AdvPayActL
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> PaySchd_Srch02_AdvPayAct() {
			return aPaySchd_Srch02_AdvPayAct;
		}

		/**
		 * [PaySchd_Srch02_PayAct]ブロックのコンテナaPaySchd_Srch02_PayActLを返します。
		 *
		 * @return PaySchd_Srch02_PayActL
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> PaySchd_Srch02_PayAct() {
			return aPaySchd_Srch02_PayAct;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch03オペレーション.<p>
	 *
	 * 支払予定作成可能な買掛明細を検索する。<br>
	 */
	abstract public class PaySchd_Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR createPaySchd_Srch03_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR.create();
		}

		/**
		 * PaySchd_Srch03_RqstNoCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR createPaySchd_Srch03_RqstNoCndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR.create();
		}

		/**
		 * PaySchd_Srch03_RqstNoCndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> createPaySchd_Srch03_RqstNoCndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR.class);
		}

		/**
		 * PaySchd_Srch03_CndPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR createPaySchd_Srch03_CndPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.create();
		}

		/**
		 * PaySchd_Srch03_CndPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> createPaySchd_Srch03_CndPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.class);
		}

		/**
		 * PaySchd_Srch03_CndAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR createPaySchd_Srch03_CndAdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.create();
		}

		/**
		 * PaySchd_Srch03_CndAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> createPaySchd_Srch03_CndAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.class);
		}

		/**
		 * PaySchd_Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR createPaySchd_Srch03_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.create();
		}

		/**
		 * PaySchd_Srch03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> createPaySchd_Srch03_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_mode_flg</td></tr>
		 * 	<tr><td><br></td><td>srch_tax_diff_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> up1() {
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
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> up2() {
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
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
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
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>po_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>po_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>crryovr_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>org_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
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
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch04オペレーション.<p>
	 *
	 * 金額に応じた支払予定日を取得する<br>
	 */
	abstract public class PaySchd_Srch04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_Srch04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR createPaySchd_Srch04_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR.create();
		}

		/**
		 * PaySchd_Srch04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR> createPaySchd_Srch04_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ctl.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ctl.cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ctl.sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_ctl.min_amt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bank_ac_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch04_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch05オペレーション.<p>
	 *
	 * 支払予定鑑の単位に消費税差額を算出し、差額分の買掛明細を取得する<br>
	 */
	abstract public class PaySchd_Srch05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Srch05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_Srch05_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR createPaySchd_Srch05_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR.create();
		}

		/**
		 * PaySchd_Srch05_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> createPaySchd_Srch05_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR.class);
		}

		/**
		 * PaySchd_Srch05_CndPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR createPaySchd_Srch05_CndPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.create();
		}

		/**
		 * PaySchd_Srch05_CndPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> createPaySchd_Srch05_CndPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR.class);
		}

		/**
		 * PaySchd_Srch05_CndAdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR createPaySchd_Srch05_CndAdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.create();
		}

		/**
		 * PaySchd_Srch05_CndAdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> createPaySchd_Srch05_CndAdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR.class);
		}

		/**
		 * PaySchd_Srch05_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR createPaySchd_Srch05_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR.create();
		}

		/**
		 * PaySchd_Srch05_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> createPaySchd_Srch05_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndPayActR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndAdvPayActR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.po_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ap_d.purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sno1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sno2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sno3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sno4</td></tr>
		 * 	<tr><td><br></td><td>ap_d.act_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ap_d.tax_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.xrate</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>ap_d.wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.org_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.crryovr_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sw_src_pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.crryovr_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.valid_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * 	<tr><td><br></td><td>sw_src_rcv_bill_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch05_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch06オペレーション.<p>
	 *
	 * 同一の支払照合ヘッダとして登録可能な買掛明細をまとめた結果に対して、今回支払金額を設定する<br>
	 */
	abstract public class PaySchd_Srch06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> down2;
		
		
		// コンストラクタ
		protected PaySchd_Srch06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * PaySchd_Srch06_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR createPaySchd_Srch06_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.create();
		}

		/**
		 * PaySchd_Srch06_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> createPaySchd_Srch06_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR.class);
		}

		/**
		 * PaySchd_Srch06_PayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR createPaySchd_Srch06_PayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.create();
		}

		/**
		 * PaySchd_Srch06_PayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> createPaySchd_Srch06_PayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR.class);
		}

		/**
		 * PaySchd_Srch06_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR createPaySchd_Srch06_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.create();
		}

		/**
		 * PaySchd_Srch06_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> createPaySchd_Srch06_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR.class);
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
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lock_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_xrate</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.wrk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.last_pay_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.bfw_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_ret_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.purc_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sw_to_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.account_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.cash_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.note_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sw_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.schd_pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.adv_pay_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.adv_pay_setoff_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.adv_pay_setoff_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.adv_pay_bal</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_RsltR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_PayActR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>adv_pay_act.adv_pay_act_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch02_AdvPayActR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch07オペレーション.<p>
	 *
	 * 支払照合可能な支払実績明細を検索する。<br>
	 */
	abstract public class PaySchd_Srch07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Srch07() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_Srch07_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR createPaySchd_Srch07_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.create();
		}

		/**
		 * PaySchd_Srch07_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> createPaySchd_Srch07_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.class);
		}

		/**
		 * PaySchd_Srch07_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR createPaySchd_Srch07_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR.create();
		}

		/**
		 * PaySchd_Srch07_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR> createPaySchd_Srch07_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_only_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_act_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>calc_tgt_pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
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
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bill_tax_disp_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Srch08オペレーション.<p>
	 *
	 * 支払照合可能な前渡金実績を検索する。<br>
	 */
	abstract public class PaySchd_Srch08 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Srch08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Srch08() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_Srch08_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR createPaySchd_Srch08_CndR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.create();
		}

		/**
		 * PaySchd_Srch08_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> createPaySchd_Srch08_CndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR.class);
		}

		/**
		 * PaySchd_Srch08_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR createPaySchd_Srch08_RsltR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR.create();
		}

		/**
		 * PaySchd_Srch08_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR> createPaySchd_Srch08_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_spot_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_only_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch07_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_act_dt</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_sttl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_cd</td></tr>
		 * 	<tr><td><br></td><td>com_paid_ap_sttl_nm</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch08_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Chk01オペレーション.<p>
	 *
	 * 支払予定の登録・更新が可能かチェックをする。<br>
	 */
	abstract public class PaySchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
			up4 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
		}

		/**
		 * PaySchd_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
		}

		/**
		 * PaySchd_DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR createPaySchd_DtlApdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.create();
		}

		/**
		 * PaySchd_DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> createPaySchd_DtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
		}

		/**
		 * PaySchd_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR createPaySchd_DtlSchdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.create();
		}

		/**
		 * PaySchd_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> createPaySchd_DtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
		}

		/**
		 * PaySchd_DtlActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR createPaySchd_DtlActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.create();
		}

		/**
		 * PaySchd_DtlActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> createPaySchd_DtlActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
		}

		/**
		 * PaySchd_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR createPaySchd_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.create();
		}

		/**
		 * PaySchd_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> createPaySchd_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
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
		 * 	<tr><td><br></td><td>pay_chk.batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.man_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_psppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_psppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_d.interim_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ap_d.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ap_d.repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_d.base_purc_ac_dt</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1() {
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> up3() {
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
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> up4() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Chk02オペレーション.<p>
	 *
	 * 支払予定の削除が可能かチェックをする。<br>
	 */
	abstract public class PaySchd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0;
		
		
		// コンストラクタ
		protected PaySchd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PaySchd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
		}

		/**
		 * PaySchd_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
		}

		/**
		 * PaySchd_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR createPaySchd_DtlSchdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.create();
		}

		/**
		 * PaySchd_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> createPaySchd_DtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
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
		 * 	<tr><td><br></td><td>pay_chk.upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Ins01オペレーション.<p>
	 *
	 * 支払照合、支払予定を登録する。<br>
	 */
	abstract public class PaySchd_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> down2;
		
		
		// コンストラクタ
		protected PaySchd_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
			up4 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * PaySchd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
		}

		/**
		 * PaySchd_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
		}

		/**
		 * PaySchd_DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR createPaySchd_DtlApdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.create();
		}

		/**
		 * PaySchd_DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> createPaySchd_DtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
		}

		/**
		 * PaySchd_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR createPaySchd_DtlSchdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.create();
		}

		/**
		 * PaySchd_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> createPaySchd_DtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
		}

		/**
		 * PaySchd_DtlActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR createPaySchd_DtlActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.create();
		}

		/**
		 * PaySchd_DtlActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> createPaySchd_DtlActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
		}

		/**
		 * PaySchd_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR createPaySchd_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.create();
		}

		/**
		 * PaySchd_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> createPaySchd_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
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
		 * 	<tr><td><br></td><td>pay_chk.batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.man_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_act_not_ref_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_psppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_psppl_cl_dt</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> up3() {
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_ntc_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0() {
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
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> down1() {
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
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Upd01オペレーション.<p>
	 *
	 * 支払照合、支払予定を更新する。<br>
	 */
	abstract public class PaySchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> down2;
		
		
		// コンストラクタ
		protected PaySchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
			up3 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
			up4 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
			down2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * PaySchd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
		}

		/**
		 * PaySchd_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
		}

		/**
		 * PaySchd_DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR createPaySchd_DtlApdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.create();
		}

		/**
		 * PaySchd_DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> createPaySchd_DtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
		}

		/**
		 * PaySchd_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR createPaySchd_DtlSchdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.create();
		}

		/**
		 * PaySchd_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> createPaySchd_DtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
		}

		/**
		 * PaySchd_DtlActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR createPaySchd_DtlActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.create();
		}

		/**
		 * PaySchd_DtlActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> createPaySchd_DtlActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR.class);
		}

		/**
		 * PaySchd_AdvPayActブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR createPaySchd_AdvPayActR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.create();
		}

		/**
		 * PaySchd_AdvPayActブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> createPaySchd_AdvPayActL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR.class);
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
		 * 	<tr><td><br></td><td>pay_chk.batch_pay_schd_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.man_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pay_act_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>co_psppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>co_psppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ap_d.pay_ntc_d_print_rmrks</td></tr>
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1() {
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.pay_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>pay_act_d.upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlActR> up3() {
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_AdvPayActR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_ntc_rev</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_no</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> down0() {
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
		 * 	<tr><td><br></td><td>ap_d.ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> down1() {
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
		 * 	<tr><td><br></td><td>pay_schd.pay_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Upd02オペレーション.<p>
	 *
	 * 相殺分の支払実績を更新する。（債務承認後実行処理用）<br>
	 */
	abstract public class PaySchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0;
		
		
		// コンストラクタ
		protected PaySchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PaySchd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
		}

		/**
		 * PaySchd_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_chk.pay_chk_mng_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Del01オペレーション.<p>
	 *
	 * 支払照合、支払予定を削除する。<br>
	 */
	abstract public class PaySchd_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2;
		
		
		// コンストラクタ
		protected PaySchd_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
			up2 = MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PaySchd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR createPaySchd_HdrR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.create();
		}

		/**
		 * PaySchd_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> createPaySchd_HdrL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR.class);
		}

		/**
		 * PaySchd_DtlApdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR createPaySchd_DtlApdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.create();
		}

		/**
		 * PaySchd_DtlApdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> createPaySchd_DtlApdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR.class);
		}

		/**
		 * PaySchd_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR createPaySchd_DtlSchdR(){
			return mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.create();
		}

		/**
		 * PaySchd_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> createPaySchd_DtlSchdL(){
			return MCList.create(mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR.class);
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
		 * 	<tr><td><br></td><td>aprv_rvrs_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>co_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>co_src_ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlApdR> up1() {
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
		public MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_DtlSchdR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}
	/**
	 * PaySchd_Lock_Upd01オペレーション.<p>
	 *
	 * 支払予定鑑の単位にロックする。<br>
	 */
	abstract public class PaySchd_Lock_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PaySchd_Lock_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R> up0;
		
		
		// コンストラクタ
		protected PaySchd_Lock_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R.class);

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
			invoke((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * PaySchd_Lock_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R createPaySchd_Lock_Upd01_DtlR(){
			return mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R.create();
		}

		/**
		 * PaySchd_Lock_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R> createPaySchd_Lock_Upd01_DtlL(){
			return MCList.create(mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R.class);
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
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMS.dbc.MST_PAY_SCHD_LOCK_R> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PaySchdRegService)MSBHL_PaySchdRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}