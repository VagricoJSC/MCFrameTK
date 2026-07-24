package mcframe.serverMSBD.MSBDL5120;

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
 * "MSBDL_PurcDlvDtAdjstRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcDlvDtAdjstRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBDL5120";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcDlvDtAdjstRegService.DlvInst_Chk01 aDlvInst_Chk01;

	protected void initDlvInst_Chk01() {
		this.info = PDef.MS_MSBDL5120_DlvInst_Chk01_INFO;
		this.aDlvInst_Chk01 = ((MSBDL_PurcDlvDtAdjstRegService)this).new DlvInst_Chk01();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.DlvInst_Chk01 crtDlvInst_Chk01() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initDlvInst_Chk01();
		return lgc.aDlvInst_Chk01;
	}

	protected void paramDlvInst_Chk01(MCParam p) {
		if (this.aDlvInst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInst_Chk01.up0());
		p.addUpBlock(aDlvInst_Chk01.up1());
		p.addDownBlock(aDlvInst_Chk01.down0());
		p.addDownBlock(aDlvInst_Chk01.down1());
	}

	protected void doDlvInst_Chk01() {
		aDlvInst_Chk01.call();
	};

	/**
	 * DlvInst_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR createDlvInst_Chk01_HdrR(){
		return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.create();
	}

	/**
	 * DlvInst_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> createDlvInst_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
	}

	/**
	 * DlvInst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR createDlvInst_Chk01_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.create();
	}

	/**
	 * DlvInst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> createDlvInst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.Prms_Chk01 aPrms_Chk01;

	protected void initPrms_Chk01() {
		this.info = PDef.MS_MSBDL5120_Prms_Chk01_INFO;
		this.aPrms_Chk01 = ((MSBDL_PurcDlvDtAdjstRegService)this).new Prms_Chk01();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.Prms_Chk01 crtPrms_Chk01() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initPrms_Chk01();
		return lgc.aPrms_Chk01;
	}

	protected void paramPrms_Chk01(MCParam p) {
		if (this.aPrms_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrms_Chk01.up0());
		p.addUpBlock(aPrms_Chk01.up1());
		p.addDownBlock(aPrms_Chk01.down0());
		p.addDownBlock(aPrms_Chk01.down1());
	}

	protected void doPrms_Chk01() {
		aPrms_Chk01.call();
	};

	/**
	 * Prms_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk01_HdrR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}

	/**
	 * Prms_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk01_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
	}

	/**
	 * Prms_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.Prms_Chk02 aPrms_Chk02;

	protected void initPrms_Chk02() {
		this.info = PDef.MS_MSBDL5120_Prms_Chk02_INFO;
		this.aPrms_Chk02 = ((MSBDL_PurcDlvDtAdjstRegService)this).new Prms_Chk02();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.Prms_Chk02 crtPrms_Chk02() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initPrms_Chk02();
		return lgc.aPrms_Chk02;
	}

	protected void paramPrms_Chk02(MCParam p) {
		if (this.aPrms_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrms_Chk02.up0());
		p.addUpBlock(aPrms_Chk02.up1());
		p.addDownBlock(aPrms_Chk02.down0());
	}

	protected void doPrms_Chk02() {
		aPrms_Chk02.call();
	};

	/**
	 * Prms_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk02_CndR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Chk02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk02_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}

	/**
	 * Prms_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk02_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
	}

	/**
	 * Prms_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.Prms_Chk03 aPrms_Chk03;

	protected void initPrms_Chk03() {
		this.info = PDef.MS_MSBDL5120_Prms_Chk03_INFO;
		this.aPrms_Chk03 = ((MSBDL_PurcDlvDtAdjstRegService)this).new Prms_Chk03();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.Prms_Chk03 crtPrms_Chk03() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initPrms_Chk03();
		return lgc.aPrms_Chk03;
	}

	protected void paramPrms_Chk03(MCParam p) {
		if (this.aPrms_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrms_Chk03.up0());
		p.addUpBlock(aPrms_Chk03.up1());
		p.addUpBlock(aPrms_Chk03.up2());
		p.addUpBlock(aPrms_Chk03.up3());
		p.addDownBlock(aPrms_Chk03.down0());
		p.addDownBlock(aPrms_Chk03.down1());
		p.addDownBlock(aPrms_Chk03.down2());
		p.addDownBlock(aPrms_Chk03.down3());
	}

	protected void doPrms_Chk03() {
		aPrms_Chk03.call();
	};

	/**
	 * Prms_Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk03_CndR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Chk03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk03_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}

	/**
	 * Prms_Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk03_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
	}

	/**
	 * Prms_Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk03_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
	}

	/**
	 * Prms_Chk03_NoRefl_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk03_NoRefl_CndR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Chk03_NoRefl_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk03_NoRefl_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}

	/**
	 * Prms_Chk03_NoRefl_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk03_NoRefl_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
	}

	/**
	 * Prms_Chk03_NoRefl_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk03_NoRefl_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.DlvInst_Upd01 aDlvInst_Upd01;

	protected void initDlvInst_Upd01() {
		this.info = PDef.MS_MSBDL5120_DlvInst_Upd01_INFO;
		this.aDlvInst_Upd01 = ((MSBDL_PurcDlvDtAdjstRegService)this).new DlvInst_Upd01();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.DlvInst_Upd01 crtDlvInst_Upd01() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initDlvInst_Upd01();
		return lgc.aDlvInst_Upd01;
	}

	protected void paramDlvInst_Upd01(MCParam p) {
		if (this.aDlvInst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInst_Upd01.up0());
		p.addUpBlock(aDlvInst_Upd01.up1());
		p.addDownBlock(aDlvInst_Upd01.down0());
		p.addDownBlock(aDlvInst_Upd01.down1());
	}

	protected void doDlvInst_Upd01() {
		aDlvInst_Upd01.call();
	};

	/**
	 * DlvInst_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR createDlvInst_Upd01_HdrR(){
		return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.create();
	}

	/**
	 * DlvInst_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> createDlvInst_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
	}

	/**
	 * DlvInst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR createDlvInst_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.create();
	}

	/**
	 * DlvInst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> createDlvInst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.Prms_Upd01 aPrms_Upd01;

	protected void initPrms_Upd01() {
		this.info = PDef.MS_MSBDL5120_Prms_Upd01_INFO;
		this.aPrms_Upd01 = ((MSBDL_PurcDlvDtAdjstRegService)this).new Prms_Upd01();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.Prms_Upd01 crtPrms_Upd01() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initPrms_Upd01();
		return lgc.aPrms_Upd01;
	}

	protected void paramPrms_Upd01(MCParam p) {
		if (this.aPrms_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrms_Upd01.up0());
		p.addUpBlock(aPrms_Upd01.up1());
		p.addDownBlock(aPrms_Upd01.down0());
		p.addDownBlock(aPrms_Upd01.down1());
	}

	protected void doPrms_Upd01() {
		aPrms_Upd01.call();
	};

	/**
	 * Prms_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Upd01_HdrR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}

	/**
	 * Prms_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Upd01_DtlR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
	}

	/**
	 * Prms_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.Prms_Upd02 aPrms_Upd02;

	protected void initPrms_Upd02() {
		this.info = PDef.MS_MSBDL5120_Prms_Upd02_INFO;
		this.aPrms_Upd02 = ((MSBDL_PurcDlvDtAdjstRegService)this).new Prms_Upd02();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.Prms_Upd02 crtPrms_Upd02() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initPrms_Upd02();
		return lgc.aPrms_Upd02;
	}

	protected void paramPrms_Upd02(MCParam p) {
		if (this.aPrms_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrms_Upd02.up0());
		p.addDownBlock(aPrms_Upd02.down0());
	}

	protected void doPrms_Upd02() {
		aPrms_Upd02.call();
	};

	/**
	 * Prms_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Upd02_CndR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.Prms_Upd03 aPrms_Upd03;

	protected void initPrms_Upd03() {
		this.info = PDef.MS_MSBDL5120_Prms_Upd03_INFO;
		this.aPrms_Upd03 = ((MSBDL_PurcDlvDtAdjstRegService)this).new Prms_Upd03();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.Prms_Upd03 crtPrms_Upd03() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initPrms_Upd03();
		return lgc.aPrms_Upd03;
	}

	protected void paramPrms_Upd03(MCParam p) {
		if (this.aPrms_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrms_Upd03.up0());
		p.addUpBlock(aPrms_Upd03.up1());
		p.addDownBlock(aPrms_Upd03.down0());
	}

	protected void doPrms_Upd03() {
		aPrms_Upd03.call();
	};

	/**
	 * Prms_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Upd03_CndR(){
		return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
	}

	/**
	 * Prms_Upd03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Upd03_CndL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
	}
	protected MSBDL_PurcDlvDtAdjstRegService.DlvInst_Prms_Del01 aDlvInst_Prms_Del01;

	protected void initDlvInst_Prms_Del01() {
		this.info = PDef.MS_MSBDL5120_DlvInst_Prms_Del01_INFO;
		this.aDlvInst_Prms_Del01 = ((MSBDL_PurcDlvDtAdjstRegService)this).new DlvInst_Prms_Del01();
	}

	public static MSBDL_PurcDlvDtAdjstRegService.DlvInst_Prms_Del01 crtDlvInst_Prms_Del01() {
		MSBDL_PurcDlvDtAdjstRegService lgc = new MSBDL_PurcDlvDtAdjstRegService();
		lgc.initDlvInst_Prms_Del01();
		return lgc.aDlvInst_Prms_Del01;
	}

	protected void paramDlvInst_Prms_Del01(MCParam p) {
		if (this.aDlvInst_Prms_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDlvInst_Prms_Del01.up0());
	}

	protected void doDlvInst_Prms_Del01() {
		aDlvInst_Prms_Del01.call();
	};

	/**
	 * DlvInst_Prms_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR createDlvInst_Prms_Del01_HdrR(){
		return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.create();
	}

	/**
	 * DlvInst_Prms_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> createDlvInst_Prms_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * DlvInst_Chk01オペレーション.<p>
	 *
	 * 納入指示更新前に実行するチェック処理<br>
	 */
	abstract public class DlvInst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected DlvInst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * DlvInst_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR createDlvInst_Chk01_HdrR(){
			return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.create();
		}

		/**
		 * DlvInst_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> createDlvInst_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
		}

		/**
		 * DlvInst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR createDlvInst_Chk01_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.create();
		}

		/**
		 * DlvInst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> createDlvInst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>crnt_edi_dlv_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> up1() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * Prms_Chk01オペレーション.<p>
	 *
	 * 納期回答受領更新前に実行するチェック処理<br>
	 */
	abstract public class Prms_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prms_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Prms_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Prms_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk01_HdrR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		/**
		 * Prms_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk01_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
		}

		/**
		 * Prms_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * Prms_Chk02オペレーション.<p>
	 *
	 * 納期回答受領が入荷予定に反映されている状態を解除する前に実行するチェック処理<br>
	 */
	abstract public class Prms_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prms_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected Prms_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prms_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk02_CndR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Chk02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk02_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		/**
		 * Prms_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk02_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
		}

		/**
		 * Prms_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * Prms_Chk03オペレーション.<p>
	 *
	 * 納期回答受領を入荷予定に反映する前に実行するチェック処理<br>
	 */
	abstract public class Prms_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prms_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down3;
		
		
		// コンストラクタ
		protected Prms_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			up3 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			down3 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Prms_Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk03_CndR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Chk03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk03_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		/**
		 * Prms_Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk03_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
		}

		/**
		 * Prms_Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk03_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
		}

		/**
		 * Prms_Chk03_NoRefl_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Chk03_NoRefl_CndR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Chk03_NoRefl_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Chk03_NoRefl_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		/**
		 * Prms_Chk03_NoRefl_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Chk03_NoRefl_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
		}

		/**
		 * Prms_Chk03_NoRefl_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Chk03_NoRefl_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>screen_crct_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up3() {
			return up3;
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * DlvInst_Upd01オペレーション.<p>
	 *
	 * 納入指示を更新する<br>
	 */
	abstract public class DlvInst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected DlvInst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * DlvInst_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR createDlvInst_Upd01_HdrR(){
			return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.create();
		}

		/**
		 * DlvInst_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> createDlvInst_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
		}

		/**
		 * DlvInst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR createDlvInst_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.create();
		}

		/**
		 * DlvInst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> createDlvInst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_prnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_rev</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * Prms_Upd01オペレーション.<p>
	 *
	 * 納期回答受領を更新する<br>
	 */
	abstract public class Prms_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prms_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Prms_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Prms_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Upd01_HdrR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		/**
		 * Prms_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
		}

		/**
		 * Prms_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_dt</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_print_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_grp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>prms_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_mng_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * Prms_Upd02オペレーション.<p>
	 *
	 * 入荷予定反映解除を行う<br>
	 */
	abstract public class Prms_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prms_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected Prms_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prms_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Upd02_CndR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * Prms_Upd03オペレーション.<p>
	 *
	 * 入荷予定反映を行う<br>
	 */
	abstract public class Prms_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prms_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0;
		
		
		// コンストラクタ
		protected Prms_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Prms_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR createPrms_Upd03_CndR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.create();
		}

		/**
		 * Prms_Upd03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> createPrms_Upd03_CndL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR.class);
		}

		/**
		 * Prms_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR createPrms_Upd01_DtlR(){
			return mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.create();
		}

		/**
		 * Prms_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> createPrms_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>prms_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_refl_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.Prms_Chk01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}
	/**
	 * DlvInst_Prms_Del01オペレーション.<p>
	 *
	 * 納入指示、納期回答受領を削除する<br>
	 */
	abstract public class DlvInst_Prms_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "DlvInst_Prms_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> up0;
		
		
		// コンストラクタ
		protected DlvInst_Prms_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);

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
			invoke((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * DlvInst_Prms_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR createDlvInst_Prms_Del01_HdrR(){
			return mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.create();
		}

		/**
		 * DlvInst_Prms_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> createDlvInst_Prms_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBD.MSBDL5120.DlvInst_Chk01_HdrR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcDlvDtAdjstRegService)MSBDL_PurcDlvDtAdjstRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}