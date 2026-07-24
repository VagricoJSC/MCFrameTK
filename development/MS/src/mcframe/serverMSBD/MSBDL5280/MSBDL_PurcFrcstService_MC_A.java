package mcframe.serverMSBD.MSBDL5280;

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
 * "MSBDL_PurcFrcstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcFrcstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBD";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBDL5280";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcFrcstService.PurcFrcst_Srch01 aPurcFrcst_Srch01;

	protected void initPurcFrcst_Srch01() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Srch01_INFO;
		this.aPurcFrcst_Srch01 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Srch01();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Srch01 crtPurcFrcst_Srch01() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Srch01();
		return lgc.aPurcFrcst_Srch01;
	}

	protected void paramPurcFrcst_Srch01(MCParam p) {
		if (this.aPurcFrcst_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Srch01.up0());
		p.addUpBlock(aPurcFrcst_Srch01.up1());
		p.addDownBlock(aPurcFrcst_Srch01.down0());
	}

	protected void doPurcFrcst_Srch01() {
		aPurcFrcst_Srch01.call();
	};

	/**
	 * PurcFrcst_Srch01_Cnd01ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R createPurcFrcst_Srch01_Cnd01R(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R.create();
	}

	/**
	 * PurcFrcst_Srch01_Cnd02ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R createPurcFrcst_Srch01_Cnd02R(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R.create();
	}

	/**
	 * PurcFrcst_Srch01_Cnd02ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R> createPurcFrcst_Srch01_Cnd02L(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R.class);
	}

	/**
	 * PurcFrcst_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR createPurcFrcst_Srch01_RsltR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR.create();
	}

	/**
	 * PurcFrcst_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR> createPurcFrcst_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Srch02 aPurcFrcst_Srch02;

	protected void initPurcFrcst_Srch02() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Srch02_INFO;
		this.aPurcFrcst_Srch02 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Srch02();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Srch02 crtPurcFrcst_Srch02() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Srch02();
		return lgc.aPurcFrcst_Srch02;
	}

	protected void paramPurcFrcst_Srch02(MCParam p) {
		if (this.aPurcFrcst_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Srch02.up0());
		p.addUpBlock(aPurcFrcst_Srch02.up1());
		p.addDownBlock(aPurcFrcst_Srch02.down0());
	}

	protected void doPurcFrcst_Srch02() {
		aPurcFrcst_Srch02.call();
	};

	/**
	 * PurcFrcst_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR createPurcFrcst_Srch02_CndR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR.create();
	}

	/**
	 * PurcFrcst_Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR> createPurcFrcst_Srch02_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR.class);
	}

	/**
	 * PurcFrcst_Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR createPurcFrcst_Srch02_RsltR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR.create();
	}

	/**
	 * PurcFrcst_Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR> createPurcFrcst_Srch02_RsltL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR.class);
	}

	/**
	 * PurcFrcst_Srch02_Cnd2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R createPurcFrcst_Srch02_Cnd2R(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R.create();
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Chk01 aPurcFrcst_Chk01;

	protected void initPurcFrcst_Chk01() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Chk01_INFO;
		this.aPurcFrcst_Chk01 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Chk01();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Chk01 crtPurcFrcst_Chk01() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Chk01();
		return lgc.aPurcFrcst_Chk01;
	}

	protected void paramPurcFrcst_Chk01(MCParam p) {
		if (this.aPurcFrcst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Chk01.up0());
		p.addUpBlock(aPurcFrcst_Chk01.up1());
		p.addUpBlock(aPurcFrcst_Chk01.up2());
		p.addDownBlock(aPurcFrcst_Chk01.down0());
		p.addDownBlock(aPurcFrcst_Chk01.down1());
		p.addDownBlock(aPurcFrcst_Chk01.down2());
	}

	protected void doPurcFrcst_Chk01() {
		aPurcFrcst_Chk01.call();
	};

	/**
	 * PurcFrcst_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR createPurcFrcst_Chk01_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.create();
	}

	/**
	 * PurcFrcst_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> createPurcFrcst_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
	}

	/**
	 * PurcFrcst_Chk01_FixブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR createPurcFrcst_Chk01_FixR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.create();
	}

	/**
	 * PurcFrcst_Chk01_FixブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> createPurcFrcst_Chk01_FixL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
	}

	/**
	 * PurcFrcst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR createPurcFrcst_Chk01_DtlR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.create();
	}

	/**
	 * PurcFrcst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> createPurcFrcst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Chk02 aPurcFrcst_Chk02;

	protected void initPurcFrcst_Chk02() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Chk02_INFO;
		this.aPurcFrcst_Chk02 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Chk02();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Chk02 crtPurcFrcst_Chk02() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Chk02();
		return lgc.aPurcFrcst_Chk02;
	}

	protected void paramPurcFrcst_Chk02(MCParam p) {
		if (this.aPurcFrcst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Chk02.up0());
		p.addDownBlock(aPurcFrcst_Chk02.down0());
	}

	protected void doPurcFrcst_Chk02() {
		aPurcFrcst_Chk02.call();
	};

	/**
	 * PurcFrcst_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR createPurcFrcst_Chk02_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.create();
	}

	/**
	 * PurcFrcst_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> createPurcFrcst_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Chk03 aPurcFrcst_Chk03;

	protected void initPurcFrcst_Chk03() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Chk03_INFO;
		this.aPurcFrcst_Chk03 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Chk03();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Chk03 crtPurcFrcst_Chk03() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Chk03();
		return lgc.aPurcFrcst_Chk03;
	}

	protected void paramPurcFrcst_Chk03(MCParam p) {
		if (this.aPurcFrcst_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Chk03.up0());
		p.addDownBlock(aPurcFrcst_Chk03.down0());
	}

	protected void doPurcFrcst_Chk03() {
		aPurcFrcst_Chk03.call();
	};

	/**
	 * PurcFrcst_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR createPurcFrcst_Chk03_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.create();
	}

	/**
	 * PurcFrcst_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> createPurcFrcst_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Upd01 aPurcFrcst_Upd01;

	protected void initPurcFrcst_Upd01() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Upd01_INFO;
		this.aPurcFrcst_Upd01 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Upd01();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Upd01 crtPurcFrcst_Upd01() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Upd01();
		return lgc.aPurcFrcst_Upd01;
	}

	protected void paramPurcFrcst_Upd01(MCParam p) {
		if (this.aPurcFrcst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Upd01.up0());
		p.addUpBlock(aPurcFrcst_Upd01.up1());
		p.addUpBlock(aPurcFrcst_Upd01.up2());
		p.addDownBlock(aPurcFrcst_Upd01.down0());
		p.addDownBlock(aPurcFrcst_Upd01.down1());
	}

	protected void doPurcFrcst_Upd01() {
		aPurcFrcst_Upd01.call();
	};

	/**
	 * PurcFrcst_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR createPurcFrcst_Upd01_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.create();
	}

	/**
	 * PurcFrcst_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> createPurcFrcst_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
	}

	/**
	 * PurcFrcst_Upd01_FixブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR createPurcFrcst_Upd01_FixR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.create();
	}

	/**
	 * PurcFrcst_Upd01_FixブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> createPurcFrcst_Upd01_FixL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
	}

	/**
	 * PurcFrcst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR createPurcFrcst_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.create();
	}

	/**
	 * PurcFrcst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> createPurcFrcst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Del01 aPurcFrcst_Del01;

	protected void initPurcFrcst_Del01() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Del01_INFO;
		this.aPurcFrcst_Del01 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Del01();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Del01 crtPurcFrcst_Del01() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Del01();
		return lgc.aPurcFrcst_Del01;
	}

	protected void paramPurcFrcst_Del01(MCParam p) {
		if (this.aPurcFrcst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Del01.up0());
		p.addDownBlock(aPurcFrcst_Del01.down0());
	}

	protected void doPurcFrcst_Del01() {
		aPurcFrcst_Del01.call();
	};

	/**
	 * PurcFrcst_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR createPurcFrcst_Del01_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.create();
	}

	/**
	 * PurcFrcst_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> createPurcFrcst_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Del02 aPurcFrcst_Del02;

	protected void initPurcFrcst_Del02() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Del02_INFO;
		this.aPurcFrcst_Del02 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Del02();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Del02 crtPurcFrcst_Del02() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Del02();
		return lgc.aPurcFrcst_Del02;
	}

	protected void paramPurcFrcst_Del02(MCParam p) {
		if (this.aPurcFrcst_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Del02.up0());
		p.addDownBlock(aPurcFrcst_Del02.down0());
	}

	protected void doPurcFrcst_Del02() {
		aPurcFrcst_Del02.call();
	};

	/**
	 * PurcFrcst_Del02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR createPurcFrcst_Del02_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.create();
	}

	/**
	 * PurcFrcst_Del02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> createPurcFrcst_Del02_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);
	}
	protected MSBDL_PurcFrcstService.PurcFrcst_Prnt01 aPurcFrcst_Prnt01;

	protected void initPurcFrcst_Prnt01() {
		this.info = PDef.MS_MSBDL5280_PurcFrcst_Prnt01_INFO;
		this.aPurcFrcst_Prnt01 = ((MSBDL_PurcFrcstService)this).new PurcFrcst_Prnt01();
	}

	public static MSBDL_PurcFrcstService.PurcFrcst_Prnt01 crtPurcFrcst_Prnt01() {
		MSBDL_PurcFrcstService lgc = new MSBDL_PurcFrcstService();
		lgc.initPurcFrcst_Prnt01();
		return lgc.aPurcFrcst_Prnt01;
	}

	protected void paramPurcFrcst_Prnt01(MCParam p) {
		if (this.aPurcFrcst_Prnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcFrcst_Prnt01.up0());
		p.addUpBlock(aPurcFrcst_Prnt01.up1());
		p.addDownBlock(aPurcFrcst_Prnt01.down0());
	}

	protected void doPurcFrcst_Prnt01() {
		aPurcFrcst_Prnt01.call();
	};

	/**
	 * PurcFrcst_Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR createPurcFrcst_Prnt01_HdrR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR.create();
	}

	/**
	 * PurcFrcst_Prnt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR> createPurcFrcst_Prnt01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR.class);
	}

	/**
	 * PurcFrcst_Prnt01_CndRブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR createPurcFrcst_Prnt01_CndRR(){
		return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcFrcst_Srch01オペレーション.<p>
	 *
	 * 購買内示情報（最新内示日）を検索する。<br>
	 */
	abstract public class PurcFrcst_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R.create();
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Srch01_Cnd01ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R createPurcFrcst_Srch01_Cnd01R(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R.create();
		}

		/**
		 * PurcFrcst_Srch01_Cnd02ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R createPurcFrcst_Srch01_Cnd02R(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R.create();
		}

		/**
		 * PurcFrcst_Srch01_Cnd02ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R> createPurcFrcst_Srch01_Cnd02L(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R.class);
		}

		/**
		 * PurcFrcst_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR createPurcFrcst_Srch01_RsltR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR.create();
		}

		/**
		 * PurcFrcst_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR> createPurcFrcst_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ymd_fr</td></tr>
		 * 	<tr><td><br></td><td>ymd_to</td></tr>
		 * 	<tr><td><br></td><td>std_pf_dt</td></tr>
		 * 	<tr><td><br></td><td>dac_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg_str</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg_str</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * @see mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd01R up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_Cnd02R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
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
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_pf_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Srch02オペレーション.<p>
	 *
	 * 納入予定日基準で発注データを検索する。<br>
	 */
	abstract public class PurcFrcst_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR.class);
			up1 = mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR createPurcFrcst_Srch02_CndR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR.create();
		}

		/**
		 * PurcFrcst_Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR> createPurcFrcst_Srch02_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR.class);
		}

		/**
		 * PurcFrcst_Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR createPurcFrcst_Srch02_RsltR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR.create();
		}

		/**
		 * PurcFrcst_Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR> createPurcFrcst_Srch02_RsltL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR.class);
		}

		/**
		 * PurcFrcst_Srch02_Cnd2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R createPurcFrcst_Srch02_Cnd2R(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ym_fr</td></tr>
		 * 	<tr><td><br></td><td>ym_to</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_Cnd2R up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Chk01オペレーション.<p>
	 *
	 * 更新前チェック<br>
	 */
	abstract public class PurcFrcst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> down2;
		
		
		// コンストラクタ
		protected PurcFrcst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * PurcFrcst_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR createPurcFrcst_Chk01_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.create();
		}

		/**
		 * PurcFrcst_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> createPurcFrcst_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
		}

		/**
		 * PurcFrcst_Chk01_FixブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR createPurcFrcst_Chk01_FixR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.create();
		}

		/**
		 * PurcFrcst_Chk01_FixブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> createPurcFrcst_Chk01_FixL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
		}

		/**
		 * PurcFrcst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR createPurcFrcst_Chk01_DtlR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.create();
		}

		/**
		 * PurcFrcst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> createPurcFrcst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_period_typ</td></tr>
		 * 	<tr><td><br></td><td>pf_period_st_dt</td></tr>
		 * 	<tr><td><br></td><td>pf_period_end_dt</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Chk02オペレーション.<p>
	 *
	 * 取消前チェック<br>
	 */
	abstract public class PurcFrcst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR createPurcFrcst_Chk02_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.create();
		}

		/**
		 * PurcFrcst_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> createPurcFrcst_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Chk03オペレーション.<p>
	 *
	 * 取消キャンセル前チェック<br>
	 */
	abstract public class PurcFrcst_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR createPurcFrcst_Chk03_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.create();
		}

		/**
		 * PurcFrcst_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> createPurcFrcst_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Upd01オペレーション.<p>
	 *
	 * 購買内示情報を更新する<br>
	 */
	abstract public class PurcFrcst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> down1;
		
		
		// コンストラクタ
		protected PurcFrcst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * PurcFrcst_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR createPurcFrcst_Upd01_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.create();
		}

		/**
		 * PurcFrcst_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> createPurcFrcst_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR.class);
		}

		/**
		 * PurcFrcst_Upd01_FixブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR createPurcFrcst_Upd01_FixR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.create();
		}

		/**
		 * PurcFrcst_Upd01_FixブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> createPurcFrcst_Upd01_FixL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR.class);
		}

		/**
		 * PurcFrcst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR createPurcFrcst_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.create();
		}

		/**
		 * PurcFrcst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> createPurcFrcst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>pf_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * 	<tr><td><br></td><td>rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_frcst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_fix_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>fix_period_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_pf_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_prms_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk01_FixR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Del01オペレーション.<p>
	 *
	 * 購買内示情報を取消する。<br>
	 */
	abstract public class PurcFrcst_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR createPurcFrcst_Del01_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.create();
		}

		/**
		 * PurcFrcst_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> createPurcFrcst_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Del02オペレーション.<p>
	 *
	 * 購買内示情報を有効に更新する。<br>
	 */
	abstract public class PurcFrcst_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Del02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR createPurcFrcst_Del02_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.create();
		}

		/**
		 * PurcFrcst_Del02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> createPurcFrcst_Del02_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Chk03_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}
	/**
	 * PurcFrcst_Prnt01オペレーション.<p>
	 *
	 * 内示書、取消内示書を発行する。<br>
	 */
	abstract public class PurcFrcst_Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcFrcst_Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR> down0;
		
		
		// コンストラクタ
		protected PurcFrcst_Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR.create();
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR.class);

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
			invoke((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * PurcFrcst_Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR createPurcFrcst_Prnt01_HdrR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR.create();
		}

		/**
		 * PurcFrcst_Prnt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR> createPurcFrcst_Prnt01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR.class);
		}

		/**
		 * PurcFrcst_Prnt01_CndRブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR createPurcFrcst_Prnt01_CndRR(){
			return mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_frcst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR> up0() {
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
		 * @see mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR
		 */
		public mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_CndRR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>pf_rpt_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5280.PurcFrcst_Prnt01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcFrcstService)MSBDL_PurcFrcstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}