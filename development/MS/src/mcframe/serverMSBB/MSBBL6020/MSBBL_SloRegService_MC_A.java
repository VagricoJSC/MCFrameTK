package mcframe.serverMSBB.MSBBL6020;

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
 * "MSBBL_SloRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SloRegService_MC_A extends mcframe.serverMSBB.MSBBL9010.MSBBL_QtnSlsBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL6020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SloRegService.Slo_Chk01 aSlo_Chk01;

	protected void initSlo_Chk01() {
		this.info = PDef.MS_MSBBL6020_Slo_Chk01_INFO;
		this.aSlo_Chk01 = ((MSBBL_SloRegService)this).new Slo_Chk01();
	}

	public static MSBBL_SloRegService.Slo_Chk01 crtSlo_Chk01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Chk01();
		return lgc.aSlo_Chk01;
	}

	protected void paramSlo_Chk01(MCParam p) {
		if (this.aSlo_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Chk01.up0());
		p.addUpBlock(aSlo_Chk01.up1());
		p.addUpBlock(aSlo_Chk01.up2());
		p.addUpBlock(aSlo_Chk01.up3());
		p.addDownBlock(aSlo_Chk01.down0());
		p.addDownBlock(aSlo_Chk01.down1());
		p.addDownBlock(aSlo_Chk01.down2());
		p.addDownBlock(aSlo_Chk01.down3());
	}

	protected void doSlo_Chk01() {
		aSlo_Chk01.call();
	};

	/**
	 * Slo_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR createSlo_Upd01_HdrR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.create();
	}

	/**
	 * Slo_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> createSlo_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
	}

	/**
	 * Slo_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR createSlo_Upd01_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.create();
	}

	/**
	 * Slo_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> createSlo_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
	}

	/**
	 * Slo_Upd01_DtlCompブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR createSlo_Upd01_DtlCompR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.create();
	}

	/**
	 * Slo_Upd01_DtlCompブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> createSlo_Upd01_DtlCompL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
	}

	/**
	 * Slo_Upd01_DtlSpecブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR createSlo_Upd01_DtlSpecR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.create();
	}

	/**
	 * Slo_Upd01_DtlSpecブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> createSlo_Upd01_DtlSpecL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
	}
	protected MSBBL_SloRegService.Slo_Chk02 aSlo_Chk02;

	protected void initSlo_Chk02() {
		this.info = PDef.MS_MSBBL6020_Slo_Chk02_INFO;
		this.aSlo_Chk02 = ((MSBBL_SloRegService)this).new Slo_Chk02();
	}

	public static MSBBL_SloRegService.Slo_Chk02 crtSlo_Chk02() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Chk02();
		return lgc.aSlo_Chk02;
	}

	protected void paramSlo_Chk02(MCParam p) {
		if (this.aSlo_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Chk02.up0());
		p.addDownBlock(aSlo_Chk02.down0());
	}

	protected void doSlo_Chk02() {
		aSlo_Chk02.call();
	};

	/**
	 * Sls_Schd_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR createSls_Schd_Upd02_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR.create();
	}

	/**
	 * Sls_Schd_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR> createSls_Schd_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR.class);
	}
	protected MSBBL_SloRegService.Slo_Chk03 aSlo_Chk03;

	protected void initSlo_Chk03() {
		this.info = PDef.MS_MSBBL6020_Slo_Chk03_INFO;
		this.aSlo_Chk03 = ((MSBBL_SloRegService)this).new Slo_Chk03();
	}

	public static MSBBL_SloRegService.Slo_Chk03 crtSlo_Chk03() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Chk03();
		return lgc.aSlo_Chk03;
	}

	protected void paramSlo_Chk03(MCParam p) {
		if (this.aSlo_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Chk03.up0());
		p.addUpBlock(aSlo_Chk03.up1());
		p.addDownBlock(aSlo_Chk03.down0());
		p.addDownBlock(aSlo_Chk03.down1());
	}

	protected void doSlo_Chk03() {
		aSlo_Chk03.call();
	};

	/**
	 * Slo_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR createSlo_Del01_HdrR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
	}

	/**
	 * Slo_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR createSlo_Del01_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.create();
	}

	/**
	 * Slo_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> createSlo_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);
	}
	protected MSBBL_SloRegService.Slo_Chk04 aSlo_Chk04;

	protected void initSlo_Chk04() {
		this.info = PDef.MS_MSBBL6020_Slo_Chk04_INFO;
		this.aSlo_Chk04 = ((MSBBL_SloRegService)this).new Slo_Chk04();
	}

	public static MSBBL_SloRegService.Slo_Chk04 crtSlo_Chk04() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Chk04();
		return lgc.aSlo_Chk04;
	}

	protected void paramSlo_Chk04(MCParam p) {
		if (this.aSlo_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Chk04.up0());
		p.addDownBlock(aSlo_Chk04.down0());
	}

	protected void doSlo_Chk04() {
		aSlo_Chk04.call();
	};

	/**
	 * Slo_Upd02_SloブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR createSlo_Upd02_SloR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.create();
	}

	/**
	 * Slo_Upd02_SloブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> createSlo_Upd02_SloL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.class);
	}
	protected MSBBL_SloRegService.Slo_Ins01 aSlo_Ins01;

	protected void initSlo_Ins01() {
		this.info = PDef.MS_MSBBL6020_Slo_Ins01_INFO;
		this.aSlo_Ins01 = ((MSBBL_SloRegService)this).new Slo_Ins01();
	}

	public static MSBBL_SloRegService.Slo_Ins01 crtSlo_Ins01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Ins01();
		return lgc.aSlo_Ins01;
	}

	protected void paramSlo_Ins01(MCParam p) {
		if (this.aSlo_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Ins01.up0());
		p.addUpBlock(aSlo_Ins01.up1());
		p.addUpBlock(aSlo_Ins01.up2());
		p.addUpBlock(aSlo_Ins01.up3());
		p.addUpBlock(aSlo_Ins01.up4());
		p.addDownBlock(aSlo_Ins01.down0());
		p.addDownBlock(aSlo_Ins01.down1());
	}

	protected void doSlo_Ins01() {
		aSlo_Ins01.call();
	};

	/**
	 * Slo_Ins01_Rslt_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR createSlo_Ins01_Rslt_HdrR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.create();
	}

	/**
	 * Slo_Ins01_Rslt_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> createSlo_Ins01_Rslt_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.class);
	}

	/**
	 * Slo_Ins01_Rslt_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR createSlo_Ins01_Rslt_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.create();
	}

	/**
	 * Slo_Ins01_Rslt_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> createSlo_Ins01_Rslt_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.class);
	}

	/**
	 * Slo_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR createSlo_Upd01_CtrlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR.create();
	}
	protected MSBBL_SloRegService.Slo_Upd01 aSlo_Upd01;

	protected void initSlo_Upd01() {
		this.info = PDef.MS_MSBBL6020_Slo_Upd01_INFO;
		this.aSlo_Upd01 = ((MSBBL_SloRegService)this).new Slo_Upd01();
	}

	public static MSBBL_SloRegService.Slo_Upd01 crtSlo_Upd01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Upd01();
		return lgc.aSlo_Upd01;
	}

	protected void paramSlo_Upd01(MCParam p) {
		if (this.aSlo_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Upd01.up0());
		p.addUpBlock(aSlo_Upd01.up1());
		p.addUpBlock(aSlo_Upd01.up2());
		p.addUpBlock(aSlo_Upd01.up3());
		p.addDownBlock(aSlo_Upd01.down0());
		p.addDownBlock(aSlo_Upd01.down1());
	}

	protected void doSlo_Upd01() {
		aSlo_Upd01.call();
	};

	/**
	 * Slo_Upd01_Rslt_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR createSlo_Upd01_Rslt_HdrR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.create();
	}

	/**
	 * Slo_Upd01_Rslt_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> createSlo_Upd01_Rslt_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.class);
	}

	/**
	 * Slo_Upd01_Rslt_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR createSlo_Upd01_Rslt_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.create();
	}

	/**
	 * Slo_Upd01_Rslt_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> createSlo_Upd01_Rslt_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.class);
	}
	protected MSBBL_SloRegService.Slo_Upd02 aSlo_Upd02;

	protected void initSlo_Upd02() {
		this.info = PDef.MS_MSBBL6020_Slo_Upd02_INFO;
		this.aSlo_Upd02 = ((MSBBL_SloRegService)this).new Slo_Upd02();
	}

	public static MSBBL_SloRegService.Slo_Upd02 crtSlo_Upd02() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Upd02();
		return lgc.aSlo_Upd02;
	}

	protected void paramSlo_Upd02(MCParam p) {
		if (this.aSlo_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Upd02.up0());
	}

	protected void doSlo_Upd02() {
		aSlo_Upd02.call();
	};
	protected MSBBL_SloRegService.Slo_Del01 aSlo_Del01;

	protected void initSlo_Del01() {
		this.info = PDef.MS_MSBBL6020_Slo_Del01_INFO;
		this.aSlo_Del01 = ((MSBBL_SloRegService)this).new Slo_Del01();
	}

	public static MSBBL_SloRegService.Slo_Del01 crtSlo_Del01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_Del01();
		return lgc.aSlo_Del01;
	}

	protected void paramSlo_Del01(MCParam p) {
		if (this.aSlo_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_Del01.up0());
		p.addUpBlock(aSlo_Del01.up1());
	}

	protected void doSlo_Del01() {
		aSlo_Del01.call();
	};
	protected MSBBL_SloRegService.Slo_RevUpd01 aSlo_RevUpd01;

	protected void initSlo_RevUpd01() {
		this.info = PDef.MS_MSBBL6020_Slo_RevUpd01_INFO;
		this.aSlo_RevUpd01 = ((MSBBL_SloRegService)this).new Slo_RevUpd01();
	}

	public static MSBBL_SloRegService.Slo_RevUpd01 crtSlo_RevUpd01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_RevUpd01();
		return lgc.aSlo_RevUpd01;
	}

	protected void paramSlo_RevUpd01(MCParam p) {
		if (this.aSlo_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_RevUpd01.up0());
	}

	protected void doSlo_RevUpd01() {
		aSlo_RevUpd01.call();
	};

	/**
	 * Slo_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createSlo_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * Slo_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createSlo_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}
	protected MSBBL_SloRegService.Slo_BulkImp_Chk01 aSlo_BulkImp_Chk01;

	protected void initSlo_BulkImp_Chk01() {
		this.info = PDef.MS_MSBBL6020_Slo_BulkImp_Chk01_INFO;
		this.aSlo_BulkImp_Chk01 = ((MSBBL_SloRegService)this).new Slo_BulkImp_Chk01();
	}

	public static MSBBL_SloRegService.Slo_BulkImp_Chk01 crtSlo_BulkImp_Chk01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_BulkImp_Chk01();
		return lgc.aSlo_BulkImp_Chk01;
	}

	protected void paramSlo_BulkImp_Chk01(MCParam p) {
		if (this.aSlo_BulkImp_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_BulkImp_Chk01.up0());
		p.addDownBlock(aSlo_BulkImp_Chk01.down0());
	}

	protected void doSlo_BulkImp_Chk01() {
		aSlo_BulkImp_Chk01.call();
	};

	/**
	 * Slo_BulkImp_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR createSlo_BulkImp_Chk01_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.create();
	}

	/**
	 * Slo_BulkImp_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> createSlo_BulkImp_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);
	}
	protected MSBBL_SloRegService.Slo_BulkImp_Chk02 aSlo_BulkImp_Chk02;

	protected void initSlo_BulkImp_Chk02() {
		this.info = PDef.MS_MSBBL6020_Slo_BulkImp_Chk02_INFO;
		this.aSlo_BulkImp_Chk02 = ((MSBBL_SloRegService)this).new Slo_BulkImp_Chk02();
	}

	public static MSBBL_SloRegService.Slo_BulkImp_Chk02 crtSlo_BulkImp_Chk02() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_BulkImp_Chk02();
		return lgc.aSlo_BulkImp_Chk02;
	}

	protected void paramSlo_BulkImp_Chk02(MCParam p) {
		if (this.aSlo_BulkImp_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_BulkImp_Chk02.up0());
		p.addDownBlock(aSlo_BulkImp_Chk02.down0());
	}

	protected void doSlo_BulkImp_Chk02() {
		aSlo_BulkImp_Chk02.call();
	};

	/**
	 * Slo_BulkImp_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR createSlo_BulkImp_Chk02_DtlR(){
		return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.create();
	}

	/**
	 * Slo_BulkImp_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> createSlo_BulkImp_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);
	}
	protected MSBBL_SloRegService.Slo_BulkImp_Ins01 aSlo_BulkImp_Ins01;

	protected void initSlo_BulkImp_Ins01() {
		this.info = PDef.MS_MSBBL6020_Slo_BulkImp_Ins01_INFO;
		this.aSlo_BulkImp_Ins01 = ((MSBBL_SloRegService)this).new Slo_BulkImp_Ins01();
	}

	public static MSBBL_SloRegService.Slo_BulkImp_Ins01 crtSlo_BulkImp_Ins01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_BulkImp_Ins01();
		return lgc.aSlo_BulkImp_Ins01;
	}

	protected void paramSlo_BulkImp_Ins01(MCParam p) {
		if (this.aSlo_BulkImp_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_BulkImp_Ins01.up0());
		p.addDownBlock(aSlo_BulkImp_Ins01.down0());
	}

	protected void doSlo_BulkImp_Ins01() {
		aSlo_BulkImp_Ins01.call();
	};
	protected MSBBL_SloRegService.Slo_BulkImp_Del01 aSlo_BulkImp_Del01;

	protected void initSlo_BulkImp_Del01() {
		this.info = PDef.MS_MSBBL6020_Slo_BulkImp_Del01_INFO;
		this.aSlo_BulkImp_Del01 = ((MSBBL_SloRegService)this).new Slo_BulkImp_Del01();
	}

	public static MSBBL_SloRegService.Slo_BulkImp_Del01 crtSlo_BulkImp_Del01() {
		MSBBL_SloRegService lgc = new MSBBL_SloRegService();
		lgc.initSlo_BulkImp_Del01();
		return lgc.aSlo_BulkImp_Del01;
	}

	protected void paramSlo_BulkImp_Del01(MCParam p) {
		if (this.aSlo_BulkImp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSlo_BulkImp_Del01.up0());
	}

	protected void doSlo_BulkImp_Del01() {
		aSlo_BulkImp_Del01.call();
	};

	/**
	 * Slo_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR createSlo_Del01_HdrR_0(){
		return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.create();
	}

	/**
	 * Slo_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> createSlo_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Slo_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理、項目値の補完<br>
	 */
	abstract public class Slo_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> down3;
		
		
		// コンストラクタ
		protected Slo_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
			up3 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
			down3 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * Slo_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR createSlo_Upd01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.create();
		}

		/**
		 * Slo_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> createSlo_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
		}

		/**
		 * Slo_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR createSlo_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.create();
		}

		/**
		 * Slo_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> createSlo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
		}

		/**
		 * Slo_Upd01_DtlCompブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR createSlo_Upd01_DtlCompR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.create();
		}

		/**
		 * Slo_Upd01_DtlCompブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> createSlo_Upd01_DtlCompL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
		}

		/**
		 * Slo_Upd01_DtlSpecブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR createSlo_Upd01_DtlSpecR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.create();
		}

		/**
		 * Slo_Upd01_DtlSpecブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> createSlo_Upd01_DtlSpecL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_back_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
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
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_spec_no</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_rev_no</td></tr>
		 * 	<tr><td><br></td><td>comp_base_qty</td></tr>
		 * 	<tr><td><br></td><td>comp_rel_flg</td></tr>
		 * 	<tr><td><br></td><td>no_itm_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>rev_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>new_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>org_ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>has_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_rmrks</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_flg</td></tr>
		 * 	<tr><td><br></td><td>std_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_spec_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_spec_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_back_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>adv_rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_can_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>old_can_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>rqst_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_spec_no</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_rev_no</td></tr>
		 * 	<tr><td><br></td><td>comp_base_qty</td></tr>
		 * 	<tr><td><br></td><td>comp_rel_flg</td></tr>
		 * 	<tr><td><br></td><td>no_itm_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>rev_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>new_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_seq_flg</td></tr>
		 * 	<tr><td><br></td><td>org_ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>has_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_rmrks</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_flg</td></tr>
		 * 	<tr><td><br></td><td>std_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_spec_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_spec_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Chk02オペレーション.<p>
	 *
	 * 承認状況チェック（発注登録用）<br>
	 */
	abstract public class Slo_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected Slo_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sls_Schd_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR createSls_Schd_Upd02_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR.create();
		}

		/**
		 * Sls_Schd_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR> createSls_Schd_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Sls_Schd_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Chk03オペレーション.<p>
	 *
	 * 削除前のチェック処理、項目値の補完<br>
	 */
	abstract public class Slo_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> down1;
		
		
		// コンストラクタ
		protected Slo_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);
			down0 = mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Slo_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR createSlo_Del01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
		}

		/**
		 * Slo_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR createSlo_Del01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.create();
		}

		/**
		 * Slo_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> createSlo_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_not_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Chk04オペレーション.<p>
	 *
	 * 前受金入金額更新前チェック<br>
	 */
	abstract public class Slo_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> down0;
		
		
		// コンストラクタ
		protected Slo_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Slo_Upd02_SloブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR createSlo_Upd02_SloR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.create();
		}

		/**
		 * Slo_Upd02_SloブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> createSlo_Upd02_SloL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>adv_rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>adv_rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Ins01オペレーション.<p>
	 *
	 */
	abstract public class Slo_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> down1;
		
		
		// コンストラクタ
		protected Slo_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
			up3 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
			up4 = mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Slo_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR createSlo_Upd01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.create();
		}

		/**
		 * Slo_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> createSlo_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
		}

		/**
		 * Slo_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR createSlo_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.create();
		}

		/**
		 * Slo_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> createSlo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
		}

		/**
		 * Slo_Upd01_DtlCompブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR createSlo_Upd01_DtlCompR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.create();
		}

		/**
		 * Slo_Upd01_DtlCompブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> createSlo_Upd01_DtlCompL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
		}

		/**
		 * Slo_Upd01_DtlSpecブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR createSlo_Upd01_DtlSpecR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.create();
		}

		/**
		 * Slo_Upd01_DtlSpecブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> createSlo_Upd01_DtlSpecL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
		}

		/**
		 * Slo_Ins01_Rslt_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR createSlo_Ins01_Rslt_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.create();
		}

		/**
		 * Slo_Ins01_Rslt_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> createSlo_Ins01_Rslt_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.class);
		}

		/**
		 * Slo_Ins01_Rslt_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR createSlo_Ins01_Rslt_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.create();
		}

		/**
		 * Slo_Ins01_Rslt_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> createSlo_Ins01_Rslt_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.class);
		}

		/**
		 * Slo_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR createSlo_Upd01_CtrlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_back_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_rev_no</td></tr>
		 * 	<tr><td><br></td><td>comp_base_qty</td></tr>
		 * 	<tr><td><br></td><td>comp_rel_flg</td></tr>
		 * 	<tr><td><br></td><td>no_itm_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>rev_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>new_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>org_ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>has_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_rmrks</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_flg</td></tr>
		 * 	<tr><td><br></td><td>std_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_spec_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>commit_by_slo_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_CtrlR up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_can_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Upd01オペレーション.<p>
	 *
	 */
	abstract public class Slo_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> down1;
		
		
		// コンストラクタ
		protected Slo_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
			up3 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Slo_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR createSlo_Upd01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.create();
		}

		/**
		 * Slo_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> createSlo_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR.class);
		}

		/**
		 * Slo_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR createSlo_Upd01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.create();
		}

		/**
		 * Slo_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> createSlo_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR.class);
		}

		/**
		 * Slo_Upd01_DtlCompブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR createSlo_Upd01_DtlCompR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.create();
		}

		/**
		 * Slo_Upd01_DtlCompブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> createSlo_Upd01_DtlCompL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR.class);
		}

		/**
		 * Slo_Upd01_DtlSpecブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR createSlo_Upd01_DtlSpecR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.create();
		}

		/**
		 * Slo_Upd01_DtlSpecブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> createSlo_Upd01_DtlSpecL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR.class);
		}

		/**
		 * Slo_Upd01_Rslt_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR createSlo_Upd01_Rslt_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.create();
		}

		/**
		 * Slo_Upd01_Rslt_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> createSlo_Upd01_Rslt_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR.class);
		}

		/**
		 * Slo_Upd01_Rslt_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR createSlo_Upd01_Rslt_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.create();
		}

		/**
		 * Slo_Upd01_Rslt_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> createSlo_Upd01_Rslt_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_back_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>can_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>can_del_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>old_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_can_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>old_can_del_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_qty</td></tr>
		 * 	<tr><td><br></td><td>rqst_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_d_can_rmkrs</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_spec_no</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_rev_no</td></tr>
		 * 	<tr><td><br></td><td>comp_base_qty</td></tr>
		 * 	<tr><td><br></td><td>comp_rel_flg</td></tr>
		 * 	<tr><td><br></td><td>no_itm_cd_flg</td></tr>
		 * 	<tr><td><br></td><td>new_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>rev_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>new_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>org_ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>has_spec_flg</td></tr>
		 * 	<tr><td><br></td><td>spec_rmrks</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>spec_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>data_lno</td></tr>
		 * 	<tr><td><br></td><td>recv_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_itm_comp_no</td></tr>
		 * 	<tr><td><br></td><td>core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_flg</td></tr>
		 * 	<tr><td><br></td><td>std_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>qtn_comp_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlCompR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_spec_no</td></tr>
		 * 	<tr><td><br></td><td>sls_itm_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_spec_lno</td></tr>
		 * 	<tr><td><br></td><td>slo_itm_comp_lno</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>spec_cd</td></tr>
		 * 	<tr><td><br></td><td>spec_desc_cd</td></tr>
		 * 	<tr><td><br></td><td>rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_desc_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd01_DtlSpecR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_can_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Ins01_Rslt_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Upd02オペレーション.<p>
	 *
	 */
	abstract public class Slo_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> up0;
		
		
		// コンストラクタ
		protected Slo_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Slo_Upd02_SloブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR createSlo_Upd02_SloR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.create();
		}

		/**
		 * Slo_Upd02_SloブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> createSlo_Upd02_SloL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>adv_rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Upd02_SloR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_Del01オペレーション.<p>
	 *
	 */
	abstract public class Slo_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> up1;
		
		
		// コンストラクタ
		protected Slo_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Slo_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR createSlo_Del01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR.create();
		}

		/**
		 * Slo_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR createSlo_Del01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.create();
		}

		/**
		 * Slo_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> createSlo_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>can_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>can_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_Del01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_Del01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_RevUpd01オペレーション.<p>
	 *
	 * 受注改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class Slo_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected Slo_RevUpd01() {
			
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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Slo_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createSlo_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * Slo_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createSlo_RevUpd01_DtlL(){
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
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_BulkImp_Chk01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の登録前のチェック処理、項目値の補完を行う。<br>
	 */
	abstract public class Slo_BulkImp_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_BulkImp_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Slo_BulkImp_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Slo_BulkImp_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR createSlo_BulkImp_Chk01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.create();
		}

		/**
		 * Slo_BulkImp_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> createSlo_BulkImp_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>hdr_grp_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_hm</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
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
		 * 	<tr><td><br></td><td>pri_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_d_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>assort_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>adv_rcv_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>hdr_grp_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_err_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_comp_rev_no</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_abl_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_d_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_err_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_BulkImp_Chk02オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の削除前のチェック処理、項目値の補完を行う。<br>
	 */
	abstract public class Slo_BulkImp_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_BulkImp_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> down0;
		
		
		// コンストラクタ
		protected Slo_BulkImp_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Slo_BulkImp_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR createSlo_BulkImp_Chk02_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.create();
		}

		/**
		 * Slo_BulkImp_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> createSlo_BulkImp_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_BulkImp_Ins01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の登録を行う。<br>
	 */
	abstract public class Slo_BulkImp_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_BulkImp_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Slo_BulkImp_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Slo_BulkImp_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR createSlo_BulkImp_Chk01_DtlR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.create();
		}

		/**
		 * Slo_BulkImp_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> createSlo_BulkImp_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>assort_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_num_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_ship_ctrl_typ</td></tr>
		 * 	<tr><td><br></td><td>adv_bill_amt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rev</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>rcpt_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>hdr_grp_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno_num_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>set_itm_grp_no</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>accpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
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
		 * 	<tr><td><br></td><td>pri_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>proc_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_rqst_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_d_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>slo_d_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char2</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char3</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char4</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_char5</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_num1</td></tr>
		 * 	<tr><td><br></td><td>edi_sub_d_dt1</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_back_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_to_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>rqst_dlv_rqst_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_qty</td></tr>
		 * 	<tr><td><br></td><td>wait_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}
	/**
	 * Slo_BulkImp_Del01オペレーション.<p>
	 *
	 * 取り込んだファイルの情報をもとに、受注情報の削除を行う。<br>
	 */
	abstract public class Slo_BulkImp_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Slo_BulkImp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> up0;
		
		
		// コンストラクタ
		protected Slo_BulkImp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);

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
			invoke((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Slo_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR createSlo_Del01_HdrR(){
			return mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.create();
		}

		/**
		 * Slo_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> createSlo_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL6020.Slo_BulkImp_Chk02_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SloRegService)MSBBL_SloRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}