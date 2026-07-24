package mcframe.serverMSBE.MSBEL5730;

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
 * "MSBEL_IvRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_IvRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5730";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_IvRegService.Iv_Chk01 aIv_Chk01;

	protected void initIv_Chk01() {
		this.info = PDef.MS_MSBEL5730_Iv_Chk01_INFO;
		this.aIv_Chk01 = ((MSBEL_IvRegService)this).new Iv_Chk01();
	}

	public static MSBEL_IvRegService.Iv_Chk01 crtIv_Chk01() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Chk01();
		return lgc.aIv_Chk01;
	}

	protected void paramIv_Chk01(MCParam p) {
		if (this.aIv_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Chk01.up0());
		p.addUpBlock(aIv_Chk01.up1());
		p.addUpBlock(aIv_Chk01.up2());
		p.addUpBlock(aIv_Chk01.up3());
		p.addUpBlock(aIv_Chk01.up4());
		p.addDownBlock(aIv_Chk01.down0());
		p.addDownBlock(aIv_Chk01.down1());
		p.addDownBlock(aIv_Chk01.down2());
		p.addDownBlock(aIv_Chk01.down3());
		p.addDownBlock(aIv_Chk01.down4());
	}

	protected void doIv_Chk01() {
		aIv_Chk01.call();
	};

	/**
	 * Iv_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Chk01_HdrR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Chk01_DtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Chk01_MapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Chk01_MapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
	}

	/**
	 * Iv_Chk01_MapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Chk01_MapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
	}

	/**
	 * Iv_Chk01_ShipInstMapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR createIv_Chk01_ShipInstMapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.create();
	}

	/**
	 * Iv_Chk01_ShipInstMapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> createIv_Chk01_ShipInstMapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
	}

	/**
	 * Iv_Chk01_ShipActMapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR createIv_Chk01_ShipActMapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.create();
	}

	/**
	 * Iv_Chk01_ShipActMapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> createIv_Chk01_ShipActMapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
	}
	protected MSBEL_IvRegService.Iv_Ins01 aIv_Ins01;

	protected void initIv_Ins01() {
		this.info = PDef.MS_MSBEL5730_Iv_Ins01_INFO;
		this.aIv_Ins01 = ((MSBEL_IvRegService)this).new Iv_Ins01();
	}

	public static MSBEL_IvRegService.Iv_Ins01 crtIv_Ins01() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Ins01();
		return lgc.aIv_Ins01;
	}

	protected void paramIv_Ins01(MCParam p) {
		if (this.aIv_Ins01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Ins01.up0());
		p.addUpBlock(aIv_Ins01.up1());
		p.addUpBlock(aIv_Ins01.up2());
		p.addUpBlock(aIv_Ins01.up3());
		p.addUpBlock(aIv_Ins01.up4());
		p.addDownBlock(aIv_Ins01.down0());
		p.addDownBlock(aIv_Ins01.down1());
	}

	protected void doIv_Ins01() {
		aIv_Ins01.call();
	};

	/**
	 * Iv_Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Ins01_HdrR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Ins01_DtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Ins01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Ins01_MapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Ins01_MapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
	}

	/**
	 * Iv_Ins01_MapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Ins01_MapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
	}

	/**
	 * Iv_Ins01_ShipInstMapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR createIv_Ins01_ShipInstMapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.create();
	}

	/**
	 * Iv_Ins01_ShipInstMapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> createIv_Ins01_ShipInstMapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
	}

	/**
	 * Iv_Ins01_ShipActMapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR createIv_Ins01_ShipActMapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.create();
	}

	/**
	 * Iv_Ins01_ShipActMapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> createIv_Ins01_ShipActMapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
	}
	protected MSBEL_IvRegService.Iv_Upd01 aIv_Upd01;

	protected void initIv_Upd01() {
		this.info = PDef.MS_MSBEL5730_Iv_Upd01_INFO;
		this.aIv_Upd01 = ((MSBEL_IvRegService)this).new Iv_Upd01();
	}

	public static MSBEL_IvRegService.Iv_Upd01 crtIv_Upd01() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Upd01();
		return lgc.aIv_Upd01;
	}

	protected void paramIv_Upd01(MCParam p) {
		if (this.aIv_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Upd01.up0());
		p.addUpBlock(aIv_Upd01.up1());
		p.addUpBlock(aIv_Upd01.up2());
		p.addUpBlock(aIv_Upd01.up3());
		p.addUpBlock(aIv_Upd01.up4());
		p.addDownBlock(aIv_Upd01.down0());
		p.addDownBlock(aIv_Upd01.down1());
	}

	protected void doIv_Upd01() {
		aIv_Upd01.call();
	};

	/**
	 * Iv_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Upd01_HdrR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Upd01_DtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Upd01_MapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Upd01_MapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
	}

	/**
	 * Iv_Upd01_MapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Upd01_MapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
	}

	/**
	 * Iv_Upd01_ShipInstMapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR createIv_Upd01_ShipInstMapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.create();
	}

	/**
	 * Iv_Upd01_ShipInstMapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> createIv_Upd01_ShipInstMapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
	}

	/**
	 * Iv_Upd01_ShipActMapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR createIv_Upd01_ShipActMapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.create();
	}

	/**
	 * Iv_Upd01_ShipActMapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> createIv_Upd01_ShipActMapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
	}
	protected MSBEL_IvRegService.Iv_Upd02 aIv_Upd02;

	protected void initIv_Upd02() {
		this.info = PDef.MS_MSBEL5730_Iv_Upd02_INFO;
		this.aIv_Upd02 = ((MSBEL_IvRegService)this).new Iv_Upd02();
	}

	public static MSBEL_IvRegService.Iv_Upd02 crtIv_Upd02() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Upd02();
		return lgc.aIv_Upd02;
	}

	protected void paramIv_Upd02(MCParam p) {
		if (this.aIv_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Upd02.up0());
		p.addUpBlock(aIv_Upd02.up1());
	}

	protected void doIv_Upd02() {
		aIv_Upd02.call();
	};

	/**
	 * Iv_Upd02_Ctrl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R createIv_Upd02_Ctrl1R(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R.create();
	}

	/**
	 * Iv_Upd02_Ctrl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R createIv_Upd02_Ctrl2R(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R.create();
	}

	/**
	 * Iv_Upd02_Ctrl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R> createIv_Upd02_Ctrl2L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R.class);
	}
	protected MSBEL_IvRegService.Iv_Upd03 aIv_Upd03;

	protected void initIv_Upd03() {
		this.info = PDef.MS_MSBEL5730_Iv_Upd03_INFO;
		this.aIv_Upd03 = ((MSBEL_IvRegService)this).new Iv_Upd03();
	}

	public static MSBEL_IvRegService.Iv_Upd03 crtIv_Upd03() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Upd03();
		return lgc.aIv_Upd03;
	}

	protected void paramIv_Upd03(MCParam p) {
		if (this.aIv_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Upd03.up0());
		p.addUpBlock(aIv_Upd03.up1());
		p.addDownBlock(aIv_Upd03.down0());
	}

	protected void doIv_Upd03() {
		aIv_Upd03.call();
	};

	/**
	 * Iv_Upd03_Ctrl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R createIv_Upd03_Ctrl1R(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R.create();
	}

	/**
	 * Iv_Upd03_Ctrl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R createIv_Upd03_Ctrl2R(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R.create();
	}

	/**
	 * Iv_Upd03_Ctrl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R> createIv_Upd03_Ctrl2L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R.class);
	}

	/**
	 * Iv_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR createIv_Upd03_RsltR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR.create();
	}

	/**
	 * Iv_Upd03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR> createIv_Upd03_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR.class);
	}
	protected MSBEL_IvRegService.Iv_Upd04 aIv_Upd04;

	protected void initIv_Upd04() {
		this.info = PDef.MS_MSBEL5730_Iv_Upd04_INFO;
		this.aIv_Upd04 = ((MSBEL_IvRegService)this).new Iv_Upd04();
	}

	public static MSBEL_IvRegService.Iv_Upd04 crtIv_Upd04() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Upd04();
		return lgc.aIv_Upd04;
	}

	protected void paramIv_Upd04(MCParam p) {
		if (this.aIv_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Upd04.up0());
	}

	protected void doIv_Upd04() {
		aIv_Upd04.call();
	};

	/**
	 * Iv_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR createIv_Upd04_DtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR.create();
	}

	/**
	 * Iv_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR> createIv_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR.class);
	}
	protected MSBEL_IvRegService.Iv_Upd05 aIv_Upd05;

	protected void initIv_Upd05() {
		this.info = PDef.MS_MSBEL5730_Iv_Upd05_INFO;
		this.aIv_Upd05 = ((MSBEL_IvRegService)this).new Iv_Upd05();
	}

	public static MSBEL_IvRegService.Iv_Upd05 crtIv_Upd05() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Upd05();
		return lgc.aIv_Upd05;
	}

	protected void paramIv_Upd05(MCParam p) {
		if (this.aIv_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Upd05.up0());
		p.addUpBlock(aIv_Upd05.up1());
	}

	protected void doIv_Upd05() {
		aIv_Upd05.call();
	};

	/**
	 * Iv_Upd05_Ctrl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R createIv_Upd05_Ctrl1R(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R.create();
	}

	/**
	 * Iv_Upd05_Ctrl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R> createIv_Upd05_Ctrl1L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R.class);
	}

	/**
	 * Iv_Upd05_Ctrl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R createIv_Upd05_Ctrl2R(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R.create();
	}

	/**
	 * Iv_Upd05_Ctrl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R> createIv_Upd05_Ctrl2L(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R.class);
	}
	protected MSBEL_IvRegService.Iv_Chk02 aIv_Chk02;

	protected void initIv_Chk02() {
		this.info = PDef.MS_MSBEL5730_Iv_Chk02_INFO;
		this.aIv_Chk02 = ((MSBEL_IvRegService)this).new Iv_Chk02();
	}

	public static MSBEL_IvRegService.Iv_Chk02 crtIv_Chk02() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Chk02();
		return lgc.aIv_Chk02;
	}

	protected void paramIv_Chk02(MCParam p) {
		if (this.aIv_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Chk02.up0());
		p.addUpBlock(aIv_Chk02.up1());
		p.addUpBlock(aIv_Chk02.up2());
		p.addDownBlock(aIv_Chk02.down0());
		p.addDownBlock(aIv_Chk02.down1());
		p.addDownBlock(aIv_Chk02.down2());
	}

	protected void doIv_Chk02() {
		aIv_Chk02.call();
	};

	/**
	 * Iv_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Chk02_HdrR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Chk02_DtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Chk02_MapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Chk02_MapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
	}

	/**
	 * Iv_Chk02_MapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Chk02_MapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
	}
	protected MSBEL_IvRegService.Iv_Del01 aIv_Del01;

	protected void initIv_Del01() {
		this.info = PDef.MS_MSBEL5730_Iv_Del01_INFO;
		this.aIv_Del01 = ((MSBEL_IvRegService)this).new Iv_Del01();
	}

	public static MSBEL_IvRegService.Iv_Del01 crtIv_Del01() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_Del01();
		return lgc.aIv_Del01;
	}

	protected void paramIv_Del01(MCParam p) {
		if (this.aIv_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_Del01.up0());
		p.addUpBlock(aIv_Del01.up1());
		p.addUpBlock(aIv_Del01.up2());
	}

	protected void doIv_Del01() {
		aIv_Del01.call();
	};

	/**
	 * Iv_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Del01_HdrR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
	}

	/**
	 * Iv_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Del01_DtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
	}

	/**
	 * Iv_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
	}

	/**
	 * Iv_Del01_MapDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Del01_MapDtlR(){
		return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
	}

	/**
	 * Iv_Del01_MapDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Del01_MapDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
	}
	protected MSBEL_IvRegService.Iv_RevUpd01 aIv_RevUpd01;

	protected void initIv_RevUpd01() {
		this.info = PDef.MS_MSBEL5730_Iv_RevUpd01_INFO;
		this.aIv_RevUpd01 = ((MSBEL_IvRegService)this).new Iv_RevUpd01();
	}

	public static MSBEL_IvRegService.Iv_RevUpd01 crtIv_RevUpd01() {
		MSBEL_IvRegService lgc = new MSBEL_IvRegService();
		lgc.initIv_RevUpd01();
		return lgc.aIv_RevUpd01;
	}

	protected void paramIv_RevUpd01(MCParam p) {
		if (this.aIv_RevUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIv_RevUpd01.up0());
	}

	protected void doIv_RevUpd01() {
		aIv_RevUpd01.call();
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

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Iv_Chk01オペレーション.<p>
	 *
	 * 登録前のチェック処理を行う。<br>
	 */
	abstract public class Iv_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> down4;
		
		
		// コンストラクタ
		protected Iv_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
			up4 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
			down3 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
			down4 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * Iv_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Chk01_HdrR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Chk01_DtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Chk01_MapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Chk01_MapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
		}

		/**
		 * Iv_Chk01_MapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Chk01_MapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
		}

		/**
		 * Iv_Chk01_ShipInstMapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR createIv_Chk01_ShipInstMapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.create();
		}

		/**
		 * Iv_Chk01_ShipInstMapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> createIv_Chk01_ShipInstMapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
		}

		/**
		 * Iv_Chk01_ShipActMapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR createIv_Chk01_ShipActMapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.create();
		}

		/**
		 * Iv_Chk01_ShipActMapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> createIv_Chk01_ShipActMapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ttl_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ttl_net_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_grss_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_dim</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>old_iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_rcpt_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_tax_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>is_slo_iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ttl_trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>ttl_net_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_grss_wt</td></tr>
		 * 	<tr><td><br></td><td>ttl_dim</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>old_iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>purc_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_rcpt_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_tax_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Ins01オペレーション.<p>
	 *
	 * インボイスを登録する。<br>
	 */
	abstract public class Iv_Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Iv_Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
			up4 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Iv_Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Ins01_HdrR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Ins01_DtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Ins01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Ins01_MapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Ins01_MapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
		}

		/**
		 * Iv_Ins01_MapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Ins01_MapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
		}

		/**
		 * Iv_Ins01_ShipInstMapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR createIv_Ins01_ShipInstMapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.create();
		}

		/**
		 * Iv_Ins01_ShipInstMapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> createIv_Ins01_ShipInstMapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
		}

		/**
		 * Iv_Ins01_ShipActMapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR createIv_Ins01_ShipActMapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.create();
		}

		/**
		 * Iv_Ins01_ShipActMapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> createIv_Ins01_ShipActMapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>is_slo_iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>old_iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_tax_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Upd01オペレーション.<p>
	 *
	 * インボイスを更新する。<br>
	 */
	abstract public class Iv_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Iv_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
			up4 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Iv_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Upd01_HdrR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Upd01_DtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Upd01_MapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Upd01_MapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
		}

		/**
		 * Iv_Upd01_MapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Upd01_MapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
		}

		/**
		 * Iv_Upd01_ShipInstMapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR createIv_Upd01_ShipInstMapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.create();
		}

		/**
		 * Iv_Upd01_ShipInstMapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> createIv_Upd01_ShipInstMapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR.class);
		}

		/**
		 * Iv_Upd01_ShipActMapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR createIv_Upd01_ShipActMapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.create();
		}

		/**
		 * Iv_Upd01_ShipActMapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> createIv_Upd01_ShipActMapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>is_slo_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>cmpl_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
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
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>old_iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_tax_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>dtl_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pr_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipInstMapDtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_ShipActMapDtlR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Upd02オペレーション.<p>
	 *
	 * インボイス出荷指図マップを更新する。<br>
	 */
	abstract public class Iv_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R> up1;
		
		
		// コンストラクタ
		protected Iv_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Iv_Upd02_Ctrl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R createIv_Upd02_Ctrl1R(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R.create();
		}

		/**
		 * Iv_Upd02_Ctrl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R createIv_Upd02_Ctrl2R(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R.create();
		}

		/**
		 * Iv_Upd02_Ctrl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R> createIv_Upd02_Ctrl2L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl1R up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>fix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd02_Ctrl2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Upd03オペレーション.<p>
	 *
	 * インボイス出荷実績マップを更新する。<br>
	 */
	abstract public class Iv_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR> down0;
		
		
		// コンストラクタ
		protected Iv_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Iv_Upd03_Ctrl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R createIv_Upd03_Ctrl1R(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R.create();
		}

		/**
		 * Iv_Upd03_Ctrl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R createIv_Upd03_Ctrl2R(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R.create();
		}

		/**
		 * Iv_Upd03_Ctrl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R> createIv_Upd03_Ctrl2L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R.class);
		}

		/**
		 * Iv_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR createIv_Upd03_RsltR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR.create();
		}

		/**
		 * Iv_Upd03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR> createIv_Upd03_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_reg_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl1R up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_Ctrl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd03_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Upd04オペレーション.<p>
	 *
	 * 受払実績作成を作成する。<br>
	 */
	abstract public class Iv_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR> up0;
		
		
		// コンストラクタ
		protected Iv_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Iv_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR createIv_Upd04_DtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR.create();
		}

		/**
		 * Iv_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR> createIv_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd04_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Upd05オペレーション.<p>
	 *
	 * 一部出荷指図を登録した際に、インボイスマップを更新する。<br>
	 */
	abstract public class Iv_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R> up1;
		
		
		// コンストラクタ
		protected Iv_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Iv_Upd05_Ctrl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R createIv_Upd05_Ctrl1R(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R.create();
		}

		/**
		 * Iv_Upd05_Ctrl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R> createIv_Upd05_Ctrl1L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R.class);
		}

		/**
		 * Iv_Upd05_Ctrl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R createIv_Upd05_Ctrl2R(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R.create();
		}

		/**
		 * Iv_Upd05_Ctrl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R> createIv_Upd05_Ctrl2L(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>org_ship_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl1R> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Upd05_Ctrl2R> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Chk02オペレーション.<p>
	 *
	 * 取消前のチェック処理を行う。<br>
	 */
	abstract public class Iv_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> down2;
		
		
		// コンストラクタ
		protected Iv_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
			down0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Iv_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Chk02_HdrR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Chk02_DtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Chk02_MapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Chk02_MapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
		}

		/**
		 * Iv_Chk02_MapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Chk02_MapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>is_slo_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_Del01オペレーション.<p>
	 *
	 * インボイスを取り消す。<br>
	 */
	abstract public class Iv_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2;
		
		
		// コンストラクタ
		protected Iv_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);

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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Iv_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR createIv_Del01_HdrR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR.create();
		}

		/**
		 * Iv_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR createIv_Del01_DtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.create();
		}

		/**
		 * Iv_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> createIv_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR.class);
		}

		/**
		 * Iv_Del01_MapDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR createIv_Del01_MapDtlR(){
			return mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.create();
		}

		/**
		 * Iv_Del01_MapDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> createIv_Del01_MapDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>is_slo_iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cmpl_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_rqst_id_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL5730.Iv_Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>manual_add_flg</td></tr>
		 * 	<tr><td><br></td><td>existed_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>uplnd_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>index</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5730.Iv_Chk01_MapDtlR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}
	/**
	 * Iv_RevUpd01オペレーション.<p>
	 *
	 * インボイス改訂履歴テーブルを更新する。インボイス履歴データ更新用の共通処理（MAUCL5020）から呼び出される。<br>
	 */
	abstract public class Iv_RevUpd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation implements mcframe.serverMAUC.MAUCL5020.IfMAUCL_RevDataService_RevData_Upd01 {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Iv_RevUpd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMAUC.MAUCL5020.RevData_Upd01_DtlR> up0;
		
		
		// コンストラクタ
		protected Iv_RevUpd01() {
			
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
			invoke((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this);
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
			return ((MSBEL_IvRegService)MSBEL_IvRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}