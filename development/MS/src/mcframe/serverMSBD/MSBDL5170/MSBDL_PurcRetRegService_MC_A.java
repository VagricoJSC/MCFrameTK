package mcframe.serverMSBD.MSBDL5170;

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
 * "MSBDL_PurcRetRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBDL_PurcRetRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBDL5170";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBDL_PurcRetRegService.PurcRet_Ins01 aPurcRet_Ins01;

	protected void initPurcRet_Ins01() {
		this.info = PDef.MS_MSBDL5170_PurcRet_Ins01_INFO;
		this.aPurcRet_Ins01 = ((MSBDL_PurcRetRegService)this).new PurcRet_Ins01();
	}

	public static MSBDL_PurcRetRegService.PurcRet_Ins01 crtPurcRet_Ins01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_Ins01();
		return lgc.aPurcRet_Ins01;
	}

	protected void paramPurcRet_Ins01(MCParam p) {
		if (this.aPurcRet_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_Ins01.up0());
		p.addUpBlock(aPurcRet_Ins01.up1());
		p.addUpBlock(aPurcRet_Ins01.up2());
		p.addDownBlock(aPurcRet_Ins01.down0());
		p.addDownBlock(aPurcRet_Ins01.down1());
		p.addDownBlock(aPurcRet_Ins01.down2());
	}

	protected void doPurcRet_Ins01() {
		aPurcRet_Ins01.call();
	};

	/**
	 * HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
		return mcframe.serverMSBD.MSBDL5170.HdrR.create();
	}

	/**
	 * HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
		return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
	}

	/**
	 * DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
		return mcframe.serverMSBD.MSBDL5170.DtlR.create();
	}

	/**
	 * DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
		return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
	}

	/**
	 * IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
		return mcframe.serverMSBD.MSBDL5170.IoR.create();
	}

	/**
	 * IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
		return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
	}
	protected MSBDL_PurcRetRegService.PurcRet_Upd01 aPurcRet_Upd01;

	protected void initPurcRet_Upd01() {
		this.info = PDef.MS_MSBDL5170_PurcRet_Upd01_INFO;
		this.aPurcRet_Upd01 = ((MSBDL_PurcRetRegService)this).new PurcRet_Upd01();
	}

	public static MSBDL_PurcRetRegService.PurcRet_Upd01 crtPurcRet_Upd01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_Upd01();
		return lgc.aPurcRet_Upd01;
	}

	protected void paramPurcRet_Upd01(MCParam p) {
		if (this.aPurcRet_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_Upd01.up0());
		p.addUpBlock(aPurcRet_Upd01.up1());
		p.addUpBlock(aPurcRet_Upd01.up2());
		p.addDownBlock(aPurcRet_Upd01.down0());
		p.addDownBlock(aPurcRet_Upd01.down1());
		p.addDownBlock(aPurcRet_Upd01.down2());
	}

	protected void doPurcRet_Upd01() {
		aPurcRet_Upd01.call();
	};
	protected MSBDL_PurcRetRegService.PurcRet_Del01 aPurcRet_Del01;

	protected void initPurcRet_Del01() {
		this.info = PDef.MS_MSBDL5170_PurcRet_Del01_INFO;
		this.aPurcRet_Del01 = ((MSBDL_PurcRetRegService)this).new PurcRet_Del01();
	}

	public static MSBDL_PurcRetRegService.PurcRet_Del01 crtPurcRet_Del01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_Del01();
		return lgc.aPurcRet_Del01;
	}

	protected void paramPurcRet_Del01(MCParam p) {
		if (this.aPurcRet_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_Del01.up0());
		p.addUpBlock(aPurcRet_Del01.up1());
		p.addUpBlock(aPurcRet_Del01.up2());
	}

	protected void doPurcRet_Del01() {
		aPurcRet_Del01.call();
	};
	protected MSBDL_PurcRetRegService.PurcRet_Chk01 aPurcRet_Chk01;

	protected void initPurcRet_Chk01() {
		this.info = PDef.MS_MSBDL5170_PurcRet_Chk01_INFO;
		this.aPurcRet_Chk01 = ((MSBDL_PurcRetRegService)this).new PurcRet_Chk01();
	}

	public static MSBDL_PurcRetRegService.PurcRet_Chk01 crtPurcRet_Chk01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_Chk01();
		return lgc.aPurcRet_Chk01;
	}

	protected void paramPurcRet_Chk01(MCParam p) {
		if (this.aPurcRet_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_Chk01.up0());
		p.addUpBlock(aPurcRet_Chk01.up1());
		p.addUpBlock(aPurcRet_Chk01.up2());
		p.addDownBlock(aPurcRet_Chk01.down0());
		p.addDownBlock(aPurcRet_Chk01.down1());
		p.addDownBlock(aPurcRet_Chk01.down2());
	}

	protected void doPurcRet_Chk01() {
		aPurcRet_Chk01.call();
	};
	protected MSBDL_PurcRetRegService.PurcRet_Chk02 aPurcRet_Chk02;

	protected void initPurcRet_Chk02() {
		this.info = PDef.MS_MSBDL5170_PurcRet_Chk02_INFO;
		this.aPurcRet_Chk02 = ((MSBDL_PurcRetRegService)this).new PurcRet_Chk02();
	}

	public static MSBDL_PurcRetRegService.PurcRet_Chk02 crtPurcRet_Chk02() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_Chk02();
		return lgc.aPurcRet_Chk02;
	}

	protected void paramPurcRet_Chk02(MCParam p) {
		if (this.aPurcRet_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_Chk02.up0());
		p.addUpBlock(aPurcRet_Chk02.up1());
		p.addUpBlock(aPurcRet_Chk02.up2());
		p.addDownBlock(aPurcRet_Chk02.down0());
		p.addDownBlock(aPurcRet_Chk02.down1());
		p.addDownBlock(aPurcRet_Chk02.down2());
	}

	protected void doPurcRet_Chk02() {
		aPurcRet_Chk02.call();
	};
	protected MSBDL_PurcRetRegService.PurcRet_Chk03 aPurcRet_Chk03;

	protected void initPurcRet_Chk03() {
		this.info = PDef.MS_MSBDL5170_PurcRet_Chk03_INFO;
		this.aPurcRet_Chk03 = ((MSBDL_PurcRetRegService)this).new PurcRet_Chk03();
	}

	public static MSBDL_PurcRetRegService.PurcRet_Chk03 crtPurcRet_Chk03() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_Chk03();
		return lgc.aPurcRet_Chk03;
	}

	protected void paramPurcRet_Chk03(MCParam p) {
		if (this.aPurcRet_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_Chk03.up0());
		p.addUpBlock(aPurcRet_Chk03.up1());
		p.addUpBlock(aPurcRet_Chk03.up2());
		p.addDownBlock(aPurcRet_Chk03.down0());
		p.addDownBlock(aPurcRet_Chk03.down1());
		p.addDownBlock(aPurcRet_Chk03.down2());
	}

	protected void doPurcRet_Chk03() {
		aPurcRet_Chk03.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Chk01 aSchd_Chk01;

	protected void initSchd_Chk01() {
		this.info = PDef.MS_MSBDL5170_Schd_Chk01_INFO;
		this.aSchd_Chk01 = ((MSBDL_PurcRetRegService)this).new Schd_Chk01();
	}

	public static MSBDL_PurcRetRegService.Schd_Chk01 crtSchd_Chk01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Chk01();
		return lgc.aSchd_Chk01;
	}

	protected void paramSchd_Chk01(MCParam p) {
		if (this.aSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Chk01.up0());
		p.addUpBlock(aSchd_Chk01.up1());
		p.addUpBlock(aSchd_Chk01.up2());
		p.addDownBlock(aSchd_Chk01.down0());
		p.addDownBlock(aSchd_Chk01.down1());
		p.addDownBlock(aSchd_Chk01.down2());
	}

	protected void doSchd_Chk01() {
		aSchd_Chk01.call();
	};

	/**
	 * Schd_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
		return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
	}

	/**
	 * Schd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
		return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
	}

	/**
	 * Schd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
		return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
	}

	/**
	 * Schd_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
		return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
	}

	/**
	 * Schd_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
		return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
	}
	protected MSBDL_PurcRetRegService.Schd_Chk02 aSchd_Chk02;

	protected void initSchd_Chk02() {
		this.info = PDef.MS_MSBDL5170_Schd_Chk02_INFO;
		this.aSchd_Chk02 = ((MSBDL_PurcRetRegService)this).new Schd_Chk02();
	}

	public static MSBDL_PurcRetRegService.Schd_Chk02 crtSchd_Chk02() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Chk02();
		return lgc.aSchd_Chk02;
	}

	protected void paramSchd_Chk02(MCParam p) {
		if (this.aSchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Chk02.up0());
		p.addUpBlock(aSchd_Chk02.up1());
		p.addUpBlock(aSchd_Chk02.up2());
		p.addDownBlock(aSchd_Chk02.down0());
		p.addDownBlock(aSchd_Chk02.down1());
		p.addDownBlock(aSchd_Chk02.down2());
	}

	protected void doSchd_Chk02() {
		aSchd_Chk02.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Chk03 aSchd_Chk03;

	protected void initSchd_Chk03() {
		this.info = PDef.MS_MSBDL5170_Schd_Chk03_INFO;
		this.aSchd_Chk03 = ((MSBDL_PurcRetRegService)this).new Schd_Chk03();
	}

	public static MSBDL_PurcRetRegService.Schd_Chk03 crtSchd_Chk03() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Chk03();
		return lgc.aSchd_Chk03;
	}

	protected void paramSchd_Chk03(MCParam p) {
		if (this.aSchd_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Chk03.up0());
		p.addDownBlock(aSchd_Chk03.down0());
	}

	protected void doSchd_Chk03() {
		aSchd_Chk03.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Chk04 aSchd_Chk04;

	protected void initSchd_Chk04() {
		this.info = PDef.MS_MSBDL5170_Schd_Chk04_INFO;
		this.aSchd_Chk04 = ((MSBDL_PurcRetRegService)this).new Schd_Chk04();
	}

	public static MSBDL_PurcRetRegService.Schd_Chk04 crtSchd_Chk04() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Chk04();
		return lgc.aSchd_Chk04;
	}

	protected void paramSchd_Chk04(MCParam p) {
		if (this.aSchd_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Chk04.up0());
		p.addUpBlock(aSchd_Chk04.up1());
		p.addUpBlock(aSchd_Chk04.up2());
		p.addDownBlock(aSchd_Chk04.down0());
		p.addDownBlock(aSchd_Chk04.down1());
		p.addDownBlock(aSchd_Chk04.down2());
	}

	protected void doSchd_Chk04() {
		aSchd_Chk04.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Ins01 aSchd_Ins01;

	protected void initSchd_Ins01() {
		this.info = PDef.MS_MSBDL5170_Schd_Ins01_INFO;
		this.aSchd_Ins01 = ((MSBDL_PurcRetRegService)this).new Schd_Ins01();
	}

	public static MSBDL_PurcRetRegService.Schd_Ins01 crtSchd_Ins01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Ins01();
		return lgc.aSchd_Ins01;
	}

	protected void paramSchd_Ins01(MCParam p) {
		if (this.aSchd_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Ins01.up0());
		p.addUpBlock(aSchd_Ins01.up1());
		p.addUpBlock(aSchd_Ins01.up2());
		p.addDownBlock(aSchd_Ins01.down0());
		p.addDownBlock(aSchd_Ins01.down1());
		p.addDownBlock(aSchd_Ins01.down2());
	}

	protected void doSchd_Ins01() {
		aSchd_Ins01.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Upd01 aSchd_Upd01;

	protected void initSchd_Upd01() {
		this.info = PDef.MS_MSBDL5170_Schd_Upd01_INFO;
		this.aSchd_Upd01 = ((MSBDL_PurcRetRegService)this).new Schd_Upd01();
	}

	public static MSBDL_PurcRetRegService.Schd_Upd01 crtSchd_Upd01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Upd01();
		return lgc.aSchd_Upd01;
	}

	protected void paramSchd_Upd01(MCParam p) {
		if (this.aSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Upd01.up0());
		p.addUpBlock(aSchd_Upd01.up1());
		p.addUpBlock(aSchd_Upd01.up2());
		p.addDownBlock(aSchd_Upd01.down0());
		p.addDownBlock(aSchd_Upd01.down1());
	}

	protected void doSchd_Upd01() {
		aSchd_Upd01.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Upd02 aSchd_Upd02;

	protected void initSchd_Upd02() {
		this.info = PDef.MS_MSBDL5170_Schd_Upd02_INFO;
		this.aSchd_Upd02 = ((MSBDL_PurcRetRegService)this).new Schd_Upd02();
	}

	public static MSBDL_PurcRetRegService.Schd_Upd02 crtSchd_Upd02() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Upd02();
		return lgc.aSchd_Upd02;
	}

	protected void paramSchd_Upd02(MCParam p) {
		if (this.aSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Upd02.up0());
		p.addUpBlock(aSchd_Upd02.up1());
		p.addUpBlock(aSchd_Upd02.up2());
		p.addDownBlock(aSchd_Upd02.down0());
		p.addDownBlock(aSchd_Upd02.down1());
	}

	protected void doSchd_Upd02() {
		aSchd_Upd02.call();
	};
	protected MSBDL_PurcRetRegService.Schd_Del01 aSchd_Del01;

	protected void initSchd_Del01() {
		this.info = PDef.MS_MSBDL5170_Schd_Del01_INFO;
		this.aSchd_Del01 = ((MSBDL_PurcRetRegService)this).new Schd_Del01();
	}

	public static MSBDL_PurcRetRegService.Schd_Del01 crtSchd_Del01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initSchd_Del01();
		return lgc.aSchd_Del01;
	}

	protected void paramSchd_Del01(MCParam p) {
		if (this.aSchd_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSchd_Del01.up0());
	}

	protected void doSchd_Del01() {
		aSchd_Del01.call();
	};
	protected MSBDL_PurcRetRegService.PurcRet_RevUpd01 aPurcRet_RevUpd01;

	protected void initPurcRet_RevUpd01() {
		this.info = PDef.MS_MSBDL5170_PurcRet_RevUpd01_INFO;
		this.aPurcRet_RevUpd01 = ((MSBDL_PurcRetRegService)this).new PurcRet_RevUpd01();
	}

	public static MSBDL_PurcRetRegService.PurcRet_RevUpd01 crtPurcRet_RevUpd01() {
		MSBDL_PurcRetRegService lgc = new MSBDL_PurcRetRegService();
		lgc.initPurcRet_RevUpd01();
		return lgc.aPurcRet_RevUpd01;
	}

	protected void paramPurcRet_RevUpd01(MCParam p) {
		if (this.aPurcRet_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPurcRet_RevUpd01.up0());
	}

	protected void doPurcRet_RevUpd01() {
		aPurcRet_RevUpd01.call();
	};

	/**
	 * Po_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createPo_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * Po_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createPo_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * PurcRet_Ins01オペレーション.<p>
	 *
	 * 仕入返品を新規登録する<br>
	 */
	abstract public class PurcRet_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2;
		
		
		// コンストラクタ
		protected PurcRet_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
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
		public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
			return mcframe.serverMSBD.MSBDL5170.HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
			return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
			return mcframe.serverMSBD.MSBDL5170.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
			return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
		}

		/**
		 * IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
			return mcframe.serverMSBD.MSBDL5170.IoR.create();
		}

		/**
		 * IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
			return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0() {
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
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0() {
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
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcRet_Upd01オペレーション.<p>
	 *
	 * 仕入返品を更新する<br>
	 */
	abstract public class PurcRet_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2;
		
		
		// コンストラクタ
		protected PurcRet_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
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
		public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
			return mcframe.serverMSBD.MSBDL5170.HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
			return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
			return mcframe.serverMSBD.MSBDL5170.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
			return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
		}

		/**
		 * IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
			return mcframe.serverMSBD.MSBDL5170.IoR.create();
		}

		/**
		 * IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
			return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0() {
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
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0() {
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
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcRet_Del01オペレーション.<p>
	 *
	 * 仕入返品を削除する<br>
	 */
	abstract public class PurcRet_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2;
		
		
		// コンストラクタ
		protected PurcRet_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
			return mcframe.serverMSBD.MSBDL5170.HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
			return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
			return mcframe.serverMSBD.MSBDL5170.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
			return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
		}

		/**
		 * IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
			return mcframe.serverMSBD.MSBDL5170.IoR.create();
		}

		/**
		 * IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
			return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>io_make_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0() {
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
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcRet_Chk01オペレーション.<p>
	 *
	 * 仕入返品登録前チェック処理<br>
	 */
	abstract public class PurcRet_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2;
		
		
		// コンストラクタ
		protected PurcRet_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
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
		public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
			return mcframe.serverMSBD.MSBDL5170.HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
			return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
			return mcframe.serverMSBD.MSBDL5170.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
			return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
		}

		/**
		 * IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
			return mcframe.serverMSBD.MSBDL5170.IoR.create();
		}

		/**
		 * IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
			return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0() {
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
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2() {
			return up2;
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
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0() {
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
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcRet_Chk02オペレーション.<p>
	 *
	 * 仕入返品更新前チェック処理<br>
	 */
	abstract public class PurcRet_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2;
		
		
		// コンストラクタ
		protected PurcRet_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
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
		public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
			return mcframe.serverMSBD.MSBDL5170.HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
			return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
			return mcframe.serverMSBD.MSBDL5170.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
			return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
		}

		/**
		 * IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
			return mcframe.serverMSBD.MSBDL5170.IoR.create();
		}

		/**
		 * IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
			return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_dt</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0() {
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
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0() {
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
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dtl_upd_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcRet_Chk03オペレーション.<p>
	 *
	 * 仕入返品削除前チェック処理<br>
	 */
	abstract public class PurcRet_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2;
		
		
		// コンストラクタ
		protected PurcRet_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			up1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
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
		public mcframe.serverMSBD.MSBDL5170.HdrR createHdrR(){
			return mcframe.serverMSBD.MSBDL5170.HdrR.create();
		}

		/**
		 * HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> createHdrL(){
			return mcframe.serverMSBD.MSBDL5170.HdrL.createMS_MSBDL5170_Hdr(mcframe.serverMSBD.MSBDL5170.HdrR.class);
		}

		/**
		 * DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlR createDtlR(){
			return mcframe.serverMSBD.MSBDL5170.DtlR.create();
		}

		/**
		 * DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> createDtlL(){
			return mcframe.serverMSBD.MSBDL5170.DtlL.createMS_MSBDL5170_Dtl(mcframe.serverMSBD.MSBDL5170.DtlR.class);
		}

		/**
		 * IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoR createIoR(){
			return mcframe.serverMSBD.MSBDL5170.IoR.create();
		}

		/**
		 * IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> createIoL(){
			return mcframe.serverMSBD.MSBDL5170.IoL.createMS_MSBDL5170_Io(mcframe.serverMSBD.MSBDL5170.IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> up0() {
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
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>xpns_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.HdrL
		 */
		public mcframe.serverMSBD.MSBDL5170.HdrL<mcframe.serverMSBD.MSBDL5170.HdrR> down0() {
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
		 * 	<tr><td><br></td><td>purc_ret_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_rev</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.DtlL<mcframe.serverMSBD.MSBDL5170.DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_act_d_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.IoL<mcframe.serverMSBD.MSBDL5170.IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Chk01オペレーション.<p>
	 *
	 */
	abstract public class Schd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2;
		
		
		// コンストラクタ
		protected Schd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			up1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			down1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		/**
		 * Schd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
		}

		/**
		 * Schd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
		}

		/**
		 * Schd_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
		}

		/**
		 * Schd_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Chk02オペレーション.<p>
	 *
	 */
	abstract public class Schd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2;
		
		
		// コンストラクタ
		protected Schd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			up1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			down1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		/**
		 * Schd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
		}

		/**
		 * Schd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
		}

		/**
		 * Schd_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
		}

		/**
		 * Schd_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>mst_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Chk03オペレーション.<p>
	 *
	 */
	abstract public class Schd_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0;
		
		
		// コンストラクタ
		protected Schd_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>pr_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
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
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Chk04オペレーション.<p>
	 *
	 */
	abstract public class Schd_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2;
		
		
		// コンストラクタ
		protected Schd_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			up1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			down1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		/**
		 * Schd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
		}

		/**
		 * Schd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
		}

		/**
		 * Schd_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
		}

		/**
		 * Schd_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Ins01オペレーション.<p>
	 *
	 */
	abstract public class Schd_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2;
		
		
		// コンストラクタ
		protected Schd_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			up1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			down1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			down2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		/**
		 * Schd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
		}

		/**
		 * Schd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
		}

		/**
		 * Schd_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
		}

		/**
		 * Schd_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Upd01オペレーション.<p>
	 *
	 */
	abstract public class Schd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down1;
		
		
		// コンストラクタ
		protected Schd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			up1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		/**
		 * Schd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
		}

		/**
		 * Schd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
		}

		/**
		 * Schd_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
		}

		/**
		 * Schd_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pr_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>amt_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Upd02オペレーション.<p>
	 *
	 */
	abstract public class Schd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down1;
		
		
		// コンストラクタ
		protected Schd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
			up1 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			up2 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
			down0 = mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
			down1 = mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		/**
		 * Schd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlR createSchd_DtlR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlR.create();
		}

		/**
		 * Schd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> createSchd_DtlL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_DtlL.createMS_MSBDL5170_Schd_Dtl(mcframe.serverMSBD.MSBDL5170.Schd_DtlR.class);
		}

		/**
		 * Schd_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoR createSchd_IoR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoR.create();
		}

		/**
		 * Schd_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> createSchd_IoL(){
			return mcframe.serverMSBD.MSBDL5170.Schd_IoL.createMS_MSBDL5170_Schd_Io(mcframe.serverMSBD.MSBDL5170.Schd_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>ref_rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr1</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr2</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr3</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_addr4</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_tel</td></tr>
		 * 	<tr><td><br></td><td>ret_sppl_fax</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>pr_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>bd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bd_lot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bd_sno1</td></tr>
		 * 	<tr><td><br></td><td>bd_sno2</td></tr>
		 * 	<tr><td><br></td><td>bd_sno3</td></tr>
		 * 	<tr><td><br></td><td>bd_sno4</td></tr>
		 * 	<tr><td><br></td><td>bd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_ctg_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_oper_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bd_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_po_no</td></tr>
		 * 	<tr><td><br></td><td>bd_slo_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_print_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_arr_act_rev</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>ref_purc_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_DtlL<mcframe.serverMSBD.MSBDL5170.Schd_DtlR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_io_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoL
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_IoL<mcframe.serverMSBD.MSBDL5170.Schd_IoR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * Schd_Del01オペレーション.<p>
	 *
	 */
	abstract public class Schd_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Schd_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0;
		
		
		// コンストラクタ
		protected Schd_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Schd_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR createSchd_HdrR(){
			return mcframe.serverMSBD.MSBDL5170.Schd_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>purc_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pr_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBD.MSBDL5170.Schd_HdrR
		 */
		public mcframe.serverMSBD.MSBDL5170.Schd_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}
	/**
	 * PurcRet_RevUpd01オペレーション.<p>
	 *
	 * 仕入返品実績改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class PurcRet_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "PurcRet_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected PurcRet_RevUpd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);

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
			invoke((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Po_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createPo_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * Po_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createPo_RevUpd01_DtlL(){
			return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>rev_data_src_no</td></tr>
		 * 	<tr><td><br></td><td>rev_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBDL_PurcRetRegService)MSBDL_PurcRetRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}