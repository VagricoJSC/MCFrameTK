package mcframe.serverMSBE.MSBEL5530;

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
 * "MSBEL_ShipInstService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipInstService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL5530";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipInstService.ShipInst_Chk01 aShipInst_Chk01;

	protected void initShipInst_Chk01() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Chk01_INFO;
		this.aShipInst_Chk01 = ((MSBEL_ShipInstService)this).new ShipInst_Chk01();
	}

	public static MSBEL_ShipInstService.ShipInst_Chk01 crtShipInst_Chk01() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Chk01();
		return lgc.aShipInst_Chk01;
	}

	protected void paramShipInst_Chk01(MCParam p) {
		if (this.aShipInst_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Chk01.up0());
		p.addUpBlock(aShipInst_Chk01.up1());
		p.addUpBlock(aShipInst_Chk01.up2());
		p.addDownBlock(aShipInst_Chk01.down0());
		p.addDownBlock(aShipInst_Chk01.down1());
		p.addDownBlock(aShipInst_Chk01.down2());
	}

	protected void doShipInst_Chk01() {
		aShipInst_Chk01.call();
	};

	/**
	 * ShipInst_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Chk01_HdrR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
	}

	/**
	 * ShipInst_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
	}

	/**
	 * ShipInst_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Chk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
	}

	/**
	 * ShipInst_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
	}

	/**
	 * ShipSchd_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR createShipSchd_Chk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.create();
	}

	/**
	 * ShipSchd_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> createShipSchd_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);
	}
	protected MSBEL_ShipInstService.ShipInst_Chk02 aShipInst_Chk02;

	protected void initShipInst_Chk02() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Chk02_INFO;
		this.aShipInst_Chk02 = ((MSBEL_ShipInstService)this).new ShipInst_Chk02();
	}

	public static MSBEL_ShipInstService.ShipInst_Chk02 crtShipInst_Chk02() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Chk02();
		return lgc.aShipInst_Chk02;
	}

	protected void paramShipInst_Chk02(MCParam p) {
		if (this.aShipInst_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Chk02.up0());
		p.addUpBlock(aShipInst_Chk02.up1());
		p.addDownBlock(aShipInst_Chk02.down0());
		p.addDownBlock(aShipInst_Chk02.down1());
	}

	protected void doShipInst_Chk02() {
		aShipInst_Chk02.call();
	};

	/**
	 * ShipInst_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Chk02_HdrR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
	}

	/**
	 * ShipInst_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
	}

	/**
	 * ShipInst_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Chk02_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
	}

	/**
	 * ShipInst_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
	}
	protected MSBEL_ShipInstService.ShipInst_Chk03 aShipInst_Chk03;

	protected void initShipInst_Chk03() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Chk03_INFO;
		this.aShipInst_Chk03 = ((MSBEL_ShipInstService)this).new ShipInst_Chk03();
	}

	public static MSBEL_ShipInstService.ShipInst_Chk03 crtShipInst_Chk03() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Chk03();
		return lgc.aShipInst_Chk03;
	}

	protected void paramShipInst_Chk03(MCParam p) {
		if (this.aShipInst_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Chk03.up0());
		p.addUpBlock(aShipInst_Chk03.up1());
		p.addDownBlock(aShipInst_Chk03.down0());
		p.addDownBlock(aShipInst_Chk03.down1());
	}

	protected void doShipInst_Chk03() {
		aShipInst_Chk03.call();
	};

	/**
	 * ShipInst_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR createShipInst_Chk03_HdrR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.create();
	}

	/**
	 * ShipInst_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> createShipInst_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
	}

	/**
	 * ShipInst_Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR createShipInst_Chk03_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.create();
	}

	/**
	 * ShipInst_Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> createShipInst_Chk03_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);
	}
	protected MSBEL_ShipInstService.ShipInst_Ins01 aShipInst_Ins01;

	protected void initShipInst_Ins01() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Ins01_INFO;
		this.aShipInst_Ins01 = ((MSBEL_ShipInstService)this).new ShipInst_Ins01();
	}

	public static MSBEL_ShipInstService.ShipInst_Ins01 crtShipInst_Ins01() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Ins01();
		return lgc.aShipInst_Ins01;
	}

	protected void paramShipInst_Ins01(MCParam p) {
		if (this.aShipInst_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Ins01.up0());
		p.addUpBlock(aShipInst_Ins01.up1());
		p.addUpBlock(aShipInst_Ins01.up2());
		p.addUpBlock(aShipInst_Ins01.up3());
		p.addDownBlock(aShipInst_Ins01.down0());
		p.addDownBlock(aShipInst_Ins01.down1());
		p.addDownBlock(aShipInst_Ins01.down2());
	}

	protected void doShipInst_Ins01() {
		aShipInst_Ins01.call();
	};

	/**
	 * ShipInst_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Ins01_HdrR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
	}

	/**
	 * ShipInst_Ins01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Ins01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
	}

	/**
	 * ShipInst_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
	}

	/**
	 * ShipInst_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
	}

	/**
	 * ShipSchd_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR createShipSchd_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.create();
	}

	/**
	 * ShipSchd_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> createShipSchd_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);
	}

	/**
	 * ShipInst_Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR createShipInst_Ins01_CndR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR.create();
	}
	protected MSBEL_ShipInstService.ShipInst_Upd01 aShipInst_Upd01;

	protected void initShipInst_Upd01() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Upd01_INFO;
		this.aShipInst_Upd01 = ((MSBEL_ShipInstService)this).new ShipInst_Upd01();
	}

	public static MSBEL_ShipInstService.ShipInst_Upd01 crtShipInst_Upd01() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Upd01();
		return lgc.aShipInst_Upd01;
	}

	protected void paramShipInst_Upd01(MCParam p) {
		if (this.aShipInst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Upd01.up0());
		p.addUpBlock(aShipInst_Upd01.up1());
		p.addUpBlock(aShipInst_Upd01.up2());
		p.addDownBlock(aShipInst_Upd01.down0());
		p.addDownBlock(aShipInst_Upd01.down1());
	}

	protected void doShipInst_Upd01() {
		aShipInst_Upd01.call();
	};

	/**
	 * ShipInst_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
	}

	/**
	 * ShipInst_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
	}

	/**
	 * ShipInst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
	}

	/**
	 * ShipInst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
	}

	/**
	 * ShipInst_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR createShipInst_Upd01_CndR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR.create();
	}
	protected MSBEL_ShipInstService.ShipInst_Upd02 aShipInst_Upd02;

	protected void initShipInst_Upd02() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Upd02_INFO;
		this.aShipInst_Upd02 = ((MSBEL_ShipInstService)this).new ShipInst_Upd02();
	}

	public static MSBEL_ShipInstService.ShipInst_Upd02 crtShipInst_Upd02() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Upd02();
		return lgc.aShipInst_Upd02;
	}

	protected void paramShipInst_Upd02(MCParam p) {
		if (this.aShipInst_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Upd02.up0());
		p.addDownBlock(aShipInst_Upd02.down0());
	}

	protected void doShipInst_Upd02() {
		aShipInst_Upd02.call();
	};

	/**
	 * ShipInst_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR createShipInst_Upd02_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR.create();
	}

	/**
	 * ShipInst_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR> createShipInst_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR.class);
	}
	protected MSBEL_ShipInstService.ShipInst_Del01 aShipInst_Del01;

	protected void initShipInst_Del01() {
		this.info = PDef.MS_MSBEL5530_ShipInst_Del01_INFO;
		this.aShipInst_Del01 = ((MSBEL_ShipInstService)this).new ShipInst_Del01();
	}

	public static MSBEL_ShipInstService.ShipInst_Del01 crtShipInst_Del01() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_Del01();
		return lgc.aShipInst_Del01;
	}

	protected void paramShipInst_Del01(MCParam p) {
		if (this.aShipInst_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_Del01.up0());
		p.addUpBlock(aShipInst_Del01.up1());
		p.addUpBlock(aShipInst_Del01.up2());
		p.addDownBlock(aShipInst_Del01.down0());
	}

	protected void doShipInst_Del01() {
		aShipInst_Del01.call();
	};

	/**
	 * ShipInst_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR createShipInst_Del01_HdrR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.create();
	}

	/**
	 * ShipInst_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> createShipInst_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
	}

	/**
	 * ShipInst_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR createShipInst_Del01_DtlR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.create();
	}

	/**
	 * ShipInst_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> createShipInst_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);
	}

	/**
	 * ShipInst_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR createShipInst_Del01_CndR(){
		return mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR.create();
	}
	protected MSBEL_ShipInstService.ShipInst_RevUpd01 aShipInst_RevUpd01;

	protected void initShipInst_RevUpd01() {
		this.info = PDef.MS_MSBEL5530_ShipInst_RevUpd01_INFO;
		this.aShipInst_RevUpd01 = ((MSBEL_ShipInstService)this).new ShipInst_RevUpd01();
	}

	public static MSBEL_ShipInstService.ShipInst_RevUpd01 crtShipInst_RevUpd01() {
		MSBEL_ShipInstService lgc = new MSBEL_ShipInstService();
		lgc.initShipInst_RevUpd01();
		return lgc.aShipInst_RevUpd01;
	}

	protected void paramShipInst_RevUpd01(MCParam p) {
		if (this.aShipInst_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipInst_RevUpd01.up0());
	}

	protected void doShipInst_RevUpd01() {
		aShipInst_RevUpd01.call();
	};

	/**
	 * ShipInst_RevUpd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createShipInst_RevUpd01_DtlR(){
		return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
	}

	/**
	 * ShipInst_RevUpd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createShipInst_RevUpd01_DtlL(){
		return MCList.create(mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipInst_Chk01オペレーション.<p>
	 *
	 * 出荷指図登録オペレーション実施前に事前チェックを行います。<br>
	 */
	abstract public class ShipInst_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> down2;
		
		
		// コンストラクタ
		protected ShipInst_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);

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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * ShipInst_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Chk01_HdrR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
		}

		/**
		 * ShipInst_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
		}

		/**
		 * ShipInst_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Chk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
		}

		/**
		 * ShipInst_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
		}

		/**
		 * ShipSchd_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR createShipSchd_Chk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.create();
		}

		/**
		 * ShipSchd_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> createShipSchd_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_Chk02オペレーション.<p>
	 *
	 * 出荷指図更新オペレーション実施前に事前チェックを行います。<br>
	 */
	abstract public class ShipInst_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected ShipInst_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);

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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipInst_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Chk02_HdrR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
		}

		/**
		 * ShipInst_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
		}

		/**
		 * ShipInst_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Chk02_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
		}

		/**
		 * ShipInst_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0() {
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
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_Chk03オペレーション.<p>
	 *
	 * 出荷指図削除オペレーション実施前に事前チェックを行います。<br>
	 */
	abstract public class ShipInst_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> down1;
		
		
		// コンストラクタ
		protected ShipInst_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);

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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipInst_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR createShipInst_Chk03_HdrR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.create();
		}

		/**
		 * ShipInst_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> createShipInst_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
		}

		/**
		 * ShipInst_Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR createShipInst_Chk03_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.create();
		}

		/**
		 * ShipInst_Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> createShipInst_Chk03_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_Ins01オペレーション.<p>
	 *
	 * 出荷指図を登録します。<br>
	 */
	abstract public class ShipInst_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> down2;
		
		
		// コンストラクタ
		protected ShipInst_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);
			up3 = mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * ShipInst_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Ins01_HdrR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
		}

		/**
		 * ShipInst_Ins01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Ins01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
		}

		/**
		 * ShipInst_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
		}

		/**
		 * ShipInst_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
		}

		/**
		 * ShipSchd_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR createShipSchd_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.create();
		}

		/**
		 * ShipSchd_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> createShipSchd_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR.class);
		}

		/**
		 * ShipInst_Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR createShipInst_Ins01_CndR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipSchd_Chk01_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_Upd01オペレーション.<p>
	 *
	 * 出荷指図NOの単位で出荷指図を訂正する。<br>
	 */
	abstract public class ShipInst_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected ShipInst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);

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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ShipInst_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR createShipInst_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.create();
		}

		/**
		 * ShipInst_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> createShipInst_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR.class);
		}

		/**
		 * ShipInst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR createShipInst_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.create();
		}

		/**
		 * ShipInst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> createShipInst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR.class);
		}

		/**
		 * ShipInst_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR createShipInst_Upd01_CndR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Ins01_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>pck_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sas.ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>sas.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>hdr_dtl_peg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_Upd02オペレーション.<p>
	 *
	 * 出荷実績明細NO単位で打切および出荷実績数を更新する。<br>
	 */
	abstract public class ShipInst_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipInst_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR.class);

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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipInst_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR createShipInst_Upd02_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR.create();
		}

		/**
		 * ShipInst_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR> createShipInst_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Upd02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_Del01オペレーション.<p>
	 *
	 * 出荷指図NOの単位で出荷指図を取消する。<br>
	 */
	abstract public class ShipInst_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> down0;
		
		
		// コンストラクタ
		protected ShipInst_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);

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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipInst_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR createShipInst_Del01_HdrR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.create();
		}

		/**
		 * ShipInst_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> createShipInst_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR.class);
		}

		/**
		 * ShipInst_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR createShipInst_Del01_DtlR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.create();
		}

		/**
		 * ShipInst_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> createShipInst_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR.class);
		}

		/**
		 * ShipInst_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR createShipInst_Del01_CndR(){
			return mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_shipinst_list_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bndl_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR
		 */
		public mcframe.serverMSBE.MSBEL5530.ShipInst_Del01_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5530.ShipInst_Chk03_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}
	/**
	 * ShipInst_RevUpd01オペレーション.<p>
	 *
	 * 出荷指図改訂履歴テーブルを更新する。改訂履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class ShipInst_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipInst_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipInst_RevUpd01() {
			
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
			invoke((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipInst_RevUpd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR createShipInst_RevUpd01_DtlR(){
			return mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR.create();
		}

		/**
		 * ShipInst_RevUpd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> createShipInst_RevUpd01_DtlL(){
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
			return ((MSBEL_ShipInstService)MSBEL_ShipInstService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}