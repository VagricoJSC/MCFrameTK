CREATE OR REPLACE PROCEDURE mgpa_cost_io$p_cost_io_insert (
	 IN i_cost_io_id NUMERIC
)
AS 
$BODY$
BEGIN
	CASE i_cost_io_id
	WHEN 1 THEN
		INSERT INTO mgt_cost_io1 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;

	WHEN 2 THEN
		INSERT INTO mgt_cost_io2 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 3 THEN
		INSERT INTO mgt_cost_io3 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
		
	WHEN 4 THEN
		INSERT INTO mgt_cost_io4 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 5 THEN
		INSERT INTO mgt_cost_io5 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 6 THEN
		INSERT INTO mgt_cost_io6 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 7 THEN
		INSERT INTO mgt_cost_io7 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 8 THEN
		INSERT INTO mgt_cost_io8 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 9 THEN
		INSERT INTO mgt_cost_io9 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 10 THEN
		INSERT INTO mgt_cost_io10 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 11 THEN
		INSERT INTO mgt_cost_io11 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 12 THEN
		INSERT INTO mgt_cost_io12 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 13 THEN
		INSERT INTO mgt_cost_io13 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 14 THEN
		INSERT INTO mgt_cost_io14 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 15 THEN
		INSERT INTO mgt_cost_io15 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 16 THEN
		INSERT INTO mgt_cost_io16 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 17 THEN
		INSERT INTO mgt_cost_io17 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 18 THEN
		INSERT INTO mgt_cost_io18 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 19 THEN
		INSERT INTO mgt_cost_io19 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	WHEN 20 THEN
		INSERT INTO mgt_cost_io20 (
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		) 
		SELECT
			calc_no,
			calc_grp_cd,
			wg_cd,
			ym,
			ym_sub,
			mng_dpt_cd,
			itm_cd,
			itm_sub1,
			itm_sub2,
			itm_sub3,
			lot_no,
			sublot_no,
			sno1,
			sno2,
			sno3,
			sno4,
			bp_cd,
			asst_typ,
			qty01,
			amt01,
			std01,
			qty02,
			amt02,
			std02,
			qty03,
			amt03,
			std03,
			qty04,
			amt04,
			std04,
			qty05,
			amt05,
			std05,
			qty06,
			amt06,
			std06,
			qty07,
			amt07,
			std07,
			qty08,
			amt08,
			std08,
			qty09,
			amt09,
			std09,
			qty10,
			amt10,
			std10,
			qty11,
			amt11,
			std11,
			qty12,
			amt12,
			std12,
			qty13,
			amt13,
			std13,
			qty14,
			amt14,
			std14,
			qty15,
			amt15,
			std15,
			qty16,
			amt16,
			std16,
			qty17,
			amt17,
			std17,
			qty18,
			amt18,
			std18,
			qty19,
			amt19,
			std19,
			qty20,
			amt20,
			std20,
			qty21,
			amt21,
			std21,
			qty22,
			amt22,
			std22,
			qty23,
			amt23,
			std23,
			qty24,
			amt24,
			std24,
			qty25,
			amt25,
			std25,
			qty26,
			amt26,
			std26,
			qty27,
			amt27,
			std27,
			qty28,
			amt28,
			std28,
			qty29,
			amt29,
			std29,
			qty30,
			amt30,
			std30,
			diff_qty,
			diff_amt,
			diff_std,
			ave_tgt
		FROM
			mgpa_cost_io$p_main$rec;
	ELSE
		NULL;
	END CASE;
	
	TRUNCATE TABLE mgpa_cost_io$p_main$rec;
END;
$BODY$
LANGUAGE plpgsql
;


CREATE OR REPLACE FUNCTION mgpa_cost_io$f_chk_all_zero (
	 IN rec mgt_cost_io1
)
RETURNS BOOLEAN
AS
$BODY$
BEGIN
	IF 
		rec.qty01 <> 0 OR rec.amt01 <> 0 OR rec.std01 <> 0 OR 
		rec.qty02 <> 0 OR rec.amt02 <> 0 OR rec.std02 <> 0 OR 
		rec.qty03 <> 0 OR rec.amt03 <> 0 OR rec.std03 <> 0 OR 
		rec.qty04 <> 0 OR rec.amt04 <> 0 OR rec.std04 <> 0 OR 
		rec.qty05 <> 0 OR rec.amt05 <> 0 OR rec.std05 <> 0 OR 
		rec.qty06 <> 0 OR rec.amt06 <> 0 OR rec.std06 <> 0 OR 
		rec.qty07 <> 0 OR rec.amt07 <> 0 OR rec.std07 <> 0 OR 
		rec.qty08 <> 0 OR rec.amt08 <> 0 OR rec.std08 <> 0 OR 
		rec.qty09 <> 0 OR rec.amt09 <> 0 OR rec.std09 <> 0 OR 
		rec.qty10 <> 0 OR rec.amt10 <> 0 OR rec.std10 <> 0 OR 
		rec.qty11 <> 0 OR rec.amt11 <> 0 OR rec.std11 <> 0 OR 
		rec.qty12 <> 0 OR rec.amt12 <> 0 OR rec.std12 <> 0 OR 
		rec.qty13 <> 0 OR rec.amt13 <> 0 OR rec.std13 <> 0 OR 
		rec.qty14 <> 0 OR rec.amt14 <> 0 OR rec.std14 <> 0 OR 
		rec.qty15 <> 0 OR rec.amt15 <> 0 OR rec.std15 <> 0 OR 
		rec.qty16 <> 0 OR rec.amt16 <> 0 OR rec.std16 <> 0 OR 
		rec.qty17 <> 0 OR rec.amt17 <> 0 OR rec.std17 <> 0 OR 
		rec.qty18 <> 0 OR rec.amt18 <> 0 OR rec.std18 <> 0 OR 
		rec.qty19 <> 0 OR rec.amt19 <> 0 OR rec.std19 <> 0 OR 
		rec.qty20 <> 0 OR rec.amt20 <> 0 OR rec.std20 <> 0 OR 
		rec.qty21 <> 0 OR rec.amt21 <> 0 OR rec.std21 <> 0 OR 
		rec.qty22 <> 0 OR rec.amt22 <> 0 OR rec.std22 <> 0 OR 
		rec.qty23 <> 0 OR rec.amt23 <> 0 OR rec.std23 <> 0 OR 
		rec.qty24 <> 0 OR rec.amt24 <> 0 OR rec.std24 <> 0 OR 
		rec.qty25 <> 0 OR rec.amt25 <> 0 OR rec.std25 <> 0 OR 
		rec.qty26 <> 0 OR rec.amt26 <> 0 OR rec.std26 <> 0 OR 
		rec.qty27 <> 0 OR rec.amt27 <> 0 OR rec.std27 <> 0 OR 
		rec.qty28 <> 0 OR rec.amt28 <> 0 OR rec.std28 <> 0 OR 
		rec.qty29 <> 0 OR rec.amt29 <> 0 OR rec.std29 <> 0 OR 
		rec.qty30 <> 0 OR rec.amt30 <> 0 OR rec.std30 <> 0 
	THEN
		RETURN FALSE;
	END IF;
	
	RETURN TRUE;
