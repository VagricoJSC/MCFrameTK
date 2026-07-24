package mcframe.serverMSBF.MSBFL5050;

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
 * "MSBFL_InspActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_InspActService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL5050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_InspActService.InspAct_Chk01 aInspAct_Chk01;

	protected void initInspAct_Chk01() {
		this.info = PDef.MS_MSBFL5050_InspAct_Chk01_INFO;
		this.aInspAct_Chk01 = ((MSBFL_InspActService)this).new InspAct_Chk01();
	}

	public static MSBFL_InspActService.InspAct_Chk01 crtInspAct_Chk01() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Chk01();
		return lgc.aInspAct_Chk01;
	}

	protected void paramInspAct_Chk01(MCParam p) {
		if (this.aInspAct_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Chk01.up0());
		p.addUpBlock(aInspAct_Chk01.up1());
		p.addUpBlock(aInspAct_Chk01.up2());
		p.addDownBlock(aInspAct_Chk01.down0());
		p.addDownBlock(aInspAct_Chk01.down1());
		p.addDownBlock(aInspAct_Chk01.down2());
	}

	protected void doInspAct_Chk01() {
		aInspAct_Chk01.call();
	};

	/**
	 * InspAct_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR createInspAct_Chk01_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR.create();
	}

	/**
	 * InspAct_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR> createInspAct_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR.class);
	}

	/**
	 * InspAct_Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR createInspAct_Chk01_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR.create();
	}

	/**
	 * InspAct_Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR> createInspAct_Chk01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR.class);
	}

	/**
	 * InspAct_Chk01_SmplブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR createInspAct_Chk01_SmplR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR.create();
	}

	/**
	 * InspAct_Chk01_SmplブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR> createInspAct_Chk01_SmplL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR.class);
	}
	protected MSBFL_InspActService.InspAct_Chk02 aInspAct_Chk02;

	protected void initInspAct_Chk02() {
		this.info = PDef.MS_MSBFL5050_InspAct_Chk02_INFO;
		this.aInspAct_Chk02 = ((MSBFL_InspActService)this).new InspAct_Chk02();
	}

	public static MSBFL_InspActService.InspAct_Chk02 crtInspAct_Chk02() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Chk02();
		return lgc.aInspAct_Chk02;
	}

	protected void paramInspAct_Chk02(MCParam p) {
		if (this.aInspAct_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Chk02.up0());
		p.addUpBlock(aInspAct_Chk02.up1());
		p.addDownBlock(aInspAct_Chk02.down0());
	}

	protected void doInspAct_Chk02() {
		aInspAct_Chk02.call();
	};

	/**
	 * InspAct_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR createInspAct_Chk02_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR.create();
	}

	/**
	 * InspAct_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR> createInspAct_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR.class);
	}

	/**
	 * InspAct_Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR createInspAct_Chk02_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR.create();
	}

	/**
	 * InspAct_Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR> createInspAct_Chk02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR.class);
	}
	protected MSBFL_InspActService.InspAct_Chk04 aInspAct_Chk04;

	protected void initInspAct_Chk04() {
		this.info = PDef.MS_MSBFL5050_InspAct_Chk04_INFO;
		this.aInspAct_Chk04 = ((MSBFL_InspActService)this).new InspAct_Chk04();
	}

	public static MSBFL_InspActService.InspAct_Chk04 crtInspAct_Chk04() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Chk04();
		return lgc.aInspAct_Chk04;
	}

	protected void paramInspAct_Chk04(MCParam p) {
		if (this.aInspAct_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Chk04.up0());
		p.addUpBlock(aInspAct_Chk04.up1());
		p.addUpBlock(aInspAct_Chk04.up2());
		p.addDownBlock(aInspAct_Chk04.down0());
		p.addDownBlock(aInspAct_Chk04.down1());
		p.addDownBlock(aInspAct_Chk04.down2());
	}

	protected void doInspAct_Chk04() {
		aInspAct_Chk04.call();
	};

	/**
	 * InspAct_Chk04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR createInspAct_Chk04_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR.create();
	}

	/**
	 * InspAct_Chk04_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR> createInspAct_Chk04_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR.class);
	}

	/**
	 * InspAct_Chk04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR createInspAct_Chk04_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.create();
	}

	/**
	 * InspAct_Chk04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> createInspAct_Chk04_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
	}

	/**
	 * InspAct_Chk04_SmplブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR createInspAct_Chk04_SmplR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.create();
	}

	/**
	 * InspAct_Chk04_SmplブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> createInspAct_Chk04_SmplL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);
	}
	protected MSBFL_InspActService.InspAct_Upd01 aInspAct_Upd01;

	protected void initInspAct_Upd01() {
		this.info = PDef.MS_MSBFL5050_InspAct_Upd01_INFO;
		this.aInspAct_Upd01 = ((MSBFL_InspActService)this).new InspAct_Upd01();
	}

	public static MSBFL_InspActService.InspAct_Upd01 crtInspAct_Upd01() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Upd01();
		return lgc.aInspAct_Upd01;
	}

	protected void paramInspAct_Upd01(MCParam p) {
		if (this.aInspAct_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Upd01.up0());
		p.addUpBlock(aInspAct_Upd01.up1());
		p.addUpBlock(aInspAct_Upd01.up2());
		p.addDownBlock(aInspAct_Upd01.down0());
		p.addDownBlock(aInspAct_Upd01.down1());
		p.addDownBlock(aInspAct_Upd01.down2());
	}

	protected void doInspAct_Upd01() {
		aInspAct_Upd01.call();
	};

	/**
	 * InspAct_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR createInspAct_Upd01_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR.create();
	}

	/**
	 * InspAct_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR> createInspAct_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR.class);
	}

	/**
	 * InspAct_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR createInspAct_Upd01_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR.create();
	}

	/**
	 * InspAct_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR> createInspAct_Upd01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR.class);
	}

	/**
	 * InspAct_Upd01_SmplブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR createInspAct_Upd01_SmplR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR.create();
	}

	/**
	 * InspAct_Upd01_SmplブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR> createInspAct_Upd01_SmplL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR.class);
	}
	protected MSBFL_InspActService.InspAct_Upd02 aInspAct_Upd02;

	protected void initInspAct_Upd02() {
		this.info = PDef.MS_MSBFL5050_InspAct_Upd02_INFO;
		this.aInspAct_Upd02 = ((MSBFL_InspActService)this).new InspAct_Upd02();
	}

	public static MSBFL_InspActService.InspAct_Upd02 crtInspAct_Upd02() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Upd02();
		return lgc.aInspAct_Upd02;
	}

	protected void paramInspAct_Upd02(MCParam p) {
		if (this.aInspAct_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Upd02.up0());
		p.addUpBlock(aInspAct_Upd02.up1());
		p.addDownBlock(aInspAct_Upd02.down0());
		p.addDownBlock(aInspAct_Upd02.down1());
	}

	protected void doInspAct_Upd02() {
		aInspAct_Upd02.call();
	};

	/**
	 * InspAct_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR createInspAct_Upd02_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR.create();
	}

	/**
	 * InspAct_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR> createInspAct_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR.class);
	}

	/**
	 * InspAct_Upd02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR createInspAct_Upd02_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR.create();
	}

	/**
	 * InspAct_Upd02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR> createInspAct_Upd02_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR.class);
	}

	/**
	 * InspAct_Upd02_ReInspSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR createInspAct_Upd02_ReInspSchdR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR.create();
	}

	/**
	 * InspAct_Upd02_ReInspSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR> createInspAct_Upd02_ReInspSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR.class);
	}
	protected MSBFL_InspActService.InspAct_Upd03 aInspAct_Upd03;

	protected void initInspAct_Upd03() {
		this.info = PDef.MS_MSBFL5050_InspAct_Upd03_INFO;
		this.aInspAct_Upd03 = ((MSBFL_InspActService)this).new InspAct_Upd03();
	}

	public static MSBFL_InspActService.InspAct_Upd03 crtInspAct_Upd03() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Upd03();
		return lgc.aInspAct_Upd03;
	}

	protected void paramInspAct_Upd03(MCParam p) {
		if (this.aInspAct_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Upd03.up0());
		p.addUpBlock(aInspAct_Upd03.up1());
		p.addUpBlock(aInspAct_Upd03.up2());
		p.addUpBlock(aInspAct_Upd03.up3());
		p.addUpBlock(aInspAct_Upd03.up4());
		p.addDownBlock(aInspAct_Upd03.down0());
		p.addDownBlock(aInspAct_Upd03.down1());
		p.addDownBlock(aInspAct_Upd03.down2());
		p.addDownBlock(aInspAct_Upd03.down3());
	}

	protected void doInspAct_Upd03() {
		aInspAct_Upd03.call();
	};

	/**
	 * InspAct_Upd03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR createInspAct_Upd03_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR.create();
	}

	/**
	 * InspAct_Upd03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR> createInspAct_Upd03_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR.class);
	}

	/**
	 * InspAct_Upd03_Stt_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR createInspAct_Upd03_Stt_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR.create();
	}

	/**
	 * InspAct_Upd03_Stt_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR> createInspAct_Upd03_Stt_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR.class);
	}

	/**
	 * InspAct_Upd03_Act_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR createInspAct_Upd03_Act_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR.create();
	}

	/**
	 * InspAct_Upd03_Act_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR> createInspAct_Upd03_Act_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR.class);
	}

	/**
	 * InspAct_Upd03_Judg_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR createInspAct_Upd03_Judg_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR.create();
	}

	/**
	 * InspAct_Upd03_Judg_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR> createInspAct_Upd03_Judg_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR.class);
	}

	/**
	 * InspAct_Upd03_Yield_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR createInspAct_Upd03_Yield_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR.create();
	}

	/**
	 * InspAct_Upd03_Yield_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR> createInspAct_Upd03_Yield_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR.class);
	}
	protected MSBFL_InspActService.InspAct_Upd04 aInspAct_Upd04;

	protected void initInspAct_Upd04() {
		this.info = PDef.MS_MSBFL5050_InspAct_Upd04_INFO;
		this.aInspAct_Upd04 = ((MSBFL_InspActService)this).new InspAct_Upd04();
	}

	public static MSBFL_InspActService.InspAct_Upd04 crtInspAct_Upd04() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Upd04();
		return lgc.aInspAct_Upd04;
	}

	protected void paramInspAct_Upd04(MCParam p) {
		if (this.aInspAct_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Upd04.up0());
		p.addDownBlock(aInspAct_Upd04.down0());
	}

	protected void doInspAct_Upd04() {
		aInspAct_Upd04.call();
	};

	/**
	 * InspAct_Upd04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR createInspAct_Upd04_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR.create();
	}

	/**
	 * InspAct_Upd04_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR> createInspAct_Upd04_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR.class);
	}
	protected MSBFL_InspActService.InspAct_Del01 aInspAct_Del01;

	protected void initInspAct_Del01() {
		this.info = PDef.MS_MSBFL5050_InspAct_Del01_INFO;
		this.aInspAct_Del01 = ((MSBFL_InspActService)this).new InspAct_Del01();
	}

	public static MSBFL_InspActService.InspAct_Del01 crtInspAct_Del01() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Del01();
		return lgc.aInspAct_Del01;
	}

	protected void paramInspAct_Del01(MCParam p) {
		if (this.aInspAct_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Del01.up0());
		p.addUpBlock(aInspAct_Del01.up1());
		p.addUpBlock(aInspAct_Del01.up2());
		p.addDownBlock(aInspAct_Del01.down0());
	}

	protected void doInspAct_Del01() {
		aInspAct_Del01.call();
	};

	/**
	 * InspAct_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR createInspAct_Del01_CndR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR.create();
	}

	/**
	 * InspAct_Del01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR> createInspAct_Del01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR.class);
	}

	/**
	 * InspAct_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR createInspAct_Del01_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.create();
	}

	/**
	 * InspAct_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> createInspAct_Del01_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
	}

	/**
	 * InspAct_Del01_SmplブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR createInspAct_Del01_SmplR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.create();
	}

	/**
	 * InspAct_Del01_SmplブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> createInspAct_Del01_SmplL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);
	}
	protected MSBFL_InspActService.InspAct_Chk03 aInspAct_Chk03;

	protected void initInspAct_Chk03() {
		this.info = PDef.MS_MSBFL5050_InspAct_Chk03_INFO;
		this.aInspAct_Chk03 = ((MSBFL_InspActService)this).new InspAct_Chk03();
	}

	public static MSBFL_InspActService.InspAct_Chk03 crtInspAct_Chk03() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Chk03();
		return lgc.aInspAct_Chk03;
	}

	protected void paramInspAct_Chk03(MCParam p) {
		if (this.aInspAct_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Chk03.up0());
		p.addUpBlock(aInspAct_Chk03.up1());
		p.addUpBlock(aInspAct_Chk03.up2());
		p.addDownBlock(aInspAct_Chk03.down0());
	}

	protected void doInspAct_Chk03() {
		aInspAct_Chk03.call();
	};

	/**
	 * InspAct_Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR createInspAct_Chk03_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR.create();
	}

	/**
	 * InspAct_Chk03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR> createInspAct_Chk03_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR.class);
	}

	/**
	 * InspAct_Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR createInspAct_Chk03_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR.create();
	}

	/**
	 * InspAct_Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR> createInspAct_Chk03_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR.class);
	}

	/**
	 * InspAct_Chk03_SmplブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR createInspAct_Chk03_SmplR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR.create();
	}

	/**
	 * InspAct_Chk03_SmplブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR> createInspAct_Chk03_SmplL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR.class);
	}

	/**
	 * InspAct_Chk03_PackXfrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR createInspAct_Chk03_PackXfrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR.create();
	}

	/**
	 * InspAct_Chk03_PackXfrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR> createInspAct_Chk03_PackXfrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR.class);
	}

	/**
	 * InspAct_Chk03_PurcActNoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR createInspAct_Chk03_PurcActNoR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR.create();
	}

	/**
	 * InspAct_Chk03_PurcActNoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR> createInspAct_Chk03_PurcActNoL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR.class);
	}
	protected MSBFL_InspActService.InspAct_Upd05 aInspAct_Upd05;

	protected void initInspAct_Upd05() {
		this.info = PDef.MS_MSBFL5050_InspAct_Upd05_INFO;
		this.aInspAct_Upd05 = ((MSBFL_InspActService)this).new InspAct_Upd05();
	}

	public static MSBFL_InspActService.InspAct_Upd05 crtInspAct_Upd05() {
		MSBFL_InspActService lgc = new MSBFL_InspActService();
		lgc.initInspAct_Upd05();
		return lgc.aInspAct_Upd05;
	}

	protected void paramInspAct_Upd05(MCParam p) {
		if (this.aInspAct_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aInspAct_Upd05.up0());
		p.addUpBlock(aInspAct_Upd05.up1());
	}

	protected void doInspAct_Upd05() {
		aInspAct_Upd05.call();
	};

	/**
	 * InspAct_Upd05_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR createInspAct_Upd05_HdrR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR.create();
	}

	/**
	 * InspAct_Upd05_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR> createInspAct_Upd05_HdrL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR.class);
	}

	/**
	 * InspAct_Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR createInspAct_Upd05_DtlR(){
		return mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR.create();
	}

	/**
	 * InspAct_Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR> createInspAct_Upd05_DtlL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * InspAct_Chk01オペレーション.<p>
	 *
	 * 検査実績の登録・訂正前にチェックを行う。<br>
	 */
	abstract public class InspAct_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR> down2;
		
		
		// コンストラクタ
		protected InspAct_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * InspAct_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR createInspAct_Chk01_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR.create();
		}

		/**
		 * InspAct_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR> createInspAct_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR.class);
		}

		/**
		 * InspAct_Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR createInspAct_Chk01_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR.create();
		}

		/**
		 * InspAct_Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR> createInspAct_Chk01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR.class);
		}

		/**
		 * InspAct_Chk01_SmplブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR createInspAct_Chk01_SmplR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR.create();
		}

		/**
		 * InspAct_Chk01_SmplブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR> createInspAct_Chk01_SmplL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ttl_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>stt_can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>so_qty</td></tr>
		 * 	<tr><td><br></td><td>smpl_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk01_SmplR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Chk02オペレーション.<p>
	 *
	 * 検査実績の判定前にチェックを行う。<br>
	 */
	abstract public class InspAct_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR> down0;
		
		
		// コンストラクタ
		protected InspAct_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspAct_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR createInspAct_Chk02_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR.create();
		}

		/**
		 * InspAct_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR> createInspAct_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR.class);
		}

		/**
		 * InspAct_Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR createInspAct_Chk02_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR.create();
		}

		/**
		 * InspAct_Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR> createInspAct_Chk02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk02_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Chk04オペレーション.<p>
	 *
	 * 検査実績の取消前にチェックを行う。<br>
	 */
	abstract public class InspAct_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> down2;
		
		
		// コンストラクタ
		protected InspAct_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * InspAct_Chk04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR createInspAct_Chk04_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR.create();
		}

		/**
		 * InspAct_Chk04_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR> createInspAct_Chk04_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR.class);
		}

		/**
		 * InspAct_Chk04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR createInspAct_Chk04_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.create();
		}

		/**
		 * InspAct_Chk04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> createInspAct_Chk04_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
		}

		/**
		 * InspAct_Chk04_SmplブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR createInspAct_Chk04_SmplR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.create();
		}

		/**
		 * InspAct_Chk04_SmplブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> createInspAct_Chk04_SmplL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Upd01オペレーション.<p>
	 *
	 * 検査実績の登録・訂正を行う。<br>
	 */
	abstract public class InspAct_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR> down2;
		
		
		// コンストラクタ
		protected InspAct_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * InspAct_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR createInspAct_Upd01_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR.create();
		}

		/**
		 * InspAct_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR> createInspAct_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR.class);
		}

		/**
		 * InspAct_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR createInspAct_Upd01_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR.create();
		}

		/**
		 * InspAct_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR> createInspAct_Upd01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR.class);
		}

		/**
		 * InspAct_Upd01_SmplブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR createInspAct_Upd01_SmplR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR.create();
		}

		/**
		 * InspAct_Upd01_SmplブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR> createInspAct_Upd01_SmplL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ttl_stk_qty</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>no_call_io_act_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>stt_can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_insp_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.so_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.smpl_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.lot_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno1</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno2</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno3</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno4</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.fix_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.ac_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.so_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.lims_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.ext_insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_stt_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act.insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd01_SmplR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Upd02オペレーション.<p>
	 *
	 * 検査実績の判定を行う。<br>
	 */
	abstract public class InspAct_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR> down1;
		/** [InspAct_Upd02_ReInspSchd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR> aInspAct_Upd02_ReInspSchd;
		
		
		// コンストラクタ
		protected InspAct_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR.class);
			aInspAct_Upd02_ReInspSchd = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * InspAct_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR createInspAct_Upd02_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR.create();
		}

		/**
		 * InspAct_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR> createInspAct_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR.class);
		}

		/**
		 * InspAct_Upd02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR createInspAct_Upd02_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR.create();
		}

		/**
		 * InspAct_Upd02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR> createInspAct_Upd02_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR.class);
		}

		/**
		 * InspAct_Upd02_ReInspSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR createInspAct_Upd02_ReInspSchdR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR.create();
		}

		/**
		 * InspAct_Upd02_ReInspSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR> createInspAct_Upd02_ReInspSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>judg_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>judg_rsn</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>lot_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_DtlR> down1() {
			return down1;
		}


		/**
		 * [InspAct_Upd02_ReInspSchd]ブロックのコンテナaInspAct_Upd02_ReInspSchdLを返します。
		 *
		 * @return InspAct_Upd02_ReInspSchdL
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd02_ReInspSchdR> InspAct_Upd02_ReInspSchd() {
			return aInspAct_Upd02_ReInspSchd;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Upd03オペレーション.<p>
	 *
	 * 検査着手明細・検査実績明細・検査抜取実績を登録する。<br>
	 */
	abstract public class InspAct_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR> down3;
		
		
		// コンストラクタ
		protected InspAct_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR.class);
			up3 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR.class);
			up4 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR.class);
			down3 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * InspAct_Upd03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR createInspAct_Upd03_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR.create();
		}

		/**
		 * InspAct_Upd03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR> createInspAct_Upd03_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR.class);
		}

		/**
		 * InspAct_Upd03_Stt_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR createInspAct_Upd03_Stt_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR.create();
		}

		/**
		 * InspAct_Upd03_Stt_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR> createInspAct_Upd03_Stt_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR.class);
		}

		/**
		 * InspAct_Upd03_Act_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR createInspAct_Upd03_Act_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR.create();
		}

		/**
		 * InspAct_Upd03_Act_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR> createInspAct_Upd03_Act_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR.class);
		}

		/**
		 * InspAct_Upd03_Judg_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR createInspAct_Upd03_Judg_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR.create();
		}

		/**
		 * InspAct_Upd03_Judg_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR> createInspAct_Upd03_Judg_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR.class);
		}

		/**
		 * InspAct_Upd03_Yield_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR createInspAct_Upd03_Yield_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR.create();
		}

		/**
		 * InspAct_Upd03_Yield_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR> createInspAct_Upd03_Yield_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>accpt_dfct_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR> up0() {
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
		 * 	<tr><td><br></td><td>insp_stt_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dfct_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_insp_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Yield_DtlR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_stt_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Stt_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Act_DtlR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd03_Judg_DtlR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Upd04オペレーション.<p>
	 *
	 * 出来高登録後の、検査指図・検査実績の登録・訂正を行う。<br>
	 */
	abstract public class InspAct_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR> down0;
		
		
		// コンストラクタ
		protected InspAct_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspAct_Upd04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR createInspAct_Upd04_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR.create();
		}

		/**
		 * InspAct_Upd04_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR> createInspAct_Upd04_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd04_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Del01オペレーション.<p>
	 *
	 * 検査実績または判定結果を取り消す。<br>
	 */
	abstract public class InspAct_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR> down0;
		
		
		// コンストラクタ
		protected InspAct_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspAct_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR createInspAct_Del01_CndR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR.create();
		}

		/**
		 * InspAct_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR> createInspAct_Del01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR.class);
		}

		/**
		 * InspAct_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR createInspAct_Del01_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.create();
		}

		/**
		 * InspAct_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> createInspAct_Del01_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR.class);
		}

		/**
		 * InspAct_Del01_SmplブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR createInspAct_Del01_SmplR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.create();
		}

		/**
		 * InspAct_Del01_SmplブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> createInspAct_Del01_SmplL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>judg_rsn</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk04_SmplR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Del01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Chk03オペレーション.<p>
	 *
	 * 検査時に仕入実績を同時計上する場合に、仕入実績登録サービスのチェックを実行する。登録・訂正前チェック、判定可能チェック、取消可能チェックから呼ばれる。<br>
	 */
	abstract public class InspAct_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR> down0;
		/** [InspAct_Chk03_PackXfr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR> aInspAct_Chk03_PackXfr;
		/** [InspAct_Chk03_PurcActNo]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR> aInspAct_Chk03_PurcActNo;
		
		
		// コンストラクタ
		protected InspAct_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR.class);
			aInspAct_Chk03_PackXfr = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR.class);
			aInspAct_Chk03_PurcActNo = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * InspAct_Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR createInspAct_Chk03_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR.create();
		}

		/**
		 * InspAct_Chk03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR> createInspAct_Chk03_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR.class);
		}

		/**
		 * InspAct_Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR createInspAct_Chk03_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR.create();
		}

		/**
		 * InspAct_Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR> createInspAct_Chk03_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR.class);
		}

		/**
		 * InspAct_Chk03_SmplブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR createInspAct_Chk03_SmplR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR.create();
		}

		/**
		 * InspAct_Chk03_SmplブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR> createInspAct_Chk03_SmplL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR.class);
		}

		/**
		 * InspAct_Chk03_PackXfrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR createInspAct_Chk03_PackXfrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR.create();
		}

		/**
		 * InspAct_Chk03_PackXfrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR> createInspAct_Chk03_PackXfrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR.class);
		}

		/**
		 * InspAct_Chk03_PurcActNoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR createInspAct_Chk03_PurcActNoR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR.create();
		}

		/**
		 * InspAct_Chk03_PurcActNoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR> createInspAct_Chk03_PurcActNoL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>judg_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>old_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>judg_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_rslt_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>old_quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no_typ</td></tr>
		 * 	<tr><td><br></td><td>fix_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>rmrks_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_smpl_act_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_xfr_base_unit_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_SmplR> up2() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_HdrR> down0() {
			return down0;
		}


		/**
		 * [InspAct_Chk03_PackXfr]ブロックのコンテナaInspAct_Chk03_PackXfrLを返します。
		 *
		 * @return InspAct_Chk03_PackXfrL
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PackXfrR> InspAct_Chk03_PackXfr() {
			return aInspAct_Chk03_PackXfr;
		}

		/**
		 * [InspAct_Chk03_PurcActNo]ブロックのコンテナaInspAct_Chk03_PurcActNoLを返します。
		 *
		 * @return InspAct_Chk03_PurcActNoL
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Chk03_PurcActNoR> InspAct_Chk03_PurcActNo() {
			return aInspAct_Chk03_PurcActNo;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}
	/**
	 * InspAct_Upd05オペレーション.<p>
	 *
	 * 検査時に仕入実績を同時計上する場合に、仕入実績登録サービスの更新を実行する。登録・訂正、判定、取消から呼ばれる。<br>
	 */
	abstract public class InspAct_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "InspAct_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR> up1;
		
		
		// コンストラクタ
		protected InspAct_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR.class);

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
			invoke((MSBFL_InspActService)MSBFL_InspActService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * InspAct_Upd05_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR createInspAct_Upd05_HdrR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR.create();
		}

		/**
		 * InspAct_Upd05_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR> createInspAct_Upd05_HdrL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR.class);
		}

		/**
		 * InspAct_Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR createInspAct_Upd05_DtlR(){
			return mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR.create();
		}

		/**
		 * InspAct_Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR> createInspAct_Upd05_DtlL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5050.InspAct_Upd05_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspActService)MSBFL_InspActService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}