END;
$BODY$
LANGUAGE  plpgsql
;


CREATE OR REPLACE PROCEDURE mgpa_cost_io$p_main (
	 IN i_calc_grp_cd VARCHAR,
	 IN i_calc_no VARCHAR,
	 IN i_cost_io_id NUMERIC,
	 IN i_lock_flg CHARACTER DEFAULT '1'
)
AS 
$BODY$
/*********************************************************
<SYNOPSIS>
	原価個別受払表作成処理
<REMARKS>

<ARGUMENTS>
<IN>	I_CALC_GRP_CD
		計算グループＣＤ
<IN>	I_CALC_NO
		原価計算ＮＯ
<IN>	I_COST_IO_ID
		受払表ＩＤ
<IN>	I_LOCK_FLG
		ロックＦＬＧ
<HISTORY>
**********************************************************/
DECLARE
	c_eval_month_ave CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EVAL_TYP','MONTH_AVE');
	c_eval_term_ave CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EVAL_TYP','TERM_AVE');
	c_eval_std_unit CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EVAL_TYP','STD_UNIT');
	c_unit_calc_non CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP','NON');
	c_unit_calc_calc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_UNIT_CALC_TYP','CALC');
	c_expns_prod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','PROD');
	c_expns_sppl CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_EXPNS_TYP','SPPL');
	c_calc_rec_st_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_STK');
	c_calc_rec_purc CONSTANT VARCHAR :=fcpa_const$get_const_val('MGC_CALC_REC_TYP','PURC');
	c_calc_rec_comp CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','COMP');
	c_calc_rec_io CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','IO');
	c_calc_rec_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INPT');
	c_calc_rec_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','SLS');
	c_calc_rec_end_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_STK');
	c_calc_rec_ave CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','AVE');
	c_calc_rec_st_wip CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','ST_WIP');
	c_calc_rec_end_wip CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','END_WIP');
	c_calc_rec_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','INST');
	c_calc_rec_gp_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MGC_CALC_REC_TYP','GP_ALC');
	c_cost_io_ffr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','FFR_PROV');
	c_cost_io_onr_prov CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','ONR_PROV');
	c_cost_io_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IN');
	c_cost_io_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_OUT');
	c_cost_io_stk_io CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_IO_TYP','STK_IO');
	c_bal_calc_plus CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BAL_CALC_TYP','PLUS');
	c_bal_calc_negative CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_BAL_CALC_TYP','NEGATIVE');
	c_asst_prod CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_PROD');
	c_asst_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','CO_SLS');
	c_asst_oth CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_ASST_TYP','OTH');
	c_io_tgt_ave CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','AVE');
	c_io_tgt_st_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','ST_STK');
	c_io_tgt_st_wip CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','ST_WIP');
	c_io_tgt_purc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','PURC');
	c_io_tgt_comp CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','COMP');
	c_io_tgt_inst CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','INST');
	c_io_tgt_inpt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','INPT');
	c_io_tgt_sls CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','SLS');
	c_io_tgt_end_stk CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','END_STK');
	c_io_tgt_end_wip CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','END_WIP');
	c_io_tgt_ffr_prov_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','FFR_PROV_IN');
	c_io_tgt_ffr_prov_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','FFR_PROV_OUT');
	c_io_tgt_onr_prov_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','ONR_PROV_IN');
	c_io_tgt_onr_prov_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','ONR_PROV_OUT');
	c_io_tgt_stk_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','STK_IN');
	c_io_tgt_stk_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','STK_OUT');
	c_io_tgt_stk_io_in CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','STK_IO_IN');
	c_io_tgt_stk_io_out CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','STK_IO_OUT');
	c_io_tgt_st_stkwip CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','ST_STKWIP');
	c_io_tgt_end_stkwip CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','END_STKWIP');
	c_io_tgt_gp_alc CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','GP_ALC');
	c_io_tgt_loss_eval CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_TGT_TYP','LOSS_EVAL');
	c_io_sml_io_tgt CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_SML_TYP','IO_TGT');
	c_io_sml_ac_slip CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_SML_TYP','AC_SLIP');
	c_io_sml_ac_rsn CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_IO_SML_TYP','AC_RSN');
	c_calc_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'CALC_STK');
	c_not_stk	CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_COST_CALC_TYP', 'NOT_STK');
	c_max_cnt CONSTANT NUMERIC(38) := 50000; /* バルクインサートでの最大レコード数 */
	c_null_val CONSTANT VARCHAR := fcpa_const$get_const_val('MAC_STR','NULL_VAL');
	l_cnt NUMERIC;
	l_sql VARCHAR(2000);
	l_msg VARCHAR[];
	l_arg mgt_arg%ROWTYPE;
	l_io_mst mam_cost_io%ROWTYPE;
	l_ave_flg CHAR(1);
	l_monthly_flg CHAR(1);
	l_ave_qty mgt_acc_top.qty%TYPE;
	l_ave_act mgt_acc_sml_cost.act_cost%TYPE;
	l_ave_std mgt_acc_sml_cost.std_cost%TYPE;
	l_ave_tgt INTEGER;
	l_ave_prov_act mgt_acc_sml_cost.act_cost%TYPE;
	l_ave_prov_std mgt_acc_sml_cost.std_cost%TYPE;
	l_prov_amt_flg CHAR(1);
	l_expns VARCHAR;
	l_qty mgt_acc_top.qty%TYPE;
	l_act mgt_acc_sml_cost.act_cost%TYPE;
	l_std mgt_acc_sml_cost.std_cost%TYPE;
	l_calc_rec_typ1 mgt_acc_top.calc_rec_typ%TYPE;
	l_calc_rec_typ2 mgt_acc_top.calc_rec_typ%TYPE;
	l_cost_io_typ VARCHAR;
	l_bp_cd mam_bp.bp_cd%TYPE;
	l_asst_typ mgw_imp_pln_sls.asst_typ%TYPE;
	l_st_month_flg CHAR(1);
	l_log_no	fct_batch_log_msg.batch_log_no%TYPE;
	l_log_sub_key1	fct_batch_log_msg.log_sub_key1%TYPE;
	l_log_sub_key2	fct_batch_log_msg.log_sub_key2%TYPE;
	i INTEGER;
	rec mgt_cost_io1%ROWTYPE;
	/************************************************************************/
	x RECORD;
	v RECORD;
	w RECORD;
	y RECORD;
/************************************************************************/
BEGIN
	CALL fcpa_postgres_util$type_is_table_row('mgpa_cost_io$p_main$rec', 'mgt_cost_io1', 'integer') ;
	
	<<PROC_END>>
	BEGIN
		CALL fcpa_batch_log$p_proc_log('MGBXD0013', i_calc_grp_cd, i_calc_no, i_cost_io_id::VARCHAR);
		
		l_cnt := 0;
		IF i_lock_flg = '0' THEN
			FOR x IN
				SELECT	m.calc_grp_cd
				FROM	mam_calc_cost_io m
				WHERE	0=0 
				AND	m.calc_grp_cd = i_calc_grp_cd 
				AND	m.cost_io_id = i_cost_io_id
			LOOP
				l_cnt := 1;
			END LOOP;
		ELSE
			BEGIN
				FOR x IN
					SELECT	m.calc_grp_cd
					FROM	mam_calc_cost_io m
					WHERE	0=0 
					AND	m.calc_grp_cd = i_calc_grp_cd 
					AND	m.cost_io_id = i_cost_io_id
					FOR UPDATE NOWAIT
				LOOP
					l_cnt := 1;
				END LOOP;
			EXCEPTION
				WHEN lock_not_available THEN
					l_msg := fcpa_err$msg_binder(i_calc_grp_cd, i_calc_no) ;
					CALL fcpa_err$raise_app_err('MGBXD0009', l_msg) ;
			END;
		END IF;

		IF l_cnt = 0 THEN
			l_msg := fcpa_err$msg_binder(i_calc_grp_cd, i_cost_io_id);
			CALL fcpa_err$raise_app_err('MGBXD0023', l_msg);
		END IF;
		
		/* 同一計算グループＣＤ、原価計算ＮＯ、受払表ＩＤのデータがあれば削除 */
		l_sql := 'DELETE FROM mgt_cost_io' || i_cost_io_id || ' t WHERE t.calc_no = $1 AND t.calc_grp_cd = $2';
		EXECUTE l_sql USING i_calc_no, i_calc_grp_cd ;
		
		/* 計算情報の取得 */
		l_arg := mgpa_arg$f_get_arg(i_calc_grp_cd, i_calc_no);

		IF l_arg.cost_calc_typ NOT IN (c_calc_stk, c_not_stk) THEN
			EXIT PROC_END;
		END IF;

		BEGIN
			SELECT
				m.*
			INTO	STRICT l_io_mst
			FROM	mam_cost_io m
			WHERE	0=0 
			AND m.cost_io_id = i_cost_io_id;

		EXCEPTION
			WHEN no_data_found THEN
				l_msg := fcpa_err$msg_binder(i_cost_io_id);
				CALL fcpa_err$raise_app_err('MGBXD0021', l_msg);
		END;
		
		SELECT
			COUNT(*)
		INTO	STRICT l_cnt
		FROM	mam_cost_io_conf m
		WHERE	0=0 
		AND m.cost_io_id = i_cost_io_id;

		IF l_cnt = 0 THEN
			l_msg := fcpa_err$msg_binder(i_cost_io_id);
			CALL fcpa_err$raise_app_err('MGBXD0022', l_msg);
		END IF;
		
		SELECT
			COUNT(*)
			INTO	STRICT l_cnt
		FROM	mam_cost_io_conf m
		WHERE	0=0 
		AND m.cost_io_id = i_cost_io_id 
		AND m.io_tgt_typ = c_io_tgt_ave;

		IF l_cnt = 0 THEN
			l_ave_flg := '0';
		ELSE
			l_ave_flg := '1';
		END IF;
		
		SELECT
			COUNT(*)
		INTO	STRICT l_cnt
		FROM	mgt_calc_parm t
		WHERE	0=0 
		AND t.calc_grp_cd = i_calc_grp_cd 
		AND t.calc_no = i_calc_no 
		AND t.parm_key = 'SCA_TO' 
		AND t.parm_val IS NOT NULL 
		AND t.parm_val != '0' 
		AND t.parm_val != 'NO';

		IF l_cnt > 0 THEN
			l_monthly_flg := '1';
		ELSE
			l_monthly_flg := '0';
		END IF;

		FOR v IN
			SELECT
				m.io_col_cd
			FROM	mam_cost_io_conf m
			WHERE	0=0 
			AND m.cost_io_id = i_cost_io_id 
			AND m.io_sml_typ != c_io_sml_io_tgt 
			AND NOT EXISTS (
				SELECT
					'X'
				FROM	mam_cost_io_col m1
				WHERE	0=0 
				AND m1.cost_io_id = m.cost_io_id 
				AND m1.io_col_cd = m.io_col_cd
			)
		LOOP
			CALL fcpa_batch_log$p_data_log('MGBFD0001', l_log_no, l_log_sub_key1, l_log_sub_key2, i_cost_io_id::VARCHAR, v.io_col_cd) ;
		END LOOP;

		i := 0;

		FOR x IN
			SELECT
				CASE t2.eval_typ
					WHEN c_eval_term_ave THEN NULL
					WHEN c_eval_std_unit THEN
					CASE l_monthly_flg
						WHEN '0' THEN NULL
						ELSE t.ym
					END
					ELSE t.ym
				END AS ym, 
				t.wg_cd, 
				t.mng_dpt_cd, 
				t.itm_cd, 
				t.itm_sub1, 
				t.itm_sub2, 
				t.itm_sub3,
				CASE t2.lot_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.lot_no
				END AS lot_no,
				CASE t2.sublot_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sublot_no
				END AS sublot_no,
				CASE t2.sno1_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno1
				END AS sno1,
				CASE t2.sno2_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno2
				END AS sno2,
				CASE t2.sno3_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno3
				END AS sno3,
				CASE t2.sno4_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno4
				END AS sno4, 
				t.stk_bp_cd AS bp_cd, 
				t.asst_typ, 
				t2.lot_typ, 
				t2.sublot_typ, 
				t2.sno1_typ, 
				t2.sno2_typ, 
				t2.sno3_typ, 
				t2.sno4_typ,
				MAX(t.repurc_obli_flg) repurc_obli_flg
			FROM	mgt_acc_top t, mgt_calc_itm t1, mgt_calc_ptn t2
			WHERE	0=0 
			AND t.calc_no = i_calc_no 
			AND t.calc_grp_cd = i_calc_grp_cd 
			AND t.calc_rec_typ IN (c_calc_rec_st_stk, c_calc_rec_purc, c_calc_rec_comp, c_calc_rec_io, c_calc_rec_inpt, c_calc_rec_sls, c_calc_rec_end_stk, c_calc_rec_st_wip, c_calc_rec_end_wip, c_calc_rec_gp_alc) 
			AND (
				l_io_mst.in_flg = '1' 
				AND t.stk_bp_cd IS NULL OR l_io_mst.out_flg = '1' 
				AND t.stk_bp_cd IS NOT NULL
			) 
			AND (
				l_io_mst.prod_flg = '1' 
				AND t.asst_typ = c_asst_prod OR l_io_mst.sls_flg = '1' 
				AND t.asst_typ = c_asst_sls OR l_io_mst.other_flg = '1' 
				AND t.asst_typ = c_asst_oth
			) 
			AND EXISTS (
				SELECT
					'X'
				FROM	mam_itm_srch m
				WHERE	0=0 
				AND t.itm_cd = m.itm_cd 
				AND t.itm_sub1 = m.itm_sub1 
				AND t.itm_sub2 = m.itm_sub2 
				AND t.itm_sub3 = m.itm_sub3 
				AND (l_io_mst.itm_jnl_cd IS NULL OR l_io_mst.itm_jnl_cd = m.itm_jnl_cd) 
				AND (l_io_mst.itm_grp_cd1 IS NULL OR l_io_mst.itm_grp_cd1 = m.itm_grp_cd1) 
				AND (l_io_mst.itm_grp_cd2 IS NULL OR l_io_mst.itm_grp_cd2 = m.itm_grp_cd2) 
				AND (l_io_mst.itm_grp_cd3 IS NULL OR l_io_mst.itm_grp_cd3 = m.itm_grp_cd3) 
				AND (l_io_mst.itm_grp_cd4 IS NULL OR l_io_mst.itm_grp_cd4 = m.itm_grp_cd4) 
				AND (l_io_mst.itm_grp_cd5 IS NULL OR l_io_mst.itm_grp_cd5 = m.itm_grp_cd5) 
				AND (l_io_mst.itm_grp_cd6 IS NULL OR l_io_mst.itm_grp_cd6 = m.itm_grp_cd6) 
				AND (l_io_mst.itm_grp_cd7 IS NULL OR l_io_mst.itm_grp_cd7 = m.itm_grp_cd7) 
				AND (l_io_mst.itm_grp_cd8 IS NULL OR l_io_mst.itm_grp_cd8 = m.itm_grp_cd8) 
				AND (l_io_mst.itm_grp_cd9 IS NULL OR l_io_mst.itm_grp_cd9 = m.itm_grp_cd9) 
				AND (l_io_mst.itm_grp_cd10 IS NULL OR l_io_mst.itm_grp_cd10 = m.itm_grp_cd10)
			) 
			AND t.calc_no = t1.calc_no 
			AND t.calc_grp_cd = t1.calc_grp_cd 
			AND t.itm_cd = t1.itm_cd 
			AND t.itm_sub1 = t1.itm_sub1 
			AND t.itm_sub2 = t1.itm_sub2 
			AND t.itm_sub3 = t1.itm_sub3 
			AND t.wg_cd = t1.wg_cd 
			AND t1.calc_no = t2.calc_no 
			AND t1.calc_grp_cd = t2.calc_grp_cd 
			AND t1.calc_ptn_cd = t2.calc_ptn_cd
			GROUP BY
				CASE t2.eval_typ
					WHEN c_eval_term_ave THEN NULL
					WHEN c_eval_std_unit THEN
					CASE l_monthly_flg
						WHEN '0' THEN NULL
						ELSE t.ym
					END
					ELSE t.ym
				END, 
				t.wg_cd, 
				t.mng_dpt_cd, 
				t.itm_cd, 
				t.itm_sub1, 
				t.itm_sub2, 
				t.itm_sub3,
				CASE t2.lot_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.lot_no
				END,
				CASE t2.sublot_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sublot_no
				END,
				CASE t2.sno1_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno1
				END,
				CASE t2.sno2_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno2
				END,
				CASE t2.sno3_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno3
				END,
				CASE t2.sno4_typ
					WHEN c_unit_calc_non THEN NULL
					ELSE t.sno4
				END, 
				t.stk_bp_cd, 
				t.asst_typ, 
				t2.lot_typ, 
				t2.sublot_typ, 
				t2.sno1_typ, 
				t2.sno2_typ, 
				t2.sno3_typ, 
				t2.sno4_typ
		LOOP
			i := i + 1 ;

			INSERT INTO mgpa_cost_io$p_main$rec (
				calc_no,
				calc_grp_cd,
				wg_cd,
				ym,
				ym_sub,
				mng_dpt_cd,
				itm_cd,
				itm_sub1,
				itm_sub2,
				itm_sub3,
				lot_no,
				sublot_no,
				sno1,
				sno2,
				sno3,
				sno4,
				bp_cd,
				asst_typ,
				qty01,
				amt01,
				std01,
				qty02,
				amt02,
				std02,
				qty03,
				amt03,
				std03,
				qty04,
				amt04,
				std04,
				qty05,
				amt05,
				std05,
				qty06,
				amt06,
				std06,
				qty07,
				amt07,
				std07,
				qty08,
				amt08,
				std08,
				qty09,
				amt09,
				std09,
				qty10,
				amt10,
				std10,
				qty11,
				amt11,
				std11,
				qty12,
				amt12,
				std12,
				qty13,
				amt13,
				std13,
				qty14,
				amt14,
				std14,
				qty15,
				amt15,
				std15,
				qty16,
				amt16,
				std16,
				qty17,
				amt17,
				std17,
				qty18,
				amt18,
				std18,
				qty19,
				amt19,
				std19,
				qty20,
				amt20,
				std20,
				qty21,
				amt21,
				std21,
				qty22,
				amt22,
				std22,
				qty23,
				amt23,
				std23,
				qty24,
				amt24,
				std24,
				qty25,
				amt25,
				std25,
				qty26,
				amt26,
				std26,
				qty27,
				amt27,
				std27,
				qty28,
				amt28,
				std28,
				qty29,
				amt29,
				std29,
				qty30,
				amt30,
				std30,
				diff_qty,
				diff_amt,
				diff_std,
				_index_
			) VALUES (
				i_calc_no,
				i_calc_grp_cd,
				x.wg_cd,
				x.ym,
				COALESCE(x.ym, l_arg.end_ym),
				x.mng_dpt_cd,
				x.itm_cd,
				x.itm_sub1,
				x.itm_sub2,
				x.itm_sub3,
				COALESCE(x.lot_no, c_null_val),
				COALESCE(x.sublot_no, c_null_val),
				COALESCE(x.sno1, c_null_val),
				COALESCE(x.sno2, c_null_val),
				COALESCE(x.sno3, c_null_val),
				COALESCE(x.sno4, c_null_val),
				x.bp_cd,
				x.asst_typ,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				i
			);
			
			l_ave_qty := 0;
			l_ave_act := 0;
			l_ave_std := 0;
			l_ave_tgt := 0;
			l_ave_prov_act := 0;
			l_ave_prov_std := 0;
			l_prov_amt_flg := '0';

			IF l_ave_flg = '1' THEN
				FOR w IN
					SELECT /*+
							IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie02)
							IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
							*/
						t1.top_rec_no, 
						t1.qty, 
						COALESCE(SUM(
							CASE t2.expns_typ
								WHEN c_expns_prod THEN t2.act_cost
								ELSE 0
							END
						), 0) AS act_upri, 
						COALESCE(SUM(
							CASE t2.expns_typ
								WHEN c_expns_prod THEN t2.std_cost
								ELSE 0
							END
						), 0) AS std_upri, 
						COALESCE(SUM(
							CASE t2.expns_typ
								WHEN c_expns_sppl THEN t2.act_cost
								ELSE 0
							END
						), 0) AS prov_act_upri, 
						COALESCE(SUM(
							CASE t2.expns_typ
								WHEN c_expns_sppl THEN t2.std_cost
								ELSE 0
							END
						), 0) AS prov_std_upri
					FROM	mgt_acc_top t1
					LEFT OUTER JOIN mgt_acc_sml_cost t2
					ON (
						t1.calc_no = t2.calc_no 
						AND t1.calc_grp_cd = t2.calc_grp_cd 
						AND t1.top_rec_no = t2.top_rec_no
					)
					WHERE	0=0 
					AND t1.calc_no = i_calc_no 
					AND t1.calc_grp_cd = i_calc_grp_cd 
					AND t1.wg_cd = x.wg_cd 
					AND t1.itm_cd = x.itm_cd 
					AND t1.itm_sub1 = x.itm_sub1 
					AND t1.itm_sub2 = x.itm_sub2 
					AND t1.itm_sub3 = x.itm_sub3 
					AND (t1.ym = x.ym::TIMESTAMP WITHOUT TIME ZONE OR t1.ym = l_arg.end_ym AND x.ym IS NULL) 
					AND COALESCE(t1.mng_dpt_cd, x.mng_dpt_cd) = x.mng_dpt_cd 
					AND t1.lot_no =
						CASE x.lot_typ
							WHEN c_unit_calc_calc THEN x.lot_no
							ELSE t1.lot_no
					END 
					AND t1.sublot_no =
						CASE x.sublot_typ
							WHEN c_unit_calc_calc THEN x.sublot_no
							ELSE t1.sublot_no
					END 
					AND t1.sno1 =
						CASE x.sno1_typ
							WHEN c_unit_calc_calc THEN x.sno1
							ELSE t1.sno1
					END 
					AND t1.sno2 =
						CASE x.sno2_typ
							WHEN c_unit_calc_calc THEN x.sno2
							ELSE t1.sno2
					END 
					AND t1.sno3 =
						CASE x.sno3_typ
							WHEN c_unit_calc_calc THEN x.sno3
							ELSE t1.sno3
					END 
					AND t1.sno4 =
						CASE x.sno4_typ
							WHEN c_unit_calc_calc THEN x.sno4
							ELSE t1.sno4
					END 
					AND (
						(x.asst_typ = c_asst_oth OR x.repurc_obli_flg = '1') AND t1.bp_cd = x.bp_cd
						OR
						x.asst_typ IN (c_asst_prod, c_asst_sls) AND t1.bp_cd IS NULL AND x.bp_cd IS NULL
					) 
					AND t1.asst_typ = x.asst_typ 
					AND t1.calc_rec_typ = c_calc_rec_ave
					GROUP BY t1.top_rec_no, t1.qty
				LOOP
					IF w.act_upri = 0 THEN
						l_ave_qty := 0;
						l_ave_act := 0;
						l_ave_std := 0;
						l_ave_tgt := 0;
						l_ave_prov_act := 0;
						l_ave_prov_std := 0;
					ELSE
						l_ave_qty := w.qty;
						l_ave_act := w.act_upri;
						l_ave_std := w.std_upri;
						l_ave_tgt := 1;
						l_ave_prov_act := w.prov_act_upri;
						l_ave_prov_std := w.prov_std_upri;
					END IF;
					EXIT;
				END LOOP;
			END IF;

			FOR y IN
				SELECT
					m.*
				FROM	mam_cost_io_conf m
				WHERE	0=0 
				AND m.cost_io_id = i_cost_io_id
			LOOP
				<<NEXT_LOOP_Y>>
				BEGIN
				IF x.asst_typ IN (c_asst_prod, c_asst_sls) AND x.repurc_obli_flg = '0' AND y.prov_expns_flg = '1' THEN
					EXIT NEXT_LOOP_Y;
				END IF ;
				<<SKIP_SML>>
				BEGIN
					l_calc_rec_typ1 := NULL;
					l_calc_rec_typ2 := NULL;
					l_cost_io_typ := NULL;
					l_bp_cd := NULL;
					l_asst_typ := x.asst_typ;

					l_st_month_flg := '0';

					CASE y.io_tgt_typ
					WHEN c_io_tgt_st_stk THEN
						IF x.ym IS NULL OR x.ym = l_arg.st_ym THEN
							l_calc_rec_typ1 := c_calc_rec_st_stk;
						ELSE
							l_calc_rec_typ1 := c_calc_rec_end_stk;
							l_st_month_flg := '1';
						END IF;

					WHEN c_io_tgt_st_wip THEN
						IF x.ym IS NULL OR x.ym = l_arg.st_ym THEN
							l_calc_rec_typ1 := c_calc_rec_st_wip;
						ELSE
							l_calc_rec_typ1 := c_calc_rec_end_wip;
							l_st_month_flg := '1';
						END IF;

					WHEN c_io_tgt_purc THEN
						l_calc_rec_typ1 := c_calc_rec_purc;

					WHEN c_io_tgt_comp THEN
						l_calc_rec_typ1 := c_calc_rec_comp;

					WHEN c_io_tgt_inst THEN
						l_calc_rec_typ1 := c_calc_rec_inst;

					WHEN c_io_tgt_inpt THEN
						l_calc_rec_typ1 := c_calc_rec_inpt;

						IF y.prov_expns_flg = '1' AND (x.asst_typ = c_asst_oth OR x.repurc_obli_flg = '1') THEN
							l_prov_amt_flg := '1';
						END IF;

					WHEN c_io_tgt_sls THEN
						l_calc_rec_typ1 := c_calc_rec_sls;

					WHEN c_io_tgt_end_stk THEN
						l_calc_rec_typ1 := c_calc_rec_end_stk;

					WHEN c_io_tgt_end_wip THEN
						l_calc_rec_typ1 := c_calc_rec_end_wip;

					WHEN c_io_tgt_ffr_prov_in THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_ffr_prov;
						l_bp_cd := COALESCE(x.bp_cd, c_null_val);

					WHEN c_io_tgt_ffr_prov_out THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_ffr_prov;

					WHEN c_io_tgt_onr_prov_in THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_onr_prov;
						l_bp_cd := COALESCE(x.bp_cd, c_null_val);

						IF x.asst_typ = c_asst_oth OR x.repurc_obli_flg = '1' THEN
							l_asst_typ := c_asst_prod ;
						ELSE
							l_asst_typ := NULL ;
						END IF ;

						IF y.prov_expns_flg = '1' THEN
							l_prov_amt_flg := '1';
						END IF;

					WHEN c_io_tgt_onr_prov_out THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_onr_prov;

						IF y.prov_expns_flg = '1' THEN
							l_prov_amt_flg := '1';
						END IF;

					WHEN c_io_tgt_stk_in THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_stk_in;

					WHEN c_io_tgt_stk_out THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_stk_out;

					WHEN c_io_tgt_stk_io_in THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_stk_io;
						l_bp_cd := COALESCE(x.bp_cd, c_null_val);

					WHEN c_io_tgt_stk_io_out THEN
						l_calc_rec_typ1 := c_calc_rec_io;
						l_cost_io_typ := c_cost_io_stk_io;

					WHEN c_io_tgt_st_stkwip THEN
						IF x.ym IS NULL OR x.ym = l_arg.st_ym THEN
							l_calc_rec_typ1 := c_calc_rec_st_stk;
							l_calc_rec_typ2 := c_calc_rec_st_wip;
						ELSE
							l_calc_rec_typ1 := c_calc_rec_end_stk;
							l_calc_rec_typ2 := c_calc_rec_end_wip;
							l_st_month_flg := '1';
						END IF;

					WHEN c_io_tgt_end_stkwip THEN
						l_calc_rec_typ1 := c_calc_rec_end_stk;
						l_calc_rec_typ2 := c_calc_rec_end_wip;

					WHEN c_io_tgt_gp_alc THEN
						l_calc_rec_typ1 := c_calc_rec_gp_alc;

					WHEN c_io_tgt_ave THEN
						l_qty := l_ave_qty;
						l_act := l_ave_act;
						l_std := l_ave_std;

						IF y.prov_expns_flg = '1' THEN
							l_act := l_act + l_ave_prov_act;
							l_std := l_std + l_ave_prov_std;
						ELSIF x.repurc_obli_flg = '1' THEN
							l_qty := 0 ;
							l_act := 0 ;
							l_std := 0 ;
						END IF;
						EXIT SKIP_SML;

					WHEN c_io_tgt_loss_eval THEN
						l_qty := 0;
						l_std := 0;
						
						SELECT
							COALESCE(SUM(t1.amt), 0)
						INTO	STRICT l_act
						FROM	mgt_stk_loss t1
						WHERE	0=0 
						AND t1.calc_no = i_calc_no 
						AND t1.calc_grp_cd = i_calc_grp_cd 
						AND t1.wg_cd = x.wg_cd 
						AND t1.ym = COALESCE(x.ym, t1.ym)::TIMESTAMP WITHOUT TIME ZONE 
						AND t1.mng_dpt_cd = x.mng_dpt_cd 
						AND t1.itm_cd = x.itm_cd 
						AND t1.itm_sub1 = x.itm_sub1 
						AND t1.itm_sub2 = x.itm_sub2 
						AND t1.itm_sub3 = x.itm_sub3 
						AND t1.lot_no = COALESCE(x.lot_no, t1.lot_no) 
						AND t1.sublot_no = COALESCE(x.sublot_no, t1.sublot_no) 
						AND t1.sno1 = COALESCE(x.sno1, t1.sno1) 
						AND t1.sno2 = COALESCE(x.sno2, t1.sno2) 
						AND t1.sno3 = COALESCE(x.sno3, t1.sno3) 
						AND t1.sno4 = COALESCE(x.sno4, t1.sno4) 
						AND (
							l_bp_cd IS NULL AND COALESCE(t1.sppl_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val) 
							OR 
							l_bp_cd IS NOT NULL AND l_bp_cd = t1.sppl_cd
						) 
						AND t1.asst_typ = l_asst_typ;
						EXIT SKIP_SML;
					ELSE
						EXIT SKIP_SML;
					END CASE;

					IF l_prov_amt_flg = '1' THEN
						SELECT
							COALESCE(SUM(w2.qty), 0), 
							COALESCE(SUM(w2.act_amt), 0), 
							COALESCE(SUM(w2.std_amt), 0)
						INTO	STRICT l_qty, l_act, l_std
						FROM	(
							SELECT
								t1.top_rec_no, 
								t1.qty, 
								COALESCE(SUM(
									CASE y.io_tgt_typ
										WHEN c_io_tgt_inpt THEN t1.so_act_amt
										ELSE t1.amt
								END), 0) AS act_amt, 
								COALESCE(SUM(
									CASE y.io_tgt_typ
										WHEN c_io_tgt_inpt THEN t1.so_std_amt
										ELSE t1.std_amt
								END), 0) AS std_amt
							FROM	mgt_acc_top t1
							WHERE	0=0 
							AND t1.calc_no = i_calc_no 
							AND t1.calc_grp_cd = i_calc_grp_cd 
							AND t1.wg_cd = x.wg_cd 
							AND t1.ym = COALESCE(x.ym, t1.ym)::TIMESTAMP WITHOUT TIME ZONE 
							AND t1.mng_dpt_cd = x.mng_dpt_cd 
							AND t1.itm_cd = x.itm_cd 
							AND t1.itm_sub1 = x.itm_sub1 
							AND t1.itm_sub2 = x.itm_sub2 
							AND t1.itm_sub3 = x.itm_sub3 
							AND t1.lot_no = COALESCE(x.lot_no, t1.lot_no) 
							AND t1.sublot_no = COALESCE(x.sublot_no, t1.sublot_no) 
							AND t1.sno1 = COALESCE(x.sno1, t1.sno1) 
							AND t1.sno2 = COALESCE(x.sno2, t1.sno2) 
							AND t1.sno3 = COALESCE(x.sno3, t1.sno3) 
							AND t1.sno4 = COALESCE(x.sno4, t1.sno4) 
							AND (
								l_bp_cd IS NULL AND COALESCE(t1.stk_bp_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val) 
								OR 
								l_bp_cd IS NOT NULL AND l_bp_cd = t1.bp_cd
							) 
							AND t1.asst_typ = l_asst_typ 
							AND t1.calc_rec_typ IN (l_calc_rec_typ1, l_calc_rec_typ2) 
							AND (
								l_cost_io_typ IS NULL 
								OR 
								t1.cost_io_typ = l_cost_io_typ
							) 
							AND (
								y.io_sml_typ = c_io_sml_io_tgt 
								OR 
								y.io_sml_typ = c_io_sml_ac_slip 
									AND EXISTS (
										SELECT
											'X'
										FROM	mam_cost_io_col c
										WHERE	0=0 
										AND c.cost_io_id = y.cost_io_id 
										AND c.io_col_cd = y.io_col_cd 
										AND c.ac_slip_typ = t1.ac_slip_typ
									) 
								OR y.io_sml_typ = c_io_sml_ac_rsn 
									AND EXISTS (
										SELECT
											'X'
										FROM	mam_cost_io_col c
										WHERE	0=0 
										AND c.cost_io_id = y.cost_io_id 
										AND c.io_col_cd = y.io_col_cd 
										AND c.ac_slip_typ = t1.ac_slip_typ 
										AND c.ac_rsn_cd = t1.ac_rsn_cd
									)
								)
							AND	(l_cost_io_typ = c_cost_io_onr_prov OR l_asst_typ = c_asst_oth OR t1.repurc_obli_flg = '1')
							GROUP BY t1.top_rec_no, t1.qty
						) w2
						WHERE	0=0;
						
						l_prov_amt_flg := '0';
						EXIT SKIP_SML;
						
					ELSIF y.prov_expns_flg = '1' AND (x.asst_typ = c_asst_oth OR x.repurc_obli_flg = '1') THEN
						l_expns := c_expns_sppl;
					ELSE
						l_expns := NULL;
					END IF;
					
					SELECT /*+
							IndexScan(mgt_acc_top_mgt_acc_top_all_org mgt_acc_top_all_ie02)
							IndexScan(mgt_acc_sml_cost_mgt_acc_sml_cost_all_org mgt_acc_sml_cost_all_ie01)
							*/
						COALESCE(SUM(w2.QTY), 0) AS qty, 
						COALESCE(SUM(w2.act_amt), 0) AS act_amt, 
						COALESCE(SUM(w2.std_amt), 0) AS std_amt
					INTO	STRICT l_qty, l_act, l_std
					FROM	(
						SELECT
							t1.top_rec_no, 
							t1.qty, 
							COALESCE(SUM(
								CASE t2.expns_typ
									WHEN c_expns_prod THEN t2.act_cost
									WHEN l_expns THEN t2.act_cost
									ELSE 0
								END
							), 0) AS act_amt, 
							COALESCE(SUM(
								CASE t2.expns_typ
									WHEN c_expns_prod THEN t2.std_cost
									WHEN l_expns THEN t2.std_cost
									ELSE 0
								END
							), 0) AS std_amt
						FROM	mgt_acc_top t1
						LEFT OUTER JOIN mgt_acc_sml_cost t2
						ON (
							t1.calc_no = t2.calc_no 
							AND t1.calc_grp_cd = t2.calc_grp_cd 
							AND t1.top_rec_no = t2.top_rec_no
						)
						WHERE	0=0 
						AND t1.calc_no = i_calc_no 
						AND t1.calc_grp_cd = i_calc_grp_cd 
						AND t1.wg_cd = x.wg_cd 
						AND t1.ym =
							CASE l_st_month_flg
								WHEN '0' THEN COALESCE(
									x.ym,
									CASE t1.calc_rec_typ
										WHEN c_calc_rec_end_wip THEN l_arg.end_ym
										ELSE t1.ym
									END
								)
								ELSE fcpa_postgres_util$add_months(x.ym, - 1)
							END::TIMESTAMP WITHOUT TIME ZONE 
						AND t1.mng_dpt_cd = x.mng_dpt_cd 
						AND t1.itm_cd = x.itm_cd 
						AND t1.itm_sub1 = x.itm_sub1 
						AND t1.itm_sub2 = x.itm_sub2 
						AND t1.itm_sub3 = x.itm_sub3 
						AND t1.lot_no = COALESCE(x.lot_no, t1.lot_no) 
						AND t1.sublot_no = COALESCE(x.sublot_no, t1.sublot_no) 
						AND t1.sno1 = COALESCE(x.sno1, t1.sno1) 
						AND t1.sno2 = COALESCE(x.sno2, t1.sno2) 
						AND t1.sno3 = COALESCE(x.sno3, t1.sno3) 
						AND t1.sno4 = COALESCE(x.sno4, t1.sno4) 
						AND (
							l_bp_cd IS NULL AND COALESCE(t1.stk_bp_cd, c_null_val) = COALESCE(x.bp_cd, c_null_val) 
							OR 
							l_bp_cd IS NOT NULL AND l_bp_cd = t1.bp_cd
						) 
						AND t1.asst_typ = l_asst_typ 
						AND t1.calc_rec_typ IN (l_calc_rec_typ1, l_calc_rec_typ2) 
						AND (
							l_cost_io_typ IS NULL 
							OR 
							t1.cost_io_typ = l_cost_io_typ
						) 
						AND (
							y.io_sml_typ = c_io_sml_io_tgt 
							OR 
							y.io_sml_typ = c_io_sml_ac_slip 
							AND EXISTS (
								SELECT
									'X'
								FROM	mam_cost_io_col c
								WHERE	0=0 
								AND c.cost_io_id = y.cost_io_id 
								AND c.io_col_cd = y.io_col_cd 
								AND c.ac_slip_typ = t1.ac_slip_typ
							) 
							OR 
							y.io_sml_typ = c_io_sml_ac_rsn 
							AND EXISTS (
								SELECT
									'X'
								FROM	mam_cost_io_col c
								WHERE	0=0 
								AND c.cost_io_id = y.cost_io_id 
								AND c.io_col_cd = y.io_col_cd 
								AND c.ac_slip_typ = t1.ac_slip_typ 
								AND c.ac_rsn_cd = t1.ac_rsn_cd
							)
						)
						AND (
							t1.repurc_obli_flg = '0'
							OR
							y.prov_expns_flg = '1'
							AND
							t1.asst_typ =  c_asst_prod
							AND
							t1.repurc_obli_flg = '1'
						)
						GROUP BY t1.top_rec_no, t1.qty
					) w2
					WHERE	0=0;
				END;
				NULL;

				IF y.minus_flg = '1' THEN
					l_qty := (- 1) * l_qty;
					l_act := (- 1) * l_act;
					l_std := (- 1) * l_std;
				END IF;
				
				CASE y.io_seq
				WHEN 1 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty01 = l_qty,
						amt01 = l_act,
						std01 = l_std
					WHERE
						_index_ = i;
				WHEN 2 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty02 = l_qty,
						amt02 = l_act,
						std02 = l_std
					WHERE
						_index_ = i;
				WHEN 3 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty03 = l_qty,
						amt03 = l_act,
						std03 = l_std
					WHERE
						_index_ = i;
				WHEN 4 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty04 = l_qty,
						amt04 = l_act,
						std04 = l_std
					WHERE
						_index_ = i;
				WHEN 5 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty05 = l_qty,
						amt05 = l_act,
						std05 = l_std
					WHERE
						_index_ = i;
				WHEN 6 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty06 = l_qty,
						amt06 = l_act,
						std06 = l_std
					WHERE
						_index_ = i;
				WHEN 7 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty07 = l_qty,
						amt07 = l_act,
						std07 = l_std
					WHERE
						_index_ = i;
				WHEN 8 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty08 = l_qty,
						amt08 = l_act,
						std08 = l_std
					WHERE
						_index_ = i;
				WHEN 9 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty09 = l_qty,
						amt09 = l_act,
						std09 = l_std
					WHERE
						_index_ = i;
				WHEN 10 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty10 = l_qty,
						amt10 = l_act,
						std10 = l_std
					WHERE
						_index_ = i;
				WHEN 11 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty11 = l_qty,
						amt11 = l_act,
						std11 = l_std
					WHERE
						_index_ = i;
				WHEN 12 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty12 = l_qty,
						amt12 = l_act,
						std12 = l_std
					WHERE
						_index_ = i;
				WHEN 13 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty13 = l_qty,
						amt13 = l_act,
						std13 = l_std
					WHERE
						_index_ = i;
				WHEN 14 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty14 = l_qty,
						amt14 = l_act,
						std14 = l_std
					WHERE
						_index_ = i;
				WHEN 15 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty15 = l_qty,
						amt15 = l_act,
						std15 = l_std
					WHERE
						_index_ = i;
				WHEN 16 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty16 = l_qty,
						amt16 = l_act,
						std16 = l_std
					WHERE
						_index_ = i;
				WHEN 17 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty17 = l_qty,
						amt17 = l_act,
						std17 = l_std
					WHERE
						_index_ = i;
				WHEN 18 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty18 = l_qty,
						amt18 = l_act,
						std18 = l_std
					WHERE
						_index_ = i;
				WHEN 19 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty19 = l_qty,
						amt19 = l_act,
						std19 = l_std
					WHERE
						_index_ = i;
				WHEN 20 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty20 = l_qty,
						amt20 = l_act,
						std20 = l_std
					WHERE
						_index_ = i;
				WHEN 21 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty21 = l_qty,
						amt21 = l_act,
						std21 = l_std
					WHERE
						_index_ = i;
				WHEN 22 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty22 = l_qty,
						amt22 = l_act,
						std22 = l_std
					WHERE
						_index_ = i;
				WHEN 23 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty23 = l_qty,
						amt23 = l_act,
						std23 = l_std
					WHERE
						_index_ = i;
				WHEN 24 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty24 = l_qty,
						amt24 = l_act,
						std24 = l_std
					WHERE
						_index_ = i;
				WHEN 25 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty25 = l_qty,
						amt25 = l_act,
						std25 = l_std
					WHERE
						_index_ = i;
				WHEN 26 THEN
					UPDATE mgpa_cost_io$p_main$rec
					set
						qty26 = l_qty,
						amt26 = l_act,
						std26 = l_std
					WHERE
						_index_ = i;
				WHEN 27 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty27 = l_qty,
						amt27 = l_act,
						std27 = l_std
					WHERE
						_index_ = i;
				WHEN 28 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty28 = l_qty,
						amt28 = l_act,
						std28 = l_std
					WHERE
						_index_ = i;
				WHEN 29 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty29 = l_qty,
						amt29 = l_act,
						std29 = l_std
					WHERE
						_index_ = i;
				WHEN 30 THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						qty30 = l_qty,
						amt30 = l_act,
						std30 = l_std
					WHERE
						_index_ = i;
				ELSE
					NULL;
				END CASE;

				IF y.bal_calc_typ = c_bal_calc_plus THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						diff_qty = w2.diff_qty + l_qty,
						diff_amt = w2.diff_amt + l_act,
						diff_std = w2.diff_std + l_std
					FROM (
						SELECT 
							diff_qty,
							diff_amt,
							diff_std
						FROM mgpa_cost_io$p_main$rec
						WHERE _index_ = i
					) w2
					WHERE
						_index_ = i;
				ELSIF y.bal_calc_typ = c_bal_calc_negative THEN
					UPDATE mgpa_cost_io$p_main$rec
					SET
						diff_qty = w2.diff_qty - l_qty,
						diff_amt = w2.diff_amt - l_act,
						diff_std = w2.diff_std - l_std
					FROM (
						SELECT 
							diff_qty,
							diff_amt,
							diff_std
						FROM mgpa_cost_io$p_main$rec
						WHERE _index_ = i
					) w2
					WHERE
						_index_ = i;
				END IF;
				END;
				NULL;
			END LOOP;

			UPDATE mgpa_cost_io$p_main$rec
			SET ave_tgt = l_ave_tgt
			WHERE
				_index_ = i;

			SELECT *
			INTO STRICT rec
			FROM mgpa_cost_io$p_main$rec
			WHERE 0=0
			AND _index_ = i;

			IF 
				mgpa_cost_io$f_chk_all_zero(rec)
			THEN
				DELETE FROM mgpa_cost_io$p_main$rec t WHERE t._index_ = i ;
				i := i - 1 ;
			END IF;
			
			IF  i > 0 AND i >= c_max_cnt THEN
				CALL mgpa_cost_io$p_cost_io_insert(i_cost_io_id);
			END IF;

		END LOOP;

		IF i > 0 THEN
			CALL mgpa_cost_io$p_cost_io_insert(i_cost_io_id);
		END IF;
	END;

	COMMIT;
	CALL fcpa_batch_log$p_proc_log('MGBXD0002', CONCAT_WS('', 'MGPA_COST_IO.P_MAIN - ', i_cost_io_id));
END;
$BODY$
LANGUAGE plpgsql
;